package stefanini.matteo.CaseStudy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class setHash {

	public setHash(){
		try{
			HashSet<IndirizzoAttività> set = new HashSet<IndirizzoAttività>();
			FileReader fr = null;
	    	BufferedReader br = null;
			fr = new FileReader("attivita_comm_media_grande_distrib.csv");
			br = new BufferedReader(fr);
			String str = null;
	   		Integer indice = 0;
			while((str = br.readLine()) != null && indice < 93){
				String[] strings = str.split(";");
				(strings[2], strings[3], strings[4]);
				if(set.containsKey(ad)){
					List<Integer> temp = indirizzi.get(ad);
					temp.add(indice);
				}else{
					List<Integer> temp = new ArrayList<>();
					temp.add(indice);
					indirizzi.put(ad, temp);
				}
				indice++;
			}
		}catch (Exception e){
			
		}
	}
}
