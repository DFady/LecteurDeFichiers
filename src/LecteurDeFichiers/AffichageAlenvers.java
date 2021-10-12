package LecteurDeFichiers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class AffichageAlenvers extends FichierTexte {

	@Override
	public void readFile(String fileName) {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		File f = new File(fileName);
		BufferedReader br = null;
		List<String> myArrayList = new ArrayList<>();
		
		try {
			in = new FileInputStream(f);
		
			br = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));

	            String line;
	            
	            while ((line = br.readLine())!= null) {
	            	
	               myArrayList.add(line);
	            }
	            
	            Collections.reverse(myArrayList);
	            
	            System.out.println("Les phrases sont affichées dans l'ordre inverse : " + myArrayList);
	            
		}catch(Exception a ) {
			
			System.out.println(a.toString());
			
		}finally {
			if (in != null)
			{
				try {
					in.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (br != null)
			{
				try {
					br.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
		
	}
	

}
