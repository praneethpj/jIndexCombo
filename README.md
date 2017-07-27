# jIndexCombo

Introduction
----------------
JavaSE  JcomboxBox setIndex id as any "String"

While you are working with jCombobox , it is difficult to put indexId as String. for example id="pe001" while value="praneeth". 
this is cannot done with jComboBox.

But in here jIndexCombo can avoid this problem.

Implementation 
-------------------



        ArrayList<ItemPut> a=new ArrayList();
        a.add(new ItemPut("Pe001", "Praneeth"));
        a.add(new ItemPut("Pe002", "AJITH"));
        a.add(new ItemPut("Pe003", "Kumar"));
       
        jIndexCombo2.setItemsArray(a);
        
or you can use it call simply,

        jIndexCombo2.setItems("p001","Praneeth");
        jIndexCombo2.setItems("p002","Ajith");

you can fetch that selected by itemid

        jIndexCombo2.getSelectedIndexId() //return the value selected object
        
Additionally 
---------------

you can change the jIndexCombo color by call setColorby method

  jIndexCombo2.setColorby(Color.gray);
