class Student{
    private String name;
    private int roll;
    private String college;

    private static int count=0;

    public Student(String n,int r,String c){
        this.name=n;
        this.roll=r;
        this.college=c;
        count++;
    }
    void display(){
        System.out.println("Name="+this.name+"rollno="+this.roll+"college="+this.college);
    }
    static void total(){
        System.out.println("No.of student object created="+count);
    }
    class constructor{
        public static void main(String[] args){
            Student s1=new Student("Omey",181420,"NCIT");
            s1.display();
            Student s2=new Student("Sketchy",181421,"NCIT");
            s2.display();
            Student.total();
        }
    }
}