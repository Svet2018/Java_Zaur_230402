package src.finalStatic;

public class TernarhyOperator {
    int a = 3;
    int e = 4;


    public TernarhyOperator() {}

    public void maxMin(){ //Необходимо создавать экземпляр класса
        int max = (a > e) ? (a) : (e);
        System.out.println(max);
    }

    public static void maxMinStatic(){ //Могу не сосздавать экземпляр класса
        int a = 5;
        int e = 0;
        int max = (a > e) ? (a) : (e);
        System.out.println(max);
    }
}

class TernarhyOperatorTest{
    public static void main(String[] args) {
        TernarhyOperator operator = new TernarhyOperator();
        operator.maxMin();
        TernarhyOperator.maxMinStatic();


    }
}
