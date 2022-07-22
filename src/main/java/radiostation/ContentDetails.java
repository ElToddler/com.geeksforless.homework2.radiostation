package radiostation;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import java.lang.Math;
import java.io.FileInputStream;
import java.io.IOException;

public class ContentDetails {

    private Object contentDetails(int songCell, int contentSheet) throws IOException {
        int nowNumber = (int) (Math.random() * 19);
        FileInputStream fis = new FileInputStream("C:\\Users\\okuznetsova\\Documents\\Songs.xls");
        HSSFWorkbook songDetail = new HSSFWorkbook(fis);
        HSSFSheet sheet = songDetail.getSheetAt(contentSheet);
        Row row = sheet.getRow(nowNumber);
        Cell cell = row.getCell(songCell);
        String name = cell.toString();

        return null;
    }

}
