/**
 * 
 */
package pkgTreesGraphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Aswin
 *
 */
public class CourseSchedule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CourseSchedule cs = new CourseSchedule();
		int[][] prereq = {{1,0},{0,1}};
		System.out.println(cs.canFinish(2, prereq));

	}
	
	public boolean canFinish(int numCourses, int[][] prerequisites){
		int[][] adjMatrix = new int[numCourses][numCourses];
		int[] indegree = new int[numCourses];
		
		//create the adjMatrix for the graph
		for(int i=0; i<prerequisites.length; i++){
			int course = prerequisites[i][0];
			int pre = prerequisites[i][1];
			if(adjMatrix[pre][course] == 0)
				indegree[course]++;
			adjMatrix[pre][course] = 1;			
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=0; i<indegree.length; i++){
			if(indegree[i] == 0)
				queue.offer(i);
		}
		
		int count = 0;
		while(!queue.isEmpty()){
			int course = queue.poll();
			count++;
			for(int i=0; i<numCourses; i++){
				if(adjMatrix[course][i] != 0){
					--indegree[i];
					if(indegree[i] == 0){
						queue.offer(i);
					}
				}
			}
		}
		return count == numCourses;
	}

}
