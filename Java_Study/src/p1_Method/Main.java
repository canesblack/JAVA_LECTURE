package p1_Method;

public class Main {
    public static void main(String[] args) {
        // 메소드 호출
        int result = add(10, 20);
        System.out.println("더하기 결과: " + result);

        int subtractResult = subtract(20, 5);
        System.out.println("빼기 결과: " + subtractResult);
    }

    // 더하기 메소드
    public static int add(int a, int b) {
        return a + b;
    }

    // 빼기 메소드
    public static int subtract(int a, int b) {
        return a - b;
    }
}

