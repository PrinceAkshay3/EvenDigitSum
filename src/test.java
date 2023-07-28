public class test {
    public static int getEvenDigitSum(int num) {
        if (num < 0) {
            return -1;
        }

        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456));
}
}
