/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternstut3_iterator;

/**
 *
 * @author minarafla
 */
public class ArrayIterator implements IteratorInterface{
    Object[] my_array;
    int index;

    public ArrayIterator(Object[] my_array) {
        this.my_array=my_array;
        index=0;
    }
    

    @Override
    public boolean hasNext() {
       if(index>=my_array.length){
           return false;
       }
       return true;
        
    }

    @Override
    public Object Next() {
        return my_array[index++];
    }
    
}
