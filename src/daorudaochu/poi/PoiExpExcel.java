/**
 * 
 */
package daorudaochu.poi;

import java.io.File;
import java.io.FileOutputStream;
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
public class PoiExpExcel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] titles = {"id","user","sex"};
		//����Excel������
		HSSFWorkbook workbook = new HSSFWorkbook();
		//����һ��������sheet
		HSSFSheet sheet = workbook.createSheet();
		//������һ��
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = null;
		//�����ͷ
		for (int i = 0; i < titles.length; i++) {
			cell = row.createCell(i);
			cell.setCellValue(titles[i]);
		}
		//׷������
		for (int i = 1; i < 10; i++) {
			HSSFRow nextRow = sheet.createRow(i);
			HSSFCell cell2 = nextRow.createCell(0);
			cell2.setCellValue("id"+i);
			cell2 = nextRow.createCell(1);
			cell2.setCellValue("user"+i);
			cell2 = nextRow.createCell(2);
			cell2.setCellValue("��");
		}
		//����һ���ļ�
		File file = new File("G:/Study/���/���뵼��Excel/poi_test.xls");
		try {
			file.createNewFile();
			//��Execl���ݴ���
			FileOutputStream outputStream = FileUtils.openOutputStream(file);
			workbook.write(outputStream);
			outputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
