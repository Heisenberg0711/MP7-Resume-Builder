import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

public class Event extends CVBuilder{
	private String Event1;
	private String Event2;
	private String Role1;
	private String Role2;
	private String Experience1;
	private String Experience2;
	private String Time1;
	private String Time2;
	
	private JButton nextBtn;
	private JTextField event1;
	private JTextField event2;
	private JTextField role1;
	private JTextField role2;
	private JTextArea experience1;
	private JTextArea experience2;
	private JTextField time1;
	private JTextField time2;

	
	public Event() {
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout(10,10));
		JLabel title = new JLabel("Experience");
		title.setFont(new Font("Arial", Font.BOLD, 26));
		cp.add(title, BorderLayout.NORTH);
		
		//JPanel for adding all things
		JPanel mainPanel = new JPanel();
		cp.add(mainPanel);
		mainPanel.setLayout(null);
		experience1 = new JTextArea("Please Enter your first experience here");
		experience1.setBounds(209, 93, 364, 108);
		experience1.setLineWrap(true);
		mainPanel.add(experience1);
		
		//second experience
		JLabel exp2 = new JLabel("Discription");
		exp2.setBounds(94, 305, 93, 18);
		exp2.setFont(new Font("Arial", Font.BOLD,15));
		mainPanel.add(exp2);
		experience2 = new JTextArea("Please Enter your second experience here");
		experience2.setBounds(209, 303, 364, 132);
		mainPanel.add(experience2);
		
		//event name1
		JLabel evt1 = new JLabel("Project 1");
		evt1.setBounds(89, 28, 98, 18);
		evt1.setFont(new Font("Arial",Font.BOLD,15));
		mainPanel.add(evt1);
		event1 = new JTextField();
		event1.setBounds(209, 28, 180, 21);
		mainPanel.add(event1);
		
		//first experience
		JLabel exp1 = new JLabel("Discription");
		exp1.setBounds(94, 95, 93, 18);
		exp1.setFont(new Font("Arial",Font.BOLD, 15));
		mainPanel.add(exp1);
		
		//event name2
		JLabel evt2 = new JLabel("Project 2");
		evt2.setBounds(94, 244, 98, 18);
		evt2.setFont(new Font("Arial",Font.BOLD, 15));
		mainPanel.add(evt2);
		event2 = new JTextField();
		event2.setBounds(209, 245, 180, 21);
		mainPanel.add(event2);
		
		//button
		nextBtn = new JButton("Submit");
		nextBtn.setBounds(492, 452, 82, 23);
		mainPanel.add(nextBtn);
		nextBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
		      {
				 Event1 = event1.getText();
				 Event2 = event2.getText();
				 Role1 = role1.getText();
				 Role2 = role2.getText();
				 Experience1 = experience1.getText();
				 Experience2 = experience2.getText();
				 Time1 = time1.getText();
				 Time2 = time2.getText();
				 System.out.println("%%% OtherExperience\r\n" + 
				 		"%%% ------------------------------------------------------------\r\n" + 
				 		"\\NewPart{Experience}{}\r\n");
				 System.out.println("\\EducationEntry{"+Role1+"}{"+Time1+"}{"+ Event1 +"}{" +Experience1+"}\n");
				 if(!Event2.equals("")) {
					 System.out.println("\\EducationEntry{"+Role2+"}{"+Time2+ "}{"+ Event2 +"}{"+Experience2+"}\n");
				 }
				 System.out.println("\\end{document}");
				 dispose();
		      }
		});
		
		role1 = new JTextField("Enter your position");
		role2 = new JTextField("Enter your position");
		role1.setBounds(209, 59, 180, 24);
		role2.setBounds(209,269,180,24);
		mainPanel.add(role1);
		mainPanel.add(role2);
		
		JLabel position1 = new JLabel("Role");
		JLabel position2 = new JLabel("Role");
		position1.setBounds(94, 56, 93, 20);
		position2.setBounds(94,275,93,20);
		position1.setFont(new Font("Arial",Font.BOLD, 15));
		position2.setFont(new Font("Arial",Font.BOLD, 15));
		mainPanel.add(position1);
		mainPanel.add(position2);
		
		time1 = new JTextField();
		time1.setBounds(566, 28, 96, 21);
		mainPanel.add(time1);
		time1.setColumns(10);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Arial", Font.BOLD, 15));
		lblTime.setBounds(492, 31, 46, 15);
		mainPanel.add(lblTime);
		
		JLabel lblTime_1 = new JLabel("Time");
		lblTime_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblTime_1.setBounds(492, 246, 46, 15);
		mainPanel.add(lblTime_1);
		
		time2 = new JTextField();
		time2.setBounds(577, 244, 96, 21);
		mainPanel.add(time2);
		time2.setColumns(10);
		
		setVisible(true);
		setTitle("Experience");
		setSize(800,600);
	}

}
