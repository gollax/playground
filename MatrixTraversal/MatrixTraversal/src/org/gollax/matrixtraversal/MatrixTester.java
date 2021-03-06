package org.gollax.matrixtraversal;

import java.util.List;

public class MatrixTester {

	public static void main(String[] args) {
		testWithSquareMatrix();
		testWithaRectangularMatrix_Column();
		testWithaRectangularMatrix_Row();
		testWithirregularMatrixInput();
		
	}

	private static void testWithaRectangularMatrix_Column() {
		int[][] values;
		values = new int[][]{
				{1,2,3,4},
				{5,6,7,8}
				
		};
		//Should print 1,2,3,4,8,7,6,5
		List<Integer> result = null;
		try {
			System.out.println("----------");
			result = MatrixTraversal.traverse(new Matrix(values,2,4));
		} catch (MatrixOperationException ex) {
			ex.printStackTrace();
		}
		System.out.println(result);
		System.out.println("----------");
	}

	private static void testWithaRectangularMatrix_Row() {
		int[][] values;
		values = new int[][]{
				{1,2},
				{3,4},
				{5,6},
				{7,8}
				
		};
		//Should print 1,2,4,6,8,7,5,3
		List<Integer> result = null;
		try {
			result = MatrixTraversal.traverse(new Matrix(values,4,2));
		} catch (MatrixOperationException ex) {
			ex.printStackTrace();
		}
		System.out.println(result);
	}
	
	private static void testWithSquareMatrix() {
		int[][] values;
		values = new int[][] {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		//Should print 1,2,3,6,9,8,7,4,5
		System.out.println("----------");
		Matrix m = new Matrix(values,3,3);
		try {
			System.out.println(MatrixTraversal.traverse(m));
			
		} catch (MatrixOperationException ex) {
			ex.printStackTrace();
		}
	}
	
	
	private static void testWithirregularMatrixInput() {
		int[][] values;
		values = new int[][] {
				{1,2},
				{4,5,6},
				{7,8,9}
		};
		try{
		System.out.println("----------");
		Matrix m = new Matrix(values,3,3);
		//Should throw exception
		System.out.println(MatrixTraversal.traverse(m));
		System.out.println("----------");
		}
		catch(MatrixOperationException ex){
			//log exception information
			System.out.println("Test passed for irregular input");
		}
	}


}
