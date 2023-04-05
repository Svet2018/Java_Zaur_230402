package src.finalStatic;

public class Loop {
        //for(;;){} // минимальная реализация for
    public void time(){
        OUTER: for (int chas = 0; chas <= 23; chas++){
            System.out.println("Начало внешнего цикла: " + (chas+1));
            INNER: for (int minuta = 0; minuta<= 59; minuta++){
                if (minuta == 20){
                    //break OUTER;
                    //continue OUTER;
                    //break INNER;
                    //continue INNER;
                }
                System.out.println(chas + ":" + minuta);
            }
            System.out.println("Конец внешнего цикла " + (chas+1));
        }
    }

    public static void vremya(){
        OUTER: for (int chas = 0; chas <= 6; chas++){

            System.out.println("Начало внешнего часового цикла: " + (chas+1));
            MIDDLE: for (int minuta = 0; minuta<= 59; minuta++){
                System.out.println("Начало средненего цикла: " + (minuta+1));
                if (chas > 1 && minuta % 10 == 0){
                    break OUTER;
                    //continue OUTER;
                    //break INNER;
                    //continue INNER;
                }
                INNER: for (int sekunda = 0; sekunda < 60; sekunda++){
                    System.out.println("Начало внутреннего цикла: " + (sekunda+1));
                    if (sekunda * chas > minuta){
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + minuta + ":" + sekunda);
                }

            }
            System.out.println("Конец внешнего цикла " + (chas+1));
        }
    }

    public static void whileLoop(){
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
        System.out.println("Вышли из цикла - i = " + i);
    }

    public static void whileDel(){
        //boolean b = true;
        int a = 1;
        while ( a <= 1000){
           // System.out.println(a);
            if (a % 3 == 0 && a % 7 ==0){
                System.out.println(a);
               // b = false;
            }
            a++;
        }
    }

    public static void doWhileDel(){
        //boolean b = true;
        int a = 1;
        do {
            System.out.println(a);
            a++;
        }while (a <= 0);
    }


    public static void main(String[] args) {
        //Loop loop = new Loop();
        //loop.time();
        //vremya();//статичный метод
        //whileLoop();
        //whileDel();
        doWhileDel();


    }

}


