package practice;

import java.util.HashMap;
import java.util.Map;

public class SpreadSheet {
	
	Map<String, Integer> sheet=new HashMap<>();
	void setCellValue(String cellId, Object value) {
		Integer val=(Integer) value;
		sheet.put(cellId, val);
	}
	int getCellValue(String cellId) {
		return sheet.get(cellId);		
	}
	public static void main(String[] args) {
		SpreadSheet s=new SpreadSheet();
		s.setCellValue("A1", 13);
		s.setCellValue("A2", 14);
		System.out.println(s.getCellValue("A1"));
		s.setCellValue("A3", s.getCellValue("A1")+s.getCellValue("A2"));
		System.out.println(s.getCellValue("A3"));
		s.setCellValue("A4", s.getCellValue("A1")+s.getCellValue("A2")+s.getCellValue("A3"));
		System.out.println(s.getCellValue("A4"));

	}

}
