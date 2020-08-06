package coreJavatraining;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };

		// 4-3, 5-3, 6-2, 9-1

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}

		ArrayList<Integer> arr = new ArrayList<Integer>();
		Iterator<Integer> it = hs.iterator();

		while (it.hasNext()) {
			arr.add(it.next());
		}

		for (int j = 0; j < arr.size(); j++) {
			int c = 0;
			for (int z = 0; z < a.length; z++) {
				if (arr.get(j) == a[z]) {
					c++;
				}
			}
			System.out.println("El numero:" + " " + arr.get(j) + " esta repetido:" + " " + c);
		}

	}
}
