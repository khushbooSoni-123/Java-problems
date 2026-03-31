import java.util.Arrays;

public class sumIndices {

    public static int[] twosum(int[] nums, int target) {
        int []ans=new int[2];
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] + nums[i + 1]) == target){
                ans[0]=i;
                ans[1]=i+1;
                break;
            }
        }
        return ans;
    }
    public static void main(String []args){
        int []nums={1,5,3};
        int []ans;
        int target=8;
        twosum(nums,target);
        System.out.println("A ");
    }
}
