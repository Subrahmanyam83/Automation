package Utils;

//www.sejsoft.com/downloads/jars.rar
public class Reading_Writing_XLS {

	public static void main(String[] args) {
		
		System.out.println("HI");

		Xls_Reader d = new Xls_Reader("C:\\RVS\\Example.xlsx");
		//System.out.println(d.getRowCount("data"));
		//System.out.println(d.getCellData("Data", "Date", 3));
		
	
		
		d.setCellData("Data", "Name", 4, "hello");
		
		
		//Xls_Reader d1 = new Xls_Reader("PATH");

	}

}
