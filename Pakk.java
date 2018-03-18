import java.util.*;

public class Pakk {
    private List<Kaart> Kaardid = new ArrayList<>();
    //private final List<Kaart> Kaardid = new ArrayList<>();
    private  List<Kaart> immutableKaardid = Collections.unmodifiableList(Kaardid);


    public Pakk(List<Kaart> kaardid) {
//        for (int i = 0; i < kaardid.size()-1; i++)
//        {
//            for (int j = i+1; j < kaardid.size(); j++)
//            {
//                if ((kaardid.get(i) == kaardid.get(j)) && (i != j))
//                {
//                    //System.out.println("Duplicate Element : "+kaardid.get(j));
//                    throw new RuntimeException("Pakis on topeltkaardid");
//                }
//            }
//        }
//
//        List<Kaart> sisemineList = new ArrayList<>(kaardid);
//        sisemineList.containsAll(kaardid);
//        Set<Kaart> set = new HashSet<Kaart>(kaardid);
        //if (kaardid.size() != set.size())
        //  throw new RuntimeException("Pakis on topeltkaardid");
        //if (kaardid.size()==0) throw new IllegalArgumentException("no really, please stop");
        Kaardid = immutableKaardid;

    }
    public Pakk() {
        Kaardid = tervepakk();
    }

    @Override
    public String toString() {
        return "Pakk{" +
                "Kaardid=" + Kaardid +
                '}';
    }

    // teine peab olema ilma argumentideta ja peab looma isendi,
    // mis tähistab tavalist 52 kaardiga täispakki.
    public static List<Kaart> tervepakk() {
        String[] tugevused = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        char[] mastid = {'♣','♦','♠', '♥'}; //{"♣","♦", "♠", "♥"};
        List<Kaart> pakk52 = new ArrayList<>();
        for (int i = 0; i < tugevused.length ; i++) {
            for (int j = 0; j <mastid.length ; j++) {
                pakk52.add(new Kaart(tugevused[i], mastid[j]));
            }
        }
        return pakk52;
    }

    public List<Kaart> getKaardid() {
        return immutableKaardid;
    }
    //muudab kaartide järjekorda
    public List<Kaart> sega(){
//        Collections.shuffle();
        return Kaardid;
    }
    //võtaKaart(), mis eemaldab ja tagastab esimese kaardi paki kaartide hulgast.
    // Kui kaarti üritatakse võtta tühjast pakist, siis peab meetod viskama RuntimeExceptioni.
    public Kaart võtaKaart() {
        if (Kaardid.size()>0)
            return Kaardid.remove(0);
        else
            throw new RuntimeException("Pakis ei ole kaarte");

    }

}
