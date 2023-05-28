import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Exp2mouse extends Frame implements MouseListener{
	String str;
	Frame f1;
	TextField tf;
	
	public static void main (String args[]) {
		Exp2mouse e=new Exp2mouse();
	}
	
	Exp2mouse(){
		f1=new Frame ("mouse event");
		f1.setSize(300,400);
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);
		tf=new TextField("mouse event");
		f1.add(tf);
		f1.addMouseListener(this);
		
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		str="mouseClicked";
		tf.setText(str);
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		str="mouseEntered";
		tf.setText(str);
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		str="mouseExited";
		tf.setText(str);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		str="mousePressed";
		tf.setText(str);
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		str="mouseReleased";
		tf.setText(str);
		
	}

}
