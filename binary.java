import java.util.Scanner;
public class binary {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter an int: ");
        int a = ob.nextInt();
        int[] bin = new int[32];
        int p = 0; //pointer
        /*int [] value= {64,32,16,8,4,2,1};
        int [] bin = {0,0,0,0,0,0,0};

        for(int i = 0 ; i < value.length; i++ ){
            if(value[i] <= a && a != 0){
                bin[i] = 1;
                a = a - value[i];
            }
        }
        for (int i = 0 ; i < bin.length; i++){
            System.out.print(bin[i] + "");
        }*/
        while (a > 0) {
            bin[p++] = a % 2;
            a = a / 2;
        }
        for (int i = bin.length - 1 ; i >= 0; i--) {
            System.out.print(bin[i] + "");

        }
    }
}
