public class Variable {
    public static void main(String[] args) {
        /*
            변수 명명법 - 자바에서 변수를 생성 시 효과적으로 사용하기 위한 규칙
            1. 변수명은 반드시 영어로 입력
            2. 변수명에 영문자 및 숫자, 특수문자 ($, _)를 사용 가능
            3. 변수명의 첫 글자는 반드시 영문자이어야 함
            4. 영어 대소문자를 구분함
            5. 2개 이상의 단어로 조합된 이름의 경우 첫 번째 단어는 모두 영어 소문자로 입력, 두 번째 이상의 단어는 첫 글자는 영어 대문자, 두 번째 글자 이후로는 영어 소문자로 입력
            6. 자바 예약어는 변수명으로 사용할 수 없음
        */

        int apple = 10;
        int 사과 = 1000; // 한글로 변수명을 입력해도 오류가 발생하지 않음, 관례적으로 프로그래밍 시 데이터를 제외하고는 영어로 입력하는 것이 좋음

        System.out.println(apple);
        System.out.println(사과);

        int iphone15 = 150; // 변수 이름에 숫자 사용 가능
        int iphone15max = 180;
        int iphone1$_ = 150; // 변수 이름에 특수문자 $, _ 사용 가능
        // int iphone@#@!$%^&*() = 150; // 변수 이름에 $, _를 제외한 특수문자는 사용 불가
        // int 15iphone = 150; // 변수 이름의 가장 처음에 숫자 사용 불가
        int appleiphone15promax = 180;
        int appleIphone15ProMax = 180; // 카멜 명명법, 변수, 메서드에 사용
        int apple_iphone_15_pro_max = 180; // 스네이크 명명법, 상수에 사용
        int AppleIphone15ProMax = 180; // 파스칼 명명법, 클래스에 사용
        int iphone16 = 200;
        int iPhone16 = 200;
        int iPhOnE16 = 200;

        // 변수의 초기화 : 변수를 선언 후 최초로 데이터를 저장하는 작업

        // int value; // 변수를 선언만 하고 데이터의 초기화는 없음
        // 변수의 초기화가 이루어지지 않은 변수는 사용 불가능
        // System.out.println(value);
        int value1;
        value1 = 10;
        System.out.println(value1);

        System.out.println("\n-------------------");

        int var1 = 10;
        System.out.println("main 메소드에서 선언한 var1 : " + var1);

        System.out.println("-------------------");
        if (true) {
            int var2 = 20;
            System.out.println("if 문에서 선언한 var2 : " + var2);
            System.out.println("if 문에서 var1 호출 : " + var1);
            // System.out.println("if 문에서 var3 호출 : " + var3);
        }

        System.out.println("-------------------");
        for (int i = 0; i < 1; i++) {
            int var3 = 30;
            System.out.println("for 문 에서 선언한 var3 : " + var3);
            System.out.println("for 문에서 var1 호출 : " + var1);
            // System.out.println("for 문에서 var2 호출 : " + var2);
        }

        // var2는 if 안에서 선언한 변수이므로 if 문을 벗어나면 삭제됨
        // System.out.println("main에서 var2 호출 : " + var2);

        // var3은 for 안에서 선언한 변수이므로 for 문 벗어나면 삭제됨
        // System.out.println("main에서 var3 호출 : " + var3);
    }
}