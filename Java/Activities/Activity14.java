package activity;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {

        File myFile = new File("C:\\Users\\0030WR744\\Documents\\demo.txt");
        //System.out.println(myFile.createNewFile());
        FileWriter fwrite = new FileWriter("C:\\Users\\0030WR744\\Documents\\demo.txt");
        fwrite.write("Entered the text into the file...");
        fwrite.close();

       String str = FileUtils.readFileToString(myFile);
       System.out.println("Data in file: " + str);

        File destDir = new File("C:\\Users\\0030WR744\\Documents\\resources");

        //Copy file to directory
        FileUtils.copyFileToDirectory(myFile, destDir);
        destDir = new File("C:\\Users\\0030WR744\\Documents\\resources\\demo.txt");

        //Read data from file
        String newFileData = FileUtils.readFileToString(destDir);
        System.out.println(newFileData);

    }
}
