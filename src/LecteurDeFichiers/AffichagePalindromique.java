package LecteurDeFichiers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AffichagePalindromique extends FichierTexte
{

	@Override
	public void readFile(String fileName) {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		File f = new File(fileName);
		String fileContents = null;
		StringBuilder input1 = new StringBuilder();
		 
		try {
			in = new FileInputStream(f);
		
			int i; 
	            
	        while ((i = in.read()) != -1) {
	                fileContents = fileContents + (char) i;	                
	            }
	        
	        input1.append(fileContents);
	 
	        System.out.println(input1.reverse());
	        
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
		}	
		
	}

}
