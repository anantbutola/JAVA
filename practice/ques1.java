package practice;

public class ques1 {
    public static void main(String[] args) {
        String str = "anant";
        String  str1 ="butola";
        StringBuilder common = new StringBuilder();
        StringBuilder different = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                if (str.charAt(i)==str1.charAt(j)){
                   if (!common.toString().contains(String.valueOf(str.charAt(i)))){
                       common.append(str.charAt(i));
                   }

                }
            }
        }

        for (int i = 0; i < str.length(); i++) {
            boolean find = false;
            for(int j=0;j<str1.length();j++){
                if(str.charAt(i)==str1.charAt(j)){
                    find=true;
                    break;
                }
            }
            if(!find){
                if (!different.toString().contains(String.valueOf(str.charAt(i)))){
                    different.append(str.charAt(i));
                }

            }
        }

        for (int i = 0; i < str1.length(); i++) {
            boolean find = false;
            for(int j=0;j<str.length();j++){
                if(str1.charAt(i)==str.charAt(j)){
                    find=true;
                    break;
                }
            }
            if(!find){
                if (!different.toString().contains(String.valueOf(str1.charAt(i)))){
                    different.append(str1.charAt(i));
                }
            }
        }

        System.out.println("Common characters : "+common);
        System.out.println("Different characters : "+different);
    }


}
