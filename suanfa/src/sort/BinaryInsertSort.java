package sort;
/*
 * 二分法插入排序
 */
public class BinaryInsertSort {
	private void sort(int [] a){
		for(int i=0;i<a.length;i++){
			int temp =a[i];
			int left = 0;
			int right = i-1;
			int mid =0;
			while(left<=right){
				mid =(left+right)/2;
					if(temp<a[mid]){
						right = mid-1;
					}else{
						left = mid +1;
					}
			}
			for(int j=i-1;j>=left;j--){
				//比left右边大的值往后移动
				a[j+1] =a[j];
			}
			if(left!=i){
				a[left]=temp;
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
		}
	}
	
	public static void main(String[] args) {
		BinaryInsertSort binaryInsertSort = new BinaryInsertSort();
		int [] a={46,48,2,5,90,14,17,86,45};
		binaryInsertSort.sort(a);
	}
}
