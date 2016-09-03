/**
 * 
 */
package pkgBasic;

/**
 * @author aswin
 *
 */
public class RobotCircularMove {

	/**
	 * @param args
	 */
	
	static final int NORTH = 0;
	static final int EAST = 1;
	static final int SOUTH = 2;
	static final int WEST = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RobotCircularMove rcm = new RobotCircularMove();
		String moves = "GGLGLGGLGG";
		System.out.println(rcm.moveCircular(moves));
	}
	
	boolean moveCircular(String moves) {
		int x = 0, y = 0;
		int dir = NORTH;
		
		for(int i=0; i<moves.length(); i++) {
			char c = moves.charAt(i);
			if(c == 'L')
				dir = (4+dir-1)%4;
			else if(c == 'R')
				dir = (dir+1)%4;
			else if(c == 'G'){
				if(dir == NORTH)
					y++;
				else if(dir == EAST)
					x++;
				else if(dir == SOUTH)
					y--;
				else
					x--;
			}
		}
		return (x == 0 && y == 0);
	}
	
	

}
