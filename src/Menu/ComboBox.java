/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Menu;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author Usuario
 */
public class ComboBox extends BasicComboBoxUI {
    private Color c = new Color(255,255,255); //Seleccion background
    private Color b = new Color(83,124,164); //Azul

    public static ComboBoxUI createUI(JComponent c){
        return new ComboBox();
    }
    
    @Override
    protected JButton createArrowButton(){//DirrecciónFleca,Fondo,Sombra,DarkShadow,highlight
    BasicArrowButton basicArrowButton = new BasicArrowButton(BasicArrowButton.SOUTH,b,c,c,b);    
    basicArrowButton.setBorder(BorderFactory.createLineBorder(b,1));
    basicArrowButton.setContentAreaFilled(false);        
    return basicArrowButton;
    }
    
    @Override
     public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus){
        g.setColor(c);            
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
    }
     
    @Override
    protected ListCellRenderer createRenderer(){
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                 super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.
                 list.setSelectionBackground(c);
                 
            if (isSelected)
            {
             setBackground(b);
             setForeground(Color.WHITE);
            }
            else
            {
            setBackground(c);            
            setForeground(new Color(0,0,0));
            }
                 return this;
            }
        
        }; 
     }
}
