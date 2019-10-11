package search;
/*
 * 二分法查找
 * 递归的方式
 */
public class BinarySearch {
	public int binarySearch(int elem,int [] array,int low,int high){
		if(low>high){
			return -1;
		}
		int middle = (low+high)/2;
		if(array[middle]==elem){
			System.out.println("找到对应元素 下标为："+middle);
			return middle;
		}
		if(array[middle]<elem){
			//找右边
			return binarySearch(elem, array,middle+1, high);
		}
		if(array[middle]>elem){
			//找左边
			return binarySearch(elem, array,low, middle-1);
		}
		return -1;
	}
	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int array []={1,2,3,4,5,6,7,8,9,10};
		for(int n:array){
			System.out.print(" "+n);
		}
		binarySearch.binarySearch(5, array, 0, array.length-1);
	}
}
