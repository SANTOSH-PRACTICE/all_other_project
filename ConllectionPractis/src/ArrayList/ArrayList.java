package ArrayList;

import java.util.Iterator;

public class ArrayList 
{
		int a[];
		int index=0;
		
		void remove(int i)
		{
			if(i<0||i>index)
			{
				System.out.println("not possible");
			}
			else {
			for (int j = i; j < index; j++) 
			{
				a[j]=a[j+1];
				
			}
			index--;
		}
		}
		public String toString()
		{
			String s="";
			for (int i = 0; i < index; i++) 
			{
				s=s+a[i]+" ";
			}
			return s;
		}
		
		int [] toArray()
		{
			int b[]=new int[index];
			for (int i = 0; i < index; i++) 
			{
				b[i]=a[i];
			}
			return b;
			
		}
		int get(int i)
		{
			return a[i];
			
		}
		
		void set(int i,int num)
		{
			a[i]=num;
		}
		int lastIndexOfV1(int num)
		{
			int index=0;
			for (int i = a.length-1; i >=0 ; i--) 
			{
				if(a[i]==num)
				{
					return index=i;
				}
				
			}
			return -1;
		}
		
		int lastIndexOf(int num)
		{
			int var=-1;
			for (int i = 0; i < index; i++) 
			{
				if(a[i]==num)
				
					var= i;
			}
			return var;
		}
		
		void display()
		{
			for (int i = 0; i < index; i++) {
				System.out.print(a[i]+" ");
			}
		}
		
		void size()
		{
			int size = index;
		}
		ArrayList(int size)
		{
			a=new int[size];
			
		}
		ArrayList()
		{
			a=new int[3];
			
		}
		boolean contains(int num)
		{
			for (int i = 0; i < a.length; i++) {
				if(a[i]==num)
				{
					return true;
				}
			}
			return false;
		}
		void add(int i,int num)
		{
			if(i<0||i>index)
			{
				System.out.println("not possible");
			}
			else {
			if(i==index)
			{
				int b[]=new int[2*index];
				for (int j = 0; j < a.length; j++) 
				{
					b[j]=a[j];
				}
				a=b;
			}
			
			{
				for (int j = index; j >=i+1; j--) 
				{
					a[j]=a[j-1];
				}
				a[i]=num;
				index++;
			}
		}
		}
		void add(int num)
		{
			if(index==a.length)
			{
				int b[]=new int[index*2];
				
				for (int i = 0; i < a.length; i++)
				{
					b[i]=a[i];
				}
				a=b;
				a[index++]=num;
			}
			else
			{
				a[index]=num;
				index++;
			}
		}
}	
