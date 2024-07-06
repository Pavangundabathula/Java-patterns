import java.util.*;

/*

             *      *
             **    **
             ***  ***
             ********
             ********
             ***  ***
             **    **
             *      *
*/
public class butterfly {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<4;i++){
            for(int j=0;j<(i+1);j++){
                System.out.print("*");
            }
            for(int k=0;k<n;k++){
                System.out.print(" ");
            }
            for(int l=0;l<(i+1);l++){
                System.out.print("*");
            }
            System.out.println();
            n=n-2;
        }
        n=n+2;
        for(int i=3;i>=0;i--){
            for(int j=0;j<(i+1);j++){
                System.out.print("*");
            }
            for(int k=0;k<n;k++){
                System.out.print(" ");
            }
            for(int l=0;l<(i+1);l++){
                System.out.print("*");
            }
            System.out.println();
            n=n+2;
        }
    }
}
