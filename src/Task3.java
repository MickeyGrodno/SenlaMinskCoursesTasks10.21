import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//        3. Создайте программу, которая будет:
//        подсчитывать количество гласных в словах
//        выводить слова отсортированным списком по количеству гласных (сначала те, у которых больше гласных)
//        делать первую гласную букву в слове заглавной
//        Предложение вводится пользователем вручную русскими буквами. Разделитель пробел (“ ”).

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слова:");
        String line = scan.nextLine().trim().replaceAll(" +", " ");
        String[] allWords = line.split(" ");
        Map<Integer, List<String>> wordsAndVowelsCount = new TreeMap<>(Collections.reverseOrder());
        Pattern vocals = Pattern.compile("(?iu)[аеёиоуыэюя]");

        for (String word : allWords) {
            int count = 0;
            Matcher matcher = vocals.matcher(word);
            while (matcher.find()) {
                if (count == 0) {
                    word = word.substring(0,matcher.start()) + word.substring(matcher.start(),matcher.end()).toUpperCase()+word.substring(matcher.end());
                }
                count++;
            }
            if (!wordsAndVowelsCount.containsKey(count)) {
                wordsAndVowelsCount.put(count, new ArrayList<>());
            }
            wordsAndVowelsCount.get(count).add(word);
        }
        wordsAndVowelsCount.forEach((k, v) -> System.out.println(k + " " + v));
    }

}