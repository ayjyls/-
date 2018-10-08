package test3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class searchHashSet {
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		int[] arr = new int[1000000];
	    for(int i = 0; i < arr.length; i++)
	    {
	         arr[i] = i+1;
	         hs.add(arr[i]);
	    }
	    int a;
	    a=1000001;
	    System.out.println("Creat a randow number:"+a);
	    long startTime=System.nanoTime(); 
	    for(int j=0;j<arr.length;j++)
	    {
	    	if(a==arr[j]) {
	    		System.out.println("Find the element");
	    		break;
	    		}
	    	else
	    		System.out.println("There is not this element");
	    }
	    long endTime=System.nanoTime();
	    System.out.println("The time of program operation£º "+(endTime-startTime)+"ns"); 
	}
}
