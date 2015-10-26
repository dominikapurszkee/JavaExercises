                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 package com.capgemini.placeToSplit;

/**
 * Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
 * Example:
 * {{{
 * canBalance({1, 1, 1, 2, 1}) → true
 * canBalance({2, 1, 1, 2, 1}) → false
 * canBalance({10, 10}) → true
 * }}}
 */
public final class PlaceToSplit {
    private PlaceToSplit() {
    	
    }

    public static boolean canBalance(int[] nums) {
       int n=nums.length;
       if(n%2==1)return false;
       else
       {
    	   int totalSum=0;
    	   for(int i=0;i<n;i++)
    	   {
    		   totalSum=totalSum+nums[i];
    	   }
    	   
    	   int halfSum=totalSum/2;
    	   
    	   int leftSum=0;
    	   int leftIndex=0;
    	  
    	   while(leftSum<halfSum) {
    		  leftSum= leftSum+nums[leftIndex];
    		  leftIndex++;
    	   }
    	   System.out.println(totalSum);
    	   System.out.println(halfSum);
    	   System.out.println(leftSum);
    	   leftIndex=leftIndex-1;
    	   System.out.println(leftIndex);
    	   int rightSum=0;
    	   int r=n-1;
    	   while(r>leftIndex){
    		 
    		  if((r-1)>leftIndex) 
    		   rightSum= nums[r]+nums[r-1];
    		  
    		  else rightSum=nums[r];
    		  r--;
    	   }
    	   
    	   if(leftSum==rightSum)return true;
    	   else return false;
       }
    }
    
   public static void main (String [] args){
	   int [] tab= {9,1};

	  
	   System.out.println( canBalance(tab));
   }
   

}
   
