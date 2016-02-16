package stefanini.matteo.CaseStudy;

import java.util.List;
import java.util.Map;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;



public class App 
{
    //public static void main( String[] args )
    public App(){	
    	
    	try{
    		FileReader fr = null;
        	BufferedReader br = null;
        	Map<Address,List<Integer>> indirizzi = null;
    		fr = new FileReader("attivita_comm_media_grande_distrib.csv");
    		br = new BufferedReader(fr);
    		String str = null;
       		Integer indice = 0;
    		indirizzi = new HashMap<>();
    		while((str = br.readLine()) != null && indice < 93){
    			String[] strings = str.split(";");
    			Address ad = new Address(strings[2], strings[3], strings[4], indice.intValue());
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
    		for(Address ad: indirizzi.keySet()){
    			System.out.println(ad);
    		}
    		
    		
//    			GeoApiContext context = null;
//    	    	GeocodingResult[] results = null;
//    	    	PrintWriter pw = null;
//
//	    		context = new GeoApiContext().setApiKey(args[0]);
//	    		pw = new PrintWriter("results.txt", "UTF-8");
//	    		for(Address a: indirizzi.keySet()){
//	    			results = GeocodingApi.geocode(context, a.toString()).await();
//	    			for(Integer l: indirizzi.get(a)){
//	    				pw.println(l.toString() + ";" + results[0].geometry.location.lat + results[0].geometry.location.lng + ";" + a.toString() + ";"); 
//	    			}
//	    		}
    		br.close();
    		//pw.close();


    		}catch (Exception e){
        
    		}
    	}
	}
 