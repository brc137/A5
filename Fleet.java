import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
public class Fleet{

	public static void main(String args[]) throws FileNotFoundException,IOException{

		Scanner input = new Scanner(System.in);

		System.out.println("\n" + "What is the name of the DB text file?");
		String db = input.nextLine();

		Scanner DBread = new Scanner(new File(db));

		ArrayList<Vehicle> cars = new ArrayList<Vehicle>();

		String Vclass = "";

		while (DBread.hasNext()){

			String VC = DBread.next();

		if (VC.equals("A")){
			Car Car = new Car();

			Car.setMake(DBread.next());
			Car.setModel(DBread.next());
			Car.setWeight(DBread.nextInt());
			Car.setColor(DBread.next());
			Car.setYear(DBread.nextInt());
			Car.setMPG(DBread.nextInt());
			Car.setSeating(DBread.nextInt());
			Car.setVclass("A");

			cars.add(Car);
		}
		else if (VC.equals("T")){
			Truck Truck = new Truck();

			Truck.setMake(DBread.next());
			Truck.setModel(DBread.next());
			Truck.setWeight(DBread.nextInt());
			Truck.setColor(DBread.next());
			Truck.setYear(DBread.nextInt());
			Truck.setMPG(DBread.nextInt());
			Truck.setSeating(DBread.nextInt());
			Truck.setHauling(DBread.nextInt());
			Truck.setVclass("T");

			cars.add(Truck);
		}

		else if (VC.equals("MC")){
			Motorcycle Motorcycle = new Motorcycle();

			Motorcycle.setMake(DBread.next());
			Motorcycle.setModel(DBread.next());
			Motorcycle.setWeight(DBread.nextInt());
			Motorcycle.setColor(DBread.next());
			Motorcycle.setYear(DBread.nextInt());
			Motorcycle.setMPG(DBread.nextInt());
			Motorcycle.setVclass("MC");

			cars.add(Motorcycle);
		}

}

System.out.println("\n" + "What vehicle class would you like to list? (A: Automobile, T: Truck, MC:Motorcycle)");
		Vclass = input.next();

		System.out.println("\n" + "Now we will go through all objects created from the superclass Vehicle" + "\n");

// create an arraylist of our objects we create from the Vehicle class
		// Each vehicle with ALL of its methods and datafields will be stored in each element of our arraylist. Remember an ArrayList stores every value as an object instead of a primitive like a normal array
//We can add an object created by the subclass(Car) of the superclass(Vehicle) to an Arraylist of Vehicle because Car is a child of the parent Vehicle class.
int count = 0;

String search = Vclass.toUpperCase();

		for(Vehicle car : cars)
		{
			String Vcl = car.getVclass();

			if (search.equals(Vcl)){
				car.stats();
				count++;
			}
		}

System.out.println(count +" vehicles of the " + search + " class have been found and returned by your search");
		// You can see how 2 constructors work to do the same thing but in 2 different ways

		}
	}
