package seleniumpractice;

import java.util.HashMap;
import java.util.Map;

public class repetatedcharcterscount {
	
	public static void main(String args[])
	{
		
		
		String abc= "anandam";
		HashMap<Character,Integer> hmcharcount= new HashMap<Character,Integer>();
		for(int i=0;i<abc.length(); i++)
		{
			Character ch= Character.valueOf(abc.charAt(i));
			if(hmcharcount.containsKey(ch))
			{
			int j=	hmcharcount.get(ch).intValue();
			j++;
			hmcharcount.put(ch, Integer.valueOf(j));
			}
			
				else hmcharcount.put(ch, Integer.valueOf(1));
			
		}
		
	for(Map.Entry<Character, Integer> e  :hmcharcount.entrySet())
	{
		System.out.println(e.getKey().toString()+"  "+e.getValue().toString());
	}
		
	}
	
	
	

}
