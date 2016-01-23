package com.test.cache;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The LRU cache is a hash table of keys and double linked nodes. The hash table
 * makes the time of get() to be O(1). The list of double linked nodes make the
 * nodes adding/removal operations O(1).
 * 
 * http://www.programcreek.com/2013/03/leetcode-lru-cache-java/
 */
public class LRUCache<K, V> {

	private int capacity;
	private HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	private Node head = null;
	private Node end = null;
	private final int initialCapacity = 16;
	private final float loadFactor = 0.75F;

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	Map<K, V> cache = new LinkedHashMap<K,V>(initialCapacity, loadFactor, true) {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		//@Override
		protected boolean removeEldestEntry(java.util.Map.Entry<K,V> eldest) {
			boolean remove = this.size() > capacity;
				return remove;
			}
		};
	

	/**
	 * Get the value (will always be positive) of the key if the key exists in
	 * the cache, otherwise return -1.
	 */
	public int get(int key) {
		if (map.containsKey(key)) {
			Node n = map.get(key);
			remove(n);
			setHead(n);
			return n.value;
		}

		return -1;
	}

	public void remove(Node n) {
		if (n.pre != null) {
			n.pre.next = n.next;
		} else {
			head = n.next;
		}

		if (n.next != null) {
			n.next.pre = n.pre;
		} else {
			end = n.pre;
		}
	}

	public void setHead(Node n) {
		n.next = head;
		n.pre = null;

		if (head != null)
			head.pre = n;

		head = n;

		if (end == null)
			end = head;
	}

	public void set(int key, int value) {
		if (map.containsKey(key)) {
			Node old = map.get(key);
			old.value = value;
			remove(old);
			setHead(old);
		} else {
			// Set or insert the value if the key is not already present.
			Node created = new Node(key, value);
			if (map.size() >= capacity) {
				map.remove(end.key);
				remove(end);
				setHead(created);

			} else {
				setHead(created);
			}

			map.put(key, created);
		}
	}

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(4);
		cache.set(1, 1);
		cache.set(2, 2);
		cache.set(3, 3);
		cache.set(4, 4);
		cache.set(5, 5);
		cache.set(4, 4);
	}
}

class Node {
	int key;
	int value;
	Node pre;
	Node next;

	public Node(int key, int value) {
		this.key = key;
		this.value = value;
	}
}