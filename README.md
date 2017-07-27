# jIndexCombo

   ![alt text](https://github.com/praneethpj/jIndexCombo/blob/master/git1.png)
   
Introduction
----------------
JavaSE  JcomboxBox setIndex id as any "String"

Since you are working with jCombobox , it is difficult to put indexId as String. for example id="pe001" while value="praneeth". 
this is cannot done with jComboBox.

But in here jIndexCombo can avoid this and the jIndexCombo is a component.

Implementation 
-------------------



        ArrayList<ItemPut> a=new ArrayList();
        a.add(new ItemPut("Pe001", "Praneeth"));
        a.add(new ItemPut("Pe002", "AJITH"));
        a.add(new ItemPut("Pe003", "Kumar"));
       
        jIndexCombo2.setItemsArray(a);
        
or you can use simply,

        jIndexCombo2.setItems("p001","Praneeth");
        jIndexCombo2.setItems("p002","Ajith");

you can get selected itemid

        jIndexCombo2.getSelectedIndexId() //return the value selected object
        
     
        
Additionally 
---------------

you can change the jIndexCombo color by call setColorby method

  jIndexCombo2.setColorby(Color.gray);
  
  
References
---------------

https://stackoverflow.com/questions/31626528/how-to-set-id-and-value-for-jcombobox-when-fetching-id-and-value-from-database
https://stackoverflow.com/questions/8327352/how-to-set-selected-index-jcombobox-by-value/9799256
