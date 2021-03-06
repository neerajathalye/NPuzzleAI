public class Node1 {

    public Node1 parent;
    public int[][] matrix;

    // Blank tile cordinates
    public int x, y;

    // Number of misplaced tiles
    public int cost;

    // The number of moves so far
    public int level;

    public Node1(int[][] matrix, int x, int y, int newX, int newY, int level, Node1 parent) {
        this.parent = parent;
        this.matrix = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            this.matrix[i] = matrix[i].clone();
        }

        // Swap value
        this.matrix[x][y]       = this.matrix[x][y] + this.matrix[newX][newY];
        this.matrix[newX][newY] = this.matrix[x][y] - this.matrix[newX][newY];
        this.matrix[x][y]       = this.matrix[x][y] - this.matrix[newX][newY];

        this.cost = Integer.MAX_VALUE;
        this.level = level;
        this.x = newX;
        this.y = newY;
    }

}
