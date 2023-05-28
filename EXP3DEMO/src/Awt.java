import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Awt {
	
	Awt(){
		Frame f1=new Frame("Student details");
		f1.setLayout(null);
		f1.setSize(300,400);
		f1.setVisible(true);
		
		Label l,l1,l2,l3,l4,l5;
		TextField tf1,tf2,tf3,tf4,tf5;
		
		
		l=new Label("student Marks");
		l.setBounds(20, 40, 100, 20);
		f1.add(l);
		
		l=new Label("Enter student NAME:");
		l.setBounds(20, 60, 120, 20);
		f1.add(l);
		
		l1=new Label("PM: ");
		l1.setBounds(20, 80, 100, 20);
		f1.add(l1);
		
		l2=new Label("CN:");
		l2.setBounds(20, 100, 100, 20);
		f1.add(l2);
		
		l3=new Label("PDC:");
		l3.setBounds(20, 120, 100, 20);
		f1.add(l3);
		
		l4=new Label("AJP");
		l4.setBounds(20, 140, 100, 20);
		f1.add(l4);
	
		tf1=new TextField();
		tf1.setBounds(150, 60, 100, 20);
		f1.add(tf1);
		tf2=new TextField();
		tf2.setBounds(150, 80, 100, 20);
		f1.add(tf2);
		tf3=new TextField();
		tf3.setBounds(150, 100, 100, 20);
		f1.add(tf3);
		tf4=new TextField();
		tf4.setBounds(150, 120, 100, 20);
		f1.add(tf4);
		tf5=new TextField();
		tf5.setBounds(150, 140, 100, 20);
		f1.add(tf5);
		
		Button b=new Button("submit");
		b.setBounds(70,160,100,20);
		f1.add(b);
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Frame f2=new Frame();
				f2.setLayout(null);
				f2.setSize(300,400);
				f2.setVisible(true);
				
				Label l,l1,l2,l3,l4,l5,l6,l7;
				
				l=new Label("student NAME:"+tf1.getText());
				l.setBounds(20, 60, 120, 20);
				f2.add(l);
				
				l1=new Label("PM: "+tf2.getText());
				l1.setBounds(20, 80, 100, 20);
				f2.add(l1);
				
				l2=new Label("CN:"+tf3.getText());
				l2.setBounds(20, 100, 100, 20);
				f2.add(l2);
				
				l3=new Label("PDC:"+tf4.getText());
				l3.setBounds(20, 120, 100, 20);
				f2.add(l3);
				
				l4=new Label("AJP"+tf5.getText());
				l4.setBounds(20, 140, 100, 20);
				f2.add(l4);
				
				l4=new Label("AJP"+tf5.getText());
				l4.setBounds(20, 140, 100, 20);
				f2.add(l4);
				
				int c=Integer.parseInt(tf2.getText())+Integer.parseInt(tf3.getText())+Integer.parseInt(tf4.getText())+Integer.parseInt(tf5.getText());
				
				l5=new Label("total marks"+c);
				l5.setBounds(20, 140, 100, 20);
				f2.add(l5);
				
				int p=c/4;
				
				l6=new Label("percentage:"+p);
				l6.setBounds(20, 140, 100, 20);
				f2.add(l6);
				
				String str="";
				if(p<35) {
					str="fail";
				}else {
					str="pass";
				}
				
				l7=new Label("pass/fail:"+str);
				l7.setBounds(20, 140, 100, 20);
				f2.add(l7);
				
				
				
				
				
			}
			
		});
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Awt a=new Awt();
	}

}
