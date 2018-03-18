import java.util.NoSuchElementException;

public class Kaart {
    String tugevus;
    char mast;


    public Kaart(String tugevus, char mast) {
        if (tugevus == "2" || tugevus == "3" || tugevus == "4" || tugevus == "5" || tugevus == "6"
                || tugevus == "7" || tugevus == "8" || tugevus == "9" || tugevus == "10" || tugevus == "J" || tugevus == "Q" || tugevus == "K" || tugevus == "A")
            this.tugevus = tugevus;
        else
            throw new IllegalArgumentException(tugevus);
        if (mast == '♣' || mast == '♦' || mast == '♠' || mast == '♥')
            this.mast = mast;
        else
            throw new IllegalArgumentException("masti viga");

    }

    //  Siin on  teine konstuktor. Teine konstruktor peab võtma argumendiks
    // ainult ühe sõne, kus tugevus ja mast on kombineeritud (nt. "K♣")
    public Kaart(String tugevus) {
        if (tugevus.charAt(0) == '2' || tugevus.charAt(0) == '3' || tugevus.charAt(0) == '4' || tugevus.charAt(0) == '5'
                || tugevus.charAt(0) == '6' || tugevus.charAt(0) == '7' || tugevus.charAt(0) == '8'
                || tugevus.charAt(0) == '9' || tugevus.charAt(1) == '0' || tugevus.charAt(0) == 'J'
                || tugevus.charAt(0) == 'Q' || tugevus.charAt(0) == 'K' && (tugevus.charAt(1) == '♣' || tugevus.charAt(1) == '♦' || tugevus.charAt(1) == '♠' || tugevus.charAt(1) == '♥')
                || tugevus.charAt(0) == 'A')
            if (tugevus.charAt(1) == '0')
                this.tugevus = tugevus.substring(0, 2);
            else
                this.tugevus = tugevus.substring(0, 1);
        else
            throw new IllegalArgumentException("kaart  ei ole õige ");

        if (tugevus.charAt(1) == '0')
            this.mast = tugevus.charAt(2);
        else
            this.mast = tugevus.charAt(1);
    }


    public char getMast() {
        return mast;
    }

    public String getTugevus() {
        return tugevus;
    }

    @Override
    public String toString() {
        return tugevus + mast;
    }

    public boolean equals(Object o) {
        return this.toString().equals(o.toString());
    }

    public int hashCode() {
        return this.toString().hashCode();
    }
}
