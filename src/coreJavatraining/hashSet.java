package coreJavatraining;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashSet treeset, LinkedHashset implements Set interface
		// does not accept duplicate values
		// There is no guarantee stored in sequential order. Random order

		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		System.out.println(hs);

		Iterator<String> i = hs.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
