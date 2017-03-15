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
public class ventana3 extends Frame{
    private final Button bin1, bin2, bin3, bin4, bin5, bin6, bin7, bin8, bin9;
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana3(){
    super("Ventana 3");
    setLayout(new GridLayout()); 
bin1 = new Button ("Boton 1");
add (bin1); 
bin2 = new Button ("Boton 2");
add (bin2); 
bin3 = new Button ("Boton 3");
add (bin3); 
bin4 = new Button ("Boton 4");
add (bin4); 
bin5 = new Button ("Boton 5");
add (bin5); 
bin6 = new Button ("Boton 6");
add (bin6); 
bin7 = new Button ("Boton 7");
add (bin7); 
bin8 = new Button ("Boton 8");
add (bin8); 
bin9 = new Button ("Boton 9");
add (bin9); 
setSize (500,500);
setVisible (true);
}
}


    

