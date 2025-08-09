import java.util.Scanner;



public class reverseinteger {
    
    public static void main(String[] args) {
        int num;
        System.out.print("enter the no. :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        boolean isNegative=num<0;
        // if (isNegative) {
        //     num=num*-1; 
        // }           Replaced By Math.abs(num);
               String str = Integer.toString(Math.abs(num));
        StringBuilder sb = new StringBuilder(str);
        //System.out.println(sb);
        sc.close();
      
        
        sb.reverse();
        try{
              int reversednum=Integer.parseInt(sb.toString());
              int ans=(isNegative)? -(reversednum): (reversednum);
              System.out.println("reversed integer is :"+ans);
        }catch(NumberFormatException e){
             System.out.println("error is :"+e.getMessage());
        }
        
      
    }
}
// for (int i = 0; i < (sb.length()) / 2; i++) {
        //     int indexstr = i;
        //     int indexend = sb.length() - 1 - i;
        //     char firstChar = sb.charAt(indexstr);
        //     char endChar = sb.charAt(indexend);

        //     sb.setCharAt(indexstr, endChar);
        //     sb.setCharAt(indexend, firstChar);
        // }     //sb.reverse() replaces this............