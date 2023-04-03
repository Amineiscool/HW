public class Salary extends Employee2 {
    private double time;
    private double salary;

    public Salary(String name, int age, String position, double time) {
        super(name, age, position);
        setTime(time);
        setSalary();
    }

    public void displayInfo() {
        System.out.println("**********");
        System.out.println("name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("position: " + getPosition());
        System.out.println("wage: " + getWage());
        System.out.println("Time: " + getTime());
        System.out.println("Salary: " + getSalary());
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        salary = getTime() * getWage();
    }
}
