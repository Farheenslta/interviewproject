package javaprograms;

import java.util.ArrayList;
import java.util.Collections;

public class StringsSortingAlphabeticalOrder
{
	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Rohan");
		a.add("Shwetha");
		a.add("Farheen");
		a.add("Asma");
		a.add("Priya");
		a.add("Zee");
		a.add("Dua");
		a.add("Esha");
		
		//unsorted list
		System.out.println("Before Sorting : ");
		
		for(String counter : a)
		{
			System.out.print(counter + "\t");
		}
		System.out.println();
		
		//sort statement
		Collections.sort(a);
		//Collections.reverse(a);
		
		//Sorted List
		System.out.println("After sorting");
		for(String counter :a)
		{
			System.out.print(counter + "\t");
		}
	}
}