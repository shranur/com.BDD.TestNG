package utils;

import xls.ShineXlsReader;

public class WorkwithExcel {

	public static void main(String[] args) {

		ShineXlsReader xlsReader = new ShineXlsReader("TestData.xlsx");
		int rowCount = xlsReader.getRowCount("Sheet1");
		int columnCount = xlsReader.getColumnCount("Sheet1");
		
		for(int i=2;i<=rowCount;i++)
		{
			for(int j=0;j<columnCount;j++)
			{
				String cellData = xlsReader.getCellData("Sheet1", j, i);
				System.out.println(cellData);
			}
			
		}
		
	}

}
