/**
 * 
 */
package daorudaochu.poi;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author Administrator
 *
 */
public class PoiReadExcel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��Ҫ������Excel�ļ�
		File file = new File("G:/Study/���/���뵼��Excel/poi_test.xls");
		try {
			HSSFWorkbook workbook = new HSSFWorkbook(FileUtils.openInputStream(file));
			//HSSFSheet sheet = workbook.getSheet("sheet0");
			HSSFSheet sheet = workbook.getSheetAt(0);
			int firstRowNum = 0;
			//��ȡsheet�����һ���к�
			int lastRowNum = sheet.getLastRowNum();
			for (int i = firstRowNum; i <= lastRowNum; i++) {
				HSSFRow row = sheet.getRow(i);
				int firstCellNum = row.getFirstCellNum();
				int lastCellNum = row.getLastCellNum();
				for (int j = firstCellNum; j < lastCellNum; j++) {
					HSSFCell cell = row.getCell(j);
					System.out.print(cell.getStringCellValue() + " ");
				}
				System.out.println();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
