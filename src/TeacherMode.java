package ICS;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class TeacherMode extends JFrame {

	// Variables declaration                    
    private JButton jButton1;
	private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
	private JLabel jLabel9;
    private JList<String> jList1;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton4;
    private JRadioButton jRadioButton5;
    private JRadioButton jRadioButton6;
    private JRadioButton jRadioButton7;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JTextArea jTextArea1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextPane jTextPane1;
	private JOptionPane jOptionPane1;
	private ButtonGroup g;
    // End of variables declaration 
	
    public TeacherMode() {
        initComponents();
    }
                     
    private void initComponents() {

        jScrollPane2 = new JScrollPane();
        jTextPane1 = new JTextPane();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jTextField1 = new JTextField();
        jLabel4 = new JLabel();
        jScrollPane3 = new JScrollPane();
        jList1 = new JList<>();
        jLabel5 = new JLabel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jLabel6 = new JLabel();
        jTextField2 = new JTextField();
        jLabel7 = new JLabel();
		jLabel9 = new JLabel();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jRadioButton5 = new JRadioButton();
        jRadioButton6 = new JRadioButton();
        jRadioButton7 = new JRadioButton();
        jButton1 = new JButton();
		jButton2 = new JButton();
		g = new ButtonGroup();
		
		this.setTitle("Math Helper - Teacher Mode");
        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("To insert a new question, please enter in the following fields as prompted");

        jLabel2.setText("Problem Name:");

        jLabel3.setText("Problem Statement:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
		jTextArea1.setLineWrap(true);
		jTextArea1.setWrapStyleWord(true);
		

        jLabel4.setText("Relative Problem Difficulty (Please select one the relative difficulty):");

        jList1.setModel(new AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4", "5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jLabel5.setText("Problem Type (Please select one):");

        jRadioButton1.setText("Multiple Choice");

        jRadioButton2.setText("Short Answer");
		
		g.add(jRadioButton1);
		g.add(jRadioButton2);
		
        jLabel6.setText("Answer (Type in the correct choice for Multiple Choice questions and the full number for short answer questions)");

        jLabel7.setText("Areas of Mathematics:");
		
		jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("Choose at least one of these areas in which you think the question falls under");
		
        jRadioButton3.setText("Geometry");
		

        jRadioButton4.setText("Number Theory");
		

        jRadioButton5.setText("Probability");
		

        jRadioButton6.setText("Other");
		

        jRadioButton7.setText("Algebra");
		

        jButton1.setText("Submit");
		jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
		jButton2.setText("Back");
		jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
		
		//Setting up layout of the GUI
		GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4)
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton5)
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton7)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton6, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jTextField1))
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE))))
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(jLabel9))
                .addGap(5, 5, 5))
        );
		
		pack();
    }                                

	private void jButton1ActionPerformed(ActionEvent evt){
		//Need function to check if name is duplicate
		String name = jTextField1.getText();
		String problem = jTextArea1.getText();
		System.out.println(problem);
		String answer = jTextField2.getText();
		String areas = "";
		String type = "";
		String difficulty = "";
		boolean selected = false;
		if(jRadioButton1.isSelected()){
			type = "MC";
		}
		else if (jRadioButton2.isSelected()){
			type = "SA";
		}
		else{
			jOptionPane1 = new JOptionPane();
			JFrame f = new JFrame(); 
			JOptionPane.showMessageDialog(f,"Please select a problem type");
			return;
		}
		if (type.equals("MC")){
			if (answer.length() != 1){
				jOptionPane1 = new JOptionPane();
				JFrame f = new JFrame(); 
				JOptionPane.showMessageDialog(f,"The answer should be a singular character representing the letter that corresponds with the correct solution.");
				return;
			}
		}
		int temp = jList1.getSelectedIndex()+1;
		difficulty += temp;
		
		if (difficulty.equals("")){
			jOptionPane1 = new JOptionPane();
			JFrame f = new JFrame(); 
			JOptionPane.showMessageDialog(f,"Please select the problem's difficulty");
			return;
		}
		
		if (jRadioButton3.isSelected()){
			areas += "Geometry,";
			selected = true;
		}
		if (jRadioButton4.isSelected()){
			areas += "Number Theory,";
			selected = true;
		}
		if (jRadioButton5.isSelected()){
			areas += "Probability,";
			selected = true;
		}
		if (jRadioButton7.isSelected()){
			areas += "Algebra,";
			selected = true;
		}
		if (jRadioButton6.isSelected()){
			areas += "Other,";
			selected = true;
		}
		if (!selected){
			jOptionPane1 = new JOptionPane();
			JFrame f = new JFrame(); 
			JOptionPane.showMessageDialog(f,"Please select at least one problem area");
			return;
		}
		
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter("Text Files/problems.txt", true));
			writer.newLine();
			writer.append("/");
			writer.newLine();
			writer.append(name);
			writer.newLine();
			writer.append(problem);
			writer.newLine();
			writer.append("*");
			writer.newLine();
			writer.append(difficulty);
			writer.newLine();
			writer.append(areas);
			writer.newLine();
			writer.append(type);
			writer.newLine();
			writer.append(answer);
			writer.close();
		}
		catch (IOException e){
			jOptionPane1 = new JOptionPane();
			JFrame f = new JFrame(); 
			JOptionPane.showMessageDialog(f,"An Unexpected Error has occured");
		}
		
			
	}
	private void jButton2ActionPerformed(ActionEvent evt){
		SelectionMenu sm = new SelectionMenu();
		this.setVisible(false);
		sm.setLocationRelativeTo(null);
		sm.setVisible(true);
	}
                  
}