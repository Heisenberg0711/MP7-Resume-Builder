import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Info extends CVBuilder{
	private String FullName;
	private String Phone;
	private String EmailAddress;
	private String School;
	private String Program;
	private String HomeAdd;
	private String DateBirth;
	private String YearStart;
	private String YearEnd;
	private String level;
	private String School_Discription;

	
	private JButton next;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField phoneNumber;
	private JTextField email;
	private JTextField school;
	private JTextField program;
	private JComboBox educationLevel = new JComboBox(new String[] {
			"High School Diploma","Technical Diploma","Bachelors Degree","Masters Degree"});
	private JTextField Home;
	private JTextField Date;
	private JTextField From;
	private JTextField To;
	private JTextField discription;
	
	public Info() {
	   Container information = getContentPane();
	   information.setLayout(new BorderLayout(10,10));
	   JLabel title = new JLabel("Personal Information");
	   title.setFont(new Font("Arial", Font.BOLD, 26));
	   information.add(title, BorderLayout.NORTH);
	   
	   //JPanel for adding things
	   JPanel main = new JPanel(null);
	   information.add(main, BorderLayout.CENTER);
	   
	   //next Button
	   next = new JButton("next");
	   
	   //Name
	   firstName = new JTextField();
	   firstName.setBounds(161, 31, 124, 27);
	   lastName = new JTextField();
	   lastName.setBounds(470, 31, 124, 27);
	   JLabel fName = new JLabel("first name");
	   fName.setBounds(59, 40, 89, 18);
	   fName.setFont(new Font("Arial", Font.BOLD,15));
	   JLabel lName = new JLabel("last name");
	   lName.setBounds(371, 40, 89, 18);
	   lName.setFont(new Font("Arial", Font.BOLD,15));
	   main.setLayout(null);
	   
	   main.add(firstName);
	   main.add(lastName);
	   main.add(fName);
	   main.add(lName);
	   
	   //Phone number
	   phoneNumber = new JTextField();
	   JLabel phone = new JLabel("Phone number");
	   main.add(phone);
	   main.add(phoneNumber);
	   phone.setFont(new Font("Arial", Font.BOLD,15));
	   phone.setBounds(26, 82, 122, 18);
	   phoneNumber.setBounds(161,73,177,27);
	   
	   //Email
	   email = new JTextField();
	   JLabel emailAdd = new JLabel("Email");
	   main.add(emailAdd);
	   main.add(email);
	   emailAdd.setFont(new Font("Arial", Font.BOLD,15));
	   emailAdd.setBounds(371, 82, 89, 18);
	   email.setBounds(470,79,183,27);
	   
	   //School
	   school = new JTextField();
	   JLabel schoolName = new JLabel("School Name");
	   main.add(schoolName);
	   main.add(school);
	   schoolName.setFont(new Font("Arial", Font.BOLD,15));
	   schoolName.setBounds(26, 203, 120, 18);
	   school.setBounds(161,200,124,27);
	   
	   //Program
	   program = new JTextField();
	   JLabel programName = new JLabel("program");
	   main.add(programName);
	   main.add(program);
	   programName.setFont(new Font("Arial", Font.BOLD,15));
	   programName.setBounds(371,203, 89, 18);
	   program.setBounds(470,200,124,27);
	   
	   //Education level
	   JLabel education = new JLabel("Education level");
	   main.add(education);
	   education.setFont(new Font("Arial", Font.BOLD,15));
	   education.setBounds(28,245,120,18);
	   main.add(educationLevel);
	   educationLevel.setBounds(161,242,177,27);
	   
	   next = new JButton("next");
	   main.add(next);
	   next.setBounds(455, 414, 89, 32);
	   
	   Home = new JTextField();
	   Home.setBounds(161, 121, 177, 27);
	   main.add(Home);
	   Home.setColumns(10);
	   
	   JLabel lblAddress = new JLabel("Address");
	   lblAddress.setFont(new Font("Arial", Font.BOLD, 15));
	   lblAddress.setBounds(26, 127, 109, 15);
	   main.add(lblAddress);
	   
	   Date = new JTextField();
	   Date.setBounds(505, 121, 164, 27);
	   main.add(Date);
	   Date.setColumns(10);
	   
	   JLabel lblDateOfBirth = new JLabel("Date of Birth");
	   lblDateOfBirth.setFont(new Font("Arial", Font.BOLD, 15));
	   lblDateOfBirth.setBounds(371, 127, 124, 15);
	   main.add(lblDateOfBirth);
	   
	   From = new JTextField();
	   From.setBounds(161, 298, 124, 21);
	   main.add(From);
	   From.setColumns(10);
	   
	   JLabel lblFrom = new JLabel("From(Year)");
	   lblFrom.setFont(new Font("Arial", Font.BOLD, 15));
	   lblFrom.setBounds(36, 301, 79, 15);
	   main.add(lblFrom);
	   
	   JLabel lblNewLabel = new JLabel("To(Year)");
	   lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
	   lblNewLabel.setBounds(350, 301, 86, 15);
	   main.add(lblNewLabel);
	   
	   To = new JTextField();
	   To.setBounds(446, 298, 124, 21);
	   main.add(To);
	   To.setColumns(10);
	   
	   JTextArea Discription = new JTextArea();
	   Discription.setLineWrap(true);
	   Discription.setBounds(161, 350, 275, 63);
	   main.add(Discription);
	   
	   discription = new JTextField();
	   discription.setEditable(false);
	   discription.setBackground(Color.LIGHT_GRAY);
	   discription.setFont(new Font("Arial", Font.BOLD, 15));
	   discription.setText("Discription");
	   discription.setBounds(26, 366, 96, 21);
	   main.add(discription);
	   discription.setColumns(10);
	   
	   next.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent arg0) {
			   FullName = firstName.getText()+lastName.getText();
			   Phone = phoneNumber.getText();
			   EmailAddress = email.getText();
			   School = school.getText();
			   Program = program.getText();
			   DateBirth = Date.getText();
			   HomeAdd = Home.getText();
			   level = educationLevel.getSelectedItem().toString();
			   YearStart = From.getText();
			   YearEnd = To.getText();
			   School_Discription = Discription.getText();
			   
			   System.out.println("\\begin{document}\r\n" + 
			   		"\\MyName{"+ FullName + "}\r\n" + 
			   		"");
			   System.out.println("\\sepspace\r\n" + 
			   		"\r\n" + 
			   		"%%% Personal details\r\n" + 
			   		"%%% ------------------------------------------------------------\r\n" + 
			   		"\\NewPart{Personal details}{}\r\n");
			   System.out.println("\\PersonalEntry{Phone}{" + Phone+"}");
			   System.out.println("\\PersonalEntry{Mail}{\\url{" + EmailAddress+"}}");
			   System.out.println("\\PersonalEntry{Birth}{" + DateBirth + "}");
			   System.out.println("\\PersonalEntry{Address}{" + HomeAdd + "}");
			   System.out.println("%%% Education\r\n" + 
			   		"%%% ------------------------------------------------------------\r\n" + 
			   		"\\NewPart{Education}{}\r\n" + 
			   		"\r\n" + 
			   		"\\EducationEntry{"+ Program +","+level+ "}{"+YearStart +"-"+ YearEnd +"}{"  + School +"}{"+School_Discription+"}" );
			   System.out.println("\\sepspace");
			   dispose();
			   SwingUtilities.invokeLater(new Runnable() {
			         @Override
			         public void run() {
			        	 new Work();			            
			         }
			      });
			}
	   });
	   
	   
	   
	   setSize(800,600);
	   setVisible(true);
	   setTitle("Personal information");
		
	}
}
