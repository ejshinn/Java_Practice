public class IfEx {
    public static void main(String[] args) {
        int score = 95;

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if (score < 90) {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }

        System.out.println("\n------------------\n");

        int money = 15000;

        System.out.println("중화요리점에 갑니다.");
        System.out.println("자장면을 주문합니다.");

        if (money >= 12000) {
            System.out.println("군만두를 주문합니다.");
        }

        System.out.println("주문한 음식을 먹습니다.");
    }
}