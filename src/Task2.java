import java.util.Scanner;

//        2. Создайте программу, которая будет вычислять и выводить на экран простые множители,
//        из которых состоит целое число, введенное пользователем. Если введенное число не целое,
//        то нужно сообщать пользователю об ошибке.

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число, которое будет вычислять и выводить на экран простые множители");
        if (!scan.hasNextInt()) {
            System.out.println("Ошибка!!! Вы ввели не целое число ");
        } else {
            int number = scan.nextInt();
            int divider = 2;
            while (number != 1) {
                if (number % divider == 0) {
                    System.out.print(divider + " ");
                    number /= divider;
                } else if (divider == 2) {
                    divider++;
                } else {
                    divider += 2;
                }
            }
            scan.close();
        }
    }
}


