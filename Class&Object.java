class Class     //class
{
    String name;
    int rollNo;

    void display() {
        System.out.println(name);
        System.out.println(rollNo);
    }
}

class Main
{
    public static void main(String[] args) {
        Class obj = new Class();    //Object
        obj.name = "Naresh kumar";
        obj.rollNo = 28;
        obj.display();

        Class objk = new Class();    //Object
        objk.name = "Naresh kumar";
        objk.rollNo = 28;
        objk.display();
    }
}

