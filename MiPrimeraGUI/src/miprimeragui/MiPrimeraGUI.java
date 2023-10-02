
package miprimeragui;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.*;
/**
 *
 * @author maryse
 * 
 * GUI
 * Creación de mi primera interfaz gráfica en Java
 */

public class MiPrimeraGUI extends JFrame{
private JLabel label1,label2;
    //Contructor --> Propiedades de la ventana
    public MiPrimeraGUI(){
        setTitle("Mi primera ventana"); //Establece el título de la ventana
        setSize(1000, 880); //Dimenciona la ventana (largo y ancho)
        getContentPane().setBackground(new Color(87,35,100));
        Componentes(); //Llamada al método que contiene los componentes que conforman el  formulario
        this.setResizable(true); //Cambiar el tamaño del marco
        setLocationRelativeTo(null); //Posiciona la ventana en el centro
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Operación que se va a realizar, cuando se cierre la ventana
        setVisible(true); //Hace visible la ventana 
        
    }
    //Métodos con los elementos que conforman la ventana
    public void Componentes(){
        setLayout(null);
        label1 = new JLabel("The Strongest" );
        label1.setFont(new Font("Arial",2,60));
        label1.setForeground(new Color(0,0,0));
        label1.setBounds(290,0,600,100);
        add(label1);
        
        
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("imagen/gojo.png"));
        label2 = new JLabel(imagen1);
        label2.setBounds(0,150,1000,600);
        add(label2);
        
    }
    
    //Método que ejecuta la aplicación --> main
    public static void main(String args[]){
        MiPrimeraGUI ventana= new MiPrimeraGUI();
        //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventana.setVisible(true);
        //ventana.Componentes();
    }
    
}
