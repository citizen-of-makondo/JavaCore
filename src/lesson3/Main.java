package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        guessNumber();
        guessWord();
    }

    private static void guessNumber() throws IOException {

        int tryCount = 0;
        int randomNumber = (int) (Math.random() * 10);
        System.out.println("Введите целое число от 0 до 9");
        while (tryCount < 3) {
            int number = Integer.parseInt(reader.readLine());
            if (number == randomNumber) {
                System.out.println("Вы выйграли");
                restartGame();
            } else if (number < randomNumber) {
                System.out.println("Загаданное число больше");
                tryCount++;
            } else if (number > randomNumber) {
                System.out.println("Загаданное число меньше");
                tryCount++;
            }
        }
        System.out.println("У вас закончились попытки. Правильный ответ " + randomNumber);
        restartGame();
    }

    private static void restartGame() throws IOException {
        System.out.println("Хотите сыграть еще раз? 1 - да, 0 - нет");
        String answer = reader.readLine();
        if (answer.equals("1")) {
            guessNumber();
        } else {
            System.exit(0);
        }
    }

    private static void guessWord() throws IOException {
        String[] words = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int numberOfWord = random.nextInt(25);
        String changeRandomWord = changeWord(words[numberOfWord]);
        System.out.println("Введите слово");
        String userWord = reader.readLine();
        String changeUserWord = changeWord(userWord);
        while (true) {
            if (changeRandomWord.equalsIgnoreCase(changeUserWord)) {
                System.out.println("Вы выйграли!");
                break;
            }
            String rightAnswer = "";
            for (int i = 0; i < 16; i++) {
                if (changeUserWord.charAt(i) == changeRandomWord.charAt(i)) {
                    rightAnswer += changeUserWord.charAt(i);
                } else {
                    rightAnswer += "#";
                }
            }
            System.out.println(rightAnswer);
            changeUserWord = changeWord(reader.readLine());
        }
    }

    private static String changeWord(String word) {
        int length = word.length();
        for (int i = length; i < 16; i++) {
            word += "#";
        }
        return word;
    }
}