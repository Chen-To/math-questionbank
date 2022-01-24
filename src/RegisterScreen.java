package ICS;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class RegisterScreen extends JFrame {

	 // Variables declaration                    
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPasswordField jPasswordField1;
    private JPasswordField jPasswordField2;
    private JTextField jTextField1;
	private JOptionPane jOptionPane1;
    // End of variables declaration       
	
    public RegisterScreen() {
        initComponents();
    }
	
    private void initComponents() {

        jPasswordField1 = new JPasswordField();
        jLabel1 = new JLabel();
        jPasswordField2 = new JPasswordField();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jLabel3 = new JLabel();
        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Your Password");

        jLabel2.setText("Confirm Your Password");

        jLabel3.setText("Enter Your Username");

        jButton1.setText("Register");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)
                            .addComponent(jPasswordField2))
                        .addGap(124, 124, 124))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(167, 167, 167))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }                       
                                            

    private void jButton1ActionPerformed(ActionEvent evt) {                                         
        String user = jTextField1.getText();
		String password1 = jPasswordField1.getText();
		String password2 = jPasswordField2.getText();
		boolean valid = true;
		
		if (password1.length() < 7 || password1.length() > 14){
			jOptionPane1 = new JOptionPane();
            JFrame f = new JFrame(); 
			JOptionPane.showMessageDialog(f,"Please enter a password between 7-14 characters long");
			valid = false;
		}
		
		else if (user.length() < 3 || user.length() > 10){
			jOptionPane1 = new JOptionPane();
            JFrame f = new JFrame(); 
			JOptionPane.showMessageDialog(f,"Please enter a username between 3-10 characters long");
			valid = false;
		}
		
		else if (!password1.equals(password2)){
			jOptionPane1 = new JOptionPane();
            JFrame f = new JFrame(); 
			JOptionPane.showMessageDialog(f,"The passwords do not match");
			valid = false;
		}
		
		else if (password1.contains(" ")){
			jOptionPane1 = new JOptionPane();
            JFrame f = new JFrame(); 
			JOptionPane.showMessageDialog(f,"The password contains a space. Please delete the space.");
			valid = false;
		}
		
		else {
			for (int i = 0; i < user.length(); i ++){
				int curr = (int)user.charAt(i);
				if (!((curr >= 48 && curr <= 57) || (curr >= 65 && curr <= 90) || (curr >= 97 && curr <= 122))){
					jOptionPane1 = new JOptionPane();
					JFrame f = new JFrame(); 
					JOptionPane.showMessageDialog(f,"The username contains an invalid character. The username should only contain digits and letters.");
					valid = false;
					break;
				}
			}
		}
		
		if (valid){
			long userHash = Hasher.getHash(user);
			long passwordHash = Hasher.getHash(password1);
			try {
				BufferedReader reader = new BufferedReader(new FileReader("Text Files/userinfo.txt"));
				String holder = reader.readLine();
				while (holder != null && !holder.equals("")){
					//System.out.println("valid");
					String hold[] = holder.split(" ", 2);
					if (userHash == Long.parseLong(hold[0])){
						jOptionPane1 = new JOptionPane();
						JFrame f = new JFrame(); 
						JOptionPane.showMessageDialog(f,"This username has already been taken");
						valid = false;
						break;
					}
					holder = reader.readLine();
				}
			
				if (valid){
					try{
						BufferedWriter writer = new BufferedWriter(new FileWriter("Text Files/userinfo.txt", true));
						writer.newLine();
						writer.append(userHash + " " + passwordHash);
						writer.close();
						this.setVisible(false);
					}
					catch (IOException e){
						jOptionPane1 = new JOptionPane();
						JFrame f = new JFrame(); 
						JOptionPane.showMessageDialog(f,"An Unexpected Error has occured");
					}
				}
			}
			catch (IOException e){
				jOptionPane1 = new JOptionPane();
				JFrame f = new JFrame(); 
				JOptionPane.showMessageDialog(f,"An Unexpected Error has occured");
			}
		}
		
    }                                        
    
}
