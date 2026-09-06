import java.util.Scanner;
import java.lang.Integer;
/*
careful, nextline eats whatever is in the buffer.
nextInt leaves the nextline character in the buffer
once done.

if we have nextint followed by nextline, we will have
an issue.

always use parse methods with nextline, as nextline 
leaves nothing in the buffer
*/

public class NameAge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int age = Integer.parseInt(input.nextLine());
        String name = input.nextLine();

        System.out.printf("%s : %d\n", name, age);

        input.close();
    }
}