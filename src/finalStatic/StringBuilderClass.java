package src.finalStatic;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();//по дефолту вместимость 16 символов
        StringBuilder sb2 = new StringBuilder("Good day today!");//вместимость 9+16
        StringBuilder sb3 = new StringBuilder(50);// определена вместимость 50 симвлов
        StringBuilder sb5 = new StringBuilder(sb2);


        //Методы длины и емкости
        System.out.println("sb1.length() " + sb1.length());
        System.out.println("sb1.capacity() " + sb1.capacity());
        System.out.println("sb2.length() " + sb2.length());
        System.out.println("sb2.capacity() " + sb2.capacity());
        System.out.println("sb3.length() "+ sb3.length());
        System.out.println("sb3.capacity() " + sb3.capacity());

        //Метод определения строки на заданной позиции
        System.out.println(sb2.charAt(3));

        //Метод определения индекса первого найденного char
        System.out.println("sb2.indexOf(oo) "+ sb2.indexOf("a"));

        //Метод определения индекса найденного char с определенной позиции
        System.out.println("sb2.indexOf(d, 4) "+ sb2.indexOf("d", 4));

        //Метод ищет подстроку в строке начиная с определенного индекса
        String s = sb2.substring(3);
        System.out.println(s);
        s = sb2.substring(2,4);
        System.out.println(s);

        //Метод работает как substring, но на выходе чарсиквенс
        System.out.println(sb2.subSequence(4,9));

        //Метод добавляет в конец строки, изменяет сам объект
        System.out.println(sb2.append("hfieruhf"));
        System.out.println(sb2.append(111));
        System.out.println(sb2.append(true));

        StringBuilder strB = new StringBuilder("ok");
        char[] array ={'p','r','i','v','e','t'};
        strB.append(array,2,3);
        System.out.println(strB);

        //Метод втавляет объект по указанному индексу
        System.out.println(sb2.insert(2, "  "));
        System.out.println(sb2.insert(sb2.length(), " расширенный метод append"));

        StringBuilder strBl = new StringBuilder("Hello world");
        char[] array6 ={'p','r','i','v','e','t'};
        strBl.insert(2,array6,1,3);
        System.out.println("strBl " + strBl);

        //Метод удаляет символы начиная с определенного индекса до определенного индекса
        StringBuilder sb10 = new StringBuilder("Hello, World!");
        sb10.delete(3, 7); // 7 не включается
        System.out.println(sb10);

        //Метод удаляет символ по определенному индексу
        StringBuilder sb11 = new StringBuilder("Hello, World!");
        sb11.deleteCharAt(0);
        System.out.println(sb11);

        //Метод переворачивает стринбилдер
        StringBuilder sb12 = new StringBuilder("Строка будет перевернута");
        System.out.println(sb12.reverse());

        //Метод заменяет символы, находящиеся между определенными индексами на строку
        StringBuilder sb13 = new StringBuilder("Строка будет перевернута");
        System.out.println(sb13.replace(0,5, "Заменила "));







    }




}
