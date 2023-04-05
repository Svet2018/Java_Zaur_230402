package src.finalStatic;

public class FinalStatic {
    public final int a;
    FinalStatic(){a = 10;}

    FinalStatic(boolean b) {a = 20;}

    public void abc(short s){
        final byte b;
        b = 10;
        System.out.println(s + b);
    }

    public void abcd(final short s){
        final byte b;
        b = 10;
        System.out.println(s + b);
    }

    @Override
    public String toString() {
        return "FinalStatic{" +
                "a=" + a +
                '}';
    }
}
