package jindexcombo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

/**
 *
 * @author ewis
 */
public class RenDering extends BasicComboBoxRenderer{
    
    
    private Color Col;
    
   
     public Component getListCellRendererComponent(
            JList list, Object value, int index,
            boolean isSelected, boolean cellHasFocus)
        {
            
             super.getListCellRendererComponent(list, value, index,
                isSelected, cellHasFocus);
             
             if(index%2==0){
                   setBackground(Col);
             }
             
           
            return this;
        }

    /**
     * @param Col the Col to set
     */
    public void setCol(Color Col) {
        this.Col = Col;
    }
    
}
