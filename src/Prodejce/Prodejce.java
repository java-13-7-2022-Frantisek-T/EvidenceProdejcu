package Prodejce;

import java.time.LocalDate;

public class Prodejce {

    String      prodejceJmenoPrijmeni                               = "Jan Prodavač";
    LocalDate   prodejceDatumNarozeni                               = LocalDate.of(1963,2,1);
    int         prodejcePocetSjednanychSmluv                        = 12345;
    double      prodejceCelkoveMnozstviProdaneMrkve                 = 87654.321;                                    // v tunách
    String      prodejceSidloNazevMesta                             = "Mrkvičkov";
    String      prodejceVozidloRegistracniZnacka                    = "1AM 0833";
    double      prodejceVozidloSpotreba                             = 9.87;                                         // v litrech na 100 km
    String      prodejcePocitacAdresaIP                             = "001.002.003.004";                            // adresa verze 4
    double      vypsatPrumerneMnozstviProdaneMrkveNaJednuSmlouvu    = 0.0d;

//    if (prodejcePocetSjednanychSmluv==0) {} else vypsatPrumerneMnozstvíProdaneMrkveNaJednuSmlouvu() = prodejceCelkoveMnozstviProdaneMrkve() / prodejcePocetSjednanychSmluv();

//    System.out.println("Průměrné množství prodané mrkve na jednu smlouvu: " + vypsatPrumerneMnozstviProdaneMrkveNaJednuSmlouvu);

    public String getProdejceJmenoPrijmeni() {
        return prodejceJmenoPrijmeni;
    }

    public void setProdejceJmenoPrijmeni(String prodejceJmenoPrijmeni) {
        this.prodejceJmenoPrijmeni = prodejceJmenoPrijmeni;
    }

    public LocalDate getProdejceDatumNarození() {
        return prodejceDatumNarozeni;
    }

    public void setProdejceDatumNarození(LocalDate prodejceDatumNarození) {
        this.prodejceDatumNarozeni = prodejceDatumNarození;
    }

    public int getProdejcePocetSjednanychSmluv() {
        return prodejcePocetSjednanychSmluv;
    }

    public void setProdejcePocetSjednanychSmluv(int prodejcePocetSjednanychSmluv) {
        this.prodejcePocetSjednanychSmluv = prodejcePocetSjednanychSmluv;
    }

    public double getProdejceCelkoveMnozstvíProdaneMrkve() {
        return prodejceCelkoveMnozstviProdaneMrkve;
    }

    public void setProdejceCelkoveMnozstvíProdaneMrkve(double prodejceCelkoveMnozstvíProdaneMrkve) {
        this.prodejceCelkoveMnozstviProdaneMrkve = prodejceCelkoveMnozstvíProdaneMrkve;
    }

    public String getProdejceSídloNazevMesta() {
        return prodejceSidloNazevMesta;
    }

    public void setProdejceSídloNazevMesta(String prodejceSídloNazevMesta) {
        this.prodejceSidloNazevMesta = prodejceSídloNazevMesta;
    }

    public String getProdejceVozidloRegistracniZnacka() {
        return prodejceVozidloRegistracniZnacka;
    }

    public void setProdejceVozidloRegistracniZnacka(String prodejceVozidloRegistracniZnacka) {
        this.prodejceVozidloRegistracniZnacka = prodejceVozidloRegistracniZnacka;
    }

    public double getProdejceVozidloSpotreba() {
        return prodejceVozidloSpotreba;
    }

    public void setProdejceVozidloSpotreba(double prodejceVozidloSpotreba) {
        this.prodejceVozidloSpotreba = prodejceVozidloSpotreba;
    }

    public String getProdejcePocitacAdresaIP() {
        return prodejcePocitacAdresaIP;
    }

    public void setProdejcePocitacAdresaIP(String prodejcePocitacAdresaIP) {
        this.prodejcePocitacAdresaIP = prodejcePocitacAdresaIP;
    }

    public double getVypsatPrumerneMnozstviProdaneMrkveNaJednuSmlouvu() {
        return vypsatPrumerneMnozstviProdaneMrkveNaJednuSmlouvu;
    }

    public void setVypsatPrumerneMnozstviProdaneMrkveNaJednuSmlouvu(double vypsatPrumerneMnozstviProdaneMrkveNaJednuSmlouvu) {
        this.vypsatPrumerneMnozstviProdaneMrkveNaJednuSmlouvu = vypsatPrumerneMnozstviProdaneMrkveNaJednuSmlouvu;
    }
}



