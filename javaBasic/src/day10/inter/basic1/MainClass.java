package day10.inter.basic1;

public class MainClass {

   public static void main(String[] args) {
      
      Basic basic = new Basic();
      basic.method01();
      basic.method02();
      System.out.println(basic.ABC); //상속받은 상수도 가지고 있어서 사용이 가능하다.
      System.out.println(Basic.ABC); //하지만 (인터페이스명.상수) 로 사용하는게 좀 더 올바른 표현이다.
      
      System.out.println("----------------------------------");
      
      /*
       * 인터페이스도 하나의 데이터 타입이 될 수 있습니다.
       */
      
      Inter01 b = new Basic(); //b. 을 찍으면 Inter01 의 기능을 사용하지만 
                         //오버라이딩된 Basic 의 메서드가 실행
      b.method01();
      //b.method02(); //Inter01에는 추상메서드 method01만 있기 때문이다.
      
      Inter02 b2 = new Basic();//b. 을 찍으면 Inter02 의 기능을 사용하지만 
                         //오버라이딩된 Basic 의 메서드가 실행
      //b2.method01(); //Inter02에는 추상메서드 method02만 있기 때문이다.
      b2.method02();
      
      System.out.println("-------------------------------");
      
      Basic bb = (Basic)b; // b 도 Basic 이라는 타입으로 형변환(캐스팅) 할 수 있다.
      bb.method01();
      bb.method02();   
   }
}
