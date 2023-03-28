package com.adecco.modelo;

public class Bateria extends InstrumentoMusical {
    // Implementar método abstracto de su padre
    @Override
    public String sonidoEmite() {
        return "taca taca ta ta ta";
    }
    public String intrumentoPercusion() {
        return "Es un instrumento de percusión";
    }

    // CONSTRUCTORES
    public Bateria() {
    }
    public Bateria(String marca, double precio) {
        super(marca, precio);
    }
}
