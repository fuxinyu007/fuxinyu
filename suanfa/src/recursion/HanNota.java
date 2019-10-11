package recursion;
/*
 * �ݹ�  ��ŵ��
 * n�����Ӵ�A����BŲ��C
 * n-1�����Ӵ�B����AŲ��C ����n-1�����Ӵ�AŲ��C
 */
public class HanNota {
	private int i=1;
	//n��ʾn������
	public void hanNota(int n,char from,char dependOn,char to){
		if(n==1){
			move(1,from,to);
		}else{
			//������������ӣ������������Ӵ�A����CŲ��B
			hanNota(n-1,from,to,dependOn);
			//�����ĵ��̴�AŲ��C
			move(n,from,to);
			//�����������Ӵ�B����AŲ��C
			hanNota(n-1,dependOn,from,to);
		}
	}
	private void move(int n, char from, char to) {

		System.out.println("��"+i+++"��"+"��"+n+"������"+from+"----->"+to);
	}
	public static void main(String[] args) {
		HanNota hanNota = new HanNota();
		hanNota.hanNota(3, 'A', 'B','C');
	}
}
