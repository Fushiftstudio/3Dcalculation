import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Zadejte délku použitého filamentu v centimetrech:");
        double delka = sc.nextDouble();

      
        System.out.println("Zadejte hustotu filamentu v gramech na metr:");
        double hustota = sc.nextDouble();

      
        double hmotnost = delka * hustota;

        
        System.out.println("Zadejte cenu jednoho filamentu v Kč:");
        double cenaFilamentu = sc.nextDouble();

      
        double cenaVyrobku = hmotnost / 1000 * cenaFilamentu;

        
        System.out.println("Hmotnost výrobku je " + hmotnost + " gramů.");
        System.out.println("Cena výrobku je " + cenaVyrobku + " Kč.");
    }
}
