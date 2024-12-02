class solution{
  public int secondLargest(int[] arr{
    int n=arr.length;
    int l=-1;
    int r=-1;
    for(int i=0;i<n;i++){
      if(arr[i]>l){
        r=l;
        l=arr[i];
      }
       else if(arr[i]>r && arr[i]!=l){
          r=arr[i];
            }
      }
      return r;
    }
}    
