package stefanini.matteo.CaseStudy;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;


import java.io.BufferedReader;
import java.io.FileReader;

import java.util.ArrayList;




public class AppTree 
{
    public AppTree(){	
    	
    	try{
    		FileReader fr = null;
        	BufferedReader br = null;
        	Map<AddressTree ,List<Integer>> indirizzi = null;
    		fr = new FileReader("attivita_comm_media_grande_distrib.csv");
    		br = new BufferedReader(fr);
    		String str = null;
       		Integer indice = 0;
    		indirizzi = new TreeMap<>();
    		str = br.readLine();
    		while((str = br.readLine()) != null && indice < 92){
    			String[] strings = str.split(";");
    			AddressTree ad = new AddressTree(strings[2], strings[3], strings[4], indice.intValue());
    			if(indirizzi.containsKey(ad)){
    				List<Integer> temp = indirizzi.get(ad);
    				temp.add(indice);
    			}else{
    				List<Integer> temp = new ArrayList<>();
    				temp.add(indice);
    				indirizzi.put(ad, temp);
    			}
    			indice++;
    		}
    		for(AddressTree ad: indirizzi.keySet()){
    			System.out.println(ad);
    		}
    		
    		
    		br.close();


    		}catch (Exception e){
        
    		}
    	}
	}