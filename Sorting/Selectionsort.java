package Sorting;
class Selcectionsort{

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    // public static int[] SelcSOrt(int arr[]){
    //     for(int i=0; i<arr.length-2; i++){
    //         // first is find the smallest index of value 
    //        int minpos = i; //assign the smallest value index in minpos
    //         for(int j=i+1; j<arr.length; j++){
    //            if(arr[minpos]>arr[j]){ //chack the condition if minpos value is greates then assign the vlaue in minpos =j
    //             minpos =j;
    //            }
    //         }
    //         //complete this loop find the minimum value the swap the first element of array index 
    //          int temp =  arr[minpos];
    //             arr[minpos] = arr[i];
    //             arr[i] = temp;
            
    //     }
    //     return arr;
    // }
    public static int[] bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        return arr;
    }
    public static int[] InsertionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > curr ){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] ={13,46,24,52,20,9};

        print(InsertionSort(arr));

    }
}