import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestKaardiPakk {
    public static void main(String[] args) {
        System.out.println("tere");
        Kaart kaart1 = new Kaart("2", '♣');
        Kaart kaart3 = new Kaart("2", '♣');
        System.out.println(kaart1);
        System.out.println(Pakk.tervepakk());
        System.out.println(kaart1.getMast());
        System.out.println(kaart1.getTugevus());
        System.out.println(kaart1.toString());
        //System.out.println(Pakk.kaardid);
        Kaart kaart2 = new Kaart("10♥");
        System.out.println(kaart2.toString());
        Pakk pakk1 = new Pakk();
        System.out.println("pakk1" +pakk1);
        //pakk1.võtaKaart();
        System.out.println("pakk1-1" +pakk1);

        // 1. Üritan luua vigast kaarti new Kaart("1", '♣') Vigase kaardi loomine õnnestus.
        //Kaart kaartvigane = new Kaart("1", '♣'); System.out.println(kaartvigane);
        //Kaart kaartnull = new Kaart(null); System.out.println("kaartnull "+kaartnull);


        // 2. Üritan luua pakki, milles on korduvaid kaarte [Q♦~, Q♦~] Vigase paki loomine õnnestus
        List<Kaart> kaardilst = new ArrayList<>();
        kaardilst.add(kaart1);
        kaardilst.add(kaart2);
        kaardilst.add(kaart1);
        System.out.println("kaardilst " + kaardilst);

        Pakk korduvatepakk = new Pakk(kaardilst);
        System.out.println("korduvatepakk " + korduvatepakk);
        //korduvatepakk.võtaKaart();
        System.out.println("korduvatepakk-1 " + korduvatepakk);
        //korduvatepakk.võtaKaart();
        System.out.println("korduvatepakk-2 " + korduvatepakk);
        //korduvatepakk.võtaKaart();
        //System.out.println("korduvatepakk-3 " + korduvatepakk);

        Set<Kaart> set = new HashSet<Kaart>(kaardilst);
        System.out.println(set);
        System.out.println(korduvatepakk.getKaardid());
        System.out.println(kaart1.equals(kaart3));
        Pakk  täispakk2 = new Pakk();
        System.out.println(täispakk2.getKaardid());

    }
}
