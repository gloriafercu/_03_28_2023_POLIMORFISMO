package com.adecco.modelo;

public class Flauta extends InstrumentoMusical {
    // Como hereda de una clase abstracta nos pide que implementemos el método abstracto
    @Override
    public String sonidoEmite() {
        return "flu flu flu";
    }
    public String instrumentoAire() {
        return "Es un instrumento de aire";
    }
    // Los constructores no se heredan a las clases hijas por tanto tendremos que construirlo
    // Como no tenemos ningún atributo no tenemos que generar setters ni getters

    // CONSTRUCTORES
    public Flauta() {
    }

    public Flauta(String marca, double precio) {
        super(marca, precio);
    }
}
