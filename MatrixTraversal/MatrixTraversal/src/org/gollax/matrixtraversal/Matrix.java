package org.gollax.matrixtraversal;

public class Matrix {
	private int[][] values;
	private int rowCount;
	private int columnCount;
	
	public int getRowCount(){
		return rowCount;
	}
	
	public int getColumnCount(){
		return columnCount;
	}
	

	public int getValue(int row, int column) throws MatrixOperationException{
		if(row<0 || column<0) throw new MatrixOperationException("invalid row or column count");
		if(row>=rowCount || column>=columnCount) throw new MatrixOperationException("index out of bounds");
		if(values==null) throw new MatrixOperationException("Empty values");
		try {
			return values[row][column];
		} catch (ArrayIndexOutOfBoundsException ex) {
			throw new MatrixOperationException("invalid matrix");
		}
	}
	
	public Matrix(int[][] values, int rowCount, int columnCount){
		this.values = values;
		this.rowCount = rowCount;
		this.columnCount = columnCount;
	}
}
