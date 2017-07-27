/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jindexcombo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

class CellRenderer extends JLabel implements ListCellRenderer<Object> {

    private static int ID;

    /**
     * @return the ID
     */
    public static int getID() {
        return ID;
    }

    /**
     * @param aID the ID to set
     */
    public static void setID(int aID) {
        ID = aID;
    }
 
   
 
    public CellRenderer() {
        setOpaque(true);

    }

    public Component getListCellRendererComponent(JList<?> list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus) {
        setID(list.getSelectedIndex());
        setText(value.toString());

        Color background;
        Color foreground;

        ComboDetails.setId(String.valueOf(list.getSelectedIndex()));


        // ComboDetails.setName(String.valueOf(value));
        
        
     //  System.out.println("in "+CellRenderer.ID);


        // check if this cell represents the current DnD drop location
        JList.DropLocation dropLocation = list.getDropLocation();
        if (dropLocation != null
                && !dropLocation.isInsert()
                && dropLocation.getIndex() == index) {

            background = Color.BLUE;
            foreground = Color.WHITE;

            // check if this cell is selected
        } else if (isSelected) {
            background = Color.BLUE;
            foreground = Color.WHITE;

            // unselected, and not the DnD drop location
        } else {
            background = Color.WHITE;
            foreground = Color.BLACK;
        };

        setBackground(background);
        setForeground(foreground);

        return this;
    }
}
