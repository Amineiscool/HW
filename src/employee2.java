public class employee2 extends Employee1{
    private double wage;
    private String position;

public class employee2(String name, int age, int position){
    super(name , age);
    setPosition(position);
    setWage (position);
}
    public double getWage(){

        return wage;
    }
    public void setWage (int position){
       if(position == 1){
           wage =75;
       }
else if (position == 2) {
    wage = 50;
       }

    }
    public String getPosition(){

        return position;
    }
    public void setPosition (int position){
        if(position == 1){
          this.position ="employee1 mike";
        }
        else if (position == 2) {
         this.position = "employee2 jane ";
        }



    }

    }