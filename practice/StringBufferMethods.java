package practice;

public class StringBufferMethods {
    public static void main(String[] args) {
        String str ="Anant";
        StringBuffer sb=new StringBuffer(str);
        StringBuffer sr=new StringBuffer( 10);
        //sb.append("hii");
       // System.out.println(sb.delete(0,3));
        //sr.ensureCapacity(11);
        sb.insert(3,"hi");
        System.out.println(sb);

    }
}
