/**
maximum number of comparisons required is equal to size of the array

advantage - you dont need a sorted array to search using linear search algo
*/

public class LinearSearchDemo{
	public static void main(String[] args){
		int[] a = {23, 2, 89, 74, 32, 68, 12, 54, 35, 23, 89, 74, 10, 58, 32, 69, 19};
		
		int numberToSearch = 52;
		
		int idx = linearSearch(a, numberToSearch);
		
		if(idx != -1)
			System.out.println("Element present at index: "+idx);
		else
			System.out.println("Element NOT present");
		
		
	}
	
	public static int linearSearch(int[] arr, int numberToSearch){
		if(arr == null)
			return -1;
			
		for(int i=0; i<arr.length; i++){
			System.out.println(numberOfComparisons);
			if(arr[i]==numberToSearch)
				return i;
			
			
		}
		
		return -1;
	}
}