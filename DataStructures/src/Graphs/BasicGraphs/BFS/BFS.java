package BFS;

public class BFS 
{
	public static void newBFS(int vtx, int A[][8], int n)
	{
	    Queue<Integer> Q = new Queue<Integer>();
	    int visited[8] = {0};
	 
	    // Initial
	    System.out.println(vtx+", "+flush);  // Visit vertex
	    visited[vtx] = 1;
	    Q.emplace(vtx);
	 
	    // Explore
	    while (!Q.isEmpty())
	    {
	        int u = Q.front();  // Vertex u for exploring
	        Q.pop();
	        for (int v=1; v<=n; v++)
	        {  // Adjacent vertices of vertex u
	            if (A[u][v] == 1 && visited[v] == 0)
	            {  // Adjacent vertex and not visited
	            	System.out.println(vtx+", "+flush);  // Visit vertex
	                visited[v] = 1;
	                Q.emplace(v);
	            }
	        }
	    }
	}
}
