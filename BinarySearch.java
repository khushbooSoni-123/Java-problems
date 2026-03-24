public class BinarySearch {

    public int binarySearch(int arr[],int l,int r,int target) {

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                return 1;
            }
            if(arr[mid]<target)
            {
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;

    }
        public static void main (String[]args){      //processor operation
        BinarySearch sc=new BinarySearch();

            int arr[] = {10, 12, 15, 19, 20, 25, 30,32,36,40};
           int result= sc.binarySearch(arr,0,arr.length,15);
            if(result ==1){
                System.out.println("found");
            }
            else{
                System.out.println("not found");
            }
        }
    }
