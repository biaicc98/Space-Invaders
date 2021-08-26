import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Player extends Character implements MouseListener, MouseMotionListener{
	
	private int x=0;
	
	
	
	SpaceInvaders spaceInvaders;
	
	Shot shot;

	boolean hitState=false;
	
	
	
	public Player(SpaceInvaders spaceInvaders) { 
		super(spaceInvaders);		
	}
	
	public void mouseMoved(MouseEvent me) {
		
	}
	
	public void mouseDragged(MouseEvent me) {
		
	}

	public void mouseEntered(MouseEvent me) {

	}
	public void mouseExited(MouseEvent me) {

	}
	public void mouseRelease(MouseEvent me) {

	}
	public void mousePressed(MouseEvent me) {

	}
	public void mouseClicked(MouseEvent me) {

	}
	
	public void drawShip(Graphics g) {
		
	}
	
	public boolean checkShot(int xShot, int yShot) {
		
	}
	public void hitByAlien() {
		
	}
}
