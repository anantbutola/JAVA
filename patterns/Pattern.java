package patterns;
public class Pattern{
    public static void main(String[] args){
         for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else if((i+j)%2!=0){
                    System.out.print("0");
                }else{
                    System.out.println(" ");
                }
            }
            System.out.println();
         }//0-1 half-pyramid
}
}
 // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // } //solid rectangle
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //      if (i==1||j==1||i==4||j==5) {
        //         System.out.print("*");
        //      }   else{
        //         System.out.print(" ");
        //      }
        //     }
        //     System.out.print("\n");
        // }  //hollow rectangle
    //     for(int i=1;i<=4;i++){
    //         for(int j=1;j<=5;j++){
    //          if (i==j||i>=j) {
    //             System.out.print("*");
    //         }else{
    //             System.out.print(" ");
    //         }
            
    //     } 
    //     System.out.print("\n");
    // }   //Half pyramid
     //    for(int i=4;i>=1;i--){
    //         for(int j=1;j<=5;j++){
    //          if (i>=j) {
    //             System.out.print("*");
    //         }else{
    //             System.out.print(" ");
    //         }
            
    //     } 
    //     System.out.print("\n");
    // }// inverted half pyramid
    //for(int i=4;i>=1;i--){
//             for(int j=1;j<=4;j++){
//              if (i<=j) {
//                 System.out.print("*");
//             }else{
//                 System.out.print(" ");
//             }
            
//         } 
//         System.out.print("\n");
//     }//  half pyramid rotated 180 degrees
//for(int i=1;i<=4;i++){
//             for(int j=1;j<=4;j++){
//              if (i<=j) {
//                 System.out.print("*");
//             }else{
//                 System.out.print(" ");
//             }
            
//         } 
//         System.out.print("\n");
//     }//   inverted half pyramid rotated 180 degrees  
// int num=1;
//      for(int i=1;i<=5;i++){
//         for(int j=1;j<=5;j++){
           
//           if(i>=j){
            
//             System.out.print(num+" ");
//             num++;
//           } else{
//           System.out.print("");
//         }
//             }        System.out.println();
//      } //half pyramid with number incrementing
