package day10.inter.basic1;

public class Basic implements Inter01, Inter02 {
   //인터페이스 상속은(구현) implements 키워드 입니다.
   //여러 인터페이스를 동시에 구현하는게 가능하다. (implements a, b, c ... 로 나열)
   //받은 인터페이스(부모)에 추상메서드가 있다면 오버라이딩을 해줘야 에러가 나지 않음


   @Override
   public void method01() {
      System.out.println("재정의된 메서드 1번 실행");
      
   }

   @Override
   public void method02() {
      System.out.println("재정의된 메서드 2번 실행");
      
   }
   
}