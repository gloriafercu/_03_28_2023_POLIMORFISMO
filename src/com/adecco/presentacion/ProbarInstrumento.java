package com.adecco.presentacion;

import com.adecco.modelo.Bateria;
import com.adecco.modelo.Flauta;
import com.adecco.modelo.Guitarra;
import com.adecco.modelo.InstrumentoMusical;

public class ProbarInstrumento {
    public static void main(String[] args) {
       // Vamos a instanciar un ARRAY DE INSTRUMENTOS MUSICALES
        InstrumentoMusical [] instrumentos = new InstrumentoMusical[3];
        instrumentos[0] = new Flauta("Yamaha", 10);
        instrumentos[1] = new Guitarra("Ban & Olufsen", 120);
        instrumentos[2] = new Bateria("Yamaha", 300);

        // Recorrer el Array con ForEach
        for (InstrumentoMusical instrumento: instrumentos) {
            System.out.println("El sonido que emite el instrumento es: " + instrumento.sonidoEmite());
            System.out.println(instrumento.getClass());
            System.out.println("¿Es una guitarra? " + (instrumento instanceof Guitarra));
            System.out.println("¿Es una guitarra un InstrumentoMusical? " + (instrumento instanceof InstrumentoMusical));
            // instanceof es para preguntar si el objeto es de una determinada clase o no: respuesta verdadero o falso
            if (instrumento instanceof Flauta) {
                System.out.println(((Flauta) instrumento).instrumentoAire());
                // el array es InstrumentoMusical y para poder leer el método de Flauta lo tenemos que convertir mediante CASTING
            }
        }
    }
}