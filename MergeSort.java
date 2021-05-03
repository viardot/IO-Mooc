

public class MergeSort {

  public static void main (String[] args) {
  
      int[] arr = {38,27,43,3,9,82,10};
	  
      sort(arr, 0, arr.length - 1);
      
	  for (int i = 0 ; i < arr.length; i++){
	      System.out.println(arr[i]+" ");
      }
  }

  private static void sort(int[] arr, int l, int r) {
	  if (r > l) {
        int m = l + (r - l)/2;
		sort(arr, l, m);
		sort(arr, m + 1, r);
		merge(arr, l, m , r);
	  }
  }
  
  private static void merge(int[] arr, int l, int m, int r) {
	  int n1 = m - l + 1;
	  int n2 = r - m;
	  
	  int L[] = new int[n1];
	  int R[] = new int[n2];
	  
	  for (int i = 0; i < n1; i++) {
		  L[i] = arr[l + i];
	  }
	  
	  for (int j = 0; j < n2; j++){
		  R[j] = arr[m + 1 + j];
	  }
	  
	  int i = 0, j = 0;
	  int k = l;
	  while (i < n1 && j < n2) {
		  if (L[i] <= R[j]){
			  arr[k] =L[i];
			  i++;
		  } else { 
		      arr[k] = R[j];
			  j++;
		  }
		  k++;
	  }
	  
	  while (i < n1) {
		  arr[k] = L[i];
		  i++; k++;
	  }
	  
	  while (j < n2) {
		  arr[k] = R[j];
		  j++; k++;
	  }
  }

}