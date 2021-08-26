import java.awt.Image;
import java.util.Vector;

public class AlienArmy {

	Alien[] rowOne= new	 Alien[10];
	Alien[] rowTwo= new	 Alien[10];
	Alien[] rowThree= new	 Alien[10];
	
	boolean moveRight=true;
	
	int moveDistance=15;
	
	Vector alienShots=new Vector();
	
	private Player player;
	private SpaceInvaders spaceInvaders;
	Image alienImage;
	
	public AlienArmy(Player player, SpaceInvaders spaceInvaders, Image alienImage) {
		this.player=player;
		this.spaceInvaders=spaceInvaders;
		this.alienImage=alienImage;
		
		createArmy();
		setStartingPositions();
		
		
	}
	
	public void createArmy() {
		for(int i=0; i< rowOne.length;i++) {
			rowOne[i]=new Alien(alienImage,spaceInvaders);
			rowTwo[i]=new Alien(alienImage,spaceInvaders);
			rowThree[i]=new Alien(alienImage,spaceInvaders);

		
		}
	}
	
	public void setStartingPositions() {
		int rowY=50;
		int rowX=50;
		
		for(int i=0;i < rowOne.length; i++) {
			rowOne[i].setPosition(rowX,rowY);
			rowX+=40;
		}
		rowY+=50;
		rowX=50;
		for(int i=0;i < rowTwo.length; i++) {
			rowOne[i].setPosition(rowX,rowY);
			rowX+=40;
		}
		rowY+=50;
		rowX=50;
		for(int i=0;i < rowThree.length; i++) {
			rowOne[i].setPosition(rowX,rowY);
			rowX+=40;
		}
	}
	
	public void moveArmy() {
		
		if(moveRight) {
			
		}
		
	}
	

	
}
