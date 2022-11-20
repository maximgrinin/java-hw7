import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // First level: Level1:
        // 1) В программу (в консоль) вводится строка. Найдите длину строки, если она больше 10, то выведите true, иначе false
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        int inputStringLen = inputString.length();

        if (inputStringLen > 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // Тест тернарных операций в Java
        System.out.println(inputStringLen > 10 ? "True" : "False");

        // 2) В программу (в консоль) вводится строка. Если первый и последний символ равны - выведите true, иначе false
        System.out.println();
        System.out.print("Введите еще одну строку: ");
        inputString = scanner.nextLine();
        inputStringLen = inputString.length();

        if (inputStringLen > 1 && inputString.charAt(0) == inputString.charAt(inputStringLen - 1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Level2:
        // В программу вводится строка из двух букв A и B, замените все буквы A на B, а все B на A. Например ABBA -> BAAB
        System.out.println();
        System.out.print("Введите последнюю строку: ");
        inputString = scanner.nextLine();

        StringBuilder newStr = new StringBuilder();
        for (char ch: inputString.toCharArray()) {
            if (ch == 'a' || ch == 'A' || ch == 'а' || ch == 'А') {
                newStr.append(++ch);
            } else if (ch == 'b' || ch == 'B' || ch == 'б' || ch == 'Б') {
                newStr.append(--ch);
            } else {
                newStr.append(ch);
            }
        }

        System.out.println(newStr);
    }
}