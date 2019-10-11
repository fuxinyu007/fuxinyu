package recursion;
/*
 * 欧几里德原理
 */
public class Gcd {
	//(m>n)m和n的最大公约数 =n和m%n的最大公约数
	// m=36 n=24
	public static void main(String[] args) {
		Gcd gcd = new Gcd();
		int x=gcd.gcd(99, 55);
		System.out.println(x);
	}
	public int gcd(int m,int n){
		if(n==0){
			return m;
		}else{
			return gcd(n,m%n);
		}
	}
	
}
