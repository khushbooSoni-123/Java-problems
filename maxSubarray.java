public class maxSubarray {   //maximum sub array using prefix sum
    public static void prefixSum(int numbers[]){
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
       int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i+1;j<numbers.length;j++) {
                int end = j;
                currentsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                System.out.print("current sum : "+currentsum+"\t");
            }
            System.out.println();
                if(currentsum>maxsum){
                    maxsum=currentsum;

            }

        }
        System.out.println(maxsum);
}

    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        prefixSum(numbers);
    }
}
