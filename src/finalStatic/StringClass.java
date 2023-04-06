package src.finalStatic;

public class StringClass {
    public static void main(String[] args) {
        String s1 = new String("Привет и Пока");
        StringBuilder ddd = new StringBuilder(("Hello"));
        String ddd1 = new String(ddd);
        System.out.println(ddd);
        System.out.println(ddd1);
        char[] array = new char[]{'p','r','i','v','e','t'};
        String ffff = new String(array);
        System.out.println(ffff);
        // Метод определения длины строки
        int a = s1.length();
        System.out.println(s1);
        System.out.println("длина строки: " + s1 + " = " + a);//выводит длину объекта s1

        // Метод показывает символ по индексу
        int i = 1;
        char с1 = s1.charAt(i);
        System.out.println("символ по индексу " + i + " = " + с1);

        //Метод показывает на каком индексе находится первый char или string
        char simbol = 'и';
        int ind = s1.indexOf(simbol);
        System.out.println("индекс символа " + simbol + " = " + ind);

        String str = new String("вет");
        int ind2 = s1.indexOf(str);
        System.out.println("начальный индекс строки " + str + " = " + ind2);

        //при отсутствии подстроки выводится -1
        String str2 = new String("www");
        int ind3 = s1.indexOf(str2);
        System.out.println("показывает, что подстроки " + str2 + " нет в строке " + s1 + ". ответ = " + ind3);

        //ищет символ начиная с заданного индекса
        char ch = 'П';
        int n = 3;
        int ind4 = s1.indexOf(ch, n);
        System.out.println("показывает, что символ " + ch + " находится по индексу " + ind4 + ", отчет начинается с индекса " + n);

        //Метод показывает начинается ли строка с подстроки
        boolean b1 = s1.startsWith("При");
        System.out.println(b1);
        boolean b2 = s1.startsWith("При", 3);
        System.out.println(b2);

        //Метод показывает заканчивается ли строка с подстроки
        boolean b3 = s1.endsWith("ока");
        System.out.println(b3);

        //Метод присваевает строке значение подстроки из выбранной строки начиная с определенного индекса
        String str5 = s1.substring(3);
        System.out.println(str5);

        //Метод присваевает строке значение подстроки из выбранной строки начиная с определенного индекса
        //и заканчивая определенным индексом (не включается в поиск)
        String str6 = s1.substring(2, 9);
        System.out.println(str6);

        //Метод убирает пробелы по бокам
        String newStr = new String("    wdfvj    gutirk        ");
        System.out.println(newStr);
        String str7 = newStr.trim();
        System.out.println(str7);

        //Метод заменяет старый char на новый
        String str8 = s1.replace('П', 'Q');
        System.out.println(str8);

        //Метод заменяет старую подстроку на новую
        String str9 = s1.replace("При", "Вай");
        System.out.println(str9);

        //Метод конкатенации строк
        String str10 = s1.concat(s1);
        System.out.println(str10);

        //хитрый метод конкатенации строк
        int s = 1;
        int ss = 2;
        String sss = "OK";
        System.out.println(s + ss + sss);
        System.out.println("" + s + ss + sss);

        //тоже хитрый метод конкатенации строк
        String aa = null;
        System.out.println(aa);
        aa += "-слово";
        System.out.println(aa);

        //Метод приводит строку к нижнему регистру
        String low = s1.toLowerCase();
        System.out.println(low);

        //Метод приводит строку к верхнему регистру
        String up = s1.toUpperCase();
        System.out.println(up);

        //Метод определяет содержит ли какие-либо строку
        boolean cont = s1.contains("ок");
        System.out.println(cont);

        //Метод chaining, методы вополняются слева направо
        String h = "  Hello World";
        String h1 = "Urrraaaaaa!!!  ";
        String h2 = h.concat(h1);
        System.out.println(h2);
        String h3 = h.concat(h1).trim();
        System.out.println(h3);
        String h4 = h.concat(h1).trim().replace("Urrraaaaaa", "УРА");
        System.out.println(h4);
        String h5 = h.concat(h1).trim().replace("Urrraaaaaa", "УРА").substring(6,10);
        System.out.println(h5);
        System.out.println(h.substring((h.indexOf('W'))));
        System.out.println(h + " " + h1);

        //Лучше использовать strip вместо trim
        String ee = "     fhuihfiu   ";
        System.out.println("ee.strip() " + ee.strip());

        //Метод удаляет пробелы из начала
        String eee = "     fhuihfiu   ";
        System.out.println("eee.stripLeading() " + eee.stripLeading());

        //Метод удаляет пробелы с конца
        String ee2 = "     fhuihfiu   ";
        System.out.println("ee2.stripTrailing() " + ee2.stripTrailing());

        //Метод сравнивает строки с учетом регистра букв
        String e1 = "Как дела?";
        String e2 = "как Дела?";
        System.out.println("Как дела? " + e2.equals(e1));

        //Метод сравнивает строки без учета регистра букв
        String k1 = "Как дела?";
        String k2 = "как Дела?";
        System.out.println("Как дела? " + k2.equalsIgnoreCase(k1));

        //Метод сравнивает строку с пробелом и пустотой
        String g1 = "privet";
        System.out.println("g1.isBlank() " + g1.isBlank());
        g1 = "";
        System.out.println("g1.isBlank() " + g1.isBlank());
        g1 = " "; //пробелы
        System.out.println("g1.isBlank() " + g1.isBlank());
        g1 = "      "; //табы
        System.out.println("g1.isBlank() " + g1.isBlank());

        //Проверяет пустая ли строка
        String r1 = " "; //пробел
        System.out.println("r1.isEmpty() " + r1.isEmpty());
        r1 = ""; //пуста]
        System.out.println("r1.isEmpty() " + r1.isEmpty());


        //программка вывода названия почты
        String mails = "ya@yandex.ru; you@mail.ru; he@gmail.com;";
        int index1 = 0; //позиция символа @
        int index2 = 0; //позиция символа .
        int index3 = 0; //позиция символа ;
        while (index3 < mails.length() - 1) {
            index1 = mails.indexOf('@', index3);
            index2 = mails.indexOf('.', index3);
            index3 = mails.indexOf(';', index3 + 1);
            System.out.println(mails.substring(index1 + 1, index2));
        }





        //программка сравнения двух строк
        String f1 = "Моноширинный шрифт: заключите текст в обратные одиночные кавычки (`). Используйте моноширинный шрифт для путей к файлам и имен файлов, а также для текста, который вводит пользователь, или текста сообщений, которые видит пользователь.";
        String f2 = f1.toUpperCase();
        char ch1;
        char ch2;
        for (int j = 0; j < f1.length(); j++){
            ch1 = f1.charAt(j);
            ch2 = f2.charAt(j);
            if (ch1 != ' ' && ch1 != ',' && ch1 != '.' && ch1 != ':' && ch1 != ')' && ch1 != '(' && ch1 == ch2){
                System.out.println();
                System.out.print(ch1);
                continue;
            }
            System.out.print(ch1);

        }
        System.out.println();


    }
}
