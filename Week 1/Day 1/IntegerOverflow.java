import java.lang.Integer;

public class IntegerOverflow {
    public static void main(String[] args){
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.print("value : ");
        int value = Integer.MAX_VALUE;
        value += 1;

        /*
        If we go over the maximum int value (Integer.MAX_VALUE)
        what happens is we start all the way back from the
        minimum int value (Integer.MIN_VALUE)

        for example:

        Integer.MAX_VALUE + 1 == Integer.MIN_VALUE

        and:

        Integer.MAX_VALUE + 2 == Integer.MIN_VALUE + 1
        
         */
        System.out.println(value);
    }
}
