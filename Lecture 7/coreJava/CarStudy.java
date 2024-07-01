
public class CarStudy{
    public static void main(String args[]){
        Car polo=new Car();
        System.out.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);

        polo.name="Polo";
        polo.color="Red";
        polo.year=2010;
        polo.maxSpeed=160;

        System.out.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);
    }
}

class Car{
    String name;
    String color;
    int year;
    int maxSpeed;
    void accelerate(){
        System.out.println("Car is accelerating");
    }
}