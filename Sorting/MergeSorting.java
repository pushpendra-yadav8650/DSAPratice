package Sorting;

public class MergeSorting {
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void MergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si+(ei-si)/2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
        merge(arr,si, mid,ei);
    }
    public static void merge(int arr[], int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i =si ;
        int j=mid+1 ;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;

        }
        while(i <= mid){
                temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }


    }
    public static void QuickSort(int arr[], int si, int ei){
        if(si>=ei){
            return ;
        }
        int Pindx = Partion(arr, si, ei);
        QuickSort(arr, si, Pindx-1);
        QuickSort(arr, Pindx+1,ei);
    }
    public static int Partion(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si; j<ei;j++){
            if(arr[j]<= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;

    }
    public static void main(String[] args) {
        int arr[] ={34,54,65,43,56,7,9};
        int si =0; 
        int ei=arr.length-1;
        QuickSort(arr, 0, ei);
        print(arr);
    }
}
