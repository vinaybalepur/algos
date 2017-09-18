package hash;

import java.util.Arrays;

public class RunHashTable 
{
	public static void main(String[] args) {
		MyHash m = new MyHash(10);
		for(int i=0;i<10;i++)
		{
			m.insert("hithesh" +"" +i);
			
		}
		System.out.println(m.toString());
	}
}


class MyHash
{
	String s;
	String in[];
	
	public MyHash(int i)
	{
		in = new String[i]; 
	}
	
	
	
	public void insert(String key)
	{
		this.s = key;
		int hash = hashCode();
		if(in[hash] == null)
		{
			in[hash] = key;
		}else
		{
			System.out.println("Index is occupied " + hash);
		}
	}
	
	public int hashCode()
	{
		long sum = 0;
		for(int i=0;i<s.length();i++)
		{
			sum = sum + Integer.valueOf(s.charAt(i));
			
		}
		return (int) sum%in.length;
	}
	
	public String toString()
	{
		return Arrays.toString(in);
	}
}