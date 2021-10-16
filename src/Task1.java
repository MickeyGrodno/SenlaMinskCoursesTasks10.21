import java.util.Scanner;


//        1. Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке. Если цифр нет,
//        то возвращаемая сумма должна быть равна 0.

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку с цифрами:");
        String line = scan.nextLine();
        String numberLine = line.replaceAll("\\D", "");
        int sum = 0;
        if (!numberLine.isEmpty()) {
            int numbers = Integer.parseInt(numberLine);
            while (numbers > 0) {
                sum += numbers % 10;
                numbers = numbers / 10;
            }
        }
        System.out.println(sum);
        scan.close();
    }


}