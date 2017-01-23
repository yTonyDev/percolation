package percolation;
import java.lang.*;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
/**
 *
 * @author Tony
 */
public class Percolation {
    private int[][] grid;
    private int gridRow;
    private int gridCol;
    
    public Percolation(int n) {    // create n-by-n grid, with all sites blocked
        if(n <= 0) { throw new IllegalArgumentException(); }
        gridRow = n + 1; //indexed from 1 to n
        gridCol = n + 1;
        grid = new int[gridRow][gridCol]; //Automatically initialized to 0 == blocked
    }  
    public void open(int row, int col) { // open site (row, col) if it is not open already
        if(row <= 0 || row > gridRow) {throw new IndexOutOfBoundsException();}
        if(col <= 0 || col > gridCol) {throw new IndexOutOfBoundsException();}
        if(grid[row][col] == 0) { grid[row][col] = 1; }
    }

    public boolean isOpen(int row, int col) { // is site (row, col) open?
        if(row <= 0 || row > gridRow) {throw new IndexOutOfBoundsException();}
        if(col <= 0 || col > gridCol) {throw new IndexOutOfBoundsException();}
        return (grid[row][col] == 1);
    } 
    public boolean isFull (int row, int col) { // is site (row, col) full? Is it connected to the top?
        return false;
    } 
    public int numberOfOpenSites() { return 0;} // number of open sites
    public boolean percolates() { return false;} // does the system percolate?
    
    public static void main(String[] args) {
        // TODO code application logic here
        Percolation test = new Percolation(20); 
        System.out.println( test.isOpen(20, 20));
        test.open(20, 20);
        System.out.println( test.isOpen(20, 20));
    }
    
}
