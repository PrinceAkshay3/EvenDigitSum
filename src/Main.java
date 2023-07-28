public class Main {
    public static void main(String[] args) {
        int number = 1231234;
        System.out.println(getEvenDigitSum(number) != -1 ? "The sum of the prime number in the digits is "+getEvenDigitSum(number)+"." : number+ " Invalid, Please enter a positive number.");
    }

    public static boolean isPrime(int number){

       return number % 2 == 0;

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int lasDigit = 0;
        int sum = 0;
        while (number !=0) {
            lasDigit = number % 10;

            if (isPrime(lasDigit)) {
                sum += lasDigit;
            }
            number /= 10;
        }
        return sum;
    }
}
