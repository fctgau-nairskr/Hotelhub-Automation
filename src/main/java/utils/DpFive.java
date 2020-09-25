package utils;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;


public class DpFive {

    @SuppressWarnings("resource")
    @DataProvider(name="TC005PropertyDetails")
    public static Object[][] getData() throws IOException{//Getting data from excel
        Object[][] testData;//string -group of string in 2D
        FileInputStream	fis=new FileInputStream("./testData/TC005PropertyDetails.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);//workbook
        XSSFSheet sheet=wb.getSheetAt(0);//sheet

        int rowCount=sheet.getLastRowNum();//row and getlastrow returns lastrow-1
        int coulumnCount=sheet.getRow(0).getLastCellNum();//cell and getlastcellNum returns last column,getrow(index) freeze that row
        testData=new String[rowCount][coulumnCount];

        System.out.println("Row count="+rowCount);

        System.out.println("Coulmn count="+coulumnCount);



        for(int i=1;i<=rowCount;i++)
        {
            XSSFRow row=sheet.getRow(i);

            for(int j=0;j<coulumnCount;j++){
                String cellValue=row.getCell(j).getStringCellValue();
                System.out.println("The data from the row "+i+" and column "+j+" is "+cellValue);
                testData[i-1][j]=cellValue;//since testng reads table value as [0,0] we are using i-1
            }
        }

        return testData;

    }

}
