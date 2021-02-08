package OOP;


public class Ogrenci {

    int ogrenciiNo;
    String isim;

    void kayitEkle(int ogr, String name) {
        ogrenciiNo = ogr;
        isim = name;
    }

    void bilgileriGoster() {
        System.out.println(ogrenciiNo + " " + isim);
    }
}
class TestOgrenci {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci();
        Ogrenci ogrenci2 = new Ogrenci();

        ogrenci1.kayitEkle(4610, "kirkbir");
        ogrenci2.kayitEkle(4041, "kirkbirdir o");

        ogrenci1.bilgileriGoster();
        ogrenci2.bilgileriGoster();

    }
}

class Dortgen {
    int uzunluk;
    int genislik;

    void ekle(int u, int g) {
        uzunluk = u;
        genislik = g;
    }

    void alanHesapla() {
        System.out.println(uzunluk * genislik);
    }
}
class TestDortgen {
    public static void main(String[] args) {
        Dortgen dortgen1 = new Dortgen();
        Dortgen dortgen2 = new Dortgen();

        dortgen1.ekle(6, 8);
        dortgen2.ekle(8, 8);

        dortgen1.alanHesapla();
        dortgen2.alanHesapla();
    }
}


//TEK YERDE KULLANACAGIM ICIN BIRAZ DAHA FARKLI CAGIRDIM.
class Hesapla {

    void faktoryel(int n) {
        int sonuc = 1;
        for (int i = 1; i <= n; i++) {
            sonuc *= i;
        }
        System.out.println(sonuc);
    }

    public static void main(String[] args) {
        Hesapla hesapla = new Hesapla();
        hesapla.faktoryel(5);
//      new hesapla().faktoryel(5);  //anonim nesne... bu sekilde de oluyor..
    }
}



//PARAMETRELI CONSTRUCTORLA OLUSTURULDU....
class HayvanatBahcesi{
    int numara;
    String isim;

    HayvanatBahcesi(int no, String name) {
        numara=no;
        isim=name;
    }
    void bilgiler(){
        System.out.println(isim+" "+numara);
    }

    static class HayvanTesti{
        public static void main(String[] args) {
              HayvanatBahcesi hayvanatBahcesi=new HayvanatBahcesi(12,"AT");
              hayvanatBahcesi.bilgiler();
        }
    }


}