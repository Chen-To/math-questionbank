package ICS;

public class SAProblem extends Problem{
	private String name;
	private String statement;
	private String difficulty;
	private String answer;
	private LinkedList areas;
	
	public SAProblem(){
		super();
	}
	
	public SAProblem(String name, String statement, String difficulty, String answer, String types){
		super(name, statement, difficulty, types);
		this.answer = answer;
		/*
		this.name = name;
		this.statement = statement;
		this.difficulty = difficulty;
		areas = new LinkedList();
		String temp = "";
		for (int i = 0; i < types.length(); i ++){
			if (types.charAt(i) != ','){
				temp += types.charAt(i);
			}
			else{
				Node n = new Node(temp);
				areas.addLast(n);
				temp = "";
			}
		}*/
	}
	
	public String getAnswer(){
		return answer;
	}
	
	public boolean checkAnswer(String answer){
		return this.answer.equals(answer);
	}
	
	/*
	public String getProblem(){
		return statement;
	}
	
	public String getTypes(){
		String typeFormatted = "";
		Node base = areas.getHead();
		for (int i = 0; i < areas.getSize(); i ++){
			if (i == 0)
				base = areas.getHead();
			else
				base = base.getNext();
			typeFormatted += ((String)(base.getStore()));
			if (i != areas.getSize()-1)
				typeFormatted += ", ";
		}
		return typeFormatted;
	}
	
	public String getDifficulty(){
		return difficulty;
	}
	
	public String getName(){
		return name;
	}*/
}