package Activities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Activity13_2a {

    public static void writeExcel(String path,List<String[]> data) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet();
        int rownum = 0;
        for (String[] rowData : data) {
            //Creates a new row in the sheet
            Row row = sheet.createRow(rownum++);
            //System.out.println(Arrays.toString(rowData));
            int cellnum = 0;
            for (String cellData : rowData) {
                //Creates a cell in the next column of that row
                Cell cell = row.createCell(cellnum++);
                cell.setCellValue(cellData);
                //System.out.println(cellData);
            }
        }
        FileOutputStream out = new FileOutputStream(new File(path));
        workbook.write(out);
        out.close();
        workbook.close();

    }
    public static void readExcel(String path) throws IOException {
        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Sheet0");
        int lastRowNum = sheet.getLastRowNum();
        int firsRowNum = sheet.getFirstRowNum();
        //System.out.println(lastRowNum + "  " + firsRowNum);
        List<Row> rows = new ArrayList<>();
        for (int i = firsRowNum; i <= lastRowNum; i++) {

            Row row = sheet.getRow(i+1);
            rows.add(row);
            System.out.println(row.getCell(1));
            //System.out.print(row.getCell(2));
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case NUMERIC:
                       // System.out.print(cell.getNumericCellValue() + " \t ");
                        break;
                    case STRING:
                        //System.out.print(cell.getStringCellValue() + " \t ");
                        break;
                    default:
                        //System.out.println("Invalid value");
                        break;
                }

            }
            System.out.println("");
        }


    }


    public static void main(String[] args) throws IOException {
        List<String[]> data = new ArrayList<String[]>();
        String[] heading = {"ID", "First Name", "Last Name", "Email", "Ph.No."};
        String[] row1 = {"1", "Satvik", "Shah", "satshah@example.com", "4537829158"};
        String[] row2 = {"2", "Avinash", "Kati", "avinashK@example.com", "4892184058"};
        String[] row3 = {"3", "Lahri", "Rath", "lahri.rath@example.com", "4528727830"};
        data.add(heading);
        data.add(row1);
        data.add(row2);
        data.add(row3);
        Activity13_2a.writeExcel("src\\main\\resources\\MyFile.xlsx",data);
        Activity13_2a.readExcel("src\\main\\resources\\MyFile.xlsx");
    }
}
