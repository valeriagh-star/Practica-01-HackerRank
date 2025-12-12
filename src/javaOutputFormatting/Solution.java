package javaOutputFormatting;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1 = sc.next();
            String spaces = s1 + "               ";
            spaces = spaces.substring(0, 15);
            int x = sc.nextInt();
            String xFormatted;
            if (x < 10) {
                xFormatted = "00" + x;
            } else if (x < 100) {
                xFormatted = "0" + x;
               } else {
                    xFormatted = "" + x;
                }
        System.out.println(spaces + xFormatted);
            
        }
        System.out.println("================================");
		sc.close();
	}
}