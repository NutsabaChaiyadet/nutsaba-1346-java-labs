/**
 * This program is to create metrics.  Select a size and it will display in metric format. 
 *  and displays numbers in rows, columns, rows from back to front  Sort from column back to front  
 * oblique from left to right  Oblique from right to left and zigzag.
 * 
 * Author: Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* Date: january 13, 2023
 */
package chaiyadet.nutsaba.lab4;

import java.util.Scanner;
/**
 * Matrix Creation  and display each matrix
 */
public class DisplayMatrix {
    static int[][] matrix;
    static int rowDim, colDim;

    /**
     * invoke method
     */
    public static void main(String[] args) {
        inputMatrix();
        showMatrix();
        showMatrixByRow();
        showMatrixBycolumn();
        showMatrixByRowBackward();
        showMatrixByColumnBackward();
        showMatrixByDiagonalTopLeftBottomRight();
        showMatrixByDiagonalTopRightBottomLeft();
        showMatrixByRowZigzag();
    }
    /**
     * input matrixenter the desired size  then put yourself in the matrix
     */
    public static void inputMatrix(){  
        System.out.print("(Enter the size of the matrix (number of rows then number of collumns) : ");
        Scanner scanner = new Scanner(System.in);
        String[] numStr = scanner.nextLine().split(" ");
        Integer[] numInt = new Integer[numStr.length];
        for(int i = 0;i < numStr.length;i++){
            numInt[i] = Integer.parseInt(numStr[i]);
        }
        rowDim = numInt[0];
        colDim = numInt[1];
        matrix = new int[rowDim][colDim];
        for(int r=0; r<rowDim; r++){
            for(int c=0; c<colDim; c++){
                System.out.print("Enter element at row " + r + " column " + c + " : ");
                matrix[r][c] = scanner.nextInt();
            }
        }
        scanner.close();
    }
    /**
     * Shows a matrix where numbers are inserted in the form of a size matrix that we want.
     */
    public static void showMatrix(){
        System.out.println("Show the original matrix : " );
        for(int r=0; r<rowDim; r++){
            for(int c=0; c<colDim; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }   
    }    
    /**
     * Show the matrix as rows, sort by rows before columns.
     */
    public static void showMatrixByRow(){
        System.out.print("Show the matrix by row : ");
            for(int r=0; r<rowDim; r++){
                for(int c=0; c<colDim; c++){
                    System.out.print(matrix[r][c] + " ");
                }
            }
    }
    /**
     * Displays metrics as rows by columns, and so on.
     */
    public static void showMatrixBycolumn(){
        System.out.print("\nShow the matrix by column : ");
            for(int c=0; c<colDim; c++){
                for(int r=0; r<rowDim; r++){        
                    System.out.print(matrix[r][c] + " ");
                }
            }
    }
    /**
     * Sort the numbers in the matrix from the back row to the front.
     */
    public static void showMatrixByRowBackward(){
        System.out.print("\nShow the matrix by row backward : ");
            for(int r=rowDim-1; r>=0; r--){
                for(int c=colDim-1; c>=0; c--){
                    System.out.print(matrix[r][c] + " ");
                }
            }
    }
    /**
     * Sort the numbers in the metric from the last digit column to the front.
     */
    public static void showMatrixByColumnBackward(){
        System.out.print("\nShow the matrix by collumn backward : ");
        for(int c=colDim-1; c>=0; c--){
            for(int r=rowDim-1; r>=0; r-- ){
                System.out.print(matrix[r][c] + " ");
            }
        }
    }
    /**
     * Sort the numbers in the matrix italically from left to right.
     */
    public static void showMatrixByDiagonalTopLeftBottomRight(){
        System.out.print("\nShow the diagonal elements of the matrix from top-left to bottom-right :");
        if((rowDim == colDim) || (rowDim < colDim)){
            for(int r = 0;r < rowDim;r++){
                System.out.print(matrix[r][r] + " ");
            }
        }else{
            for(int c = 0;c < colDim;c++){
                System.out.print(matrix[c][c] + " ");
            }
        }
    }
    /**
     * Sort the numbers in the matrix right-to-left italics.
     */
    public static void showMatrixByDiagonalTopRightBottomLeft(){
        System.out.print("\nShow the diagonal elements of the matrix from top-righ to bottom-left :");
        if ((rowDim == colDim) || (rowDim < colDim)){
            for(int r=0; r<rowDim; r++){
                    System.out.print(matrix[r][colDim-1-r] + " ");
                  
            }
        }else{
            for(int c = 0; c < colDim; c++){
                System.out.print(matrix[c][colDim-1-c] + " ");
            }
        }
     }
     /**
      * Sort the numbers in a zigzag matrix from the first row, start back to the front of row 2, and then from the front of row 3.
      */
    public static void showMatrixByRowZigzag(){
        System.out.print("\nShow the matrix by row zigzag :");
        for (int cr=0; cr<rowDim; cr++){
            if (cr % 2 == 0){
                for (int c = 0; c < colDim;c++){
                    System.out.print(matrix[cr][c] + " ");
                }
            }else if (cr % 2 == 1){
                for (int c = colDim - 1;c>=0;c--){
                    System.out.print((matrix[cr][c] + " "));
                }
            }
        }
    }
}
