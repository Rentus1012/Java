public class Hellojava {
   public static void main(String args[]) {
      // 이 프로그램은 자바코드로 작성된 프로그램입니다.
      String my1stVariable = "Hello, World!";
      double PI = 3.141592; // 'const' 대신 'final'을 사용해야 합니다.
      boolean isTrue;
      isTrue = (32 < 42);
      double data = PI * 2;
      System.out.println("isTrue = " + (isTrue ? "True" : "Fslse"));
      //System.out.print(my1stVariable + (int)data);
      System.out.print(my1stVariable + (int)data+ "\n");
// 이 줄에도 몇 가지 오류가 있습니다.
   }
}
