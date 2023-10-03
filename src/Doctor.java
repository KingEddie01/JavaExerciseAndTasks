public class Doctor extends Human{
    private String specialization;

    private double salary;

    public Doctor(String name) {
        super(name);
    }

    public String getSpecialization() {
        return specialization;
    }


    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void talk(){
        System.out.println("Doctor does not talk much");
    }
    public void eat(){
        System.out.println("Doctor eats moderately");
    }
    public void work(){
        System.out.println("Doctor is working in the hospital");
    }



    }

