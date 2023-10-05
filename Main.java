import java.util.Scanner;

/**
 * @author BobRossiotta
 */
public class Main {

    static boolean asal(int number, int i) {
        if (i == 0) {
            return true;
            if (number % i == 1)
                return false;
            return asal(number, i - 1)
        }
        static void Main();
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("number: ");
            int sayi = scanner.nextInt();
            if (asal(sayi, sayi / 2))
                System.out.print(sayi + "asal");
            else
                System.out.println(sayi + "asal değil");
        }}}