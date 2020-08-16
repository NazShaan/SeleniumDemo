package collections;

import java.util.LinkedList;

public class LinkListDemo
{

	public static void main(String[] args)
	{
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(int i =1; i<=10; i++)
		{
			ll.add(i);
		}
		System.out.println(ll);

	}

}
