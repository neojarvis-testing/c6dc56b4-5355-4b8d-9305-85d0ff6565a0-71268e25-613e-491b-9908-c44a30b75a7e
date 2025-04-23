package utils;
 
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
/*
    * a. Class name : ExcelReader
    * b. Author : Dharen
    * c. Description : This class is designed to facilitate reading data from Excel files using the Apache POI library.
*/
public class ExcelReader {
    /*
     * a. Method name : readdata
     * b. Author : Dharen
     * c. Description : This method reads and returns the value of a specific cell
     * in an Excel file.
     * d. Return type : String (The formatted cell value as a String)
     * e. Parameter list :
     * - String filepath: The full path to the Excel file.
     * - String sheetname: The name of the sheet from which data needs to be read.
     * - int rownumber: The row index of the desired cell (zero-based index).
     * - int colnumber: The column index of the desired cell (zero-based index).
     */
    public static String readdata(String filepath, String sheetname, int rownumber, int colnumber) {
        // Using try-with-resources to automatically close the file and workbook after
        // use
        try (FileInputStream file = new FileInputStream(filepath); // Open the file at the specified filepath
                XSSFWorkbook workbook = new XSSFWorkbook(file)) { // Load the workbook from the file
            XSSFSheet sheet = workbook.getSheet(sheetname);
            XSSFRow row = sheet.getRow(rownumber);
            XSSFCell col = row.getCell(colnumber);
            // DataFormatter ensures that the cell value is returned as a formatted String
            DataFormatter formatter = new DataFormatter();
            return formatter.formatCellValue(col);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
 
