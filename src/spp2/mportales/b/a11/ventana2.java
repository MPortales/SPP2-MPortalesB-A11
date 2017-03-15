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
public class ventana2 extends Frame{
    private final Button btnNorte, btnSur, btnEste, btnOeste, btnCentro;
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana2(){
    super("Ventana 2");
    setLayout(new BorderLayout()); 
btnNorte = new Button ("Boton Norte");
add (btnNorte,BorderLayout.NORTH); 
btnSur= new Button ("Boton Sur");
add (btnSur,BorderLayout.SOUTH);
btnEste = new Button ("Boton Este");
add (btnEste,BorderLayout.EAST);
btnOeste = new Button ("Boton Oeste");
add (btnOeste,BorderLayout.WEST); 
btnCentro = new Button ("Boton Centro");
add (btnCentro,BorderLayout.CENTER); 
setSize (800,600);
setVisible (true);
}
}
