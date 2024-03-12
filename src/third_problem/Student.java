package third_problem;

public class Student {
    private String name;
    private int age;
    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student (){
        this.name = "";
        this.age = 0;
        this.grade = "";
    }
    public Student (String a, int b){
        this.name = a;
        this.age = b;
        this.grade = "";
    }
    public Student (String a, int b, String c){
        this.name = a;
        this.age = b;
        this.grade = c;
    }

    //public void displayStudent (){

    //}

}
