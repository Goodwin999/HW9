public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] expenses = generateRandomArray();
        int sum = 0;
        for (int j : expenses) {
            sum = sum + j;
        }
        System.out.println("Суммма трат в месяц составляет " + sum + " рублей ");

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] expenses = generateRandomArray();
        int min = 200_000;
        int max = 0;
        for (int expense : expenses) {
            if (expense < min) {
                min = expense;
            } else if (expense > max) {
                max = expense;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
    }

    private static void task3() {
        System.out.println("Задача 3");

        int[] expenses = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < expenses.length - 1; i++) {
            sum = sum + expenses[i];
        }
        double average = (double) sum / expenses.length;
        System.out.printf("Средняя сумма трат за месяц составила " + average + " рублей");
    }
}









