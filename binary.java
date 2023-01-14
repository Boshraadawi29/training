import java.util.Scanner;
public class binary {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter an int: ");
        int a = ob.nextInt();
        int[] bin = new int[32];
        int p = 0; //pointer

        while (a > 0) {
            bin[p++] = a % 2;
            a = a / 2;
        }
        for (int i = bin.length - 1 ; i >= 0; i--) {
            System.out.print(bin[i] + "");

        }
    }
}
