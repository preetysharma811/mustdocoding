package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Vertex {

	    int data;
	    boolean visited=false;
	    
	    List<Vertex> adjacentList;
	    
	    Vertex(int data) {
	        this.data = data;
	    }
		@Override
	    public int hashCode() {     
	        return this.data;
	    }

	@Override
	public boolean equals(Object obj) {
	
		Vertex v = (Vertex) obj;
	return this.data==v.data?true:false;
	
	}
}

class NGraph
{

	Vector<Vertex<ArrayList<Vertex>> vertex;
	LinkedList<Integer> listOfAdjacentVertex [] ;
	
	//add node
	void addVertex(int data) {
		Vertex newVertex = new Vertex(data);
		
		newVertex.adjacentList= new ArrayList<Vertex>();
		
		vertex.add(newVertex);
	
	}
	
	//add relationship
	void addEdge(int src, int dest) {
		
		Vertex desV = new Vertex(dest);
		if(root.data==src) {
			root.adjacentList.add(desV);
		}
		else {
			for(Vertex v :root.adjacentList)
			{
				if(v.data==src)
				{
					v.adjacentList.add(desV);	
				}
			}
		}
//	    grph.get(v1).add(v2);
	 //   grph.get(v2).add(v1);
	}


	
	
}
