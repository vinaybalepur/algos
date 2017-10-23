package allAlgos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SteadyGenes {

	private static int n;
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        String s = scanner.next();
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('T', 0);
        map.put('G', 0);
        map.put('C', 0);
        
        char c[] = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
        	map.put(c[i], map.get(c[i])+1);
        }
        System.out.println(map.toString());
        
        int balancedValue = n/4;
        int charectersToadd = 0;
        Iterator<Character> it = map.keySet().iterator();
        for(int i=0;i<map.keySet().size();i++)
        {
        	
        	char key = it.next();
        	while(true){
        		
	        	if(map.get(key)<balancedValue)
	        	{
	        		charectersToadd++;
	        		map.put(key, map.get(key)+1);
	        	}else if(map.get(key)>balancedValue)
	        	{
	        		map.put(key, map.get(key)-1); 
	        	}else
	        	{
	        		break;
	        	}
        	}
        }
        System.out.println( charectersToadd);
	}
	
	
}
