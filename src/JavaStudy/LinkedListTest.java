package JavaStudy;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		List<String> a = new LinkedList<String>();
		a.add("Amy");
		a.add("arl");
		a.add("Eria");
		
		ListIterator<String> aIter = a.listIterator();
		while(aIter.hasNext()) {
			System.out.println(aIter.next());
		}
	}

}
