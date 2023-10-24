public class MyMath {
    static int count = 0;

    // 정수 x의 절대값을 계산하는 정적 메서드
    public static int abs(int x)
    {
        count++;
        if (x < 0) {
            return -x;
        }
        else
        {
            return x;
        }
    }

    // 정수 base를 정수 exponent 횟수만큼 제곱하는 정적 메서드
    public static int power(int base, int exponent) {
        count++;
        if (exponent < 0)
        {
            return 0; // 음수 지수에 대한 처리 (예외 상황)
        }

        int result = 1;
        
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
