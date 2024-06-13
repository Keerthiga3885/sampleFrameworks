package Utils;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Excel {


    private static final String outputExcelLocation = "test-output/e6TestOutput.xlsx";

    @DataProvider(name = "E6TestData")
    public static Object[][] excelReader(Method m) {

        Object[][] excelData;
        DataFormatter dataFormatter = new DataFormatter();
        Sheet sheet = null;
        try {

            InputStream inputStream = Files.newInputStream(Paths.get(outputExcelLocation));
            Workbook workBook = WorkbookFactory.create(inputStream);

            if(m.getName().equalsIgnoreCase("loginTest")){
                sheet = workBook.getSheet("Login");
            }

            else if(m.getName().equalsIgnoreCase("catalogTest")) {
                sheet = workBook.getSheet("Workspace");
            }



            assert sheet != null;
            int rowCount = sheet.getLastRowNum();
            int colCount = sheet.getRow(0).getLastCellNum();
            excelData = new Object[rowCount][colCount];

            for (int i = 1; i <= rowCount; i++) {
                for (int j = 0; j < colCount; j++) {

                    String cellValue = dataFormatter.formatCellValue(sheet.getRow(i).getCell(j));
                    excelData[i - 1][j] = cellValue.replaceAll("\\s+", " ").trim();
                }
            }

            workBook.close();
            inputStream.close();

        } catch (IOException e) {
            throw new RuntimeException("Unable to read data from excel " + e.getMessage());
        }

        return excelData;

    }

    public static synchronized void excelWriter(String sheetName, String columnName, List<String> data) {

        try (InputStream inputStream = Files.newInputStream(Paths.get(outputExcelLocation));
             Workbook workBook = WorkbookFactory.create(inputStream)) {

            Sheet sheet = workBook.getSheet(sheetName);

            int columnIndex = findColumnIndex(sheet.getRow(0), columnName);
            if (columnIndex == -1) {
                throw new IllegalArgumentException("Column '" + columnName + "' not found.");
            }

            for (int j = 0; j < data.size(); j++) {

                Row row = sheet.getRow(j + 1);
                if (row == null) {
                    row = sheet.createRow(j + 1);
                }
                Cell cell = row.createCell(columnIndex);
                cell.setCellValue(data.get(j));
            }

            try (FileOutputStream fileOutputStream = new FileOutputStream(outputExcelLocation)) {
                workBook.write(fileOutputStream);
            }

        } catch (IOException e) {
            throw new RuntimeException("Unable to write data to excel: " + e.getMessage(), e);
        }
    }

    private static int findColumnIndex(Row headerRow, String columnName) {
        for (int i = 0; i < headerRow.getLastCellNum(); i++) {
            Cell cell = headerRow.getCell(i);
            if (cell != null && cell.getStringCellValue().equalsIgnoreCase(columnName)) {
                return i;
            }
        }
        return -1;
    }

}
