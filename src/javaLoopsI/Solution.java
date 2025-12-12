package javaLoopsI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1 ;i<=10;i++){
            int res = N*i;
            String formato = N+" "+"x"+" "+i+" = "+ res;
              System.out.println(formato);
        }
        bufferedReader.close();
    }

}
