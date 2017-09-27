import java.util.Arrays;

public class Selector {
	
	private static void swap(Word[] array, int i, int j){
		if(i == j) return;
		
		Word temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static Word[] select(Word[] array, int k){
	// Problem #1
	// Fill in this method with an O(n*k) time algorithm
	// that returns the k largest elements of array in
	// order from largest to smallest.
	// Note: This should return an array with k elements.
	//Word[] temp = WordReader.loadWords();
	String[] stringWord = new String[array.length];
	int[] wordFreq = new int[array.length];
	int counter=0;
	for(int i=0; i<array.length; i++)
	{
		stringWord[i] = ""+array[i];
		stringWord[i] = stringWord[i].substring(stringWord[i].indexOf(" ")+1);
		stringWord[i] = stringWord[i].substring(0,stringWord[i].indexOf("]"));
		wordFreq[i] = Integer.parseInt(stringWord[i]);
	}

	for(int i=0; i<array.length-1; i++)
	{
		counter++;
		int min = i;
		for(int j= i+1; j<array.length; j++)
		{
			if(wordFreq[j]>wordFreq[min])
			{
				min=j;
			}
		}


		int tester = wordFreq[min];
		wordFreq[min] = wordFreq[i];
		wordFreq[i] = tester;

		if(counter <= 500)
		{
			swap(array, i, min);
		}
	}

	return Arrays.copyOfRange(array, 0, 499);
	}
}
