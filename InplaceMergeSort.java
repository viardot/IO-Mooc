

public class InplaceMergeSort{

  public static void main(String[] args) {
  
      int[] arr = {38,27,43,3,9,82,10};
	  
      sort(arr, 0, arr.length - 1);
      
	  for (int i = 0 ; i < arr.length; i++){
	      System.out.println(arr[i]+" ");
      }
  
  }
  
  private static void sort (int arr[], int l , int r) {
      if (r > l) {
	      int m = l + (r - l)/2;
		  sort(arr, l, m);
		  sort(arr, m + 1, r);
		  merge(arr, l, m, r);
	  }
  }
  
  private static void merge(int arr[], int start, int mid, int end) {
      int start2 = mid + 1;
      if (arr[mid] <= arr[start2]) {
		  return;
	  }
      while (start <= mid && start2 <=end) {
		  if (arr[start] <= arr[start2]){
			  start++;
		  } else {
			  int value = arr[start2];
			  int index = start2;
			  
			  while(index != start){
				  arr[index] = arr[index -1 ];
				  index--;
			  }
			  arr[start] = value;
			  start++;
			  mid++;
			  start2++;
		  }
	  } 	  
  }
}