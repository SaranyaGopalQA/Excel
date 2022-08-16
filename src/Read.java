public class Read {
    File f=new File("\\Desktop\\login.xlsx");
    FileInputStream fi=new FileInputStream("\\Desktop\\login.xlsx");
    XSSFWorkbook wb1=new XSSFWorkbook(fi);
    XSSFSheet sheet1=wb1.getSheetAt(0);
    //Get the current count of rows in excel file
    int rowCount = sheet1.getLastRowNum()-sheet1.getFirstRowNum();
    //Get the first row from the sheet
    Row row1 = sheet1.getRow(0);
    Row row2=sheet1.getRow(1);
    //Create a new row and append it at last of sheet
    Row newRow = sheet1.createRow(rowCount+1);
    //Create a loop over the cell of newly created Row
        for(int j = 1; j < row1.getLastCellNum(); j++){

        //Fill data in row
        //row1.createCell(0).setCellValue(timestamp());
        //row1.createCell(1).setCellValue("123");
        newRow.createCell(0).setCellValue(timestamp());
        newRow.createCell(1).setCellValue("123");


    }

        fi.close();
    FileOutputStream fo=new FileOutputStream("\\Desktop\\login.xlsx");
        wb1.write(fo);
        wb1.close();

}
}




