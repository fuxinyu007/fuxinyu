package recursion;
/*
 * 递归  汉诺塔
 * n个盘子从A借助B挪到C
 * n-1个盘子从B借助A挪到C 将第n-1个盘子从A挪到C
 */
public class HanNota {
	private int i=1;
	//n表示n个盘子
	public void hanNota(int n,char from,char dependOn,char to){
		if(n==1){
			move(1,from,to);
		}else{
			//如果有三个盘子，将这两个盘子从A经过C挪到B
			hanNota(n-1,from,to,dependOn);
			//把最大的底盘从A挪到C
			move(n,from,to);
			//把这两个盘子从B经过A挪到C
			hanNota(n-1,dependOn,from,to);
		}
	}
	private void move(int n, char from, char to) {

		System.out.println("第"+i+++"步"+"第"+n+"个盘子"+from+"----->"+to);
	}
	public static void main(String[] args) {
		HanNota hanNota = new HanNota();
		hanNota.hanNota(3, 'A', 'B','C');
	}
}
