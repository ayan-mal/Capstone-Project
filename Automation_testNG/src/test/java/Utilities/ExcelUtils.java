
package Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static Object[][] getExcelData() {

        Object[][] data = null;

        try {

            String path = System.getProperty("user.dir")
                    + "\\src\\test\\resources\\TestData.xlsx";

            System.out.println("Excel Path: " + path);

            // Try-with-resources automatically closes fis and workbook
            try (FileInputStream fis = new FileInputStream(path);
                 Workbook wb = new XSSFWorkbook(fis)) {

                Sheet sheet = wb.getSheetAt(0);

                if (sheet == null) {
                    throw new RuntimeException("Sheet not found");
                }

                int rows = sheet.getLastRowNum();
                int cols = sheet.getRow(0).getLastCellNum();

                data = new Object[rows][cols];

                DataFormatter formatter = new DataFormatter();

                for (int i = 1; i <= rows; i++) {

                    for (int j = 0; j < cols; j++) {

                        data[i - 1][j] =
                                formatter.formatCellValue(
                                        sheet.getRow(i).getCell(j));
                    }
                }
            }

        } catch (Exception e) {

            System.out.println("Error reading Excel file:");
            e.printStackTrace();
        }

        return data;
    }
}