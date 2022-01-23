package org.Sample;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Sample {
	public static void main(String[] args) {

		
		 String s = "abacbbbscccksa";
		 
		 Map<Character,Integer>mp=new LinkedHashMap<>();
		 
		 for(int i=0;i<s.length();i++) {
			 
			 char c = s.charAt(i);
			 
			 if(mp.containsKey(c)) {
				 
				 Integer a = mp.get(c);
				 mp.put(c, a+1);
			 }else {
				 mp.put(c, 1);
			 }
			 
			 
		 }
			
			
		System.out.println(mp);
		
	}

}
