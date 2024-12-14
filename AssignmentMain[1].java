package Assignment1Main;
import Assignment1Main.Manager;
import Assignment1Main.Developer;
import Assignment1Main.EmployeeUtilities;
public class Assignment1Main {
public static void main(String[] args) {
Manager manager = new Manager("John", 101, 90000, "Sales");
Developer developer = new Developer("Alice", 102, 80000, "Java");
EmployeeUtilities.printEmployeeDetails(manager);
EmployeeUtilities.printEmployeeDetails(developer);
}
}
