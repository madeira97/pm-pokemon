package pokemon_pm.pokemon_pm;

import java.util.*;


/**
 * Using my version of Pair due to the necessity of setting pair's values. 
 * @author ricardo madeira
 *
 */
public class MyPair {
	
	private int x;
	
	private int y;

    public MyPair (int x, int y) {
    	this.x = x;
    	this.y = y;
    }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void incrementDirectionHorizontal() {
		this.x++;
	}
	
	public void incrementDirectionVertical() {
		this.y++;
	}
	
	public void decrementDirectionHorizontal() {
		this.x--;
	}
	
	public void decrementDirectionVertical() {
		this.y--;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyPair other = (MyPair) obj;
		return x == other.x && y == other.y;
	}
    
    
}