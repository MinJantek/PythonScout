import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Podaj rok urodzenia: ");
        int rok = scann.nextInt();
        int lata_po_urodzeniu_chrystusa = 2026;
        if (rok > lata_po_urodzeniu_chrystusa) {
            System.out.println("Jesteś bogiem z przyszłości!!!!");
        }
        else {

            int wiek = lata_po_urodzeniu_chrystusa - rok;

            System.out.println("Masz " + wiek + " lat.");
        scann.close();
        }

    }
}