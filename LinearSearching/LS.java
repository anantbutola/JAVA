

public class LS {
public static void main(String[] args) {
    int[] arr={2,4,12,567,9999,86,290};
    int ans=count(arr);
    System.out.println(ans);
}    
public static int count(int[] arr){
    int count=0;
    for (int i = 0; i < arr.length; i++) {
        if (checkEven(arr[i])) {
            count++;
        }
    }
    return count;
}
public static boolean checkEven(int num) {
  int count=0;
  while (num>0) {
    count++;
    num=num/10;
    
  }
    return count % 2 == 0;
  
}
     
}
 //public static void main(String[] args) {
//         int[] arr={11,8,9,1246,78};
//         System.out.println(countarray(arr));
        
//     }
//      public static int countarray(int [] arr) {
//         int count=0;
//     for (int num : arr) {
//         if (evenDigits(num)) {
//             count++;
//         }
//     }
//     return count;
// }
// public static boolean evenDigits(int num) {
//         int count=0;
//         while (num>0) {
//             count++;
//             num=num/10;
//         }
//         if (count%2==0) {
//             return true;
//         } else{
//             return false;
//         }
//      }