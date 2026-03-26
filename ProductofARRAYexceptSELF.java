public class ProductofARRAYexceptSELF {
    public static int productExceptSelf(int []nums,int[]answer){

        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    product=product*nums[j];
                }
                answer[i]=product;
            }
        }
        return 0;
    }

    public static void main(String []args){
        int nums[]={-1,1,0,-3,3};
        int []answer = new int[nums.length];
        productExceptSelf(nums,answer);

        for(int i=0;i<nums.length;i++){
            System.out.print(answer[i]+"\t");
        }
    }
}
