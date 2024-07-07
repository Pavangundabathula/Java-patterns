

/*
               *
             * * *
           * * * * *
         * * * * * * *
         * * * * * * *
           * * * * *
             * * *
               *


 */

public class diamond{
    public static void main(String[] args) {
        int m=0;
        for(int i=0;i<4;i++){
            int n=3;
            for(int j=0;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int k=0;k<=(m);k++){
                System.out.print("*");
            }
            System.out.println();
            m=m+2;
        }
        m=m-2;
        for(int i=0;i<4;i++){
            int n=0;
                for(int j=0;j<=(n+i);j++){
                    System.out.print(" ");
                }
    
                for(int k=0;k<=(m);k++){
                    System.out.print("*");
                }
                System.out.println();
                m=m-2;
        }
    }
}