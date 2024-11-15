package p1_EffectiveRange;

public class Main {
    // 전역변수 (인스턴스 변수)
    int x = 10; 

    public void method() {
        // 지역변수
        int x = 20; 
        System.out.println("지역변수 x: " + x); // 지역변수 출력
        System.out.println("전역변수 x: " + this.x); // 전역변수 출력

        // 블록변수 예시
        if (x == 20) {
            int y = 30; // 블록변수
            System.out.println("if문 안에서 y: " + y); // 블록변수 y 출력
        }

        // System.out.println(y); // 오류 발생: y는 if문 블록을 벗어나면 접근 불가
    }

    public static void main(String[] args) {
        // Main 객체 생성 후 메소드 호출(차후배움-> 걱정하지말것)
        Main obj = new Main();
        obj.method(); // 인스턴스 메소드 호출
    }
}