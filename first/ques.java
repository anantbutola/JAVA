import java.util.Scanner;

public class ques {
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    String num=sc.nextLine();
    char largest =num.charAt(0);
    for (int i = 1; i < num.length(); i++) {
        if (num.charAt(i)>largest) {
            largest=num.charAt(i);
        }
    }
    System.out.println(largest);
    sc.close();
  }
}
