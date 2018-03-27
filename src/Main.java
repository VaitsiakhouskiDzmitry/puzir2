import java.util.Scanner;
public class Main {



            public static void main(String[] args) {

    Scanner scanner =new Scanner(System.in);
    System.out.println("введите число");
    int number=scanner.nextInt();
    String binary = Integer.toBinaryString(number);
    System.out.println("исло"+number+"в 2ойСС="+binary);
    String hex=Integer.toHexString(number);
    System.out.println("в 8ой" +hex);
    String octal=Integer.toOctalString(number);
    System.out.println("в 16ой"+octal);


    }
}
