
abstract class Vehicle{
    protected String name;
    protected String brand;
    public Vehicle(String name, String brand){
    this.name = name;
    this.brand = brand;
    }
     public abstract void start();
   }
  
  class Car extends Vehicle{
   

    public Car(String name, String brand){
      super(name, brand);
    }
    public void start(){
        System.out.println(name);
        System.out.println(brand);
    
  }}
  public class Main {
    public static void main(String[] args) {
          Car obj = new Car("m5", "bmw");
          obj.start();
   }
  }
  