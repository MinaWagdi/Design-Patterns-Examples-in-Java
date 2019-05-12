/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternstut3_iterator;

import java.util.ArrayList;

/**
 *
 * @author minarafla
 */
public class ArrayListIterator implements IteratorInterface{
    ArrayList<Object>myArrayList;
    int index;

    public ArrayListIterator(ArrayList<Object>arrlist) {
        this.myArrayList=arrlist;
        index=0;
    }
    
    

    @Override
    public boolean hasNext() {
        if(index>=this.myArrayList.size()){
            return false;
        }
        return true;
    }

    @Override
    public Object Next() {
        return this.myArrayList.get(index++);
    }
    
}
