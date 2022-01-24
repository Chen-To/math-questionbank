package ICS;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class QuestionsetMenu extends JFrame {

	// Variables declaration - do not modify     
	private JButton jButton1;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton4;
    private JRadioButton jRadioButton6;
    private JRadioButton jRadioButton7;
    private JRadioButton jRadioButton8;
    private JTextField jTextField1;
    private JTextField jTextField2;
	private JOptionPane jOptionPane1;
	private ButtonGroup g;
	private LinkedList allProblems;
    // End of variables declaration    
	
    /**
     * Creates new form QuestionsetMenu
     */
	 
	public QuestionsetMenu(){
	}
	
    public QuestionsetMenu(LinkedList allProblems) {
		this.allProblems = allProblems;
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jTextField1 = new JTextField();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
		jButton1 = new JButton();
        jButton3 = new JButton();
        jTextField2 = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jRadioButton6 = new JRadioButton();
        jRadioButton7 = new JRadioButton();
        jRadioButton8 = new JRadioButton();
		g = new ButtonGroup();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Problem Set Generator Filter");

        jRadioButton1.setText("Multiple Choice Only");

        jRadioButton2.setText("Short Answer Only");
		
		g.add(jRadioButton1);
		g.add(jRadioButton2);
		
		jButton1.setText("Cancel");
		jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
		
        jButton3.setText("Done");
		jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("Restricts difficulty to the inputted difficulty");

        jLabel3.setText("Number of Problems");

        jLabel4.setText("Difficulty Restriction");

        jRadioButton3.setText("Geometry");

        jRadioButton4.setText("Number Theory");

        jRadioButton6.setText("Probability");

        jRadioButton7.setText("Other");

        jRadioButton8.setText("Algebra");
		
		//Setting up layout of the GUI
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2))
                            .addComponent(jLabel2, GroupLayout.Alignment.TRAILING)
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jRadioButton3)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton6)
                                        .addGap(16, 16, 16)))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton7)))
                                .addGap(8, 8, 8)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton7))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton8))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)))
        );

        pack();
    }      
	private void jButton1ActionPerformed(ActionEvent evt){
		this.setVisible(false);
		dispose();
	}
	
	private void jButton3ActionPerformed(ActionEvent evt){
		String problems = jTextField1.getText();
		String difficulty = jTextField2.getText();
		LinkedList areas = new LinkedList();
		boolean mc = true;
		boolean sa = true;
		boolean selectedType = false;
		if (difficulty.equals("") || difficulty == null)
			difficulty = "5";
		if (jRadioButton1.isSelected())
			sa = false;
		else if (jRadioButton2.isSelected())
			mc = false;
		if (jRadioButton3.isSelected()){
			Node n = new Node("Geometry");
			selectedType = true;
			areas.addFirst(n);
		}
		if (jRadioButton4.isSelected()){
			Node n = new Node("Number Theory");
			selectedType = true;
			areas.addFirst(n);
		}
		if (jRadioButton6.isSelected()){
			Node n = new Node("Probability");
			selectedType = true;
			areas.addFirst(n);
		}
		if (jRadioButton7.isSelected()){
			Node n = new Node("Other");
			selectedType = true;
			areas.addFirst(n);
		}
		if (jRadioButton8.isSelected()){
			Node n = new Node("Algebra");
			selectedType = true;
			areas.addFirst(n);
		}
		if (!selectedType)
			areas = includeAll(areas);
		int numProb = Integer.parseInt(problems);
		Node curr = allProblems.getHead();
		MCProblem probMC = new MCProblem();
		SAProblem probSA = new SAProblem();
		LinkedList usuableProbs = new LinkedList();
		System.out.println(allProblems.getSize() + "***");
		for (int i = 0; i < allProblems.getSize(); i ++){
			if (mc && sa){
				if (curr.getStore() instanceof MCProblem){
					probMC = (MCProblem)(curr.getStore());
					//System.out.println("*** " + probMC.getName());
					boolean legible = checkLegibility(areas, difficulty, probMC);
					if (legible)
						usuableProbs.addFirst(new Node(probMC));
				}
				else{
					probSA = (SAProblem)(curr.getStore());
					//System.out.println("*** " + probSA.getName());
					boolean legible = checkLegibility(areas, difficulty, probSA);
					if (legible)
						usuableProbs.addFirst(new Node(probSA));
				}
			}
			else if (sa){
				//System.out.println("indic2");
				if (curr.getStore() instanceof SAProblem){
					probSA = (SAProblem)(curr.getStore());
					boolean legible = checkLegibility(areas, difficulty, probSA);
					if (legible)
						usuableProbs.addFirst(new Node(probSA));
				}
			}
			else{
				//System.out.println("indic3");
				if (curr.getStore() instanceof MCProblem){
					probMC = (MCProblem)(curr.getStore());
					boolean legible = checkLegibility(areas, difficulty, probMC);
					if (legible)
						usuableProbs.addFirst(new Node(probMC));
				}
			}
			curr = curr.getNext();
		}
		if (numProb > usuableProbs.getSize()){
			jOptionPane1 = new JOptionPane();
            JFrame f = new JFrame(); 
			JOptionPane.showMessageDialog(f,"There are not enough problems to support your request");
			return;
		}
		this.setVisible(false);
		generateProblems(numProb, usuableProbs);
	}		
	
	private LinkedList includeAll(LinkedList areas){
		areas.addFirst(new Node("Geometry"));
		areas.addFirst(new Node("Number Theory"));
		areas.addFirst(new Node("Algebra"));
		areas.addFirst(new Node("Other"));
		areas.addFirst(new Node("Probability"));
		return areas;
	}
	
	private void generateProblems(int numProb, LinkedList usuableProbs){
		QuestionDisplay question;
		System.out.println(usuableProbs.getSize() + "*");
		for (int i = 0; i < numProb; i ++){
			//Generate a random number from 0 to the size of usuableProbs-1
			int random = (int)(Math.random()*usuableProbs.getSize());
			
			//Get a node from that index
			Node randNode = usuableProbs.getIndexHelper(random);
			
			//Use the QuestionDisplay class to display the question which could be either multiple choice style or short answer
			if (randNode.getStore() instanceof MCProblem)
				question = new QuestionDisplay((MCProblem)(randNode.getStore()));
			else
				question = new QuestionDisplay((SAProblem)(randNode.getStore()));
			
			question.setVisible(true);
			question.setLocationRelativeTo(null);
			//Delete the node storing the question as said question has already been used
			usuableProbs.delete(randNode);
		}
	}
	
	private boolean checkLegibility(LinkedList areas, String difficulty, MCProblem probMC){
		if (Integer.parseInt(probMC.getDifficulty()) > Integer.parseInt(difficulty)){
			return false;
		}
		LinkedList probAreas = probMC.getAreas();
		Node n = probAreas.getHead();
		for (int i = 0; i < probAreas.getSize(); i ++){
			String currType = (String)(n.getStore());
			boolean isValid = containsType(areas, currType);
			if (!isValid)
				return false;
		}
		return true;
	}
	
	private boolean checkLegibility(LinkedList areas, String difficulty, SAProblem probSA){
		if (!probSA.getDifficulty().equalsIgnoreCase(difficulty))
			return false;
		LinkedList probAreas = probSA.getAreas();
		Node n = probAreas.getHead();
		for (int i = 0; i < probAreas.getSize(); i ++){
			String currType = (String)(n.getStore());
			boolean isValid = containsType(areas, currType);
			if (!isValid)
				return false;
		}
		return true;
	}
	
	private boolean containsType(LinkedList areas, String str){
		boolean doesContain = false;
		Node n = areas.getHead();
		for (int i = 0; i < areas.getSize(); i++){
			String curr = (String)(n.getStore());
			if (curr.equalsIgnoreCase(str)){
				doesContain = true;
				break;
			}
			n = n.getNext();
		}
		return doesContain;
	}
}
