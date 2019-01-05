public class QuickSort{
  public static void quickSort(int[] a, int start, int end){
    if(end - start < 1){
      return;
    }
   	int key = start, j = end;
  	int i = key + 1;
    while(j > i){
      if(a[i] >= a[key] && a[j] < a[key]){
          int temp = a[i];
          a[i++] = a[j];
          a[j--] = temp;
      }
      else{
    	  if(a[i] < a[key])
    		  i++;
    	  if(a[j] > a[key])
    		  j--;
      }
    }
    if(a[j] <= a[key]){
      int temp = a[key];
      a[key] = a[j];
      a[j] = temp;
      key = j;
    }
    else if(a[j - 1] <= a[key]){
      int temp = a[key];
      a[key] = a[j-1];
      a[j-1] = temp;
      key = j-1;
    }
    quickSort(a,start,key-1);
    quickSort(a,key + 1,end);
  }
  public static void quickSort(int[] a) {
	  quickSort(a,0,a.length-1);
  }
  public static void main(String[] args) {
    int[] a = {1,3,66,9999999,2,123,543,0,121,124,56,65,};
    quickSort(a);
    for(int i : a) {
    	System.out.print(i + " ");
    }
  }
}
