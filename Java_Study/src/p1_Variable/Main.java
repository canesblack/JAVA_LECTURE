package p1_Variable;

public class Main {
    public static void main(String[] args) {
        
        // 정수형 (Integer Type)
        // int: 정수를 표현하는 자료형, 양수, 음수, 0을 포함할 수 있습니다.
        int positiveNumber = 10; // 양수 예시
        int negativeNumber = -5; // 음수 예시
        int zero = 0; // 0 예시
        System.out.println("정수형 예시: " + positiveNumber + ", " + negativeNumber + ", " + zero);
        
        // 실수형 (Floating Point Types)
        // float: 소수점 이하 숫자를 포함한 실수 표현 (float는 f를 뒤에 붙여야 함)
        // double: 더 높은 정밀도를 가진 실수 표현
        float floatNumber = 3.14f; // 소수(float) 예시
        double doubleNumber = 3.14159; // 소수(double) 예시
        System.out.println("실수형 예시 - float: " + floatNumber + ", double: " + doubleNumber);
        
        // 문자형 (Character Type)
        // char: 한 개의 문자만을 표현하는 자료형, 작은 따옴표(' ')를 사용
        char letter = 'A'; // 문자 예시
        char koreanLetter = '가'; // 한글 문자 예시
        System.out.println("문자형 예시: " + letter + ", " + koreanLetter);
        
        // 논리형 (Boolean Type)
        // boolean: 참(true) 또는 거짓(false)만을 표현하는 자료형
        boolean isTrue = true; // 참 예시
        boolean isFalse = false; // 거짓 예시
        System.out.println("논리형 예시: " + isTrue + ", " + isFalse);
    }
}
