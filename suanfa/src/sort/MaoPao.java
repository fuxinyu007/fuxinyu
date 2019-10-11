package sort;
/*
 * 冒泡排序
 */
public class MaoPao {
	public static void main(String[] args) {
		int score[] ={100,66,88,77,99};
		maopao(score);
		for(int i=0;i<score.length;i++){
			System.out.print(score[i]+" ");
		} }
	public static void maopao(int [] score){
		//i表示排序第i次
		for(int i=0;i<score.length;i++){
			//j表示第j个数开始比较 j每一轮都从0开始
			for(int j=0;j<score.length-1-i;j++){
				if(score[j]>score[j+1]){
					int temp=score[j];
					score[j]=score[j+1];
					score[j+1]=temp;
				} } } }
}
