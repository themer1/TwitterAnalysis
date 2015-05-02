/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec711assignment4;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Think
 */
public class MySet<E> {
    private ArrayList els; // the rep

 // constructors

    public MySet()
    {
        els = new ArrayList();
    }

    public class MySetIterator<T> implements Iterator<T>
    {
        private int index;

        public MySetIterator()
        {
            index = 0;
        }

        @Override
        public boolean hasNext() 
        {
            return index < els.size();
        }

        @SuppressWarnings("unchecked")
        @Override
        public T next() 
        {
            T result = (T) els.get(index++);
            return result;
        }

        @Override
        public void remove() 
        {
            throw new UnsupportedOperationException();
        }
   }

    //methods

    public void insert(E el)
    // MODIFIES: this
    // EFFECTS: Adds el to the elements of this
    {
     if(getIndex(el)<0) els.add(el);
    }

    public void remove(E el)
    // MODIFIES: this
    // EFFECTS: Removes el from this
    {
        int i = getIndex(el);
        if(i<0) return;
        els.set(i,els.get(els.size()-1));
        els.remove(els.size()-1);
    }

    public boolean isIn(E el)
    // EFFECTS: Returns true if el is in this else returns false
    {
     return getIndex(el)>=0;
    }

    private int getIndex(E el)
    // EFFECTS: If el is in this returns index where el appears 
    //          else returns -1
    {
        for(int i=0; i<els.size(); i++)
           if(el.equals(els.get(i))) return i;
        return -1;
    }

    public int size()
    // EFFECTS: Returns the cardinality of this
    {
     return els.size();
    }

    public String toString()
    // EFFECTS: Return string representation of this
    {
        if(els.size()==0)
           return "{}";
        else
        {
         String str="{"+els.get(0);
         for(int i=1; i<els.size(); i++)
            str+=","+els.get(i);
         return str+"}";
        }
    }

    public Iterator iterator()
    {
        return new MySetIterator();
    }
}
