package com.adecco.modelo;

public class Guitarra extends InstrumentoMusical {
    // Implementamos el método abstracto pq extiende de una clase abstracta
    @Override
    public String sonidoEmite() {
        return "gli gli gli gli";
    }

    // CONSTRUCTORES
    public Guitarra() {
    }
    public Guitarra(String marca, double precio) {
        super(marca, precio);
    }
}
