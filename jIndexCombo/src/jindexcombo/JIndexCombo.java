/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jindexcombo;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import jindexcombo.Editor.MyEditor;
 

/**
 *
 * @author Praneeth
 * @ Ewis
 */
/**
 * The
 * <code>JIndexCombo</code> class is extend in JComboBox implements KeyListener
 *
 * <p>setItemsArray(IDS,Description)</p> <p>setItemsArray(Description)</p>
 * <p>getSelectedItemIdByList()</p> <p> getSelectedIndex()</p>
 * <p>setItems(HashMap h);</p><p>setItems(Objects);</p><p>setItems(Object id,Object Description);</p>
 *
 * @author unascribed
 * @since JDK6.0
 */
public class JIndexCombo extends JComboBox implements KeyListener {

    private Vector v = new Vector();
    private Object getDesc;
    private ArrayList arrayDescripn;
    private ArrayList arryId;

    public JIndexCombo() {


        super();
        setEditor(new MyEditor());


        setRenderer(new CellRenderer());
        addItem("Value1");
        addItem("Value2");
        addItem("Value3");
        addItem("Value4");

        // jComboBox2.setModel(new DefaultComboBoxModel(arr1.toArray()));

    }

    public void setItemsArray(ArrayList array) {
        setModel(new DefaultComboBoxModel(array.toArray()));
    }

    public void setItemsArray(ArrayList ID, ArrayList Description) {
        this.arrayDescripn = Description;
        this.arryId = ID;


        setModel(new DefaultComboBoxModel(Description.toArray()));

    }

    public Object getSelectedItemIdByList()throws ArrayIndexOutOfBoundsException {

        return arryId.get(Integer.valueOf(ComboDetails.getId()));
    }

    public void setColorby(Color c) {
        RenDering ren = new RenDering();
        ren.setCol(c);

        setRenderer(ren);
    }

    public boolean setItems(HashMap<Object, Object> h) {

        boolean isDone = true;;
        v.add(h);
        setModel(new DefaultComboBoxModel<Object>(v));

        return isDone;

    }

    public boolean setItems(Object id, Object Description) {

        boolean isDone = true;;
        v.add(new ItemPut(id, Description));
        setModel(new DefaultComboBoxModel<Object>(v));

        return isDone;

    }

    public boolean setItems(Object Description) {

        boolean isDone = true;;
        v.add(Description);
        setModel(new DefaultComboBoxModel<Object>(v));

        return isDone;

    }

    public Object getSelectedDesc() {

        getDesc = ((ItemPut) getSelectedItem()).getDescription();

        return getDesc;
    }

    @Override
    public int getSelectedIndex() {

        int id = Integer.valueOf(ComboDetails.getId());

        return id;
    }

    public Object getSelectedIndexId() {

        getDesc = ((ItemPut) getSelectedItem()).getId();

        return getDesc;
    }

    @Override
    public String toString() {
        String a = (getSelectedItem()).toString();

        return a;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == 10) {
            showPopup();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 10) {
            showPopup();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == 10) {
            showPopup();
        }
    }
}
