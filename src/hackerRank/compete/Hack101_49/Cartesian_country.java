package hackerRank.compete.Hack101_49;

import java.util.Scanner;

public class Cartesian_country {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  Return the maximum number of bridges the Rulers will commission.
        long x1 = in.nextLong();
        long y1 = in.nextLong();
        long x2 = in.nextLong();
        long y2 = in.nextLong();
        long xC = in.nextLong();
        long yC = in.nextLong();
        long x_max=(x1<x2)?x2:x1;
        long x_min=(x1<x2)?x1:x2;
        long y_max=(y1<y2)?y2:y1;
        long y_min=(y1<y2)?y1:y2;
        long min_x=(xC-x_min<x_max-xC)?(xC-x_min):(x_max-xC);
        long min_y=(yC-y_min<y_max-yC)?(yC-y_min):(y_max-yC);
        if(x_max<xC || x_min>xC || y_max<yC || y_min>yC)
            System.out.println(0);
        else
            System.out.println(Math.abs(min_x)+Math.abs(min_y)+2*(Math.abs(min_x)*Math.abs(min_y)));
    }
}
