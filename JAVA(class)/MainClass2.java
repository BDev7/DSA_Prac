import java.util.Scanner;
class DemoStudent2{
    int rollNo;
    String name;
    float marks;
    void setData()
    {
        System.out.println("Please enter the studednt detail: ");
        Scanner sc=new Scanner(System.in);
        rollNo=sc.nextInt();
        marks=sc.nextFloat();
        name=sc.next();
        
    }
    void showData()
    {
        System.out.println("RollNo: "+rollNo);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }

}

class MainClass2
{
    public static void main(String[] args) {
        
        DemoStudent2 obj1=new DemoStudent2();
        obj1.setData();
        obj1.showData();
    }
}