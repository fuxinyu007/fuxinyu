package greedy;
/*
 * 分治算法：循环赛问题
 */
public class SportsSchedule {
	public void scheduleTable(int [][] table,int n){
		if(n==1){
			table[0][0]=1;
		}else{
			//填充左下区域矩阵
			int m=n/2;
			scheduleTable(table, m);
			//填充右上区域矩阵
			for(int i=0;i<m;i++){
				for(int j=m;j<n;j++){
					//i表示行，j表示列
					////在列相同的情况下，每一行的第1个数比第1+m个数小m
					table[i][j]=table[i][j-m]+m;
				}
			}
			//填充左下区域矩阵
			for(int i=m;i<n;i++){
				for(int j=0;j<n;j++){
					//在行相同的情况下，每一列的第1个数比第1+m个数小m
					table[i][j]=table[i-m][j]+m;
				}
			}
			//填充右下区域矩阵
			for(int i=m;i<n;i++){
				for(int j=m;j<n;j++){
					//行-m 列-m与左上角相同
					table[i][j]=table[i-m][j-m];
				}
			}
		}
	}
	public static void main(String[] args) {
		int [][] table= new int[8][8];
		int n =8;
		SportsSchedule sportsSchedule = new SportsSchedule();
		sportsSchedule.scheduleTable(table, n);
		int c=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(table[i][j]+ " ");
				c++;
				//如果c的长度与n一样时就换行
				if(c%n==0){
					System.out.println();
				}
			}
		}
	}
	
}
