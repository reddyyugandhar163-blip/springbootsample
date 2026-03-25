package org.example.springbootsample.Strings;

public class Iamyogi {
    public int getSaliery() {
        return saliery;
    }

    public void setSaliery(int saliery) {
        this.saliery = saliery;
    }

    public double getAccount() {
        return account;
    }

    public boolean setAccount(double account) {
        this.account = account;
        return false;
    }

    private int saliery;
    private double account;

    public static void main(String[] args) {
        Iamyogi  iamyogi =new Iamyogi();
        System.out.println(iamyogi.setAccount(100));
    }
}
