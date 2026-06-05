import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // printy
        System.out.println("Hello world");
        System.out.print("Hello world");
        System.out.printf("%-10s", "Hello world");
        // System.out.printf(typ (%s)+ile(-10 = 10 cyfr od lewj), tekst tego typu ("Hello world"));
        // zmienne
        int a = 5; 
        double b = 3.14;
        String c = "Hello world";
        char d = 'A';
        boolean e = true;
        // operatory   
        int f = a + 10; // dodawanie
        int g = a - 2; // odejmowanie  
        int h = a * 3; // mnożenie
        double i = b / 2; // dzielenie
        int j = a % 2; // reszta z dzielenia
        boolean k = a > 3; // porównanie
        boolean l = a == 5; // porównanie równości
        boolean m = a != 5; // porównanie nierówności
        // instrukcje warunkowe
        if (a > 3) {
            pass; // kod do wykonania, jeśli warunek jest prawdziwy
        } else if (a == 3) {
            pass; // kod do wykonania, jeśli warunek jest prawdziwy
        } else {
            pass; // kod do wykonania, jeśli żaden z powyższych warunków nie jest prawdziwy
        }
        // pętle
        for (int i = 0; i < 10; i++) {// od ilu, do ilu, co ile; i++ = i = i + 1 = i += 1
            pass; // kod do wykonania w każdej iteracji
        }
        while (a < 10) {
            // kod do wykonania, dopóki warunek jest prawdziwy
            a++; // zwiększanie a o 1, aby uniknąć nieskończonej pętli
        }

        do {//odwrócona pętla while, najpierw wykonuje kod, potem sprawdza warunek
            // kod do wykonania, dopóki warunek jest prawdziwy
            System.out.println(a);
            a++; // zwiększanie a o 1, aby uniknąć nieskończonej pętli
        } while (a < 10);







    }
}