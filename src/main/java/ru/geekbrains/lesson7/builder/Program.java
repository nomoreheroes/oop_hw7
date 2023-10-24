package ru.geekbrains.lesson7.builder;

public class Program {


    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("AAAA");
        String str = stringBuilder1
                .append("BBB")
                .append("CCC")
                .append("EEE")
                .delete(1, 3)
                .append("DDD")
                .toString();

        Order oder = new OrderBuilder()
                .setPrice(300)
                .setProductId(45001)
                .setQnt(2)
                .setProductName("Product #1")
                .build();

    }

}
