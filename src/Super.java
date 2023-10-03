public class Super extends Person{
    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    private String power;
    public Super(String name, int age, String power){
        super(name, age);
        this.power = power;
    }
}
