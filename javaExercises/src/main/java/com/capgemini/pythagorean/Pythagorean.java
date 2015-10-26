package com.capgemini.pythagorean;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Pythagorean {
	public void triplet()
	{
	   
     int sum = 1000;
    int a;
    for (a = 1; a <= sum/3; a++)
    {
        int b;
        for (b = a + 1; b <= sum/2; b++)
        {
            int c = sum - a - b;
            if ((Math.pow(a,2.0)  + Math.pow(b,2.0)) ==Math.pow(c,2.0) ){
                System.out.println(a);
             System.out.println(b);
             System.out.println(c);
         }
        }

    }

	
	}
	
	public static void main (String [] args){
		
		 
		 Pythagorean p=new Pythagorean();
		 p.triplet();
	   }
}
