import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class Work extends CVBuilder{
	private String Work1;
	private String Work2;
	private String Position1;
	private String Position2;
	private String Company1;
	private String Company2;
	private String From1;
	private String From2;
	private String To1;
	private String To2;
	
	private JButton submitBtn;
	private JTextArea workexp1;
	private JTextArea workexp2;
	private JTextField workPosition1;
	private JTextField workPosition2;
	private JTextField company1;
	private JTextField company2;
	private JTextField from1;
	private JTextField to1;
	private JTextField from2;
	private JTextField to2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Work window = new Work();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Work() {
		Container cont = getContentPane();
		cont.setLayout(new BorderLayout(10,10));
		JLabel title = new JLabel("Past Work Experience");
		title.setFont(new Font("Arial", Font.BOLD, 26));
		cont.add(title, BorderLayout.NORTH);
		
		//JPanel for adding components
		JPanel mainJP = new JPanel();
		cont.add(mainJP, BorderLayout.CENTER);
		mainJP.setLayout(null);
		
		//Work exp 1
		JLabel comp1 = new JLabel("Company name");
		comp1.setFont(new Font("Arial", Font.BOLD,15));
		comp1.setBounds(10, 30, 107, 30);
		JLabel role1 = new JLabel("Role");
		role1.setFont(new Font("Arial", Font.BOLD,15));
		role1.setBounds(10, 70, 107, 30);
		JLabel detail1 = new JLabel("Detail");
		detail1.setFont(new Font("Arial", Font.BOLD,15));
		detail1.setBounds(10, 110, 107, 30);
		company1 = new JTextField("");
		company1.setBounds(127,30,176,26);
		workexp1 = new JTextArea("Please enter your past working experience here");
		workPosition1 = new JTextField();
		workPosition1.setBounds(127, 74, 176, 26);
		workexp1.setBounds(127, 114, 353, 100);
		workexp1.setLineWrap(true);
		
		mainJP.add(comp1);
		mainJP.add(role1);
		mainJP.add(detail1);
		mainJP.add(company1);
		mainJP.add(workexp1);
		mainJP.add(workPosition1);
		
		
		//Work exp2
		JLabel comp2 = new JLabel("Company name");
		comp2.setFont(new Font("Arial", Font.BOLD,15));
		comp2.setBounds(10, 248, 107, 30);
		JLabel role2 = new JLabel("Role");
		role2.setFont(new Font("Arial", Font.BOLD,15));
		role2.setBounds(10, 278, 107, 30);
		JLabel detail2 = new JLabel("Detail");
		detail2.setFont(new Font("Arial", Font.BOLD,15));
		detail2.setBounds(10, 308, 107, 30);
		company2 = new JTextField("");
		company2.setBounds(127,248,176,26);
		workexp2 = new JTextArea("Please enter your past working experience here");
		workPosition2 = new JTextField();
		workPosition2.setBounds(127, 282, 176, 26);
		workexp2.setBounds(127, 322, 353, 100);
		workexp2.setLineWrap(true);
		
		mainJP.add(comp2);
		mainJP.add(role2);
		mainJP.add(detail2);
		mainJP.add(company2);
		mainJP.add(workexp2);
		mainJP.add(workPosition2);
		
		//Submit
		submitBtn = new JButton("Next");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Position1 = workPosition1.getText();
				Position2 = workPosition2.getText();
				Work1 = workexp1.getText();
				Work2 = workexp2.getText();
				Company1 = company1.getText();
				Company2 = company2.getText();
				From1 = from1.getText();
				From2 = from2.getText();
				To1 = to1.getText();
				To2 = to2.getText();
				System.out.println("%%% Work experience\r\n" + 
						"%%% ------------------------------------------------------------\r\n");
				System.out.println("\\NewPart{Work experience}{}");
				System.out.println("\\EducationEntry{"+Position1+"}{" + From1+"-"+ To1 + "}{"+Company1+"}{"+Work1+"}\n\\sepspace\n");
				if(!Position2.equals("")) {
					System.out.println("\\EducationEntry{"+Position2+"}{"+ From1+"-"+ To1 + "}{" +Company2+"}{"+Work2+"}\n");
				}
				dispose();
				new Event(); 
			}
		});
		submitBtn.setBounds(497,452,100,30);
		mainJP.add(submitBtn);
		
		from1 = new JTextField();
		from1.setBounds(461, 36, 96, 21);
		mainJP.add(from1);
		from1.setColumns(10);
		
		to1 = new JTextField();
		to1.setText("");
		to1.setBounds(461, 76, 96, 24);
		mainJP.add(to1);
		to1.setColumns(10);
		
		JLabel lblStartyear = new JLabel("Start Year");
		lblStartyear.setFont(new Font("Arial", Font.BOLD, 15));
		lblStartyear.setBounds(354, 39, 83, 15);
		mainJP.add(lblStartyear);
		
		JLabel lblEndyear = new JLabel("End Year");
		lblEndyear.setFont(new Font("Arial", Font.BOLD, 15));
		lblEndyear.setBounds(354, 79, 83, 15);
		mainJP.add(lblEndyear);
		
		JLabel lblStartYear = new JLabel("Start Year");
		lblStartYear.setFont(new Font("Arial", Font.BOLD, 15));
		lblStartYear.setBounds(366, 256, 90, 15);
		mainJP.add(lblStartYear);
		
		JLabel lblEndYear = new JLabel("End Year");
		lblEndYear.setFont(new Font("Arial", Font.BOLD, 15));
		lblEndYear.setBounds(357, 286, 80, 15);
		mainJP.add(lblEndYear);
		
		from2 = new JTextField();
		from2.setBounds(461, 254, 96, 21);
		mainJP.add(from2);
		from2.setColumns(10);
		
		to2 = new JTextField();
		to2.setBounds(461, 284, 96, 21);
		mainJP.add(to2);
		to2.setColumns(10);
		
		setVisible(true);
		setSize(800,600);
	}

}
