/**
 * An interface that defines how tables/sheets should interact with eachother
 *
 */
public interface Table {

	// compares this table to another table and returns the comprehensive difference as a table
	Table compare(Table other);

	// retrieve the number of rows
	int getRowSize();

	// retrieve the number of columns
	int getColSize();
	
	// retrieve data at a certain position
	String getData(int row, int col);
	
	// get the label for a specific column
	String getLabel(int col);

	// retrieve all of the data from this table
	@Override
	String toString();
}
