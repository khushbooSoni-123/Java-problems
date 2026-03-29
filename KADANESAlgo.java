public class KADANESAlgo {
    // to find Meximum subarray using kadane's Algorithm

    public static void MaxSubarray(int []numbers){
        int currentsum=0;
        int maxsum= Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            currentsum= (currentsum+numbers[i])<0 ? currentsum=0 :currentsum+numbers[i];
            if(currentsum>maxsum){
                maxsum=currentsum;
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String []args){
        int []numbers={-2,-3,4,-1,-2,1,5,-3};
        MaxSubarray(numbers);
    }
}
