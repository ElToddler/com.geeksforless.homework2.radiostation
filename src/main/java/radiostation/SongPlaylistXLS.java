package radiostation;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class SongPlaylistXLS {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\okuznetsova\\Documents\\Songs.xls"));
        HSSFWorkbook songName = new HSSFWorkbook(fis);
        HSSFSheet sheet = songName.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(1);
        String song = cell.toString();
        System.out.println(song);

    }
}
