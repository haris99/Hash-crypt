import java.awt.List;

public class ObjectHashTable<T> {
	private static final int SIZE = 16;
	private Entry table[] = new Entry[SIZE];

	class Entry<T> {
		Integer key;
		T value;
		Entry next;

		Entry(Integer k, T v) {
			key = k;
			value = v;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Integer getKey() {
			return key;
		}
	}

	public Entry<T> get(Integer k) {
		int hash = k.hashCode() % SIZE;
		Entry e = table[hash];

		// if bucket is found then traverse through the linked list and
		// see if element is present
		while (e != null) {
			if (e.key.equals(k)) {
				return e;
			}
			e = e.next;
		}
		return null;
	}

	public void put(Integer k, T v) {
		int hash = k.hashCode() % SIZE;
		Entry e = table[hash];
		if (e != null) {
			// it means we are trying to insert duplicate
			// key-value pair, hence overwrite the current
			// pair with the old pair
			if (e.key.equals(k)) {
				e.value = v;
			} else {
				// traverse to the end of the list and insert new element
				// in the same bucket
				while (e.next != null) {
					e = e.next;
				}
				Entry entryInOldBucket = new Entry(k, v);
				e.next = entryInOldBucket;
			}
		} else {
			// new element in the map, hence creating new bucket
			Entry entryInNewBucket = new Entry(k, v);
			table[hash] = entryInNewBucket;
		}
	}

	public static void main(String[] args) {
		ObjectHashTable<Dog> hashMap = new ObjectHashTable<Dog>();
		Dog dog = new Dog();
		Dog dog2 = new Dog("Yellow");
		hashMap.put(new Integer(7), dog);
		hashMap.put(new Integer(8), dog2);
		System.out.println(hashMap.get(7).getValue().getColor());
		System.out.println(hashMap.get(8).getValue().getColor());
		// System.out.println(""+e.getValue());

	}
}
