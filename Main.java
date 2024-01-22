import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Vytvoření Scanneru pro čtení vstupu z konzole
        Scanner sc = new Scanner(System.in);

        // Zadání délky použitého filamentu v centimetrech
        System.out.println("Zadejte délku použitého filamentu v centimetrech:");
        double delka = sc.nextDouble();

        // Zadání hustoty filamentu v gramech na metr
        System.out.println("Zadejte hustotu filamentu v gramech na metr:");
        double hustota = sc.nextDouble();

        // Výpočet hmotnosti
        double hmotnost = delka * hustota;

        // Zadání ceny jednoho filamentu
        System.out.println("Zadejte cenu jednoho filamentu v Kč:");
        double cenaFilamentu = sc.nextDouble();

        // Výpočet ceny výrobku
        double cenaVyrobku = hmotnost / 1000 * cenaFilamentu;

        // Vypsání výsledků
        System.out.println("Hmotnost výrobku je " + hmotnost + " gramů.");
        System.out.println("Cena výrobku je " + cenaVyrobku + " Kč.");
    }
}
