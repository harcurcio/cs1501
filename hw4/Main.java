import java.util.Iterator;

public class Main {

	public static void main(String[] args){
		int costLimit = 1000;
		int timeLimit = 30;
		
		Item[] items = new Item[4];
		// Arguments: String name, int cost, int time, int numberOfCookies
		items[0] = new Item("Chocolate Chip", 50, 2, 150);
		items[1] = new Item("Peanut Butter", 100, 3, 250);
		items[2] = new Item("Snickerdoodle", 50, 6, 200);
		items[3] = new Item("Oatmeal Raisin", 120, 1, 200);
		
		Multiset set = KnapsackSolver.solve(items, costLimit, timeLimit);
		printResult(set, costLimit, timeLimit);
		
		// ANSWER:
		// Chocolate Chip x 11
		// Peanut Butter x 2
		// Oatmeal Raisin x 2
	}
	
	private static void printResult(Multiset set, int costLimit, int timeLimit){
		System.out.println("**** Items ****");
		System.out.println();
		
		int total = 0;
		Iterator<Item> it = set.iterator();
		while(it.hasNext()){
			Item item = it.next();
			total += item.numberOfCookies * set.count(item);
			System.out.println(item.name + " x "  + set.count(item));
		}
		
		System.out.println();
		System.out.println("A total of " + total + " cookies in at most " + timeLimit + " hours with at most $" + costLimit + ".");
	}
	
}
