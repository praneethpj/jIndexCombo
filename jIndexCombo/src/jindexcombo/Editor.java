/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jindexcombo;

import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.plaf.basic.BasicComboBoxEditor;

/**
 *
 * @author ewis
 */
public class Editor {
      static class MyEditor extends BasicComboBoxEditor {

        JScrollPane scroller = new JScrollPane();
        //NOTE: editor is a JTextField defined in BasicComboBoxEditor

        public MyEditor() {
            super();
            scroller.setViewportView(editor);
            scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        }

        /**
         * Return a JScrollPane containing the JTextField instead of the
         * JTextField *
         */
        @Override
        public Component getEditorComponent() {
            return scroller;
        }

        /**
         * Override to create your own JTextField. *
         */
        @Override
        protected JTextField createEditorComponent() {
            JTextField editor = new JTextField();
            editor.setBorder(null);
            /*editor.setEditable(false); //If you want it not to be editable */
            return editor;
        }
    }
}
