package greedy;
/*
 * �����㷨��ѭ��������
 */
public class SportsSchedule {
	public void scheduleTable(int [][] table,int n){
		if(n==1){
			table[0][0]=1;
		}else{
			//��������������
			int m=n/2;
			scheduleTable(table, m);
			//��������������
			for(int i=0;i<m;i++){
				for(int j=m;j<n;j++){
					//i��ʾ�У�j��ʾ��
					////������ͬ������£�ÿһ�еĵ�1�����ȵ�1+m����Сm
					table[i][j]=table[i][j-m]+m;
				}
			}
			//��������������
			for(int i=m;i<n;i++){
				for(int j=0;j<n;j++){
					//������ͬ������£�ÿһ�еĵ�1�����ȵ�1+m����Сm
					table[i][j]=table[i-m][j]+m;
				}
			}
			//��������������
			for(int i=m;i<n;i++){
				for(int j=m;j<n;j++){
					//��-m ��-m�����Ͻ���ͬ
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
				//���c�ĳ�����nһ��ʱ�ͻ���
				if(c%n==0){
					System.out.println();
				}
			}
		}
	}
	
}
