package ICS;

public class Problem{
	private String name;
	private String statement;
	private String difficulty;
	private LinkedList areas;
	
	public Problem(){
	}
	
	public Problem(String name, String statement, String difficulty, String types){
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
		}
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
	public LinkedList getAreas(){
		return areas;
	}
	public String getProblem(){
		return statement;
	}
	
	public String getDifficulty(){
		return difficulty;
	}
	
	public String getName(){
		return name;
	}
	
}