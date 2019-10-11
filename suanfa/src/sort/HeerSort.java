package sort;
/*
 * 希尔排序
 */
public class HeerSort {
	public static void main(String[] args) {
		int [] a={49,38,44,2,0,7,28,12,-9,7,2,5,12,23};
		int d=a.length/2;//增量 默认的为长度的一般
		while(true){
			for(int i=0;i<d;i++){
				for(int j=i;j+d<a.length;j+=d){
					//i=0 j=0 8
					//i=1 j=1 9
					for(int n=j;n<a.length/d;n++){
						int tmp;
						if(a[j]>a[j+d]){
							tmp=a[j];
							a[j]=a[j+d];
							a[j+d]=tmp;
						}
					}
					
				}
			}
			if(d == 1){
				break;
			}
			d--;
		}
		for(int i=0;i<a.length;i++){
			System.out.print(" "+a[i] );
		}
	}

}
