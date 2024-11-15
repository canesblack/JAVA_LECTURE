package p1_Loop;

public class Main {
  
    public static void main(String[] args) {
        // for 반복문 예시: 100명의 아이들에게 아이스크림을 나눠주는 코드
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "번째 아이에게 아이스크림을 줬다.");
        }

        // while 반복문 예시: 5명의 아이들에게 아이스크림을 나눠주는 코드
        int i = 1;
        while (i <= 5) {
            System.out.println(i + "번째 아이에게 아이스크림을 줬다.");
            i++; // i 값을 증가시켜 조건이 거짓이 되도록 유도
        }

        // do-while 반복문 예시: 최소 한 번은 실행되는 코드
        int j = 1;
        do {
            System.out.println(j + "번째 아이에게 아이스크림을 줬다.");
            j++;
        } while (j <= 3);

        // 중첩된 for 문 예시: 각 줄에 있는 5명의 아이들에게 아이스크림을 나눠주는 코드
        for (int row = 1; row <= 3; row++) {
            System.out.println(row + "번째 줄:");
            for (int col = 1; col <= 5; col++) {
                System.out.println("   " + col + "번째 아이에게 아이스크림을 줬다.");
            }
        }
    }
}