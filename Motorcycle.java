public class Motorcycle extends Vehicle{
  private int weight;

  public void setWeight(int in){
    weight = in;
  }

  public int getWeight(){
    return weight;
  }

  public void stats(){
    System.out.println("Vehicle model name: " + model);
    System.out.println("Vehicle model year: " + year);
    System.out.println("Vehicle weight is: " + weight);
    System.out.println("Vehicle color is: " + color);
    System.out.println("Vehicle EPA rated MPG: " + mpg);
    System.out.println("Vehicle make: " +make);
    System.out.println(notes);
  }

}
