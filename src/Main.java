import java.util.Arrays;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        //Задача 1 - Сумма всех выплат
        int payMonth = 0;

        for (int pay : arr) {
            payMonth = payMonth + pay;
        }
        System.out.println("Сумма трат за месяц составила " + payMonth + " рублей.");
        System.out.println(" ");

        //Задача 2 - Максимальная и минимальная трата за день
        //Можно решить задачу так:
        int maxPay = 100_000;
        int minPay = 200_000;

        for (int pay : arr) {
            if (pay > maxPay) {
                maxPay = pay;
            }
            if (pay < minPay) {
                minPay = pay;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPay + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxPay + " рублей");
        System.out.println(" ");

        //А можно сделать еще проще:
        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + arr[arr.length-1] + " рублей");
        System.out.println(" ");

        //Задача 3 - Средняя сумма трат за месяц
        float averageCostPerMonth = (float)payMonth / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageCostPerMonth + " рублей");
        System.out.println(" ");

        //Задача 4 - ФИО - ОИФ
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i = i - 1) {
            System.out.print(reverseFullName[i]);
        }

    }

}