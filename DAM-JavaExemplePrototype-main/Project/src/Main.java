import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Electrodomestic> llista = new ArrayList<>();
        List<Electrodomestic> llistaCopy = new ArrayList<>();
        
        Rentadora rent1 = new Rentadora();
        rent1.nom = "Rentadora 1";
        rent1.color = "Blanc";
        rent1.preu = 500;
        rent1.marca = "Siemens";
        rent1.eficiencia = 40;
        rent1.revolucions = 30;
        rent1.soroll = 60;
        llista.add(rent1);

        Rentadora rent2 = new Rentadora();
        rent2.nom = "Rentadora 2";
        rent2.color = "Gris";
        rent2.preu = 600;
        rent2.marca = "Siemens";
        rent2.eficiencia = 60;
        rent2.revolucions = 50;
        rent2.soroll = 50;
        llista.add(rent2);

        Nevera nev1 = new Nevera();
        nev1.nom = "Nevera 1";
        nev1.color = "Vermell";
        nev1.preu = 800;
        nev1.marca = "Bosch";
        nev1.eficiencia = 40;
        nev1.frigories = 50;
        nev1.soroll = 30;
        llista.add(nev1);

        Nevera nev2 = new Nevera();
        nev2.nom = "Nevera 2";
        nev2.color = "Blau";
        nev2.preu = 900;
        nev2.marca = "Mitsubishi";
        nev2.eficiencia = 70;
        nev2.frigories = 70;
        nev2.soroll = 25;
        llista.add(nev2);

        Forn fo1 = new Forn();
        fo1.nom = "Forn 1";
        fo1.color = "Negre";
        fo1.preu = 250;
        fo1.marca = "Balai";
        fo1.eficiencia = 30;
        fo1.temperatura = 200;
        fo1.autoneteja = false;
        llista.add(fo1);

        Forn fo2 = new Forn();
        fo2.nom = "Forn 2";
        fo2.color = "Blanc";
        fo2.preu = 750;
        fo2.marca = "Lalala";
        fo2.eficiencia = 100;
        fo2.temperatura = 500;
        fo2.autoneteja = true;
        llista.add(fo2);

        // Clonar la llista
        for (Electrodomestic obj : llista) {
            llistaCopy.add(obj.clone());
        }

        System.out.println("Comparar la mateixa llista:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llista.get(i));
        }

        System.out.println("Comparar amb la llista clonada:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(i));
        }

    }

    static void compare (int i, Electrodomestic a, Electrodomestic b) {
        if (a == b) {
            System.out.println(i + ": Els electrodomestics són el mateix objecte");
        } else {
            System.out.print(i + ": Els electrodomestics són objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": Els electrodomestics són idèntics");
            } else {
                System.out.println(i + ": Els electrodomestics NO són identics");
            }
        }
    }
}
