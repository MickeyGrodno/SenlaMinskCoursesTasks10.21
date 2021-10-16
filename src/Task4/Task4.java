package Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//        4. Создайте программу, которая будет получать число и печатать его в следующем формате
//        (формы цифр можно придумать свои, главное, чтобы они читались на экране).
//        (*) Дополнительно: сделайте так, чтобы наибольшая цифра состояла не из ‘*’,
//        а из соответствующих маленьких (обычных) цифр.

public class Task4 {
    public static void main(String[] args) {
        Numbers numb = new Numbers();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        String b = scan.nextLine();
        int max = numb.takesLine(b);
        List<String> result = new ArrayList<>();
        for (char c : b.toCharArray()) {
            String maxOrStar = max == Character.getNumericValue(c) ? String.valueOf(c) : Numbers.STAR;
            if (c == '0') {
                numb.number0(result, maxOrStar);
            } else if (c == '1') {
                numb.number1(result, maxOrStar);
            } else if (c == '2') {
                numb.number2(result, maxOrStar);
            } else if (c == '3') {
                numb.number3(result, maxOrStar);
            } else if (c == '4') {
                numb.number4(result, maxOrStar);
            } else if (c == '5') {
                numb.number5(result, maxOrStar);
            } else if (c == '6') {
                numb.number6(result, maxOrStar);
            } else if (c == '7') {
                numb.number7(result, maxOrStar);
            } else if (c == '8') {
                numb.number8(result, maxOrStar);
            } else if (c == '9')
                numb.number9(result, maxOrStar);
        }
        for (String line : result) {
            System.out.println(line);
        }
    }
}

