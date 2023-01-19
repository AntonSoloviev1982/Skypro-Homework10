import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static int [] generateRandomArray() {
        Random random = new Random();
        int [] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }

    public static void task1() {
        System.out.println("\nЗадание 1:");
        int [] array = generateRandomArray();
        int sumAllPaymentsForMonth = 0;
        for (int i = 0; i < array.length; i++) {
            sumAllPaymentsForMonth += array [i];
        }
        System.out.println("Сумма трат за месяц составила " + sumAllPaymentsForMonth + " рублей.");
    }

    public static void task2() {
        System.out.println("\nЗадание 2:");
        int [] array = generateRandomArray();
        int maxSum = array [0];
        int minSum = array [0];
        for (int i = 0; i < array.length; i++) {
            if (array [i] > maxSum) {
                maxSum = array [i];
            }
            if (array [i] < minSum) {
                minSum = array [i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. " +
                "Максимальная сумма трат за день составила " + maxSum + " рублей");
    }

    public static void task3() {
        System.out.println("\nЗадание 3:");
        int [] array = generateRandomArray();
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array [i];
        }
        double averageSum = total / array.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");
    }

    public static void task4() {
        System.out.println("\nЗадание 4:");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName [i]);
        }
    }

}