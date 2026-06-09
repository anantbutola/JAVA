package strings;


import java.util.Arrays;

public class StringOverview {
    static void main() {
        String name = "Anant";
        String str = new String("Anant");
        System.out.println(name.length());
        System.out.println(str.charAt(1));


        String str2= "Hola";
         str2 = "Amigo";
        System.out.println(str2);


        String check1 = "hello";
        String check2 = "hello";
        String check3 = new String("hello");
        String check4 = "HELLO";
        System.out.println(check1==check2);
        System.out.println(check1 == check3);
        System.out.println(check1.equals(check3));
        System.out.println(check1.equals(check4));
        System.out.println(check1.equalsIgnoreCase(check4));

        //checking isEmpty() and blank() function
        String a= "";
        System.out.println(a.length());
        System.out.println(a.isEmpty());
        String b = "  ";
        System.out.println(b.length());
        System.out.println(b.isEmpty());
        System.out.println(b.isBlank());

        // trim method -- removes leading and trailing spaces
        String d = "    anant    ";
        System.out.println(d.length());
        System.out.println(d);
        d = d.trim();
        System.out.println(d);

        // substring -> it simply extracts substring from original string.
        String sen = "Hi my name is hola amigo!";
        System.out.println(sen.substring(3,9)); //  --> it has two parameters : beginIndex is inclusive and endingIndex is exclusive.
        //

        // contains - only checks given substring is present or not in original string.
        System.out.println(sen.contains("is hola"));

        // valueOf() - converts any datatype into string.
        int mr = 2021;
        String mr1 = String.valueOf(mr);
        System.out.println(mr1 + 1);

        // toCharArray() -> converts string to character array
        String new1 = "Anant";
        char[] arr = new1.toCharArray();
        for (char ch: arr){
            System.out.println("Val: "+ch);
        }

        // split() - according to the regular expression it breaks string into array of string.
        String new2 = "Hi,My,Name,is,Anant,Butola";
        String[] arr2 = new2.split(",");
        System.out.println(Arrays.toString(arr2));

        // replace() - replaces all old character with given new characters.
        
        String new3 = "Anant";
        new3 = new3.replace('n','z');
        System.out.println(new3);
    }
}
/*
    Making of String in 2 ways:

    1. String str = "Anant"
    2. String str1 = new String("Anant");

    both are very different:There are 2 types of memory present- heap and stack.
    IN heap memory, "String Pool" is present . When we create string using method-1 , memory allocate for that string in string pool
    present in heap memory.
    String str = "Anant"
    String ex = "Anant"
    In string pool, if "Anant" already present in there with its reference str.There is no new memory allocate for "ex" there.
    Simply, ex should also refer to "Anant" there.
    Both str and ex got same memory.Before creating memory for new objeect of string, string pool is checked and if string literal
    already present in string-pool that object simple refer to that string literal already present in string pool.
    "No new memmory allocate".
    str and ex variables take memory in "stack" & and string take memory in "heap".


    In method-2 of creating string:
    String str1 = new String("Anant");
    -> because of new , always new memory allocate for object in heap memory.
    -> and because of string literal, memory also allocate in stringpool.(Condition checked if stringpool also contains that literal)


     String str2= "Hola";
         str2 = "Amigo";
        System.out.println(str2);
    String is immutable. Means-: we cannot change string once created.
    but in here we're not changing string. we only change the reference here.
    "Hola" is still present in string-pool but  old reference now pointing to "Amigo"

    COMPARING STRINGS:
        String check1 = "hello";
        String check2 = "hello";
        String check3 = new String("hello");
     " == " : checks the reference of both string is same or not.It never checks the content of both strings.
     It simply checks both reference should point on same location or not.
     therefore, check1 and check2 result is true.
     check1 and check3 result is false b/c of differnt refernce locations.

    String check2 = "hello";
        String check3 = new String("hello");
   System.out.println(check2 == (check3));  // False..

   ".equals()": it properly checks each index value properly.It is case-sensitive.

    String check2 = "hello";
        String check3 = new String("hello");
   System.out.println(check2.equals(check3));   //True...

   ".equalsIgnoreCase()" :  it properly checks each index value properly, and it's not case-sensitive.

    String check2 = "HELLO";
        String check3 = new String("hello");
   System.out.println(check2.equals(check3)); //false
   System.out.println(check2.equalsIgnoreCase(check3));  //true..


   //checking isEmpty() and blank() function
        String a= "";
        System.out.println(a.length());
        System.out.println(a.isEmpty());
        String b = "  ";
        System.out.println(b.length());
        System.out.println(b.isEmpty());
        System.out.println(b.isBlank());

    isEmpty() - only checks string is empty or not means checks its (length=0) only.
    isBlank() - checks string lenght or any spaces present in string or not.
 */
