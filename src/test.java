import java.util.Scanner;

public class test {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if ( number % 2 == 0 )
            System.out.println("Четное");
        else
            System.out.println("Нечетное");
        }
    }

