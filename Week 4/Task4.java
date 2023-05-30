public class Task4{
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(3, true, 10, "yellow");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}
class Fan{
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){
        this.speed = 1;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean getOn(){
        return this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public String toString(){
        if(this.on){
            return "Fan speed: " + this.speed + " | Fan color: " + this.color + " | Fan radius: " + this.radius;
        }
        else{
            return "Fan color: " + this.color + " | Fan radius: " + this.radius + " | Fan is off";
        }
    }
}
