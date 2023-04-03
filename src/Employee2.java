public class Employee2 extends Employee1 {
    private double wage;
    private String position;

    public Employee2(String name, int age, String position) {
        super(name, age);
        setPosition(position);
        setWage(position);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(String position) {
        if (position.equals("employee1")) {
            wage = 75.0;
        } else if (position.equals("employee2")) {
            wage = 50.0;
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position.equals("employee1")) {
            this.position = "employee1 mike";
        } else if (position.equals("employee2")) {
            this.position = "employee2 jane";
        }
    }
}
