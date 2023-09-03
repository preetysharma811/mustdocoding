package graph;

import java.util.List;
import java.util.Map;

import string.strStrCheckSubStrContains;

public class DFSgraph {

	
	static void DFS(Vertex v)
	{
		
		if(v==null)
		{
			return;
		}
		
		System.out.print(v.data+",");
		v.visited=true;
		
		
	for(Vertex l:v.adjacentList)
	{
	   if(l.visited==false)
	   {
		   DFS(l);   
	   }
	}
		
	}
	public static void main(String args[]) 
    { 
	
		
		
        // create the graph given in above figure 
		NGraph g = new NGraph();
	    g.addVertex(1);
	    g.addVertex(2);
	    g.addVertex(3);
	    g.addVertex(4);
	    g.addVertex(5);
	    g.addEdge(1, 3);
	    g.addEdge(1, 2);
	    g.addEdge(2, 3);
	    g.addEdge(3, 4);
	    g.addEdge(4, 5);
	    g.addEdge(5, 2);
	    
	    DFS(g.root);
	
  }
}
