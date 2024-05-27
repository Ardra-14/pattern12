import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = s.nextInt();
        for (int i = 1; i <= rows ; i++){
            for (int j = 1; j <= (rows - i); j++){
                System.out.print(" ");
            }
            for (int k = i ; k < (2 * i); k++){
                System.out.print(k);
            }
            for (int l = ((2 * i) - 2) ; l >= i; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}