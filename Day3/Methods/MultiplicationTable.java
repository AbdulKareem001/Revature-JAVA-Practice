public class MultiplicationTable {
    public static void printTable(int number, int multiplier) {
        if (multiplier <= 10) {
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            printTable(number, multiplier + 1);
        }
    }

    public static void main(String[] args) {
        int number = 15;
        printTable(number, 1);
    }
}
