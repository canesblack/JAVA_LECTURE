package p1_Array;

public class Main {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] numbers = {10, 20, 30, 40, 50};
        
        // 배열의 모든 요소 출력
        System.out.println("배열의 모든 요소:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        
        // 배열의 합계 계산
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        // 평균 계산
        double average = (double) sum / numbers.length;
        System.out.println("배열 요소의 합계: " + sum);
        System.out.println("배열 요소의 평균: " + average);
    }
}