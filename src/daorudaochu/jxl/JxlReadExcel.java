/**
 * 
 */
package daorudaochu.jxl;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * @author Administrator
 *
 */
public class JxlReadExcel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//����workbook
			Workbook workbook = Workbook.getWorkbook(new File("G:/Study/���/���뵼��Excel/jxl_test.xls"));
			//��ȡ��һ��������sheet1
			Sheet sheet = workbook.getSheet(0);
			//��ȡ����
			for (int i = 0; i < sheet.getRows(); i++) {
				for (int j = 0; j < sheet.getColumns(); j++) {
					Cell cell = sheet.getCell(j, i);
					System.out.print(cell.getContents() + " ");
				}
				System.out.println();
			}
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
