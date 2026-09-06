import java.util.Scanner;
public class Swap {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("a : ");
        int a = input.nextInt();

        System.out.print("b : ");
        int b = input.nextInt();

        int[] tbl = swapWithoutExtraVariable(a,b);

        System.out.println("Without temp variable:\n" + "a : " + tbl[0] + "\n" + "b : " + tbl[1]);

        a = tbl[1];
        b = tbl[0];
        int temp = b;

        b = a;
        a = temp;

        System.out.println("With temp variable:\n" + "a : " + tbl[0] + "\n" + "b : " + tbl[1]);

        input.close();
    }

    public static int[] swapWithoutExtraVariable
    (int a, int b){
        int[] arr = {a, b};
        
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];

        return arr;
    }

    
}
