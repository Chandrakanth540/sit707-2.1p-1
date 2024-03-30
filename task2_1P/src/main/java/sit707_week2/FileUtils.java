//package sit707_week2;
//
//import java.io.File;
//
//public class FileUtils {
//
//	public static void copyFile(File screenshotFile, File file) {
//		// TODO Auto-generated method stub
//		public static void copyFile(File sourceFile, File destinationFile) throws IOException {
//	        Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
//	    }
//		
//	}
//
//}
package sit707_week2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileUtils {

    public static void copyFile(File sourceFile, File destinationFile) throws IOException {
        Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}