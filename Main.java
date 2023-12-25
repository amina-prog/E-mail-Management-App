
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Emri: ");
        String emri = input.nextLine();
        System.out.print("Mbiemri: ");
        String mbiemri = input.nextLine();
        EmailApp email = new EmailApp(emri, mbiemri);
        System.out.println(email.afishoTeDhena());
    }
}