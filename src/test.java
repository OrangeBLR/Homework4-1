import java.util.Scanner;

public class test {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int num2 = number>0 ? number>100 ? 100 : number : -number;
        System.out.println(num2);
        }
    }

