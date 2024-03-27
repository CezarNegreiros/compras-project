package com.cezarNegreiros.compras.entities.enums;

public enum OrderStatus {
    /*Os números servem para setar de forma explícita o código de cada ENUM, para evitar que a ordem seja alterada por
    caosa de um Enum novo criado entre os enums atuais*/
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static OrderStatus valueOf(int code){
        for(OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
