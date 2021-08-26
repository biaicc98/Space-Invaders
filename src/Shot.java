import java.awt.Graphics;

public class Shot implements Runnable{
	
	private int shotSpeed=10;
	private int shotWidth=2;
	private int shotHeight=5;
	private int x=0;
	private int y=0;
	//    private int shotHeight = 0;
	boolean shotState=true;
	
	AlienArmy alienArmy;
	
	public Shot(int x, int y, AlienArmy alienArmy) {
		this.x=x;
		this.y=y;
		this.alienArmy=alienArmy;
	}

	private boolean moveShot() {
		
	}

	public void drawShot(Graphics g) {
		
	}
	public boolean getShotState() {
		
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(shotSpeed);
			} catch(InterruptedException ie) {
				
			}
			
		}
		
		
		
	}
	
}
