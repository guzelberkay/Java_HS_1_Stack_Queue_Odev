package com.berkay;

import java.util.LinkedList;
import java.util.Queue;

public class BankaKuyrugu {
    Queue<BankaCustomer> kuyruk = new LinkedList<>();

    public void musteriEkle(BankaCustomer customer) {
        kuyruk.add(customer);
    }

    public BankaCustomer siradakiMusteri() {
        for (BankaCustomer customer: kuyruk) {
            if (customer.isBankCustomer) {
                return customer;
            }
        }
        return kuyruk.peek();
    }

    public BankaCustomer musteriCikar() {
        return kuyruk.poll();
    }
}
