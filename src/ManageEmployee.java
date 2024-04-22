import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageEmployee {
    public static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        employee();
        displayEmployees();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add New Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Display Employees");
            System.out.println("0. Exit");

            System.out.print("Insert your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    removeEmployee(scanner);
                    break;
                case 3:
                    displayEmployees();
                    break;
                case 0:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Choice not valid");
            }
        } while (choice != 0);
    }
abc

    public static void employee(){
        employees.add(new Employee(1, "John", 30, "HR", "EMP001", 2500));
        employees.add(new Employee(2, "Alice", 28, "Finance", "EMP002", 2800));
        employees.add(new Employee(3, "Bob", 35, "IT", "EMP003", 3000));
        employees.add(new Employee(4, "Emily", 32, "Marketing", "EMP004", 2700));
        employees.add(new Employee(5, "David", 40, "HR", "EMP005", 3200));
        employees.add(new Employee(6, "Sophia", 26, "Finance", "EMP006", 2600));
        employees.add(new Employee(7, "Michael", 33, "IT", "EMP007", 3100));
        employees.add(new Employee(8, "Emma", 29, "Marketing", "EMP008", 2750));
        employees.add(new Employee(9, "William", 38, "HR", "EMP009", 3300));
        employees.add(new Employee(10, "Olivia", 31, "IT", "EMP010", 2900));
    }

    private static void displayEmployees() {
        System.out.println("List of employees:\n");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void addEmployee(Scanner scanner) {
        System.out.println("Insert New Employee: ");

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Department: ");
        String department = scanner.nextLine();

        System.out.print("Code: ");
        String code = scanner.nextLine();

        System.out.print("Salary Rate: ");
        int salary_rate = scanner.nextInt();

        employees.add(new Employee(id, name, age, department, code, salary_rate));
        System.out.println("New Employee added successfully.");
    }

    private static void removeEmployee(Scanner scanner) {
        System.out.print("Insert ID Employee need to be deleted: ");
        int id = scanner.nextInt();

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                System.out.println("Employee removed successfully.");
                return;
            }
        }
        System.out.println("Not found Employee with ID " + id);
    }
}
