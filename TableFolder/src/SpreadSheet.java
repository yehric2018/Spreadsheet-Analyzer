import java.util.Scanner;

/**
 * A spreadsheet that implements the methods in Table and ultimately compares to another Spreadsheet
 */
public class SpreadSheet implements Table {
	private String[] header;
	private String[][] data;
	
	public SpreadSheet(Scanner in) {
		if (!in.hasNextLine()) {
			throw new IllegalArgumentException();
		}
		
		header = in.nextLine().split(",");
		List<String[]> dataList = new ArrayList<String[]>();
		while (in.hasNextLine) {
			dataList.add(in.nextLine().split(","));
		}
		
		data = new String[dataList.size()][header.length];
		for (int i = 0 ; i < dataList.size(); i++) {
			data[i] = dataList.get(i);
		}
	}
	
	@Override
	public Table compare(Table other) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRowSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getData(int row, int col) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLabel(int col) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return null;
	}
}
