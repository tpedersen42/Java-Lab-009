import java.math.BigInteger;

public class BigIntRewrite {
    public static BigInteger pow(int x, int n) {
        if (n == 0) return BigInteger.ONE;

        BigInteger bigX = BigInteger.valueOf(x);
        BigInteger t = pow(x, n / 2);

        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(bigX);
        }

    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        BigInteger result = pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);


    }
}
