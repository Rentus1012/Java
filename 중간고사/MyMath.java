public class MyMath {
    static int count = 0;

    // ���� x�� ���밪�� ����ϴ� ���� �޼���
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

    // ���� base�� ���� exponent Ƚ����ŭ �����ϴ� ���� �޼���
    public static int power(int base, int exponent) {
        count++;
        if (exponent < 0)
        {
            return 0; // ���� ������ ���� ó�� (���� ��Ȳ)
        }

        int result = 1;
        
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
