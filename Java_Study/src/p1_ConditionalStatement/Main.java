package p1_ConditionalStatement;

public class Main {
    public static void main(String[] args) {
        // 첫 번째 조건문 예시: 비가 오는 상황
        boolean 비가오는중 = true;

        if (비가오는중 == true) {
            System.out.println("우산을 쓰고 다닌다.");
        } else {
            System.out.println("우산을 쓰지 않는다.");
        }

        // 두 번째 조건문 예시: 점수에 따른 등급
        int score = 85;

        if (score >= 90) {
            System.out.println("A등급");
        } else if (score >= 80) {
            System.out.println("B등급");
        } else if (score >= 70) {
            System.out.println("C등급");
        } else {
            System.out.println("F등급");
        }
    }
}