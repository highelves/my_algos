package hackerRank._practice.algos.b_Implementation;

	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class Divisible_sum_pairs {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        Arrays.sort(a);
	        int count=0;
	        for(int x=n-1;x>0;x--){
	            for(int y=0;y<x;y++){
	                if ((a[x]+a[y])%k==0)
	                    count++;
	            }
	        }
	        System.out.println(count);
	    }
}