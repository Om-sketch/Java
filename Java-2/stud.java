// Section 2
// 1.Create a package with your name+roll number as a package name.
// 2.Inside the package create a class named Student with name, roll, college as the attributes.
// 3.Create getters and setters function to initialise and display each of the attributes.
package nameroll;
class Student{
    private String name;
    private int roll;
    private String college;

    void Name(String n){
        this.name=n;
    }
    void Roll(int r){
        this.roll=r;
    }
    void College(String c){
        this.college=c;
    }
    void display(){
        System.out.println(this.name +this.roll +this.college);
    }
}
class stud{
    public static void main(String[] args){
        Student s1=new Student();
        s1.Name("Om");
        s1.Roll(181420);
        s1.College("NCIT");
        s1.display();
    }
}