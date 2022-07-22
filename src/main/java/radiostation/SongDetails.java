package radiostation;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import java.lang.Math;
import java.io.FileInputStream;
import java.io.IOException;

interface SongDetails {

    static ContentActions songName() throws IOException {
        int nowNumber = (int) (Math.random() * 19);
        FileInputStream fis = new FileInputStream("C:\\Users\\okuznetsova\\Documents\\Songs.xls");
        HSSFWorkbook songName = new HSSFWorkbook(fis);

        HSSFSheet sheet = songName.getSheetAt(0);
        Row row = sheet.getRow(nowNumber);
        Cell cell = row.getCell(1);
        String name = cell.toString();

        return null;
    }


    static ContentActions songArtist() throws IOException {
        int nowNumber = (int) ( Math.random() * 19 );
            FileInputStream fis = new FileInputStream("C:\\Users\\okuznetsova\\Documents\\Songs.xls");
            HSSFWorkbook songArtist = new HSSFWorkbook(fis);

            HSSFSheet sheet = songArtist.getSheetAt(0);
            Row row = sheet.getRow(nowNumber);
            Cell cell = row.getCell(0);
            String artist = cell.toString();

            return null;
        }


    private void SongDuration(){

    }

}
