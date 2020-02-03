import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.lang.*;
import java.util.*;
public class Solution{
    public static void
         main(String [] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int N=Integer.parseInt(br.readLine());
            //BigInteger b;
            BigInteger a=BigInteger.valueOf(0);
            BigInteger b= BigInteger.valueOf(1);
            BigInteger c= BigInteger.valueOf(1);
            for(int i=2;i<=N;i++){
                c=a.add(b);
                a=b;
                b=c;
            }
            BigInteger A=BigInteger.valueOf(1000000007);
            System.out.println(c.mod(A));
        }
    }
}
