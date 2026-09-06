import java.lang.Integer;
import java.lang.Long;

public class PrimitiveTypes {
    public static void main(String[] args){
        // int, long, char, short, byte, float, double, boolean
        byte temperature = 20;
        int i = 100000000;
        long l = 1000000000000000000l;
        char letter = 'a';
        float f = 12.5f;
        double d = 30.405;
        boolean b = true;
        short s = 2026;
        System.out.printf("MAX VALUE int : %d\n", Integer.MAX_VALUE);
        System.out.printf("MIN VALUE int : %d\n", Integer.MIN_VALUE);
        System.out.printf("MAX VALUE long : %d\n",Long.MAX_VALUE);
        System.out.printf("MIN VALUE long : %d\n",Long.MIN_VALUE);
    }
}
