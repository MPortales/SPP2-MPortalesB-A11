/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mportales.b.a11;

import java.awt.*;

/**
 *
 * @author may37
 */
public class ventana1 extends Frame { //Frame: para agregar lo de la biblioteca de java
    //atributos: 3 botones

    private final Button b1, b2, b3;
    //constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana1(){
    super("Esta es una ventana de prueba"); //super es un constructor de Frame y permite poner el titulo
        setLayout(new FlowLayout()); //acomoda en medio
//setLayout(new FlowLayout(FlowLayout.RIGHT)); //acomoda a la derecha
//setLayout(new FlowLayout(FlowLayout.LEFT)); //acomoda a la izq
b1= new Button ("Soy el boton 1");
add (b1);
b2= new Button ("Soy el boton 2");
add (b2);
b3= new Button ("Soy el boton 3");
add (b3);
setSize (400,400);
setVisible (true);
    }
}
