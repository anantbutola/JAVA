package patterns;

public class AdvPattern {
    public static void main(String[] args) {
     int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
             System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
             System.out.println();
        }         //diamond pattern
     }
    }
//  int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             int spaces = 2 * (n - i);
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         int p = 4;
//         for (int i = 4; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             int space = 2 * (p - i);
//             for (int j = 1; j <= space; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }           //butterfly
//   int n=5;
//        for(int i=1;i<=n;i++){
//         for(int j=1;j<=(n-i);j++){
//             System.out.print(" ");
//         }
//         for(int k=1;k<=n;k++){
//             System.out.print("*");
//         }
//         System.out.println();
    //    }   //solid rhombus
    // int n=5;
    //  int num=1;
    //  for(int i=1;i<=n;i++){
    //     for(int j=1;j<=(n-i);j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=1;k<=i;k++){
    //         System.out.print(num+" ");
    //     }
    //     num++;
    //     System.out.println();
    //  }   //number pyramid
    // int n=5;
     
    //  for(int i=1;i<=n;i++){
    //     for(int j=1;j<=(n-i);j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=i;k>=1;k--){
    //         System.out.print(k);
    //     }
    //     for(int l=2;l<=i;l++){
    //         System.out.print(l);
    //     }
    //     System.out.println();
    // }           //palindrome pyramid