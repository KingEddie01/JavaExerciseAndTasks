public class Human {
    private String name;
    private String gender;
    private int age;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus(   ) {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    public void eat(){
        System.out.println(" He is eating");
    }
    public void talk(){
        System.out.println("he is talking");
    }
}
