public class Promotion {
    public static void main(String[] args) {
        byte byteValue = 10;
        // byte 타입보다 int 타입이 더 큰 데이터 타입이므로 자동 타입 변환 발생
        int intValue = byteValue;
        System.out.println(intValue);

        char charValue = 'A';
        System.out.println(charValue);
        // 자바에서 정수 타입의 기본 데이터 타입은 int 타입
        // 작은 정수 타입의 연산이 발생 시 정수 타입으로 자동 변환되어서 연산됨
        // 연산된 결과가 int 타입이므로 char 타입의 변수에 저장할 수 없어서 강제 타입 변환을 통해서 데이터를 저장함
        charValue = (char)(charValue + 1);
        System.out.println(charValue);
        intValue = charValue + 1;
        System.out.println("A의 유니코드 : " + intValue);

        intValue = 500;
        // 변수 longValue는 long 타입의 변수이므로 int 타입 데이터를 자동 타입 변환하여 저장함
        long longValue = intValue;
        System.out.println(longValue);

        intValue = 200;
        // 변수 doubleValue는 double 타입의 변수이므로 int 타입 데이터를 자동 타입 변환하여 저장함
        double doubleValue = intValue;
        System.out.println(doubleValue);
    }
}