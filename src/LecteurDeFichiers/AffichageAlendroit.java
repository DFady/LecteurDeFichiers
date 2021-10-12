package LecteurDeFichiers;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AffichageAlendroit extends FichierTexte {

	
	
	@Override
	public void readFile(String fileName) {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		File f = new File(fileName);
		try {
			in = new FileInputStream(f);
		
			int i; 
	            
	        while ((i = in.read()) != -1) {
	                System.out.print((char) i);
	            }
		}catch(Exception a) {
			
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

	/* @Override
	public void display(FileInputStream in) {
		// TODO Auto-generated method stub
		 * 
		 * int i; 
	            
	        while ((i = in.read()) != -1) {
	                System.out.print((char) i);
	            }
	--> While NE PAS TENIR COMPTE DES COMMENTAIRES */

	
	

}
