package daffa.belajarjava.basic;

public class Break {
    public static void main(String[] args) {

        var counter = 1;

        while (true) {
            System.out.println("Perulangan " + counter);
            counter++;

            if (counter > 10) {
                break; // Untuk Menghentikan Semua Perulangan
            }
        }

        System.out.println("Perulangan Berhenti");

    }
}