class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            int s=0, e=m-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mat[i][mid]==x) return true;
            else if(mat[i][mid]>x) e=mid-1;
            else s=mid+1;
          }
        }
        return false;
    }
}
