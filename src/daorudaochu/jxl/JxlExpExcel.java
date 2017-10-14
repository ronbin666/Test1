/**
 * 
 */
package daorudaochu.jxl;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/**
 * @author Administrator
 *
 */
public class JxlExpExcel {

	/**
	 * @param args
	 * @throws WriteException 
	 * @throws RowsExceededException 
	 */
	public static void main(String[] args) throws RowsExceededException, WriteException {
		// TODO Auto-generated method stub
        String[] titles = {"id","name","sex"};
		File file = new File("G:/Study/后端/导入导出Excel/jxl_test.xls");
		try {
			file.createNewFile();
			//创建工作薄
			WritableWorkbook workbook = Workbook.createWorkbook(file);
			//创建sheet
			WritableSheet sheet = workbook.createSheet("sheet1", 0);
			Label label = null;
			for (int i = 0; i < titles.length; i++) {
				label = new Label(i, 0, titles[i]);
				try {
					sheet.addCell(label);
				} catch (RowsExceededException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (WriteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			for (int i = 1; i < 10; i++) {
				label = new Label(0,i,"a"+i);
				sheet.addCell(label);
				label = new Label(1, i, "user"+i);
				sheet.addCell(label);
				label = new Label(2, i, "男");
				sheet.addCell(label);
			}
			workbook.write();
			workbook.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
