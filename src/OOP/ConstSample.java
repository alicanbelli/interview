package OOP;




    class HayvanatBahcesi2{
        int numara;
        String isim;

        //KONSTRUCTOR OLUSTURULDU...PARAMETRELI///
        HayvanatBahcesi2(int no, String name) {
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




