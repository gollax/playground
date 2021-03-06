/**
 * author : Saikrishna Gollapudi
 */
package org.gollax.matrixtraversal;
import java.util.List;
import java.util.LinkedList;

public class MatrixTraversal {
	 
	
	public static List<Integer> traverse(Matrix m) throws MatrixOperationException{
		List<Integer> traversedList = null;
		if(m!=null){			
				 traversedList = new LinkedList<Integer>();
				traverse(m,0,m.getRowCount()-1,0,m.getColumnCount()-1,traversedList);
		}
		return traversedList;
	}

	private static void traverse(Matrix m, int startRow, int endRow,
			int startColumn, int endColumn, List<Integer> traversedList) throws MatrixOperationException {
		if (rangeCheck(m, startRow, endRow, startColumn, endColumn)) {
			for (int index = startColumn; index <=endColumn; index++) {
				doSomething(m.getValue(startRow, index),traversedList);
			}
			for (int index = startRow + 1; index <=endRow; index++) {
				doSomething(m.getValue(index, endColumn),traversedList);
			}
			for (int index = endColumn - 1; index >=startRow; --index) {
				doSomething(m.getValue(endRow, index),traversedList);
			}
			for (int index = endRow - 1; index >startRow; --index) {
				doSomething(m.getValue(index, startColumn),traversedList);
			}
			if (endRow - startRow > 1 && endColumn - startColumn > 1) {
				traverse(m, ++startRow, --endRow, ++startColumn, --endColumn, traversedList);
			}
		}
	}

	private static boolean rangeCheck(Matrix m, int startRow, int endRow,
			int startColumn, int endColumn) {
		if (m != null) {
			if (startRow >= 0 && startRow < m.getRowCount() && endRow >= 0
					&& endRow < m.getRowCount() && startColumn >= 0
					&& startColumn < m.getColumnCount() && endColumn >= 0
					&& endColumn < m.getColumnCount())
				return true;
		}
		return false;
	}

	private static void doSomething(int value,List<Integer> resultList) {
		
		if(resultList!=null){
			resultList.add(value);
		}
	}

}
