package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        double normalTutar, yas�ndirimi, indirimliTutar, gidisDon�s�ndirimi, son�ndirimliTutar;
        int yolculukTipi, mesafe, yas;


        Scanner scanner = new Scanner(System.in);

        System.out.print("L�tfen Gidece�iniz Mesafeyi Km cinsinden giriniz: ");
        mesafe = scanner.nextInt();
        System.out.print("L�tfen ya��n�z� giriniz: ");
        yas = scanner.nextInt();
        System.out.print("L�tfen Yolculuk Tipini (gidi� veya d�n��=1, gidi�-d�n�� =2) giriniz : ");
        yolculukTipi = scanner.nextInt();

        if (mesafe > 300) {
            if (yolculukTipi == 2) {

                if (yas > 0 && yas < 13) {

                    normalTutar = mesafe * 0.10;
                    yas�ndirimi = normalTutar * 0.50;
                    indirimliTutar = normalTutar - yas�ndirimi;
                    gidisDon�s�ndirimi = indirimliTutar * 0.20;
                    son�ndirimliTutar = indirimliTutar - gidisDon�s�ndirimi;


                    System.out.println("Bilet Fiyat� = " + normalTutar);
                    System.out.println("G�ncel �ndirimliBilet Fiyat�n�z : " + son�ndirimliTutar);


                } else if (yas > 12 && yas < 25) {
                    normalTutar = mesafe * 0.10;
                    yas�ndirimi = normalTutar * 0.10;
                    indirimliTutar = normalTutar - yas�ndirimi;
                    gidisDon�s�ndirimi = indirimliTutar * 0.20;
                    son�ndirimliTutar = indirimliTutar - gidisDon�s�ndirimi;


                    System.out.println("Bilet Fiyat� = " + normalTutar);
                    System.out.println("G�ncel �ndirimliBilet Fiyat�n�z : " + son�ndirimliTutar);

                } else if (yas > 65) {
                    normalTutar = mesafe * 0.10;
                    yas�ndirimi = normalTutar * 0.50;
                    indirimliTutar = normalTutar - yas�ndirimi;
                    gidisDon�s�ndirimi = indirimliTutar * 0.30;
                    son�ndirimliTutar = indirimliTutar - gidisDon�s�ndirimi;


                    System.out.println("Bilet Fiyat� = " + normalTutar);
                    System.out.println("G�ncel �ndirimliBilet Fiyat�n�z : " + son�ndirimliTutar);

                } else if (yas > 24 && yas < 65) {

                    normalTutar = mesafe * 0.10;
                    yas�ndirimi = normalTutar * 0.20;
                    indirimliTutar = normalTutar - yas�ndirimi;

                    System.out.println("Bilet Fiyat� = " + normalTutar);
                    System.out.println("Ya� �ndirimli Tutar  = " + indirimliTutar);


                } else {
                    System.out.println("Hatal� Giri� Yapt�n�z. L�tfen Ya��n�z� Tekrar giriniz");
                }
            } else if (yolculukTipi == 1) {
                if (yas > 0 && yas < 13) {

                    normalTutar = mesafe * 0.10;
                    yas�ndirimi = normalTutar * 0.50;
                    indirimliTutar = normalTutar - yas�ndirimi;
                    gidisDon�s�ndirimi = indirimliTutar * 1.0;
                    son�ndirimliTutar = indirimliTutar - gidisDon�s�ndirimi;


                    System.out.println("Bilet Fiyat� = " + normalTutar);
                    System.out.println("G�ncel �ndirimliBilet Fiyat�n�z : " + son�ndirimliTutar);


                } else if (yas > 12 && yas < 25) {
                    normalTutar = mesafe * 0.10;
                    yas�ndirimi = normalTutar * 0.10;
                    indirimliTutar = normalTutar - yas�ndirimi;
                    gidisDon�s�ndirimi = indirimliTutar * 1.0;
                    son�ndirimliTutar = indirimliTutar - gidisDon�s�ndirimi;


                    System.out.println("Bilet Fiyat� = " + normalTutar);
                    System.out.println("G�ncel �ndirimliBilet Fiyat�n�z : " + son�ndirimliTutar);
                } else if (yas > 65) {
                    normalTutar = mesafe * 0.10;
                    yas�ndirimi = normalTutar * 0.50;
                    indirimliTutar = normalTutar - yas�ndirimi;
                    gidisDon�s�ndirimi = indirimliTutar * 1.0;
                    son�ndirimliTutar = indirimliTutar - gidisDon�s�ndirimi;


                    System.out.println("Bilet Fiyat� = " + normalTutar);
                    System.out.println("G�ncel �ndirimliBilet Fiyat�n�z : " + son�ndirimliTutar);

                } else if (yas > 24 && yas < 65) {

                    normalTutar = mesafe * 0.10;


                    System.out.println("Bilet Fiyat� = " + normalTutar);


                }
            } else {
                System.out.println("Hatal� Giri� Yapt�n�z. L�tfen Ya��n�z� Tekrar giriniz");
            }
        } else {
            System.out.println("Hatal� Giri� Yapt�n�z. Dikkat 300 km Alt�nda U�ak seyatlerimiz bulunmamaktad�r.");
        }
    }
}



