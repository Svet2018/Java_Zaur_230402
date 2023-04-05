package src.finalStatic;

public class FinalStaticTest {
    public static void main(String[] args) {
        //теститурем public int a = 10
        FinalStatic finalStatic1 = new FinalStatic(true);
       // finalStatic1.a = finalStatic1.a * 2;
        //System.out.println(finalStatic1);//переопределить метод стринг
        System.out.println("a = " + finalStatic1.a);//так выводиn
        System.out.println(finalStatic1.a);
        //тестируем public final int b = 10;
        //FinalStatic finalStatic2 = new FinalStatic(b, b1);
        //System.out.println(finalStatic2);
        finalStatic1.abc((short) 4);


    }



}
