package dataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/* 
 * Source: https://www.youtube.com/watch?v=zVrPdF7f4-I
 * 
 * File input format: 
 * N // number of vertices 
 * a // vertices
 * b
 * c
 * d 
 * a b //edges
 * c d
 * d b
*/public class JAdjacencyList {
	class Neighbor{
		public int vertexNum;
		public Neighbor next;
		public Neighbor (int vnum, Neighbor n){
			vertexNum = vnum;
			next = n; 
		}
	}
	
	class Vertex{
		String name;
		Neighbor adjList;
		Vertex(String name, Neighbor neighbors){
			this.name = name;
			this.adjList = neighbors;
		}
	}
	
	Vertex [] adjLists;
	
	public JAdjacencyList(String file) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File(file));
		adjLists = new Vertex[sc.nextInt()]; // first int of file is num of vertices
		
		// read vertices
		for (int v=0; v< adjLists.length; v++){
			adjLists[v] = new Vertex(sc.next(), null);
		}
		
		// read edges
		while (sc.hasNext()){
			
			//read vertex names and get their integer mapping (position in array)
			int v1 = indexForName(sc.next());
			int v2 = indexForName(sc.next());
			
			adjLists[v1].adjList = new Neighbor(v2, adjLists[v1].adjList);
			adjLists[v2].adjList = new Neighbor(v1, adjLists[v2].adjList);
			
			
		}
	}
	
	int indexForName(String name){
		int index=-1;
		for (int i=0; i<adjLists.length; i++){
			if (adjLists[i].name.equals(name)){
				index = i; 
				break;
			}
		}
		return index;
			
	}

	public void print(){
		System.out.println();
		for (int v = 0; v < adjLists.length; v++) {
			System.out.print(adjLists[v].name);
			for (Neighbor nbr=adjLists[v].adjList; nbr!=null; nbr=nbr.next){
				System.out.print(" --> " + adjLists[nbr.vertexNum].name);
			}
		System.out.println("\n");
		}
	}

	public static void main(String[] args) throws IOException{
		JAdjacencyList j = new JAdjacencyList("file");
		j.print();
	}
}
