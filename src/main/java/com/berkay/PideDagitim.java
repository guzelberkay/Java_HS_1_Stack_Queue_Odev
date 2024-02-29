package com.berkay;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PideDagitim {
    public static void main(String[] args) {
        /**
         *2-   String bir kuyruk olusturcagız bir metot ile 10 tane musteri ekleyelim
         * daha sonra random 1 - 12  adet arasında bir pide üreteceğiz pide sayımız
         * daha sonra oluşmuş kuyruğa pideleri dağıtacağız
         * pide bittiğinde pide kalmadı çıktısını verelim
         * eğer pide bitmemiş ise ve pide almayan varsa pide almayanları da ayrıca yazdıralım
         *
         */


        /**
         * Önce kuyruk oluşturalım ve bu kuyruğa 10 tane müşteri ekleyelim
         * Burada LinkedList kullanacağız çünkü Queue interface i uygular ve
         * veri ekleme , silme gibi işlemlerde verimli bir performans sunar.
         */

        Queue<String> customers = new LinkedList<>();
        for (int i=1; i<11 ; i++){
            customers.offer("Musteri " + i);
        }
        // Simdi Random pide üretelim.
        Random random = new Random();
        int pideSayisi = random.nextInt(12)+1; // 1-12 arası rasgele pide atadık

        // Simdi pideleri kuyruğa dağıtalım

        for (int i=0; i<pideSayisi;i++){
            if (!customers.isEmpty()){
                String musteri = customers.poll();
                System.out.println(musteri + " pide alindi");
            }else {
                System.out.println("Pide bitti ve kuyrukta musteri kalmadi");
                break;
            }
        }
        // Pide almayan müşterileri yazdırma
        if (!customers.isEmpty()) {
            System.out.println("Pide almayan musteriler:");
            for (String customer : customers) {
                System.out.println(customer);
            }
        }
    }
}