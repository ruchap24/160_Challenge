class Solution {
    public void reverseArray(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int t=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=t;
        }
    }
}
