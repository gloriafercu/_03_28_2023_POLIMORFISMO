package com.adecco.presentacion;

import com.adecco.modelo.Bateria;
import com.adecco.modelo.Flauta;
import com.adecco.modelo.Guitarra;
import com.adecco.modelo.InstrumentoMusical;

public class ProbarInstanceOf {
    public static void main(String[] args) {
        System.out.println("---------FLAUTA--------------");
        InstrumentoMusical i1 = new Flauta("Yamaha", 15);
        System.out.println("¿Es una flauta? " + (i1 instanceof Flauta));
        System.out.println("¿Es un instrumento musical? " + (i1 instanceof InstrumentoMusical));
        System.out.println("¿Es una guitarra ? " + (i1 instanceof Guitarra));
        // ¡¡ OJO : IMPORTANTE !!
        // i1 solo podemos ver los métodos de InstrumentoMusical pq su variable de referencia es de tipo InstrumentoMusical
        // si asignamos i1 a una variable de tipo Flauta f1, entonces ya podremos ver métodos de Flauta
        Flauta f1 = (Flauta) i1; // casting: convierte instrumento i1 a una flauta
        System.out.println(f1.instrumentoAire());

        System.out.println("---------BATERIA--------------");
        InstrumentoMusical b1 = new Bateria("Bang & Olufsen", 200);
        Bateria b2 = (Bateria) b1; // Asignamos b1 a una variable tipo Bateria para poder ver los métodos de bateria
        System.out.println(b2.intrumentoPercusion());


    }
}
