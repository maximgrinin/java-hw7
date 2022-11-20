public class StringLearning {
    public static void main(String[] args) {

        //примитивные
        //byte
        //short
        //int
        //long

        //float
        //double

        //boolean

        //char


        //объекты
        //Scanner
        //String


        String str = "Java is good";

        System.out.println(str.length()); //Длина строки
        System.out.println(str.toLowerCase()); //к нижнему регистру
        System.out.println(str.toUpperCase()); //к верхнему регистру
        System.out.println(str.charAt(0)); //получить символ из строки.
        // !!!Внимание!!! - первый символ имеет индекс = 0

        int len = str.length();
        System.out.println(str.charAt(len - 1)); //последний символ строки

        System.out.println(str.charAt(str.length() - 1)); //можно и так найти последний символ

        System.out.println(str.replace('a', 'b')); //замена всех символов на другой символы
        System.out.println(str.replace("Java", "Python")); //замена подстроки на подстроку
        System.out.println(str.contains("is")); //Есть ли подстрока в строке (true, false)
        System.out.println(str.startsWith("Java")); //Начинается ли строка на подстроку
        System.out.println(str.endsWith("god")); //Кончается ли строка на подстроку
        System.out.println(str.indexOf('y')); //Найти индекс первой встречной буквы (-1 = символа нет)
        str = str + " "; //добавить пробел к концу строки
        System.out.println(str.repeat(5));
        str = "!" + str;
        System.out.println(str); //добавить символ (строку) в начало строки

        System.out.println(str.substring(2, 6)); //взять часть строки со 2 символа по 6 (НЕ ВКЛЮЧАЯ 6). [2, 6) - кусочек строки
        System.out.println(str.substring(2)); //взять часть строки со 2 символа по ПОСЛЕДНИЙ

        System.out.println(str);

        //до 46-47 минут

        str = str.replace('J', 'T'); //Заменил J на T и поместил в переменную (коробку) новую строку
        str = str.replace('T', 'J');

        System.out.println(str);

        str.replace("T", "R");

        System.out.println(str);
        //СТРОКА НЕИЗМЕНЯЕМАЯ

    }
}