package test3;

import java.util.Random;
import java.util.TreeSet;
public class searchTree {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		int[] arr = new int[1000];
	    for(int i = 0; i < arr.length; i++)
	    {
	         arr[i] = i+1;
	         ts.add(arr[i]);
	    }
		int a;
	    a=1001;
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
