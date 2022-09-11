package com.tema2;

public class Tema2 {
    public static void main(String[] args) {
        double price = priceIva(1456);
        System.out.println("Precio con IVA incluído: " + price);
    }

    /**
     *
     * @param price
     * @return el precio con el IVA del 19% que se utiliza en Colombia
     */
    static double priceIva(double price) {
        return price * 1.19;
    }
}
