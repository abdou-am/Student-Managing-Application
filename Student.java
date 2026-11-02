public class Student{
    private static int id = 0;
    private int studentId;
    private String firstName;
    private String secondName;
    private String studentClass;
    private int age;
    public Student (String firstName , String secondName , String studentClass , int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.studentClass = studentClass;
        this.age = age;
        id = id + 1;
        this.studentId = id;
    }

    // getters 

    public int getId(){
        return this.studentId;
    }
    public int age(){
        return this.age;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getSecondName(){
        return this.secondName;
    }
    public String getStudentClass(){
        return this.studentClass;
    }

    // setters

    public void setAge(int ageNumber){
        this.age = ageNumber;
    }
    public void setFirstName(String firstNameText){
        this.firstName = firstNameText;
    }
    public void setSecondName(String secondNameText){
        this.secondName = secondNameText;
    }
    public void setClass(String classText){
        this.studentClass = classText;
    }
}