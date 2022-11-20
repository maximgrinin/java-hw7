public class ClassWork {
    public static void main(String[] args) {
        //Есть строка "Password123456qwerty"
        //эта строка - пароль от Нетфликса одного известного человека
        //Вы знаете, что этот пароль не безопасен. Вы хотите его изменить. Вот по какому правилу:
        //1) заменить "qwerty" на "67tred$32"
        //2) В начало строки добавить знак "*"
        //3) цифру 3 заменить на three
        //4) Повторить пароль два раза
        //5) Создать из пароля подстроку с 5 символа по последний
        //--------------
        //6) Добавить в конец пароля длину самого этого пароля. Password -> 8 -> Password8
        //7) Вставить в середину слово Hello, прямо четко в середину строки. Если там нечётное количество символов, то можно +- один

        String passString = "Password123456qwerty";
        String newPassString;

        newPassString = passString.replace("qwerty", "67tred$32");
        newPassString = '*' + newPassString;
        newPassString = newPassString.replace("3", "three");
        newPassString = newPassString.repeat(2);
        newPassString = newPassString.substring(5);
        newPassString = newPassString + newPassString.length();

        System.out.printf("Старый пароль: %s\n", passString);
        System.out.printf("Новый пароль: %s\n", newPassString);

        int halfLength = newPassString.length() / 2;
        newPassString = newPassString.substring(0, halfLength) + "Hello" + newPassString.substring(halfLength);

        System.out.printf("Самый новый пароль: %s\n", newPassString);
    }
}
