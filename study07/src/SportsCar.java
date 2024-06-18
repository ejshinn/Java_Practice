// Car 클래스를 상속받아 사용하는 SportsCar 클래스
public class SportsCar extends Car {

    // Car 클래스에서 상속받은 speedUp() 메서드를 오버라이딩함
    @Override
    public void speedUp() {
        speed += 10;
    }

//    Car 클래스에서 상속받은 stop() 메서드를 오버라이딩하려고 하였지만 stop() 메서드가 final 메서드이기 때문에 오버라이딩 불가능
//    @Override
//    public void stop() {
//        System.out.println("스포츠카를 멈춤");
//        speed = 0;
//    }
}