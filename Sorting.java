public class MySort {
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
    
    
}
