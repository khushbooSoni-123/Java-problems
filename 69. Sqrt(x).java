class Solution {
    public int mySqrt(int x) {
        int left=1;
        int right = x;
        if(x==0) return 0; 
        while(true){
          
           int mid = (left+right)/2;
            
           if(mid==x/mid){
            return mid; 
           } 
           if(mid>x/mid){
            right=mid-1;
            if(left>right){
                return right;
            }
            mid=(left+right)/2;
           }

           if(mid<x/mid){
            left=mid+1;
            if(left>right){
                return right;
            }
            mid=(left+right)/2;
           }
           
        }
       
    }
}
