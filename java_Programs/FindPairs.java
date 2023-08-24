package java_Programs;

public class FindPairs {
	//int[] arr = {1,2,3,4,5,6,7,8};
//	int target =12;
//	findpairs(arr,target)
	static int arr[] = {1,2,3,4,5,6,7,8};

	public static void findPairs(int[]arr ,int target) {
		
		System.out.println("====The Pair Of Numbers Which Is Equal To The Target Numbers====");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==target) {
				
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
			
		}
	
	}
	
	public static void main(String[] args) {
		
		int target =12;
		findPairs(arr,target);
		
	}
	
	
}
