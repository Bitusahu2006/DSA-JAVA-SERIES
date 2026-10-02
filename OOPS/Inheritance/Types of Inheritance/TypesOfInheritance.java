// Parent Class
class Employee {
    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}


// Hierarchical Inheritance
class SalesManager extends Employee {

    SalesManager(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    void boostSales() {
        System.out.println("Boosting sales");
    }
}


// Hierarchical Inheritance
class MarketingManager extends Employee {

    MarketingManager(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    void createMarketingStrategy() {
        System.out.println("Creating marketing strategy");
    }
}


// Hierarchical Inheritance
class Executive extends Employee {

    Executive(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    void makeExecutiveDecision() {
        System.out.println("Making executive decision");
    }
}


// Hierarchical Inheritance
class Developer extends Employee {

    String programmingLanguage;

    public Developer(String name, int employeeId, double salary,
            String programmingLanguage) {

        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void show() {
        System.out.println("Programming Language: "
                + programmingLanguage);
    }
}


// Hierarchical Inheritance
class HRManager extends Employee {

    HRManager(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    void handleHRDuties() {
        System.out.println("Handling HR duties");
    }
}


// Multilevel Inheritance
class CEO extends Executive {

    CEO(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    void leadCompany() {
        System.out.println("CEO is leading the company");
    }
}


// Multilevel Inheritance
class HRDirector extends HRManager {

    HRDirector(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    void manageHRDept() {
        System.out.println("Managing HR department");
    }
}


// Interface for Sales
interface SalesRole {
    void boostSales();
}


// Interface for Marketing
interface MarketingRole {
    void createMarketingStrategy();
}


// Multiple Inheritance using Interfaces
class BusinessDevelopmentManager extends Employee
        implements SalesRole, MarketingRole {

    BusinessDevelopmentManager(
            String name,
            int employeeId,
            double salary) {

        super(name, employeeId, salary);
    }

    @Override
    public void boostSales() {
        System.out.println(
                "Business Development Manager is boosting sales");
    }

    @Override
    public void createMarketingStrategy() {
        System.out.println(
                "Business Development Manager is creating marketing strategy");
    }

    void coordinateBusinessDevelopment() {
        System.out.println(
                "Coordinating business development");
    }
}


// Interface for Project Manager
interface ProjectManager {
    void manageProject();
}


// Interface for Team Lead
interface TeamLead {
    void leadTeam();
}


// Multiple Inheritance using Interfaces
class TechLead extends Employee
        implements ProjectManager, TeamLead {

    TechLead(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    @Override
    public void manageProject() {
        System.out.println("Tech Lead is managing project");
    }

    @Override
    public void leadTeam() {
        System.out.println("Tech Lead is leading team");
    }

    void displayInfo() {
        System.out.println("Tech Lead: " + name);
    }
}