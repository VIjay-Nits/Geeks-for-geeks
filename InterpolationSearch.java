 import java.util.Scanner;
import java.util.*;
public class Solution {

  public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
       
       
            int len=scan.nextInt();
            int K=scan.nextInt();
            
            int[]a=new int[len];
            for(int i=0;i<len;i++){
                a[i]=scan.nextInt();
            }
            Solution sc=new Solution();
            int i=sc.interpolationSearch(a,K,0,len-1);
            if(i==1)
                System.out.println("1");
            else 
                System.out.println("-1");
        
  

  }
    
  public int interpolationSearch(int a[],int K,int low,int hi){
           int pos=low+(((K-a[low])*(hi-low))/(a[hi]-a[low]));
          
           if(a[pos]==K)return 1;
           else if(a[pos]>K)return interpolationSearch(a,K,low,pos-1);
           else if(a[pos]<K)return interpolationSearch(a,K,pos+1,hi);
           else return -1;
           
          
           
  
  }
  
 
