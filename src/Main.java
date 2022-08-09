import Prodejce.Prodejce;

public class Main {

    public static void main(String[] args) {

        Prodejce prodejce = new Prodejce();

        double prumerneMnozstviProdaneMrkveNaJednuSmlouvu = 0.0d;

        if (!(prodejce.getProdejcePocetSjednanychSmluv()==0)) {
            prumerneMnozstviProdaneMrkveNaJednuSmlouvu = prodejce.getProdejceCelkoveMnozstvíProdaneMrkve() / prodejce.getProdejcePocetSjednanychSmluv();
        }

    System.out.println("Průměrné množství prodané mrkve na jednu smlouvu: " + prumerneMnozstviProdaneMrkveNaJednuSmlouvu + " tun.");

    }
}