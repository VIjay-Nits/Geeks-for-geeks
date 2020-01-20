 import java.util.Scanner;
import java.util.*;
public class Solution {

  public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int n=(a*(a+1))/2;
        a--;
        while(a-->0){
            n=n-scan.nextInt();
        }
        System.out.println(n);
  
  }
}
