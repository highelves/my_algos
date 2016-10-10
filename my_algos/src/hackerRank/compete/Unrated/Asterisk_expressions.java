package hackerRank.compete.Unrated;

public class Asterisk_expressions {
	
	public static int multiply(int mul,int x, int p){
		return (mul*x)%p;
	}

	public static int exponent(int x, int n, int p){
		int mul=1;
		for(int i=0;i<n;i++){
			mul=multiply(mul,x,p);
		}
		return mul;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(exponent(2,3,5));
	}
}
