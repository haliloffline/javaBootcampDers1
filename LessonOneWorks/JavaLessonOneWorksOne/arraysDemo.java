package ders1odev2;

public class arraysDemo {

	public static void main(String[] args) {
		
		String ogrenci1 = "Engin";
		String ogrenci2 = "Halil";
		String ogrenci3 = "As�m";
		String ogrenci4 = "Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("--------------------------------");
		
		
		String[] ogrenciler = new String[3];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Halil";
		ogrenciler[2]="As�m";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("--------------------------------");
		
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		
		
		
		
	}

}
