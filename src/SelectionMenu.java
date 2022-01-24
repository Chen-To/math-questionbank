package ICS;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SelectionMenu extends JFrame {

    public SelectionMenu() {
        initComponents();
    }
                   
    private void initComponents() {

        jButton1 = new JButton();
        jButton3 = new JButton();
		
		this.setTitle("Math Helper");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Student Mode");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Teacher Mode");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
		
		//Setting up layout of the GUI
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }                

    private void jButton1ActionPerformed(ActionEvent evt) {                                         
       StudentMode sm = new StudentMode();
	   sm.setVisible(true);
	   sm.setLocationRelativeTo(null);
	   this.setVisible(false);
    }                                        

    private void jButton3ActionPerformed(ActionEvent evt) {                                         
        TeacherMode tm = new TeacherMode();
		tm.setVisible(true);
		tm.setLocationRelativeTo(null);
        tm.setResizable(false);
		this.setVisible(false);
    }                                        

    // Variables declaration - do not modify                     
    private JButton jButton1;
    private JButton jButton3;
    // End of variables declaration                   
}
