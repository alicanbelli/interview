package OOP;

public class StaticKeyword {
    int ogrenciNo;
    String isim;
    static String fakulte="Edebiyat";

    StaticKeyword(int no,String adi){  //parametreli konstructor
        ogrenciNo=no;
        isim=adi;
    }
    void bilgileriGoster(){  //method...
        System.out.println(ogrenciNo+isim);
    }

    static class TestStaticKeyWord{
        public static void main(String[] args) {
            StaticKeyword staticKeyword=new StaticKeyword(1453,"Ali"); //
            // Parametreli konstructor in degerlerni girdik...
            //Burda obje olusturup atama yapmadik.
            staticKeyword.bilgileriGoster();

        }
    }



}
