package Activities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Activity13_1 {

    public static void main(String[] args) throws IOException, CsvException {
        CSVReader reader = new CSVReader(new FileReader("src\\main\\resources\\Results.csv"));
        List <String[]> data = reader.readAll();
        Iterator<String[]> itr = data.iterator();

        while(itr.hasNext())
        {
            System.out.println(Arrays.toString(itr.next()));
        }
        reader.close();
    }

}
