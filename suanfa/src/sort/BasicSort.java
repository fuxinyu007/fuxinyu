package sort;

import java.util.ArrayList;
import java.util.List;

/*
 * 基数排序
 */
public class BasicSort {
	public void sort(int [] array){
		//先找到最大数值
		int max=0;
		for(int i=0;i<array.length;i++){
			if(max<array[i]){
				max=array[i];
			}
		}
		//获取最大值位数
		int times=0;
		while(max>0){
			max = max/10;
			times++;
		}
		//多维数组
		List<ArrayList> queue = new ArrayList<ArrayList>();
		for(int i=0;i<10;i++){
			//创建一个小数组
			ArrayList q = new ArrayList<>();
			//在大数组中添加小数组
			queue.add(q);
		}
		for(int i=0;i<times;i++){
			for(int j=0;j<array.length;j++){
				//获取对应的位的值 当i=0获取这个数的个位，i=1时获取这个数的十位，i=2时获取这个数的百位
				int x=array[j]%(int)Math.pow(10, i+1)/(int)Math.pow(10, i);
				ArrayList q = queue.get(x);
				q.add(array[j]);//把元素添加进对应下标数组
				queue.set(x, q);
			}
			//收集
			int count=0;
			for(int j=0;j<10;j++){
				while(queue.get(j).size()>0){
					//拿到每一个数组
					ArrayList<Integer> q = queue.get(j);
					array[count] = q.get(0);
					//把数从小数组中移除
					q.remove(0);
					count++;
				}
			}
		}
	}
	public static void main(String[] args) {
		BasicSort basicSort = new BasicSort();
		int [] a={136,2,6,8,9,2,8,11,23,56,34,90,89,29,145,209,320,78,3};
		basicSort.sort(a);
		for(int n:a){
			System.out.print(" "+n);
		}
	}
}
