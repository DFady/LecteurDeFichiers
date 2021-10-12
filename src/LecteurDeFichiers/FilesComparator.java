package LecteurDeFichiers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FilesComparator {
	
	public boolean compare(Path file1, Path file2)
    {
        try {
            if (Files.size(file1) != Files.size(file2)) {
                return false;
            }
 
            byte[] first = Files.readAllBytes(file1);
            byte[] second = Files.readAllBytes(file2);
            return Arrays.equals(first, second);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

	
}
