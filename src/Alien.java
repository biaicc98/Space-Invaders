import java.awt.Image;

public class Alien extends Character{
	private int leftPosition=0;
	private int rightPosition=0;
	private boolean hitState = false;
	private Image alienImage;
	
	SpaceInvaders spaceInvaders;
	
	public Alien(Image alienImage, SpaceInvaders spaceInvaders) { 
		super(spaceInvaders);
		this.alienImage=alienImage;
		
	}
	
	public boolean hasBeenHit() {
		
	}

	public boolean hitAlien(int x,int y) {
		
	}
	
	public void setPosition() {
		
	}
	public int getXPosition() {
		
	}
	public int getYPosition() {
		
	}
	
	public void drawAlien(Graphics g) {
		
	}
}
