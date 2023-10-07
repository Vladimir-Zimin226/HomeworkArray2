import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        tasks();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void tasks() {
        int[] arr = generateRandomArray();

        //Task 1
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        //Task 2
        int min = arr[0];
        int max = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        //Task 3
        int monthDays = 30;
        double middleSlending = sum / monthDays;
        System.out.println("Средняя сумма трат за месяц составила " + middleSlending + " рублей.");


        //Task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}