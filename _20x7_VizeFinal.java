package com.turkcell;

import java.util.Scanner;

public class _20x7_VizeFinal {
	
	public static void main(String[] args) {
		
		// kullanıcıdan alınan vize ve final notuna göre geçme(ortalama)
		Scanner scanner = new Scanner(System.in);
		int sinav1, sinav2;
		System.out.println("Vize notunuzu giriniz: ");
		sinav1 = scanner.nextInt();
		System.out.println("Final notunuzu giriniz:");
		sinav2 = scanner.nextInt();
		if (sinav1 < 0 || sinav1 > 100 || sinav2 < 0 || sinav2 > 100) {
			System.out.println("Sınav notları 0 ile 100 arasında olmalıdır");
			return;
		}
		double ortalama = average(sinav1, sinav2);
		// not ortalaması: ortalama<50 altında ise kaldı
		if (ortalama < (double) 50)
			System.out.println("Kaldi");
		// not ortalaması: ortalama==50 Geçti
		else if (ortalama == 50)
			System.out.println("Gecti");
		// not ortalaması: 55<=x<=70 BB
		else if (ortalama < 70)
			System.out.println("Notunuz BB");
		// not ortalaması: 70<=x<=84 BA
		else if (ortalama < 85)
			System.out.println("Notunuz BA");
		// not ortalaması: 84<=x<=100 AA
		else
			System.out.println("Notunuz AA");
	}
	
	public static Double average(int number1, int number2) {
		return (double) ((number1 + number2) / 2);
	}
}
