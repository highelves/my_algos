package hackerRank.compete.WoC24;

import java.util.Scanner;

public class Apple_and_orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		int t=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		int orange=0,apple=0;
		for(int p=0;p<m;p++){
			int c=sc.nextInt();
			if(a+c>=s && a+c<=t)
				apple++;
		}
		for(int q=0;q<n;q++){
			int d=sc.nextInt();
			if(b+d>=s && b+d<=t)
				orange++;
		}
		sc.close();
		System.out.println(apple+"\n"+orange);
	}

}
