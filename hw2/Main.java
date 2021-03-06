//Harlie Curcio
public class Main {
	public static void main(String[] args){
		Datum[] dataArray = DataReader.loadData();
		ChainingHashMap map = new ChainingHashMap(1000);
		
		// Populate the map with words and their corresponding frequencies
		for(int i=0; i<dataArray.length; i++)
			map.put(dataArray[i].word, dataArray[i].frequency);
		
		// Evaluate the effectiveness of the hash function
		int sizeOfLargestList = collisionTest(map);
		int numberOfEmptyLists = sparsityTest(map);
		
		// Print the results
		System.out.println("The size of the largest linkedlist is: " + sizeOfLargestList);
		System.out.println("The total number of empty linkedlists is: " + numberOfEmptyLists);
	}
	
	public static int collisionTest(ChainingHashMap map){
	// Problem #2A
	// Fill in this method to compute the size of the largest
	// linkedlist. You must use the getSize and countCollisions
	// methods to get full credit.
		int size = map.getSize();
		return map.countCollisions(size);
	}
	
	public static int sparsityTest(ChainingHashMap map){
	// Problem #2B
	// Fill in this method to compute the number of empty
	// linkedlists. You must use the getSize and countCollisions
	// methods to get full credit.
		int size = map.getSize();
		size = size-map.countCollisions(size);
		return size;
	}
}
