public class DuplicateElements {

    public static boolean duplicateElements(int nums[]){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String []args){
        {
            int nums[]={1,3,4,0,5,1};
            System.out.println((duplicateElements(nums)));
        }
    }
}
