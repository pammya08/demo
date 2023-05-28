import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtFrame  {
	AwtFrame(){
	Frame f=new Frame("student details");
	f.setLayout(null);
	f.setSize(300,400);
	f.setVisible(true);
	
	Label l,l1,l2,l3,l4,l5;
	TextField tf1,tf2,tf3,tf4,tf5;
	
	l=new Label("Enter Student Marks");
	l.setBounds(10, 30, 120, 20);
	f.add(l);
	
	l1=new Label("ENTER NAME:");
	l1.setBounds(10, 50, 120, 20);
	f.add(l1);

	l2=new Label("PM:");
	l2.setBounds(10, 70, 120, 20);
	f.add(l2);
	
	l3=new Label("CN:");
	l3.setBounds(10, 90, 120, 20);
	f.add(l3);
	
	l4=new Label("PDC:");
	l4.setBounds(10, 110, 120, 20);
	f.add(l4);
	
	l5=new Label("AJP:");
	l5.setBounds(10, 130, 120, 20);
	f.add(l5);
	
	tf1= new TextField();
	tf1.setBounds(130, 50, 120, 20);
	f.add(tf1);
	tf2= new TextField();
	tf2.setBounds(130, 70, 120, 20);
	f.add(tf2);
	tf3= new TextField();
	tf3.setBounds(130, 90, 120, 20);
	f.add(tf3);
	tf4= new TextField();
	tf4.setBounds(130, 110, 120, 20);
	f.add(tf4);
	tf5= new TextField();
	tf5.setBounds(130, 130, 120, 20);
	f.add(tf5);
	Button b=new Button("submit");
	b.setBounds(80,160 ,120,20);
	f.add(b);
	b.addActionListener( new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Frame f2=new Frame();
			f2.setLayout(null);
			f2.setSize(300,400);
			f2.setVisible(true);
			Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
			
			l1=new Label("Marks of "+tf1.getText());
			l1.setBounds(10, 50, 120, 20);
			f2.add(l1);
			
			l2=new Label("PM: "+tf2.getText());
			l2.setBounds(10, 70, 120, 20);
			f2.add(l2);
			
			l3=new Label("CN: "+tf3.getText());
			l3.setBounds(10, 90, 120, 20);
			f2.add(l3);
			
			l4=new Label("AJP: "+tf4.getText());
			l4.setBounds(10, 110, 120, 20);
			f2.add(l4);
			
			l5=new Label("PDC: "+tf5.getText());
			l5.setBounds(10, 130, 120, 20);
			f2.add(l5);
			
			int total=Integer.parseInt(tf2.getText())+Integer.parseInt(tf3.getText())+Integer.parseInt(tf4.getText())+Integer.parseInt(tf5.getText());
			
			l1=new Label("TOTAL MARKS: "+total);
			l1.setBounds(10, 150, 120, 20);
			f2.add(l1);
			
			int percent=total/4;
			
			l1=new Label("PERCENTAGE: "+percent);
			l1.setBounds(10, 170, 120, 20);
			f2.add(l1);
			String str="";
			if(percent<35) {
				str="fail";
			}else {
				str="pass";
			}
			
			l1=new Label("RESULT: "+str);
			l1.setBounds(10, 190, 120, 20);
			f2.add(l1);
			
			
			
		}
		
	});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AwtFrame a=new AwtFrame();

	}

}
