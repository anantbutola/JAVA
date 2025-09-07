import java.util.*;
 class firstcode{
    public static void main(String[] args) {
        System.out.println("Enter button");
        Scanner obj=new Scanner(System.in);
        int button=obj.nextInt();
        switch(button){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3:System.out.println("hola");
            break;
            default: System.out.println("sasriyakal");
                
        }
       obj.close();
    }
}
