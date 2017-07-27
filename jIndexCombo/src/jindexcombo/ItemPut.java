/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jindexcombo;

 

public class ItemPut
    {
        private Object id;
        private Object description;

        public ItemPut(Object id, Object description)
        {
            this.id = id;
            this.description = description;
        }

        public Object getId()
        {
            return id;
        }

        public Object getDescription()
        {
            return description;
        }

    @Override
        public String toString()
        {
            return description.toString();
        }
    }