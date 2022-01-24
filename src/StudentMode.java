package ICS;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.io.*;

public class StudentMode extends JFrame {

	// Variables declaration - do not modify   
	private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
	private JButton jButton4;
	private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
	private JTextField jTextField1;
    private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenu jMenu4;
    private JMenuBar jMenuBar1;
    private JMenuBar jMenuBar2;
	private JOptionPane jOptionPane1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
	private ButtonGroup g; 
	private LinkedList problems;
	private LinkedList allProblems = new LinkedList();
    // End of variables declaration     
	
    /**
     * Creates new form StudentMode
     */
    public StudentMode() {
		storeElements();
        initComponents();
    }
                      
    

    private void initComponents() {
		this.setTitle("Math Helper - Student Mode");
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenu2 = new JMenu();
        jScrollPane1 = new JScrollPane();
		jButton1 = new JButton();
        jTextField1 = new JTextField();
        jButton2 = new JButton();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jButton3 = new JButton();
		jButton4 = new JButton();
		problems = allProblems;
		g = new ButtonGroup();
		
        jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
        jMenuBar2 = new JMenuBar();
        jMenu3 = new JMenu();
        jMenu4 = new JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

	
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		initializeTable();
		fillInTable();
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); 
        jLabel1.setText("List of Problems");
		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); 
        jLabel2.setText("Double click the problem name to open up a problem");
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); 
        jLabel3.setText("Select the sort option and click sort");
		
        jButton1.setText("Search");
		jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sort");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
		

        jRadioButton1.setText("Sort by Name");

        jRadioButton2.setText("Sort by Difficulty");
		
		g.add(jRadioButton1);
		g.add(jRadioButton2);
		
        jButton3.setText("Generate Problem Sets");
		jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
		
		jButton4.setText("Back");
		
		//Setting up layout of the GUI
       GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(192, 192, 192)
                                        .addComponent(jButton4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton2)))))
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>                         
	
	public void initializeTable(){
		jTable1 = new JTable(){
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		jTable1.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Problem Name", "Problem Area", "Relative Difficulty", "Problem Type"
            }
        ));
		
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(200);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);
			jTable1.getColumnModel().getColumn(1).setMinWidth(200);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        }
		
		jTable1.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				if (e.getClickCount() == 2){
					JTable target = (JTable)e.getSource();
					int row = target.getSelectedRow();
					int column = target.getSelectedColumn();
					System.out.println(column + " **");
					if (column == 0){
						Node n = problems.getIndex(row, 0, problems.getHead());
						QuestionDisplay q;
						if (n.getStore() instanceof SAProblem)
							q = new QuestionDisplay((SAProblem)(n.getStore()));
						else
							q = new QuestionDisplay((MCProblem)(n.getStore()));
						q.setVisible(true);
						q.setLocationRelativeTo(null);
					}
				}
			}
		});
	}
	
	public void fillInTable(){
		DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
		String [] data = new String[4];
		Node temp = problems.getHead();
		for (int i = 0; i < problems.getSize(); i ++){
			if (temp.getStore() instanceof MCProblem){
				data[0] = ((MCProblem)(temp.getStore())).getName();	
				data[1] = ((MCProblem)(temp.getStore())).getTypes();
				data[2] = ((MCProblem)(temp.getStore())).getDifficulty();
				data[3] = "MC";
				tableModel.addRow(data);
			}
			else{
				data[0] = ((SAProblem)(temp.getStore())).getName();	
				data[1] = ((SAProblem)(temp.getStore())).getTypes();
				data[2] = ((SAProblem)(temp.getStore())).getDifficulty();
				data[3] = "SA";
				tableModel.addRow(data);
			}
			
			temp = temp.getNext();
		}
		revalidate();
		repaint();
	}
	
	public void storeElements(){
		try{
			BufferedReader reader = new BufferedReader(new FileReader("Text Files/problems.txt"));
			String line = reader.readLine();
			while (line != null && !line.equals("")){
				String name = reader.readLine();
				String statement = "";
				String temp = reader.readLine();
				while (temp != null && !temp.equals("*")){
					if (!statement.equals(""))
						statement += ("@" + temp);
					else
						statement += temp;
					temp = reader.readLine();
				}
				String difficulty = reader.readLine();
				String area = reader.readLine();
				String type = reader.readLine();
				String answerSA;
				char answerMC;
				MCProblem probMC;
				SAProblem probSA;
				Node n;
				if (type.equals("SA")){
					answerSA = reader.readLine();
					probSA = new SAProblem(name, statement, difficulty, answerSA, area);
					n = new Node(probSA);
					allProblems.addFirst(n);
				}
				else{
					String hold = reader.readLine();
					answerMC = hold.charAt(0);
					probMC = new MCProblem(name, statement, difficulty, answerMC, area);
					n = new Node(probMC);
					allProblems.addFirst(n);
				}
				line = reader.readLine();
			}
		}
		catch (IOException e){
			jOptionPane1 = new JOptionPane();
			JFrame f = new JFrame(); 
			JOptionPane.showMessageDialog(f,"An Unexpected Error has occured");
		}
		
	}
	
	private void jButton1ActionPerformed(ActionEvent evt){
		String search = jTextField1.getText();
		if (search == null || search.equals(""))
			problems = allProblems;
		else{
			problems = new LinkedList();
			Node n = allProblems.getHead();
			String curr = "";
			for (int i = 0; i < allProblems.getSize(); i ++){
				if (n.getStore() instanceof SAProblem)
					curr = ((SAProblem)(n.getStore())).getName();
				else
					curr = ((MCProblem)(n.getStore())).getName();
				if (curr.toLowerCase().contains(search.toLowerCase()))
					problems.addFirst(new Node(n.getStore()));
				n = n.getNext();
			}
		}
		initializeTable();
		fillInTable();
	}
	
	private void jButton2ActionPerformed(ActionEvent evt){
		boolean selected = false;
		if (jRadioButton1.isSelected()){
			selected = true;
			problems.sortAlpha();
		}
		else if (jRadioButton2.isSelected()){
			selected = true;
			problems.sortNum();
		}
		if (selected){
			initializeTable();
			fillInTable();
		}
	}
	
	private void jButton3ActionPerformed(ActionEvent evt){
		QuestionsetMenu questions = new QuestionsetMenu(allProblems);
		questions.setVisible(true);
		questions.setLocationRelativeTo(null);
	}
	                                                
}
