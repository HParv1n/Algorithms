import java.util.Scanner;

public class SimpleNumbers {
    public SimpleNumbers() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;

        for(int i = 1; i < a; i = b + 1) {
            b += 2;
            System.out.println(b);
        }

    }
}