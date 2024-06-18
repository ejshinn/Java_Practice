// 부모 인터페이스로 사용되는 InterC
// 최상위 인터페이스 InterA, InterB를 동시에 상속받고 있음
public interface InterC extends InterA, InterB {
    // InterA로부터 상속받은 추상 메서드 methodA() 가 존재함
    // InterB로 부터 상속받은 추상 메서드 methodB() 가 존재함

    // 자신의 추상 메서드 methodC()가 존재함
    void methodC();
}