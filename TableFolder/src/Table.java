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
}
