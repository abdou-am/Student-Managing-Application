import java.util.ArrayList;
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

    // adding marks

    ArrayList<Double> mathMarks = new ArrayList<>();
    public void addMathMark(double mathMark){
        this.mathMarks.add(mathMark);
    }

    ArrayList<Double> physicsMarks = new ArrayList<>();
    public void addPhysicsMark(double physicsMark){
        this.physicsMarks.add(physicsMark);
    }

    ArrayList<Double> frenchMarks = new ArrayList<>();
    public void addFrenchMark(double frenchMark){
        this.frenchMarks.add(frenchMark);
    }

    ArrayList<Double> englishMarks = new ArrayList<>();
    public void addEnglishMark(double englishMark){
        this.englishMarks.add(englishMark);
    }

    // computing average

    public double mathAverage(){
        double average = 0;
        for (Double x:mathMarks){ 
            average = average + x;
        }
        average = average / mathMarks.size();
        return average;
    }    

    public double physicsAverage(){
        double average = 0;
        for (Double x:physicsMarks){ 
            average = average + x;
        }
        average = average / physicsMarks.size();
        return average;
    }  

    public double frenchAverage(){
        double average = 0;
        for (Double x:frenchMarks){ 
            average = average + x;
        }
        average = average / frenchMarks.size();
        return average;
    }  

    public double englishAverage(){
        double average = 0;
        for (Double x:englishMarks){ 
            average = average + x;
        }
        average = average / englishMarks.size();
        return average;
    }  

    // computing the whole average

    public double average(){
        return (((englishAverage()) + (mathAverage()) + (physicsAverage()) + (frenchAverage())) / 4);
    }
    
}