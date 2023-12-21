class Solution {
    public int[] sortArray(int[] arr) {
        quicksort(arr,0,arr.length-1);
        return arr;
    }
    static void quicksort(int []arr,int lo,int hi){
        
        if(lo>=hi){
            return;
        }
        int start=lo;
        int end=hi;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        quicksort(arr,lo,end);
        quicksort(arr,start,hi);
    }
}