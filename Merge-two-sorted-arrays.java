/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package solution;

/**
 *
 * @author USER
 */
import java.util.Scanner;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;

public class Solution {
    
 
    public static void
         main(String []args) throws IOException{
        
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
              InputReader uu=new InputReader(System.in);
             
       // Scanner sc=new Scanner(System.in);
        int e=uu.mInt();
        while(e-->0){
//           String []s=br.readLine().trim().split("\\s+");
//           int n=Integer.parseInt(s[0]);
//           int m=Integer.parseInt(s[1]);
//           String []ss=br.readLine().trim().split("\\s+");
//           int []arr1=new int[n];
//           for(int i=0;i<n;i++)arr1[i]=Integer.parseInt(ss[i]);
//           
//           String []sss=br.readLine().trim().split("\\s+");
//           int []arr2=new int[m];
//           for(int i=0;i<m;i++)arr2[i]=Integer.parseInt(sss[i]);
//          
            int n=uu.mInt();
            int m=uu.mInt();
            int[]arr1=uu.mIntArr(n);
            int[]arr2=uu.mIntArr(m);
           int i,j,gp;
           for(gp=Solution.gap(n+m);gp>0;gp=gap(gp)){
               for(i=0;i+gp<n;i++){
                   if(arr1[i]>arr1[i+gp]){
                       int temp=arr1[i];
                       arr1[i]=arr1[i+gp];
                       arr1[i+gp]=temp;
                   }
                   
               }
               
               for(j=gp>n?gp-n:0;j<m&&i<n;j++,i++){
                   if(arr1[i]>arr2[j]){
                       int temp=arr1[i];
                       arr1[i]=arr2[j];
                       arr2[j]=temp;
                   }
                   
               }
               
               for(;j+gp<m;j++){
                   if(arr2[j]>arr2[j+gp]){
                       int temp=arr2[j];
                       arr2[j]=arr2[j+gp];
                       arr1[j+gp]=temp;
                   }
                   
               }
           }
           String s1="";
          
               for(i=0;i<n;i++){s1=s1+arr1[i]+" ";}
               for(i=0;i<m;i++){s1=s1+arr2[i]+" ";}
               
                 bw.write(s1);
                 bw.newLine();
                // System.out.println("ydh");
                
           
    
    }
        
        bw.close();
        
         }
         
        
         private static int gap(int n){
             if(n<=1)return 0;
             else
             return ((n)/2)+((n)%2);
         }
    
    
    
    
    static class InputReader { 
        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;
        public InputReader(InputStream st) {
            this.stream = st;
        } 
        public int read() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } 
                catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }
        public int mInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        } 
        public long mLong() {
            int c = read();
            while (isSpaceChar(c)) {
            c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        } 
        public int[] mIntArr(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = mInt();
            }
            return a;
        } 
        public String mString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                    c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }
        public String nextLine() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        } 
        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
 
        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        } 
    }


    
}


class MySort {
    public void selectionSort(int[]a,int left,int right){
        //left index from 0 and right= last index
        for(int i=left;i<=right;i++){
            int min_index=i;
            for(int j=i+1;j<=right;j++){
                if(a[min_index]>a[j])min_index=j;
            }
            int temp=a[min_index];
            a[min_index]=a[i];
            a[i]=temp;
        }
    }
    
    public void bubbleSort(int a[],int  left,int right){
        //left index from 0 and right= last index
        
        for(int i=left;i<=right;i++){
            for(int j=left;j<right;j++){
                if(a[j+1]<a[j]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    
    
    public void insertionSort(int a[],int left,int right){
        //left index from 0 and right= last index
        for(int i=left+1;i<=right;i++){
            int temp=a[i];
            int j=i-1;
            for(;j>=0&&temp<a[j];j--){
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
    }
    
    public void quickSort(int a[],int left,int right){
        //left index from 0 and right= last index
        if(left<right){
            int pi_index=partition(a,left,right);
            
            quickSort(a,pi_index+1,right);//for left side of pivot
            quickSort(a,left,pi_index-1);//for right side of pivot
            
        }
        
    }
    private int partition(int a[],int left,int right){
            //last element is used as pivot
            int pivot=a[right];
            int i=left-1;
            for(int j=left;j<right;j++){
                if(pivot>a[j]){
                    i++;
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            int temp=a[i+1];
            a[i+1]=a[right];
            a[right]=temp;
            return i+1;
    }
    
    
    public void mergeSort(int []a,int left,int right){
        if(left<right){
            int m=(left+right)/2;
            mergeSort(a, left, m);
            mergeSort(a, m+1, right);
            merging(a,left,m,right);
            
        }
        
        
    }
    private void merging(int[]a,int left,int m,int right){
        int n1=m-left+1;
        int n2=right-(m+1)+1;
        int []L=new int[n1];
        int []R=new int[n2];
        
        for(int i=0;i<n1;i++){L[i]=a[left+i];}
        for(int i=0;i<n2;i++){R[i]=a[m+1+i];}
        
        int i=0;int j=0;
        int k=left;
        while(i<n1&&j<n2){
            if(L[i]<=R[j]){
                a[k]=L[i];
                i++;
            }
            else {
                a[k]=R[j];
                j++;
            }
            k++;
        }
        
        while(i<n1){
            a[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=R[j];
            j++;
            k++;
        }
    }
    
}

                
