public class program6{
    String fname;
    String lname;
    int age;

    public static void main(String[] args){
        program6 obj = new program6();
        obj.fname="John";
        obj.lname="Doe";
        obj.age=24;
        System.out.println("Name: "+obj.fname+" "+obj.lname);
        System.out.println("Age: "+obj.age);
    }
}
