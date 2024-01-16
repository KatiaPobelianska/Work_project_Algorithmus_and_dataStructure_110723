package homeTask20240110.task3;

import java.util.*;

/*
Task 3. Сгруппируйте слова с одинаковым набором символов
Дан список слов со строчными буквами. Реализуйте функцию поиска всех слов с одинаковым уникальным набором символов.


Input: String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf", "tact"};
Output :
student, students
cat, act, tact
dog, god
flow, wolf
(Набор букв 1 группы: s, t, u, d, e, n, t; 2 группы: a, c, t; 3 группы: d, o, g; 4 группы: f, l, o, w)
Группы слов функция возвращает в виде List>, либо сразу печатает в консоль.*/
public class MainClass {
    public static void main(String[] args) {
        String[] words = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf", "tact"};

        Map<String, List<String>> groupedWords = groupWords(words);

        for (List<String> group : groupedWords.values()) {
            System.out.println(String.join(", ", group));
        }
    }
    public static Map<String, List<String>> groupWords(String[] words) {
        Map<String, List<String>> groupedWords = new LinkedHashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String uniqueChars = new String(charArray);

            groupedWords.computeIfAbsent(uniqueChars, k -> new ArrayList<>()).add(word);
        }
        return groupedWords;
    }
}
