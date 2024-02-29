package Pertemuan2;

import java.util.Scanner;

public class IndeksNilaiMatkul {
    private static int nilai;
	
	public static String CheckNilai() {
		String Nilai = null;
		
		if(nilai >= 0) {
			if((nilai >= 0)&&(nilai <= 20 )) {
				System.out.println("E");
			}else if ((nilai >= 0 )&&(nilai <= 40)) {
				System.out.println("D");
			}else if ((nilai > 40 )&&(nilai <= 50)) {
				System.out.println("C");
			}else if ((nilai > 50 )&&(nilai <= 55)) {
				System.out.println("BC");
			}else if ((nilai > 55 )&&(nilai <= 75)) {
				System.out.println("B");
			}else if ((nilai > 75 )&&(nilai <= 80)) {
				System.out.println("AB");
			}else if ((nilai > 80 )&&(nilai <= 100)) {
				System.out.println("A");
			}else {
				System.out.println("Nilai Diluar Jangkauan");
			}	
		}else {
			System.out.println("Tolong isi Nilai dengan benar!");
		}
		return Nilai;
		
	}
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukan Nilai anda : ");
		if (scanner.hasNextInt()) {
			nilai = scanner.nextInt();
			CheckNilai();
		} else {
			System.out.println("Nilai Harus diisi");
		}

	}
}
