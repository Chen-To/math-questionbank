package ICS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QuestionDisplay extends JFrame {

	 // Variables declaration - do not modify                     
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JTextField jTextField1;
    private JTextField jTextField2;
	private MCProblem probMC;
	private SAProblem probSA;
	private JOptionPane jOptionPane1;
	private boolean indic = false;
    // End of variables declaration  
	
	/**
     * Creates new form QuestionDisplay
     */
    public QuestionDisplay(MCProblem prob) {
		System.out.println(prob.getName() + "1234");
		probMC = prob;
		indic = false;
        initComponents();
    }
    
	public QuestionDisplay(SAProblem prob){
		System.out.println(prob.getName() + "1234");
		probSA = prob;
		indic = true;
		initComponents();
	}
    private void initComponents() {
		
        jButton1 = new JButton();
        jButton2 = new JButton();
        jTextField1 = new JTextField();
        jButton3 = new JButton();
        jTextField2 = new JTextField();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jLabel1 = new JLabel();
		
		this.setTitle("Math Helper");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Done");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Show Answer");
		jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
		
		jTextField1.setEditable(false);

        jButton3.setText("Check Answer");
		jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
		
		jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Enter Answer Below");
		
		displayProblem();
		jTextArea1.setLineWrap(true);
		jTextArea1.setWrapStyleWord(true);
		
		//Setting up layout of the GUI
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1)
                            .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
	
	public void displayProblem(){
		if (indic){
			String name = probSA.getName();
			String statement = formatStatement(probSA.getProblem(), 0);
			jTextField1.setText(name);
			jTextArea1.setText(statement);
		}
		else{
			String name = probMC.getName();
			String statement = formatStatement(probMC.getProblem(), 0);
			jTextField1.setText(name);
			jTextArea1.setText(statement);
		}
	}
	
	public String formatStatement(String statement, int index){
		if (index == statement.length())
			return statement;
		if (statement.charAt(index) == '@')
			return formatStatement(statement.substring(0,index)+"\n"+statement.substring(index+1), index+1);
		return formatStatement(statement, index+1);
	}
    private void jButton1ActionPerformed(ActionEvent evt) {   
		System.out.println("reached jButton1");		
        this.setVisible(false);
    } 

	private void jButton2ActionPerformed(ActionEvent evt) {                                         
        jOptionPane1 = new JOptionPane();
		JFrame f = new JFrame(); 
		if (indic)
			JOptionPane.showMessageDialog(f,"The answer is " + probSA.getAnswer());
		else
			JOptionPane.showMessageDialog(f,"The answer is " + probMC.getAnswer());
    } 
	
	private void jButton3ActionPerformed(ActionEvent evt) {   
		System.out.println("reached jButton3");
        //Check Answer method
		String answer;
		if (!jTextField2.getText().trim().equals(""))
			answer = jTextField2.getText().trim();
		else
			return;
		//Check for short answer
		if (indic){
			if (probSA.checkAnswer(answer)){
				jOptionPane1 = new JOptionPane();
				JFrame f = new JFrame(); 
				JOptionPane.showMessageDialog(f,"Correct");
			}
			else{
				jOptionPane1 = new JOptionPane();
				JFrame f = new JFrame(); 
				JOptionPane.showMessageDialog(f,"Incorrect");
			}
		}
		//Check for multiple choice
		else{
			if (answer.length() > 1){
				jOptionPane1 = new JOptionPane();
				JFrame f = new JFrame(); 
				JOptionPane.showMessageDialog(f,"Invalid answer please type in a letter that corresponds with one of the choices");
				return;
			}
			if (probMC.checkAnswer(answer.charAt(0))){
				jOptionPane1 = new JOptionPane();
				JFrame f = new JFrame(); 
				JOptionPane.showMessageDialog(f,"Correct");
			}
			else{
				jOptionPane1 = new JOptionPane();
				JFrame f = new JFrame(); 
				JOptionPane.showMessageDialog(f,"Incorrect");
			}
		}
    } 

                                          
                 
}