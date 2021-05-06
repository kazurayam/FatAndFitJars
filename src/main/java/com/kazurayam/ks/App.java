package com.kazurayam.ks;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        System.out.println("Hello World!");

        Workbook wb = new XSSFWorkbook();
        try {
            OutputStream fileOut = new FileOutputStream("workbook.xlsx");
            wb.write(fileOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
