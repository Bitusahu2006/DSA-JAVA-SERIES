public class Main {

    public static void main(String[] args) {

        // Employee
        System.out.println("----- Employee -----");

        Employee e = new Employee(
                "Rahul", 101, 50000);

        e.display();


        // Sales Manager
        System.out.println("\n----- Sales Manager -----");

        SalesManager sm = new SalesManager(
                "Amit", 102, 70000);

        sm.display();
        sm.boostSales();


        // Marketing Manager
        System.out.println("\n----- Marketing Manager -----");

        MarketingManager mm = new MarketingManager(
                "Priya", 103, 75000);

        mm.display();
        mm.createMarketingStrategy();


        // Executive
        System.out.println("\n----- Executive -----");

        Executive ex = new Executive(
                "Rohit", 104, 90000);

        ex.display();
        ex.makeExecutiveDecision();


        // Developer
        System.out.println("\n----- Developer -----");

        Developer d = new Developer(
                "Bitu", 105, 80000, "Java");

        d.display();
        d.show();


        // CEO
        System.out.println("\n----- CEO -----");

        CEO ceo = new CEO(
                "Raj", 106, 150000);

        ceo.display();
        ceo.makeExecutiveDecision();
        ceo.leadCompany();


        // HR Manager
        System.out.println("\n----- HR Manager -----");

        HRManager hr = new HRManager(
                "Neha", 107, 70000);

        hr.display();
        hr.handleHRDuties();


        // HR Director
        System.out.println("\n----- HR Director -----");

        HRDirector hrd = new HRDirector(
                "Pooja", 108, 110000);

        hrd.display();
        hrd.handleHRDuties();
        hrd.manageHRDept();


        // Business Development Manager
        System.out.println(
                "\n----- Business Development Manager -----");

        BusinessDevelopmentManager bdm =
                new BusinessDevelopmentManager(
                        "Karan", 109, 95000);

        bdm.display();
        bdm.boostSales();
        bdm.createMarketingStrategy();
        bdm.coordinateBusinessDevelopment();


        // Tech Lead
        System.out.println("\n----- Tech Lead -----");

        TechLead tl = new TechLead(
                "Arjun", 110, 120000);

        tl.display();
        tl.manageProject();
        tl.leadTeam();
        tl.displayInfo();
    }
}