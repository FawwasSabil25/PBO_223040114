package Pertemuan2;

import java.util.Scanner;

public class TotalBilangan {
	    public static int hitungTotal(int N) {
	        Scanner scanner = new Scanner(System.in);
	        int total = 0;

	        for (int i = 1; i <= N; i++) {
	            int bilangan = scanner.nextInt();
	            total += bilangan;
	        }

	        return total;
	        }
            

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("N : ");
	        int N = scanner.nextInt();

	        if (N <= 0) {
	            System.out.println("N tidak boleh nol atau minus");
	        } else {
	            int total = hitungTotal(N);
	            System.out.println("Total = " + total);
	        }
	    }
    
}
