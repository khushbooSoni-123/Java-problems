public class TrappedRainwater {
    public static void trappedRainwater(int height[]){
        int leftmaxboundary[]=new int [height.length];
        leftmaxboundary[0]=height[0];
        for(int i=1;i<height.length;i+=1){
           leftmaxboundary[i]=Math.max(leftmaxboundary[i-1],height[i]);
        }
        int rightmaxboundary[]=new int [height.length];

        rightmaxboundary[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
           rightmaxboundary[i]=Math.max(height[i],rightmaxboundary[i+1]);
        }

        int tw=0,waterlevel;
        for(int i=0;i<height.length;i++){
            waterlevel=Math.min(leftmaxboundary[i],rightmaxboundary[i]);
            tw=tw+(waterlevel-height[i]);
        }
        System.out.println(tw);

    }
    public static void main(String []args){
        int height[]={4,2,0,6,3,2,5};
        trappedRainwater(height);
    }
}
