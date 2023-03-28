package com.adecco.modelo;

public abstract class InstrumentoMusical {
    // 1. Atributos
    protected String marca;
    protected double precio;

    // 2. Métodos
    public abstract String sonidoEmite();

    @Override
    public String toString() {
        return "InstrumentoMusical {" +
                " marca = '" + marca + '\'' +
                ", precio = " + precio + " " +
                '}';
    }

    // 3. Constructores

    // Constructor vacío
    public InstrumentoMusical() {
    }
    // Constructor con todos los argumentos
    public InstrumentoMusical(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    // 4. Setters y Getters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
