public class StepMatrix
{
    private final int[][] matrix; // the reduced matrix at this step
    private final int[] rowLabel;
    private final int[] colLabel;
    private final int[] rowMin; // the minimum of each row before reducing the matrix
    private final int[] colMin; // the minimum of each col before reducing the matrix
    private final int nodeCount; // the remaining nodes at this step
    private final int removedRow; // the removed row at this step
    private final int removedCol; // the removed col at this step

    public StepMatrix(int[][] matrix, int removedRow, int removedCol, int[]rowMin, int[] colMin, int[]rowLabel, int[]colLabel)
    {
        this.matrix = new int[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length; i++)
        {
            this.matrix[i] = matrix[i].clone();
        }
        this.removedRow = removedRow;
        this.removedCol = removedCol;
        this.rowMin = rowMin;
        this.colMin = colMin;
        this.rowLabel = rowLabel;
        this.colLabel = colLabel;
        nodeCount = matrix.length;
    }

    // Getters

    public int[][] getMatrix()
    {
        return matrix;
    }

    public int getNodeCount()
    {
        return nodeCount;
    }

    public int getRemovedRow()
    {
        return removedRow;
    }

    public int getRemovedCol()
    {
        return removedCol;
    }

    public int[] getRowMin()
    {
        return rowMin;
    }

    public int[] getColMin()
    {
        return colMin;
    }

    public int[] getRowLabel()
    {
        return rowLabel;
    }

    public int[] getColLabel()
    {
        return colLabel;
    }
}
