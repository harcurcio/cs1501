
public final class Selection {

	private static <E extends Comparable<E>> void swap(int i, int j, E[] array){
		if(i == j) return;
		
		E temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static <E extends Comparable<E>> E[] iterativeSort(E[] array){
		E[] result = array.clone();
		int length = result.length;
		
		if(length < 2) return result;
		
		for(int i = 0; i < length - 1; i++){
			E minValue = result[i];
			int index = i;
			
			for(int j = i + 1; j < length; j++){
				if(minValue.compareTo(result[j]) > 0){  // minValue is greater than result[j]
					minValue = result[j];
					index = j;
				}
			}
			swap(i, index, result);
		}
		
		return result;
	}
	
	public static <E extends Comparable<E>> E[] recursiveSort(E[] array){
		E[] result = array.clone();
		if(result.length < 1) return result;
		
		return recursiveSort(0, result);
	}
	
	public static <E extends Comparable<E>> E[] recursiveSort(int i, E[] result){
		int length = result.length;
		if(i == length - 1) return result;
		
		E minValue = result[i];
		int index = i;
		
		for(int j = i + 1; j < length; j++){
			if(minValue.compareTo(result[j]) > 0){  // minValue is greater than result[j]
				minValue = result[j];
				index = j;
			}
		}
		swap(i, index, result);
		
		return recursiveSort(i + 1, result);
	}
	
}
