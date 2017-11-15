import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.LinkedHashSet;

public class BFS {

	// Returns the set of reachable locations using breadth first search
	public static Set<Location> getReachableSet(WeightedGraph graph, Location start){
	// Problem #1
	// Fill in this method to compute the set of all possible reachable 
	// locations (ignoring costs and budget).  You must use Breadth
	// First Search to get full credit.
		LinkedHashSet<Location> travelOrder = new LinkedHashSet<Location>();
		HashSet<Location> visited = new HashSet<Location>();
		Queue<Location> queue = new LinkedList<Location>();
		
		queue.add(start);
		System.out.print(start);
		visited.add(start);
		while(!queue.isEmpty()) {
			//find neighbors
			//
		}

		Set<Location> end = null; //placeholder for return statement
		return end;
	}
}
