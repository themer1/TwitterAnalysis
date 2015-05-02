/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec711assignment4;

/**
 *
 * @author Think
 */
public class LongerThan implements Checker<String>{
    private int value;

    public LongerThan(int x)
    {
        value = x;
    }

    @Override
    public boolean check(String obj) 
    {
        String s = obj;

        boolean result;
            if (s.length() > value)
                    result = true;
            else
                    result = false;

        return result;
    }

}
