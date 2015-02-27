import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;

class Program {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);	
		queue.add(2);	
		queue.add(3);
		System.out.println("Queue");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());			
		}

		System.out.println("Set");
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);	
		set.add(2);	
		set.add(3);	
		set.add(1);
		for (Integer i: set) {
			System.out.println(i);
		}

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);	
		list.add(2);	
		list.add(3);	
		list.add(1);
		System.out.println("List");
		for (Integer i: list ) {
			System.out.println(i);
		}
				
	}

}