/*        *****           *****
//     *********       *********
//   *************   *************
// *********************************
// *********************************
//   *****************************
//     *************************
//       *********************
//         *****************
//           *************
//             *********
//               *****
//                 * 
*/
public class heart {
    public static void main(String[] args) {
        int n=32;
        int space=6;
        int stars=5;
        int spaceb=11;
        for(int i=0;i<4;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int z=0;z<stars;z++){
                System.out.print("*");
            }
            for(int k=0;k<spaceb;k++){
                System.out.print(" ");
            }
            for(int l=0;l<stars;l++){
                System.out.print("*");
            }
            System.out.println();
            space=space-2;
            if(stars==16){
                break;
            }
            spaceb=spaceb-4;
            if(spaceb<0){
                spaceb=0;
            }
            if(stars==13){
                stars-=1;
                System.out.print("*");
            }
            stars=stars+4;
        }                                
        System.out.println("**********|I LOVE YOU|***********");
        space=0;
        stars=(stars+stars)+1;
        int m=0;
        for(int j=0;j<9;j++){
            for(int k=0;k<m;k++){
                System.out.print(" ");
            }
            for(int i=0;i<stars;i++){
                System.out.print("*");
            }
            System.out.println();
            stars-=4;
            m+=2;
        }
    }    
}
