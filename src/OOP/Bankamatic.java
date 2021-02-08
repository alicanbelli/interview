package OOP;

public class Bankamatic {
    int hesapNo;
    String musteriIsmi;
    float eldekiPara;

    void musteriEkle(int hspNo, String isim, float mikt) {
        hesapNo = hspNo;
        musteriIsmi = isim;
        eldekiPara = mikt;

    }
    void paraYatir(float yatirilacakTutar) {
        eldekiPara += yatirilacakTutar;
        System.out.println(yatirilacakTutar + " hesabiniza yatirildi... Hayirli olsun ");
    }
    void paraCek(float cekilecekTutar) {
            if (cekilecekTutar>eldekiPara){
                System.out.println("uzgunum, "+ cekilecekTutar + " kadar paraniz yok...");
            }else{
                eldekiPara=eldekiPara-cekilecekTutar;
            }
    }
    void kontrol() {
        System.out.println("Bugunun bakiyesi : "+eldekiPara+ " Liradir...");
    }
    void goster() {
        System.out.println(hesapNo + " "+ musteriIsmi+ " "+ eldekiPara);
}
    public static void main(String[] args) {

        Bankamatic musteri1=new Bankamatic();
        musteri1.musteriEkle(4041," A l i", 50000);
        musteri1.goster();
        musteri1.paraCek(10000);
        System.out.println(musteri1.eldekiPara);
        musteri1.kontrol();
        musteri1.paraYatir(60000);
        musteri1.kontrol();
        musteri1.paraCek(150000);


    }


}
