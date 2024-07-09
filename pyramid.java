import java.util.*;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no steps of Pyramid: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=n;
            for(int j=0;j<=(m-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<(i+1);k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
