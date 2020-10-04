//Section 3
// 1.Create a class called Shape. It should contain x-axis, y-axis, length and width as instance variables.
//  You should design the class to accommodate following requirements
//  ●A user can give values to all four attributes
//  ●If only two values are provided then those values should be assigned to length and width and the values of x-axis and y-axis should default to 0.
//  ●If no values are given, the x-axis and y-axis should default to 0 and that of length and width should be equal to 1.
class Shape{
    int x,y,length,width;
    public Shape(int x,int y,int l,int w){
        this.x=x;
        this.y=y;
        this.length=l;
        this.width=w;
    }
    public Shape(int l,int w){
        this(0,0,1,w);
    }
    public Shape(){
        this(0,0,1,1);
    }
    void display(){
        System.out.println("X-axis="+ this.x+",Y-axis="+this.y +",length="+this.length +",width="+this.width);
    }
    public static void main(String[] args){
        Shape s1=new Shape(1,2,3,4);
        Shape s2=new Shape(5,6);
        Shape s3=new Shape();
        s1.display();
        s2.display();
        s3.display();
    }
}