class Training
{
	private int Trainingid;
	private String TrainingName;
	public Training(){}
	public Training(int Trainingid,String TrainingName)
{
		this.Trainingid=Trainingid;
		this.TrainingName=TrainingName;
}
	public void setTrainingid(int Trainingid){ this.Trainingid=Trainingid; }
	public void setTrainingName(String TrainingName){ this.TrainingName=TrainingName; }
	public int getTrainingid() { return Trainingid; }
	public String getTrainingName() { return TrainingName; }
	ArrayList<String> List = new ArrayList<String>();
	List(1,"hrm");
	List(2,"dbms");
	List(3,"c");
	List(4,"python");
	System.out.println(List);
	
}
class Student
{
	private int Studentid;
	private String StudentName;
	private Student s;
	public Student(){}
	public Student(int ,String StudentName){
		this.Studentid=Studentid;
		this. StudentName= StudentName;
		
}
	public void setStudentid(int Studentid){ this.Studentid=Studentid; }
	public void setStudentName(String StudentName){ this.StudentName=StudentName; }
	public int getStudentid() { return Studentid; }
	public String getStudentName() { return StudentName; }
	ArrayList<String> List = new ArrayList<String>();
	List.add(98765,"ajay"); 
	List.add(93472,"ram");
	List.add(34768,"kishore");
	List.add(32487,"varma");
	System.out.println(List);
}
}
