package com.test.programs;

import java.util.ArrayList;
import java.util.List;

public class ImmutabilityTest {

	public static final class FixMe<E> implements Comparable<E> {

		private final int id;
		private final String name;
		private final List<E> list;

		public FixMe(int id, String name, List<E> list) {
			this.id = id;
			this.name = name;
			// this.list = list;
			// Change to make class as immutable
			this.list = new ArrayList<>(list);
		}

		@Override
		public int compareTo(E o) {
			// TODO Auto-generated method stub
			return 0;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public List<E> getList() {
			return list;
			// Individually return new ArrayList, will not protect immutability
			// return new ArrayList<E>(list);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			FixMe other = (FixMe) obj;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			list.add("foo");
			FixMe<String> fixMe = new FixMe<>(1, "A", list);
			System.out.println(fixMe.getList());
			list.clear();
			System.out.println(fixMe.getList());
		}

	}
}
