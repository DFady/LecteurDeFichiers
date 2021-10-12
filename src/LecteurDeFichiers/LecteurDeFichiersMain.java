package LecteurDeFichiers;

import java.nio.file.Path;
import java.nio.file.Paths;

public class LecteurDeFichiersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------- LE FICHIER EST AFFICHE A L'ENDROIT ----------");
		System.out.println();
		AffichageAlendroit test1 = new AffichageAlendroit();
		test1.readFile("D:\\Users\\fdjilla.cfonb\\Desktop\\UNIVERSITE\\java\\test1.txt");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		System.out.println();
		System.out.println("---------- LE FICHIER EST AFFICHE A L'ENVERS ----------");
		System.out.println();
		AffichageAlenvers test2 = new AffichageAlenvers();
		test2.readFile("D:\\Users\\fdjilla.cfonb\\Desktop\\UNIVERSITE\\java\\test1.txt");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("---------- LE FICHIER EST AFFICHE DE FACON PALINDROMIQUE ----------");
		System.out.println();
		AffichagePalindromique test3 = new AffichagePalindromique();
		test3.readFile("D:\\Users\\fdjilla.cfonb\\Desktop\\UNIVERSITE\\java\\test1.txt");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	
	
		
		System.out.println("---------- ICI NOUS COMPARONS DEUX FICHIERS POUR SAVOIR S'ILS ONT LE MEME CONTENU ----------");
		System.out.println();
		FilesComparator test5 = new FilesComparator();
		Path file1 = Paths.get("D:\\Users\\fdjilla.cfonb\\Desktop\\UNIVERSITE\\java\\test1.txt");
		Path file2 = Paths.get("D:\\Users\\fdjilla.cfonb\\Desktop\\UNIVERSITE\\java\\test3.txt");
		boolean compare = test5.compare(file1, file2);
		System.out.println(compare);
		System.out.println();
		
		
		
		System.out.println("---------- FIN ----------");
		System.out.println();
		
		// FichierSon test4 = new FichierSon();
		// test4.readFile("D:\\Users\\fdjilla.cfonb\\Desktop\\UNIVERSITE\\java\\test1.txt");
		
		
		
	}

}
