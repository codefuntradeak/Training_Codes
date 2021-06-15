//This program implements matrix multiplication beteen matrices of any size.
/*Object Oriented Programming Concepts used:
Classes and Objects: We have a single class MultiplyMat here.
Dependency - Class MultiplyMat is dependent on Scanner class for taking input.
*/
import java.util.*;

class MultiplyMat{
  public static void getMatValues(int [][] mat, int row, int col)
  {
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<row; i++)
      for(int j=0; j<col; j++)
        mat[i][j] = sc.nextInt();
  }
  public static void displayMatrix(int [][] mat, int row, int col)
  {
    for(int i=0; i<row; i++)
    {
      for(int j=0; j<col; j++)
        System.out.print(mat[i][j]+" ");
      System.out.println();
    }
  }
  public static int [][] multiplyMat(int [][] mat1, int [][] mat2)
  {
    int row1=mat1.length, row2=mat2.length;
    if(row1==0 || row2==0)
      return new int[0][0];
    int col1=mat1[0].length, col2=mat2[0].length;
    if(col2==0)
      return new int[0][0];
    if(col1!=row2)
      return new int[0][0];
    int [][] res = new int[row1][col2];
    for(int i=0; i<row1; i++)
      for(int j=0; j<col2; j++)
        for(int k=0; k<col1; k++)
            res[i][j] += mat1[i][k]*mat2[k][j];
    return res;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int mat1row, mat1col, mat2row, mat2col;
    System.out.println("Enter matrix1 number of row and column");
    mat1row = sc.nextInt();
    mat1col = sc.nextInt();
    System.out.println("Enter matrix2 number of row and column");
    mat2row = sc.nextInt();
    mat2col = sc.nextInt();
    int [][] mat1 = new int[mat1row][mat1col];
    int [][] mat2 = new int[mat2row][mat2col];
    System.out.println("Enter matrix1 elements:");
    getMatValues(mat1,mat1row,mat1col);
    System.out.println("Enter matrix2 elements:");
    getMatValues(mat2,mat2row,mat2col);
    System.out.println("Matrix1:");
    displayMatrix(mat1,mat1row,mat1col);
    System.out.println("Matrix2:");
    displayMatrix(mat2,mat2row,mat2col);
    int [][] res = multiplyMat(mat1,mat2);
    if(res.length==0)
      System.out.println("Given matrices cannot be multiplied");
    else
    {
      System.out.println("Result:");
      displayMatrix(res,res.length, res[0].length);
    }
  }
}
