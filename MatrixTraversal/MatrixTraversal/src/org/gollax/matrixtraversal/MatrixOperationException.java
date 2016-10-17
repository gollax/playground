package org.gollax.matrixtraversal;

public class MatrixOperationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8799776242405010473L;
	private String message;
	public MatrixOperationException(String message){
		this.message  = message;
	}
}
