package day17;

public class OgrenciOlusturma {
	/*
	 * OgrenciOlusturma adinda bir class olusturun Ogrencinin numarasi, adi, soyadi
	 * ve ortalamasi degiskenlerini private access modifier kullanarak olusturun
	 * getter ve setter methodlari olusturun default constructor ve tum degiskenleri
	 * iceren parametleri constructor olusturun
	 * 
	 * 
	 * OgrenciIsleri adinda bir class olusturun Ogrenci kayit, ogrenci goruntuleme,
	 * ogrenci silme ve cikis methodlari olusturun bu methodlari switch case ile
	 * cagirin 
	 * 
	 * 
	 * 
	 * 
	 */

	private int numarasi;
	private String adi;
	private String soyAdi;
	private double ortalama;

	public OgrenciOlusturma() {

	}

	public OgrenciOlusturma(int numara, String ad, String soyAd, double ortalama) {
		this.numarasi = numara;
		this.adi = ad;
		this.soyAdi = soyAd;
		this.ortalama = ortalama;
	}

	public int getNumarasi() {
		return numarasi;
	}

	public void setNumarasi(int numarasi) {
		this.numarasi = numarasi;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyAdi() {
		return soyAdi;
	}

	public void setSoyAdi(String soyAdi) {
		this.soyAdi = soyAdi;
	}

	public double getOrtalama() {
		return ortalama;
	}

	public void setOrtalama(double ortalama) {
		this.ortalama = ortalama;
	}

}
