package Courses;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileDemo {
    /**
     * Write lines of text into a specified file
     * @param contentToWrite content to write in the form of a list of strings
     * @param fileName name of the file in which the content will be written
     */
    public static void writeToFile(List<String> contentToWrite, String fileName){
        Path pathToFile = Paths.get("files/"+fileName);

        try (BufferedWriter writer = Files.newBufferedWriter(pathToFile)){
			for(String line: contentToWrite) {
				writer.write(line);
			}
			System.out.println("Content written to " + pathToFile  );
		} catch (IOException e) {
			System.out.println("Could not write file to " + pathToFile);
			e.printStackTrace();
		} 
    }
}
