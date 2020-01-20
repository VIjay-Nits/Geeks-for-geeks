
  import java.util.Scanner;
public class Solution {

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            int len=scan.nextInt();
            int K=scan.nextInt();
            
            int[]a=new int[len];
            for(int i=0;i<len;i++){
                a[i]=scan.nextInt();
            }
            Solution sc=new Solution();
            int i=sc.binarySearch(a,0,len-1,K);
            if(i==1)
                System.out.println("1");
            else 
                System.out.println("-1");
        }
  

  }
    public int binarySearch(int a[],int l,int r,int K){
        if(r>0){
            if(a[(l+r)/2]==K)return 1;
            else if(a[(l+r)/2]>K){return binarySearch(a, 0, ((l+r)/2)-1, K);}
            else if(a[(l+r)/2]<K){return binarySearch(a, ((l+r)/2)+1, r, K);}
            else return -1;
        }
        else return -1;
    }
}

    
    
    

