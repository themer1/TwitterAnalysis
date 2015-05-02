/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec711assignment4;

import java.util.Iterator;

/**
 *
 * @author Think
 */
public class Filter<E>  implements Iterator<E> {
    private Checker<E> checker;
    private Iterator<E> iter;
    private E value;

    public Filter(Iterator<E> it, Checker<E> check)
    {
        iter = it;
        checker = check;
    }           

    @Override
    public boolean hasNext()
    {
        return true;
    }

    @Override
    public E next() 
    {
        while(true)
        {
            if (iter.hasNext())
            {
                value = iter.next();
                if(checker.check(value))
                {
                    return value;
                }
            }
        }
    }

    @Override
    public void remove() 
    {
        throw new UnsupportedOperationException();
    }
}
