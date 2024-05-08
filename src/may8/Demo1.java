package may8;

import java.util.Scanner;

interface Company {
    void pf();
}

abstract class Emp {
    int id, age;
    String name;
    int salary;
    String desig;

    Emp() {
        Scanner sc = new Scanner(System.in);
       
        System.out.println(" Enter ID : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println(" Enter Name : ");
        name = sc.nextLine();
        System.out.println(" Enter Age : ");
        age = sc.nextInt();
    }

    public void display() {
        System.out.println(" Hi ID " + id);
        System.out.println(" My Name : " + name);
        System.out.println(" Hi AGE " + age);
        System.out.println(" My Salary : " + salary);
        System.out.println(" My Designation : " + desig);
    }

    abstract void raiseSalry();

}

final class Manager extends Emp implements Company {
    Manager() {
        salary = 800000;
        desig = "Manager";
    }

    void raiseSalry() {
        salary = (salary + (salary * 20) / 100);
    }

    public void pf() {
        System.out.println("Manger pf is 12000");
    }
}

final class Tester extends Emp implements Company {

    Tester() {
        salary = 300000;
        desig = "Tester";
    }

    void raiseSalry() {
        salary = (salary + (salary * 12) / 100);
    }

    public void pf() {
        System.out.println("Tester pf is 2000");
    }

}

final class Dev extends Emp implements Company {

    Dev() {
        salary = 60000;
        desig = "Developer";
    }

    void raiseSalry() {
        salary = (salary + (salary * 15) / 100);
    }

    public void pf() {
        System.out.println("Dev pf is 123039");
    }
}

final class Clerk extends Emp implements Company {

    Clerk() {
        salary = 20000;
        desig = "Clerk";
    }

    void raiseSalry() {
        salary = (salary + (salary * 7) / 100);
    }

    public void pf() {
        System.out.println("clerk pf is 23000");
    }
}

public class Demo1 {
    public static void main(String args[]) {
        int ch1, ch2 = 0;
        Tester t = null;
        Manager m = null;
        Clerk c = null;
        Dev d = null;
        do {
            System.out.println("1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the choice :");
            ch1 = sc.nextInt();

            if (ch1 == 1) {
                do {
                    System.out.println("1) Developer");
                    System.out.println("2) Clerk");
                    System.out.println("3) Manager");
                    System.out.println("4) Tester");

                    System.out.println("5) Exit");

                    System.out.print("Enter the choice :");
                    ch2 = sc.nextInt();

                    if (ch2 == 1) {
                        d = new Dev();
                    }
                    if (ch2 == 2) {
                        c = new Clerk();
                    }
                    if (ch2 == 3) {
                        m = new Manager();
                    }
                    if (ch2 == 4) {
                        t = new Tester();
                    }
                } while (ch2 < 5);
            }
            if (ch1 == 2) {
                // System.out.println("Raise Salary .............!");
                System.out.println("1. Display for Manager");
                System.out.println("2. Display for Clerk");
                System.out.println("3. Display  for Developer");
                System.out.println("4. Display for tester");

                int ch4 = 0;
                // Scanner sc = new Scanner(System.in);
                ch4 = sc.nextInt();
                if (ch4 == 1) {
                    if (m != null) {
                        m.display();
                        m.pf();
                    } else
                        System.out.println("Manager not created yet");
                } else if (ch4 == 2) {
                    if (c != null) {
                        c.display();
                        c.pf();
                    } else
                        System.out.println("Clerk not created yet");
                } else if (ch4 == 3) {
                    if (d != null) {
                        d.display();
                        d.pf();
                    } else
                        System.out.println("developer not created yet");
                } else {
                    if (t != null) {
                        t.pf();
                        t.display();
                    } else
                        System.out.println("Tester not created yet");
                }
            }
            if (ch1 == 3) {
                System.out.println("Raise Salary .............!");
                System.out.println("1. Raise salary for Manager");
                System.out.println("2. Raise salary for Clerk");
                System.out.println("3. Raise salary for Developer");
                System.out.println("4. Raise salary for tester");

                // int ch3 = 0;
                int ch5 = 0;
                ch5 = sc.nextInt();
                if (ch5 == 1) {
                    if (m != null)
                        m.raiseSalry();
                    else
                        System.out.println("Manager not created yet");
                } else if (ch5 == 2) {
                    if (c != null)
                        c.raiseSalry();
                    else
                        System.out.println("Clerk not created yet");
                } else if (ch5 == 3) {
                    if (d != null)
                        d.raiseSalry();
                    else
                        System.out.println("developer not created yet");
                } else {
                    if (t != null)
                        t.raiseSalry();
                    else
                        System.out.println("Tester not created yet");
                }

            }
            if (ch1 == 4) {
                System.out.println("Thank You");
                System.exit(0);
            }

        } while (ch1 != 4);

    }
}