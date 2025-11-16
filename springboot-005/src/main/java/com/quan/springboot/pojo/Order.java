package com.quan.springboot.pojo;


import lombok.ToString;

public class Order {

    public static void main(String[] args) {
        Order macBook = Order.builder().id(12L).name("MacBook").price(12000D).build();
        System.out.println(macBook);
    }

    private Long id;
    private String name;
    private Double price;


    private Order(Long id,String name,Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    private static class Builder {
        private Long id;
        private String name;
        private Double price;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(Double price) {
            this.price = price;
            return this;
        }

        public  Order build() {
            return new Order(id, name, price);
        }


    }


}
