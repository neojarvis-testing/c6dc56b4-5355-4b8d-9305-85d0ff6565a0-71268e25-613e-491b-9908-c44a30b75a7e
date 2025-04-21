package utils;
 
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ExcelReader {
 
    public static String readdata(String filepath, String sheetname, int rownumber, int colnumber) {
        try (FileInputStream file = new FileInputStream(filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(file)) {
            XSSFSheet sheet = workbook.getSheet(sheetname);
            XSSFRow row = sheet.getRow(rownumber);
            XSSFCell col = row.getCell(colnumber);
            DataFormatter formatter = new DataFormatter();
            return formatter.formatCellValue(col);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
 