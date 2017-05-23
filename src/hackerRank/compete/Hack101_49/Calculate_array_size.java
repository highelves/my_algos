package hackerRank.compete.Hack101_49;


import java.util.Scanner;

public class Calculate_array_size {

    public static void main(String args[])
    {
        Calculate_array_size cas = new Calculate_array_size();

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double p=1;
        for(int j=0;j<n;j++) {
            p = p * sc.nextInt();
        }
        System.out.println((int)Math.floor(p/256));

        sc.close();
    }
}
