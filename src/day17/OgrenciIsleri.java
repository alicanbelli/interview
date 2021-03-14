package day17;

import java.util.*;

public class OgrenciIsleri {

	static List<OgrenciOlusturma> ogrenciler = new ArrayList<>();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while (flag) {

			System.out.println("Hangi islemi gerceklestirmek istersiniz? \n1:Ogrenci Kayit\n2:Ogrenci Goruntuleme"
					+ "\n3:Ogrenci Silme\n4:Cikis");
			int islem = scan.nextInt();
			switch (islem) {
			case 1:
				ogrenciKayit();
				break;
			case 2:
				ogrenciGoruntule();
				break;
			case 3:
				ogrenciSil();
				break;
			case 4:
				cikis();
				flag = false;
				break;
			default:
				break;
			}
		}

	}

	public static void cikis() {
		System.out.println("Program sonlandirilmistir");

	}

	public static void ogrenciSil() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Silmek istediginiz ogrencinin numarasini giriniz");
		int number = scan.nextInt();
		OgrenciOlusturma ogrenciSil = null;
		for (OgrenciOlusturma ogrenci : ogrenciler) {

			if (ogrenci.getNumarasi() == number) {
				ogrenciSil = ogrenci;
			}

		}
		ogrenciler.remove(ogrenciSil);
		System.out.println(number + " li ogrenci silinmistir ");
	}

	public static void ogrenciGoruntule() {

		if (ogrenciler.isEmpty()) {
			System.out.println("Suan listede kayitli ogrenci bulunmamaktadir.");
		} else {

			for (OgrenciOlusturma ogrenci : ogrenciler) {
				System.out.println("Ogrenci Adi: " + ogrenci.getAdi() + "\nOgrenci Soyadi: " + ogrenci.getSoyAdi()
						+ "\nOgrenci No: " + ogrenci.getNumarasi() + "\nOgrenci Ortalama: " + ogrenci.getOrtalama());
				System.out.println("==========================");
			}
		}

	}

	public static void ogrenciKayit() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ogrenci ismini giriniz");
		String isim = scan.next();

		System.out.println("Ogrenci soyismini giriniz");
		String soyIsim = scan.next();

		System.out.println("Ogrenci numarasini giriniz");
		int numara = scan.nextInt();

		System.out.println("Ogrenci ortalamasini giriniz");
		double ortalama = scan.nextDouble();

		OgrenciOlusturma ogrenci = new OgrenciOlusturma(numara, isim, soyIsim, ortalama);
		ogrenciler.add(ogrenci);

	}

}
