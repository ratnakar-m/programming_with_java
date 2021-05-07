public class BinarySearchUsingRecursion{
	public static void main(String[] args){
		int[] a = { 2, 10, 12, 19, 23, 25, 32, 35, 39, 54, 58, 68, 69, 74, 89 };
		                                                                  
		int numberToSearch = 95;
		
		int idx = binarySearch(a, numberToSearch);
		
		if(idx != -1)
			System.out.println("Element present at index: "+idx);
		else
			System.out.println("Element NOT present");
	}
	
	public static int binarySearch(int[] arr, int numberToSearch){
		return binarySearch(arr, numberToSearch, 0, arr.length-1);
	}
	
	public static int binarySearch(int[] arr, int numberToSearch, int startIdx, int endIdx){
		
		System.out.println("binarySearch(arr, "+numberToSearch+", "+startIdx+", "+endIdx+")");
		int middleIdx = (startIdx + endIdx)/2;
		
		if(startIdx > endIdx) //terminating condition
				return -1;
		
		if(arr[middleIdx] < numberToSearch)
			return binarySearch(arr, numberToSearch, middleIdx + 1, endIdx);
		else if (arr[middleIdx] > numberToSearch)
			return binarySearch(arr, numberToSearch, startIdx, middleIdx - 1);
		else // =
			return middleIdx;
	}
}