class Solution {
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        d=d%n;
        reversee(arr,0,d-1);
        reversee(arr,d,n-1);
        reversee(arr,0,n-1);
    }
    private static void reversee(int[] arr,int s, int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
