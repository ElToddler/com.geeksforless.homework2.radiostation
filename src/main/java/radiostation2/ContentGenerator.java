package radiostation2;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


import java.lang.Math;
import java.io.FileInputStream;
import java.io.IOException;

public abstract class ContentGenerator { //подключаемся к файлу и передаем ему случайную строку
    public void StringContentDetails(int contentCell, int contentSheet) throws IOException {
        int rowNumber = (int) (Math.random() * 19);
        FileInputStream fis = new FileInputStream("C:\\Users\\okuznetsova\\Documents\\Songs.xls");
        HSSFWorkbook songDetail = new HSSFWorkbook(fis);
        HSSFSheet sheet = songDetail.getSheetAt(contentSheet);
        Row row = sheet.getRow(rowNumber);
        Cell cell = row.getCell(contentCell);
        String content = cell.toString();

    }

    protected void intContentDetails(int songCell, int contentSheet) throws IOException {
        int rowNumber = (int) (Math.random() * 19);
        FileInputStream fis = new FileInputStream("C:\\Users\\okuznetsova\\Documents\\Songs.xls");
        HSSFWorkbook songDetail = new HSSFWorkbook(fis);
        HSSFSheet sheet = songDetail.getSheetAt(contentSheet);
        Row row = sheet.getRow(rowNumber);
        Cell cell = row.getCell(songCell);
        String content = cell.toString();
        Integer duration = Integer.valueOf(content); //немного переписываем, нам нужен инт



}}
