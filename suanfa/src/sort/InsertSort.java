package sort;
/*
 * ֱ�Ӳ�������
 */
public class InsertSort {
	public static void main(String[] args) {
		int [] a={46,48,2,5,90,14,17,86,45};
		for(int i =1;i<a.length;i++){
			int temp = a[i];
			int j;
			for(j=i-1;j>=0;j--){
				if(a[j]>temp){
					a[j+1]=a[j];
				}else{
					break;
				}
			}
			a[j+1]=temp;
		}
		System.out.println("�����");
		for(int n:a){
			System.out.print(" "+n);
		}
	}
}
