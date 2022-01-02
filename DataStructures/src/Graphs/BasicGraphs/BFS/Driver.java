package BFS;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Test");
		int array[8][8] =  new int [][]{{0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 0, 1, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 1, 0, 0},
                {0, 1, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0}};

		System.out.print("Vertex: 1 -> "+flush);
		BFS(1, A, 8);

		System.out.print("Vertex: 4 -> "+flush);
		BFS.newBFS(4, A, 8);

	}

}
