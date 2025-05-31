class Exception1 {
  public static void main(String[] args) {
      String s = "abc";
      int a = 6;
      int b = 2;
      int arr[] = {10, 20, 30};
      
      try {
          System.out.println("division " + (a / b));
      } catch (ArithmeticException e) {
          System.out.println("handled by arithmetic catch " + e);
      }
      
      try {
          System.out.println("string length " + s.length());
      } catch (NullPointerException e) {
          System.out.println("Please initialize string apart from null");
      }
      
      try {
          System.out.println("array value " + arr[3]);
      } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println(e);
      }
      
      try {
          System.out.println("Sum " + (a + b));
      } catch (Exception e) {
          System.out.println("Common Superclass " + e);
      }
      
      finally {
          System.out.println("execute compulsory");
      }
  }
}
