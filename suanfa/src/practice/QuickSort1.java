package practice;


public class QuickSort1 {

	public void quick(int a[]){
		if(a.length>0){
			quickSort(a,0,a.length-1);
		}
	}

	private void quickSort(int[] a, int low, int high) {
		 if(low<high){
			 int middle=getMiddle(a,low,high);
			 quickSort(a,0,middle);
			 quickSort(a,middle+1,high);
		 }
		
	}

	private int getMiddle(int[] a, int low, int high) {
		 int temp =a[low];
		 while(low<high){
			 while(low<high&&a[high]>=temp){
				 high--;
			 }
			 a[low]=a[high];
			 while(low<high&&a[low]<=temp){
				 low++;
			 }
			 a[high]=a[low];
		 }
		 a[low]=temp;
		 
		return low;
	}
	public static void main(String[] args) {
		QuickSort1 quickSort = new QuickSort1();
		int [] a={19,2,3,60,67,33,-7,24,56,34,5};
		quickSort.quick(a);
		for(int num :a){
			System.out.print(" "+num);
		}
	}
}
