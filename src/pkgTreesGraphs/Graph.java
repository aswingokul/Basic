<<<<<<< HEAD
/**
 * 
 */
package pkgTreesGraphs;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Aswin
 *
 */

class Neighbour {
	int vertexNum;
	Neighbour next;
	
	Neighbour(int vnum, Neighbour nxt) {
		// TODO Auto-generated constructor stub
		vertexNum = vnum;
		next = nxt;
	}
}

class Vertex {
	String name;
	Neighbour adjList;
	
	Vertex(String vname, Neighbour list) {
		// TODO Auto-generated constructor stub
		name = vname;
		adjList = list;
	}
}

public class Graph {
	Vertex[] adjLists;
	
	public Graph(String fname) throws FileNotFoundException {
		// TODO Auto-generated constructor stub
		File f = new File(fname);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(f);
		int nVertices = sc.nextInt();
		adjLists = new Vertex[nVertices];
		for(int i=0; i<nVertices; i++){
			adjLists[i] = new Vertex(sc.next(),null);
		}
		
		while(sc.hasNext()){
			int v1, v2;
			v1 = indexForName(sc.next());
			v2 = indexForName(sc.next());
			
			adjLists[v1].adjList = new Neighbour(v2, adjLists[v1].adjList);
			adjLists[v2].adjList = new Neighbour(v1, adjLists[v2].adjList);
		}
		
		
	}
	
	public int indexForName(String vname){
		for(int i = 0; i<adjLists.length; i++){
			if(adjLists[i].name.equals(vname))
				return i;
		}
		return -1;
	}
	
	public void print(){
		
		for(int i=0; i<adjLists.length; i++){
			System.out.print(adjLists[i].name);
			for(Neighbour nbr = adjLists[i].adjList; nbr!=null;nbr = nbr.next){
				System.out.print(" --> "+ adjLists[nbr.vertexNum].name );
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//System.out.print("Enter File Name: ");
		try {
			String filename = "C:\\Aswin\\Eclipse Workspace\\Basic\\src\\pkgTreesGraphs\\input.txt";//in.readLine();
			//System.out.println(filename);
			//System.out.println(new File(".").getAbsoluteFile());
			//filename = "/Basic/src/pkgTreesGraphs/"+filename;
			//System.out.println("filename: "+filename);
			Graph g = new Graph(filename);
			g.print();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
=======
/**
 * 
 */
package pkgTreesGraphs;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Aswin
 *
 */

class Neighbour {
	int vertexNum;
	Neighbour next;
	
	Neighbour(int vnum, Neighbour nxt) {
		// TODO Auto-generated constructor stub
		vertexNum = vnum;
		next = nxt;
	}
}

class Vertex {
	String name;
	Neighbour adjList;
	
	Vertex(String vname, Neighbour list) {
		// TODO Auto-generated constructor stub
		name = vname;
		adjList = list;
	}
}

public class Graph {
	Vertex[] adjLists;
	
	public Graph(String fname) throws FileNotFoundException {
		// TODO Auto-generated constructor stub
		File f = new File(fname);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(f);
		int nVertices = sc.nextInt();
		adjLists = new Vertex[nVertices];
		for(int i=0; i<nVertices; i++){
			adjLists[i] = new Vertex(sc.next(),null);
		}
		
		while(sc.hasNext()){
			int v1, v2;
			v1 = indexForName(sc.next());
			v2 = indexForName(sc.next());
			
			adjLists[v1].adjList = new Neighbour(v2, adjLists[v1].adjList);
			adjLists[v2].adjList = new Neighbour(v1, adjLists[v2].adjList);
		}
		
		
	}
	
	public int indexForName(String vname){
		for(int i = 0; i<adjLists.length; i++){
			if(adjLists[i].name.equals(vname))
				return i;
		}
		return -1;
	}
	
	public void print(){
		
		for(int i=0; i<adjLists.length; i++){
			System.out.print(adjLists[i].name);
			for(Neighbour nbr = adjLists[i].adjList; nbr!=null;nbr = nbr.next){
				System.out.print(" --> "+ adjLists[nbr.vertexNum].name );
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//System.out.print("Enter File Name: ");
		try {
			String filename = "C:\\Aswin\\Eclipse Workspace\\Basic\\src\\pkgTreesGraphs\\input.txt";//in.readLine();
			//System.out.println(filename);
			//System.out.println(new File(".").getAbsoluteFile());
			//filename = "/Basic/src/pkgTreesGraphs/"+filename;
			//System.out.println("filename: "+filename);
			Graph g = new Graph(filename);
			g.print();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
