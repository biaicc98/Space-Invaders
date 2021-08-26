import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.*;
import java.awt.image.*;
import java.io.*;


public class SpaceInvaders  extends JFrame implements Runnable, MouseListener
{
	int BOARD_WIDTH=600;
	int BOARD_HEIGHT=400;
	private int score=0;
	private boolean paused=false;
	Player player;
	AlienArmy army;
	Image backgroundImage;
	Image alienImage;
	
	private int gameSpeed=100;
	
	BufferedImage offscreen;
	Graphics offscreen_high;
	
	
//	boolean ingame = true;
//	private Dimension d;
//	
//	int x = 0;
//	BufferedImage img;
//	String message = "Click Board to Start";
//	private Thread animator;
//	
//	Alien[] aliens=new Alien[10];

	public SpaceInvaders(String frameTitle){
		super(frameTitle);
		
		
		//EXIT GAME
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
		backgroundImage = new javax.swing.ImageIcon("back3.jpg").getImage();
		
		alienImage= new javax.swing.ImageIcon("alien.jpg").getImage();
//		
		player=new Player(this);
		
		addKeyListener(new TAdapter());
//		addMouseListener(this);
//		setFocusable(true);
//		d = new Dimension(BOARD_WIDTH, BOARD_HEIGHT);
//		player= new Player(BOARD_WIDTH /2, BOARD_HEIGHT-60, 5);
//		
//		
//		int alienX=10;
//		int alienY=10;
//		for(int i=0; i<aliens.length;i++) {
//			aliens[i]=new Alien(alienX,alienY,1);
//			alienX+=40; //alien width + space
//			
//			if(i==4) {
//				alienX=10;
//				alienY+=40;
//			}
//		}
//		
//
//		setBackground(Color.black);
//		
//		/*         
//             try {
//                img = ImageIO.read(this.getClass().getResource("mount.jpg"));
//            } catch (IOException e) {
//                 System.out.println("Image could not be read");
//            // System.exit(1);
//            }
//		 */
//		if (animator == null || !ingame) {
//			animator = new Thread(this);
//			animator.start();
//		}
//
//
//		setDoubleBuffered(true);
	}
    
	public void moveAliens() {

		for(int i=0;i<aliens.length;i++) {
			if(aliens[i].moveLeft==true) {
				aliens[i].x-=aliens[i].speed;
			}
			if(aliens[i].moveRight==true) {
				aliens[i].x+=aliens[i].speed;
			}
		}	
		for(int i=0;i<aliens.length;i++) {
			if(aliens[i].x>BOARD_WIDTH) {
				for(int j=0;j<aliens.length;j++) {
					aliens[j].moveLeft=true;

					aliens[j].moveRight=false;
					aliens[j].y+=10;
				}
				
				
			}
			if(aliens[i].x<0) {
				for(int j=0;j<aliens.length;j++) {
					aliens[j].moveRight=true;
					aliens[j].moveLeft=false;
					aliens[j].y+=5;
				}
			}
		}

		
	}
	
	
    public void paint(Graphics g){
    	super.paint(g);

    	g.setColor(Color.white);
    	g.fillRect(0, 0, d.width, d.height);
    	//g.fillOval(x,y,r,r);

    	//represents player
    	g.setColor(Color.red);
    	g.fillRect(player.x, player.y, 20, 20); //add player w and h later
    	if(player.moveRight==true) {
    		player.x+=player.speed;
    	}
    	if(player.moveLeft==true) {
    		player.x-=player.speed;
    	}
    	
    	moveAliens();
    	for(int i=0; i<aliens.length;i++) {
    		if(aliens[i].isVisible) {
    			g.fillRect(aliens[i].x, aliens[i].y, 20, 20); //add player w and h later
    		}
    	}
    	
    	
    	
    	
    	Font small = new Font("Helvetica", Font.BOLD, 14);
    	FontMetrics metr = this.getFontMetrics(small);
    	g.setColor(Color.black);
    	g.setFont(small);
    	g.drawString(message, 10, d.height-60);

    	if (ingame) {





    		// g.drawImage(img,0,0,200,200 ,null);



    	}
    	Toolkit.getDefaultToolkit().sync();
    	g.dispose();
    }
    private class TAdapter extends KeyAdapter {

    	public void keyReleased(KeyEvent e) {
    		int key = e.getKeyCode();
    		player.moveLeft=false;
    		player.moveRight=false;

    	}

    	public void keyPressed(KeyEvent e) {
    		//System.out.println( e.getKeyCode());
    		// message = "Key Pressed: " + e.getKeyCode();
    		int key = e.getKeyCode();
    		if(key==39){
    			player.moveRight=true;
    		}
    		if(key==37) {
    			player.moveLeft=true;
    		}



    	}

    }




    public void mousePressed(MouseEvent e) {
    	int x = e.getX();
    	int y = e.getY();

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseClicked(MouseEvent e) {

    }

    public void run() {

    	long beforeTime, timeDiff, sleep;

    	beforeTime = System.currentTimeMillis();
    	int animationDelay = 5;
    	long time = 
    			System.currentTimeMillis();
    	while (true) {//infinite loop
    		// spriteManager.update();
    		repaint();
    		try {
    			time += animationDelay;
    			Thread.sleep(Math.max(0,time - 
    					System.currentTimeMillis()));
    		}catch (InterruptedException e) {
    			System.out.println(e);
    		}//end catch
    	}//end while loop




    }//end of run

}//end of class


