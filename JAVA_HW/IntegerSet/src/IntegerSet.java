//Copyright @ U0324017_rightleft. All rights reserved
import java.util.*;
public class IntegerSet 
{
	public static boolean a[] = new boolean[101];
	public static boolean b[] = new boolean[101];
	public static boolean Union[] = new boolean[101];
	public static boolean Inter[] = new boolean[101];
	
	public static void union(boolean[] seta, boolean[] setb)
	{
		for(int i=0; i<101; i++)
		{
			if(seta[i]==true) Union[i]=true;
			else if(setb[i]==true) Union[i]=true;
			else Union[i]=false;
		}
	}
	
	public static void intersection(boolean[] seta, boolean[] setb)
	{
		for(int i=0; i<101; ++i)
		{
			if(seta[i]==setb[i] && seta[i]==true) Inter[i]=true;
		}
	}
	
	public static void insertElement(boolean[] set,int number)
	{
		set[number]=true;
	}
	
	public static void deleteElement(boolean[] set,int number)
	{
		set[number]=false;
	}
	
	public static void toString(boolean[] set)
	{
		int isEmpty=1; // the set is empty
		for(int i=0; i<101; i++)
		{
			if(set[i]!=false)
			{
				System.out.print(i+" ");
				isEmpty=0; // the set isn't empty
			}
		}		
		if(isEmpty==1) // the set is empty
			System.out.print("---");		
	}
	
	public static boolean isEqualto()
	{
		int count1=0,count2=0;
		boolean isEqual=false;
		for(int i=0; i<101; i++)
		{
			if(a[i]==true) 
				count1++;
			if(b[i]==true)
				count2++;
		}
		if(count1==count2) isEqual=true;
		return isEqual;	
	}
	
	public void initial() // Be an empty set
	{
		for(int i=0; i<101; i++)
		{
			a[i] = false;
		}
	}	
}
