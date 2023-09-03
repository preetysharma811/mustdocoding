package graph;

import java.util.LinkedList;

public class BFSgraph {
	//Graph graph;
	
	int noOfVertex;
	LinkedList<Integer> listOfAdjacentVertex [] ;
	
	BFSgraph(int noOfVertex ){
		this.noOfVertex=noOfVertex;
		listOfAdjacentVertex = new LinkedList[noOfVertex];
		
		for(int i = 0; i < noOfVertex ; i++){ 
			listOfAdjacentVertex[i] = new LinkedList<>(); 
        } 
		
	}
	
	
	void addEdge(int srcVertex, int destVertex)
	{
		 listOfAdjacentVertex[srcVertex].add(destVertex); 
         
	        // Since graph is undirected, add an edge from dest 
	        // to src also 
		 listOfAdjacentVertex[destVertex].add(srcVertex); 
	}
	
	 void printGraph() 
	    {        
	        for(int i = 0; i < noOfVertex; i++) 
	        { 
	            System.out.println("destination vertices of :"+i); 
	            for(Integer list: listOfAdjacentVertex[i]){ 
	                System.out.print(list+","); 
	            } 
	            System.out.println("\n"); 
	        } 
	    } 
	
	public static void main(String args[]) 
    { 
        // create the graph given in above figure 
        int V = 5; 
        BFSgraph g= new BFSgraph(V); 
        g.addEdge(0, 1); 
        g.addEdge(0, 4); 
        g.addEdge(1, 2); 
        g.addEdge(1, 3); 
        g.addEdge(1, 4); 
        g.addEdge(2, 3); 
        g.addEdge(3, 4); 
        
       g.printGraph(); 
  }
}
