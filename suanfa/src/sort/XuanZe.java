package sort;
/*
 * 选择排序
 */
public class XuanZe {
	public static int[] selectionSort(int [] array){
		if(array.length ==0){
			return array;
		}
		for(int i=0;i<array.length;i++){
			int midIndex = i ;
			for(int j=i;j<array.length;j++){
				if(array[j]<array[midIndex])//找到最小的数
					midIndex =j;   //将最小数的索引保存
			}
			int temp = array[midIndex];
			array[midIndex]=array[i];
			array[i]=temp;
		}
		return array;
	}
	public static void main(String[] args) {
		int [] array ={1,57,8,3,0,2,5,8,23,80,2,4,0,6};
		int[] selectionSort = XuanZe.selectionSort(array);
		for(int n : selectionSort){
			System.out.print(" "+n);
		}
		
	}
}
