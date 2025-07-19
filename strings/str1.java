package strings;

public class str1 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello World");
    System.out.println("Original String is:" + sb);
    for (int i = 0; i < sb.length() / 2; i++) {
      int front = i;
      int rear = sb.length() - 1 - i;

      char firstChar = sb.charAt(front);
      char lastChar = sb.charAt(rear);

      sb.setCharAt(front, lastChar);
      sb.setCharAt(rear, firstChar);
    }
    System.out.println("New String is:" + sb);
  }
}
