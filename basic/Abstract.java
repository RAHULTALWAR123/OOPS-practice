abstract class vehicle{
    public abstract String start();

    public String stop(){
        return "stop";
    }
}

class car extends vehicle{
    @Override
    public String start(){
        return "car started";
    }
}

interface drive{

    public void driving();

}

class bike extends vehicle implements drive{
    @Override
    public String start(){
        return "starting";
    }

    @Override
    public void driving(){
        System.out.println("Bike is being driven!");
    }
}

public static void main (String[] args){
    car c = new car();
    System.out.println(c.start());
    System.out.println(c.stop()); 

     bike b = new bike();
        System.out.println(b.start()); // Output: Bike started!
        b.drive();     
}