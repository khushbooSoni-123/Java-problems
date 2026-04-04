public class pattern {

    public static void inverted_rotatedhalfpiramid(int totrow){
        for(int i=1 ; i<=totrow ; i++){
            for(int j=1 ;j<=totrow-i ; j++) {
                System.out.print(" ");
            }
            for (int k=1 ; k<=i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        return;
    }

    public static void hollow_rectangle(int totlrow ,int totlcol){
        for(int i=1 ; i<=totlrow ; i++){
            for(int j=1 ; j<=totlcol ; j++){
                if(i==1 || i==totlrow || j==1 || j==totlcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return;
    }

    public static void inverted_halfpiramid(int totrow ){
        for(int i=1 ; i<=totrow ; i++){
            for(int j=1 ; j<=totrow-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void flords_triangle(int n){
        int num=1;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i;j++ ){
                System.out.print(num +" ");
                ++num;
            }
            System.out.println();

        }
        return;
    }

    public static void main(String[] args){
       flords_triangle(5);
    }
}
