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
public class Odd implements Checker<Integer>
{

	public Odd()
	{

	}

	@Override
	public boolean check(Integer obj) 
	{
		int x = (int)obj;
		boolean result;
		
		if (x%2 != 0)
			result = true;
		else
			result = false;
		
		return result;
	}

}
