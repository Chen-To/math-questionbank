package ICS;

public class MainClass{
	public static void main (String args[]){
		
		RegisterScreen r = new RegisterScreen();
		SelectionMenu s = new SelectionMenu();
		Hasher hash = new Hasher();
		LoginScreen ls = new LoginScreen();
		TeacherMode tm = new TeacherMode();
		ls.setVisible(true);
		ls.setLocationRelativeTo(null);
        ls.setResizable(false);
	}
}