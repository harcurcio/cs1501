import java.lang.*;
import java.util.Arrays;

public class Heap {
	
	static int[] fArray;
	int size = 0;
	static Word[] maxHeap = new Word[10000];

	public Heap(Word[] array){
		buildHeap(array);
	}
	
	public Word[] buildHeap(Word[] array){
	// Problem #2
	// Fill in this method with an O(n) time algorithm
	// that builds an n element complete binary heap.
	// Note: You are allowed to add and modify fields
    // and helper methods.
		String[] stringArr = new String[array.length];
		String[] strings = new String[array.length];
		fArray = new int[array.length];
		for(int i=0; i<array.length; i++)
		{
			stringArr[i] = "" + array[i];
			strings[i] = stringArr[i];
			stringArr[i] = stringArr[i].substring(stringArr[i].indexOf(" ")+1);
			stringArr[i] = stringArr[i].substring(0, stringArr[i].indexOf("]"));
			fArray[i] = Integer.parseInt(stringArr[i]);
		}


		int n = array.length;

		for(int i=n/2-1; i>=0; i--)
		{
			heapify(fArray, n, i, array);
		}

		for(int i=n-1; i>=0; i--)
		{
			int temp = fArray[0];
			fArray[0] = fArray[i];
			fArray[i] = temp;
			heapify(fArray, i, 0, array);
		}

		String[] numbers = new String[array.length];

		for(int i=0; i<array.length; i++)
		{
			numbers[i] = Integer.toString(fArray[i]);
		}

		for(int i=0; i<array.length; i++)
		{
			int min = i;
			for(int j=i+1; j<array.length; j++)
			{
				if(numbers[i].equals(stringArr[j]))
				{
					min = j;
				}
			}
			String tester = stringArr[min];
			stringArr[min] = stringArr[i];
			stringArr[i] = tester;

			Word secondSwap = array[min];
			array[min] = array[i];
			array[i] = secondSwap;
		}
		maxHeap = array;
		return maxHeap;
	}

	static void printArray(Word array[])
	{
		int n= array.length;
		for(int i=0; i<n; ++i)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	public void heapify(int[] fArray, int n, int i, Word[] array)
	{
		int min = i;
		int leftChild = 2*i+1;
		int rightChild = 2*i+2;

		if(leftChild<n && fArray[leftChild] < fArray[min])
		{
			min=leftChild;
		}
		if(rightChild<n && fArray[rightChild] < fArray[min])
		{
			min=rightChild;
		}
		if(min!=i)
		{
			int temp = fArray[i];
			fArray[i] = fArray[min];
			heapify(fArray, n, min, array);
		}

	}
	
	public Word removeMax(){
	// Problem #3
	// Fill in this method with an O(log(n)) time algorithm
	// that removes the root element, restores the heap
	// structure, and finally returns the removed root element.
		/*Word popped = array[front];
		array[front] = array[count--];

		return popped;*/
		Word[] mHeap = new Word[fArray.length];
		return mHeap[0];
	}
	
	public Word[] select(int k){
		Word[] result = new Word[k];
		for(int i = 0; i < k; i++){
			result[i] = this.removeMax();
		}
		return result;
	}

	/*public int parent(int i){
		int par;
		par = (i-1)/2;
		return par;
	}

	public int leftChild(int i){
		int lChild;
		lChild = (2*i)+1;
		return lChild;
	}

	public int rightChild(int i){
		int rChild;
		rChild = (2*i)+2;
		return rChild;
	}*/
}
