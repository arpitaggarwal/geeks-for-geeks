package com.test.linked.list;

public class LinkedListInsertion {

	private Node head;

	public static void main(String[] args) {
		LinkedListInsertion list = new LinkedListInsertion();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		list.head = node1;
		node1.next = node2;
		node2.next = node3;
		list.printList();
		list.insertFirst(4);
		System.out.println("After Insertion At First Index");
		list.printList();
		list.insertLast(5);
		System.out.println("After Insertion At Last Index");
		list.printList();
	}

	static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public void insertFirst(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	public void insertLast(int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		n.next = new_node;
	}
}