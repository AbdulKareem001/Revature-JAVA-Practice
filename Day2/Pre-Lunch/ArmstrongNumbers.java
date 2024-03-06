public class ArmstrongNumbers {
    public static void main(String[] args) {
        for(int i = 100; i <= 500; i++) {
            if(isArmstrong(i)) {
                System.out.println(i + " is an Armstrong number");
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int temp = number;
        int sum = 0;
        while(temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        return number == sum;
    }
}