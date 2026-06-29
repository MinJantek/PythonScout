
public class sciagarka {
    public static void sciagacz(String[] args) {
    
        System.out.println("-----Printy-----");
        System.out.println("Hello world");
        System.out.print("Hello world");
        System.out.printf("%-10s", "Hello world");
        // System.out.printf(typ (%s)+ile(-10 = 10 cyfr od lewj), tekst tego typu ("Hello world"));


        System.out.println("-----Zmienne i typy danych-----");
        int a = 5; 
        System.out.println(a);

        double b = 3.14;
        System.out.println(b);

        String c = "Hello world";
        System.out.println(c);

        char d = 'A';
        System.out.println(d);

        boolean e = true;
        System.out.println(e);



        System.out.println("-----Operatory-----");
        int f = a + 10; // dodawanie
        System.out.println(f);

        int g = a - 2; // odejmowanie  
        System.out.println(g);

        int h = a * 3; // mnożenie
        System.out.println(h);

        double i = b / 2; // dzielenie
        System.out.println(i);

        int j = a % 2; // reszta z dzielenia
        System.out.println(j);

        boolean k = a > 3; // porównanie
        System.out.println(k);

        boolean l = a == 5; // porównanie równości
        System.out.println(l);

        boolean m = a != 5; // porównanie nierówności
        System.out.println(m);



        System.out.println("-----if,else if,else-----");
        if (a > 3) {
            System.out.println("a jest większe niż 3"); // kod do wykonania, jeśli warunek jest prawdziwy
        } else if (a == 3) {
            System.out.println("a jest równe 3"); // kod do wykonania, jeśli warunek jest prawdziwy
        } else {
            System.out.println("a nie jest większe niż 3 ani równe 3"); // kod do wykonania, jeśli żaden z powyższych warunków nie jest prawdziwy
        }



        System.out.println("-----Pętle-----");
        System.out.println("for:");
        for (int x = 0; x < 10; x++) {// od ilu, do ilu, co ile; x++ = x = x + 1 = x += 1
            System.out.println(x); // kod do wykonania w każdej iteracji
        }
        System.out.println("while:");
        while (a < 10) {
            // kod do wykonania, dopóki warunek jest prawdziwy
            a++; // zwiększanie a o 1, aby uniknąć nieskończonej pętli
        }
        System.out.println("do-while:");
        do {//odwrócona pętla while, najpierw wykonuje kod , potem sprawdza warunek
            // kod do wykonania, dopóki warunek jest prawdziwy
            System.out.println(a);
            a++; // zwiększanie a o 1, aby uniknąć nieskończonej pętli
        } while (a < 10);

        System.out.println("------------------------------------------------");

    }   
}