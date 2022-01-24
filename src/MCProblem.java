package ICS;

public class MCProblem extends Problem{
	private String name;
	private String statement;
	private int difficulty;
	private String answer;
	private LinkedList types;
	
	
	public MCProblem(String name, String statement, int difficulty, String answer, String types){
		this.name = name;
		this.statement = statement;
		this.difficulty = difficulty;
		this.answer = answer;
		types = new LinkedList();
		// Set a for/while loop to loop through the types String until the string contains no more spaces"
	}
	
	public String getProblem(){
		return statement;
	}
	
	public String getAnswer(){
		return answer;
	}
	
	public boolean checkAnswer(String answer){
		return this.answer == answer;
	}
	
	public int getDifficulty(){
		return difficulty;
	}
	
	public String getName(){
		return name;
	}
}