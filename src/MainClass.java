package ICS;

public class MainClass{
	public static void main (String args[]){
		
		//Declaration of all the classes so that they are defined (other compile error).
		RegisterScreen r = new RegisterScreen();
		SelectionMenu s = new SelectionMenu();
		Hasher hash = new Hasher();
		LinkedList l = new LinkedList();
		MCProblem prob = new MCProblem();
		SAProblem prob2 = new SAProblem();
		LoginScreen ls = new LoginScreen();
		TeacherMode tm = new TeacherMode();
		StudentMode sm = new StudentMode();
		QuestionsetMenu qs = new QuestionsetMenu();
		
		//Setting the starting screen to visible and to appear centered.
		ls.setVisible(true);
		ls.setLocationRelativeTo(null);
        ls.setResizable(false);
	}
}