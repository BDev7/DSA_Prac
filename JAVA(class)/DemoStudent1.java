class DemoStudent1{
    int rollNo;
    String name;
    float marks;
    void setData()
    {
        rollNo=101;
        name="Java";
        marks=50;
    }
    void showData()
    {
        System.out.println("RollNo: "+rollNo);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }

}

class MainClass1
{
    public static void main(String[] args) {
        
        DemoStudent1 obj1=new DemoStudent1();
        obj1.setData();
        obj1.showData();
    }
}