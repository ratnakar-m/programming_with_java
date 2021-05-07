public class BinarySearchDemo{
	public static void main(String[] args){
		int[] a = { 2, 10, 12, 19, 23, 25, 32, 35, 39, 54, 58, 68, 69, 74, 89 };
		
		int numberToSearch = 13;
		
		int idx = binarySearch(a, numberToSearch);
		
		if(idx != -1)
			System.out.println("Element present at index: "+idx);
		else
			System.out.println("Element NOT present");
	}
	
	public static int binarySearch(int[] arr, int numberToSearch){
		if(arr == null)
			return -1;
		
		int startIdx = 0;
		int endIdx = arr.length - 1;
		int middleIdx = (startIdx + endIdx)/2;
		int numberOfComparisons = 0;
		while(endIdx >= startIdx && startIdx!=middleIdx){
			middleIdx = (startIdx + endIdx)/2;
			if(arr[middleIdx] == numberToSearch)
				return middleIdx;
			else if(arr[middleIdx] < numberToSearch){
				startIdx = middleIdx;
			}
			else if(arr[middleIdx] > numberToSearch){
				endIdx = middleIdx;
			}
			numberOfComparisons++;
		}
		
		System.out.println(numberOfComparisons);
		return -1;
		
	}
}