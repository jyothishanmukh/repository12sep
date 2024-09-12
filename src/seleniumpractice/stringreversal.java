package seleniumpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class stringreversal {

	public static void main(String[] args) throws IOException {
		String str;
		System.out.println("please enter the string");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		str =br.readLine();
		int lenofstring= str.length();
		for(int j=lenofstring-1;j>=0;j--)
		{
			System.out.println(str.charAt(j));
			
		}
		
		int maxlength;
		Map<Integer,String>  hmap= new HashMap<Integer,String>();
		
		
		String[] stray= str.split(" ");
		
		for(int j=stray.length-1;j>=0;j--)
		{
			System.out.println(stray[j]);
			int lengthofstring= stray[j].length();
			hmap.put(Integer.valueOf(lengthofstring), stray[j]);			
		}
		
		
			
		//for (Integer key : hmap.keySet()) {
         ////   System.out.println(key + " = " + hmap.get(key));
		  //  hmap.keySet().
	Integer abc=	 Integer.valueOf(Collections.max(hmap.keySet()));
	System.out.println(hmap.get(abc));
		    
			// number of characters repeated and their count
	
	
	
	
	
	
	

	}

}
