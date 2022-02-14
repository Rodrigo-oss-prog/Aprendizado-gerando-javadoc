package com.dio.base;

/**
 * @author José Rodrigo
 * @version 1.0.0
 * @see String
 * @since Release 1.0.0
 */
public class Order {
    private final String code;

    /**
     * Construtor da classe
     *
     * @param code          código do pedido
     *
     */
    public Order(String code) {
        this.code = code;

    }

    /**
     * Código do pedido
     *
     * @return Caracteres de segurança
     */

    @Override
    public String toString() {
        return "Order{" +
                "code='" + code + '\'' +
                '}';
    }
}
