package com.berkay;

public class BankaUygulamasi {
    public static void main(String[] args) {
        /**
         * 3-müşterilerimizin ismi olsun sıra no olsun
         * birde banka müşterisi mi değil mi onu tuttugmuz
         * bir değişken olsun daha sonra bankada bir müsteri
         * kuyrugu olusturalım ve banka musterisi olanlara
         * öncelik verelim
         *
         *
         */
        BankaCustomer musteri1 = new BankaCustomer("Ahmet", true, 1);
       BankaCustomer musteri2 = new BankaCustomer("Ayşe", false, 2);
       BankaCustomer musteri3 = new BankaCustomer("Mehmet", true, 3);

        BankaKuyrugu bankaKuyrugu = new BankaKuyrugu();

        bankaKuyrugu.musteriEkle(musteri1);
        bankaKuyrugu.musteriEkle(musteri2);
        bankaKuyrugu.musteriEkle(musteri3);

        BankaCustomer siradakiMusteri = bankaKuyrugu.siradakiMusteri();
        System.out.println("Sıradaki Müşteri: " + siradakiMusteri);

        bankaKuyrugu.musteriCikar();

       BankaCustomer yeniSiraMusteri = bankaKuyrugu.siradakiMusteri();
        System.out.println("Yeni Sıradaki Müşteri: " + yeniSiraMusteri);

    }
}
