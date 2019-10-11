package sort;

import java.util.ArrayList;
import java.util.List;

/*
 * ��������
 */
public class BasicSort {
	public void sort(int [] array){
		//���ҵ������ֵ
		int max=0;
		for(int i=0;i<array.length;i++){
			if(max<array[i]){
				max=array[i];
			}
		}
		//��ȡ���ֵλ��
		int times=0;
		while(max>0){
			max = max/10;
			times++;
		}
		//��ά����
		List<ArrayList> queue = new ArrayList<ArrayList>();
		for(int i=0;i<10;i++){
			//����һ��С����
			ArrayList q = new ArrayList<>();
			//�ڴ����������С����
			queue.add(q);
		}
		for(int i=0;i<times;i++){
			for(int j=0;j<array.length;j++){
				//��ȡ��Ӧ��λ��ֵ ��i=0��ȡ������ĸ�λ��i=1ʱ��ȡ�������ʮλ��i=2ʱ��ȡ������İ�λ
				int x=array[j]%(int)Math.pow(10, i+1)/(int)Math.pow(10, i);
				ArrayList q = queue.get(x);
				q.add(array[j]);//��Ԫ����ӽ���Ӧ�±�����
				queue.set(x, q);
			}
			//�ռ�
			int count=0;
			for(int j=0;j<10;j++){
				while(queue.get(j).size()>0){
					//�õ�ÿһ������
					ArrayList<Integer> q = queue.get(j);
					array[count] = q.get(0);
					//������С�������Ƴ�
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
