import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keylistenerdemo extends Applet implements KeyListener {

	String str="";
	public void init() {
		addKeyListener(this);
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		str="key pressed";
		showStatus("key is pressed");
		repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		str="key released";
		showStatus("key is released");
		repaint();
		
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
		char key=arg0.getKeyChar();
		str="key typed =";
		str+=key;
		showStatus("key is typed");
		repaint();
	}
	
	public void paint(Graphics g) {
		g.drawString(str, 50, 50);
	}

}
