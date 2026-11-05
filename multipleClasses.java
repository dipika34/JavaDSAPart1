public class program10{
    public static void main(String[] args){
        program10 obj  = new program10();
        obj.fullThrottle();
        obj.speed(200);
    }
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed){
        System.out.println("Max speed is: "+maxSpeed);
    }
}
