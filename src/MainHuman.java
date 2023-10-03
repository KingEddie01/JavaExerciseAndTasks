import java.math.BigDecimal;

public class MainHuman {
    public static void main(String[] args) {
        Human human = new Human("DInjection.Edmund");
        human.setName("DInjection.Edmund");
        String humanName = human.getName();
        Doctor doctor = new Doctor("Eddie");
        doctor.eat();
        Father father = new Father("Eddie",4,"GOLD SELLER");
        father.talk();
        doctor.work();
        doctor.setSalary(15000.00);
        double salary = doctor.getSalary();
        String jobType = father.getJobType();
        int childrenNumber = father.getNumberOfChildren();
        father.setStatus("married");
        doctor.setAge(40);
        String name = father.getName();
        System.out.println("father is "+ father.getStatus());
        System.out.println("doctor is "+ doctor.getAge()+"years "+"old");
        father.setGender("male");
        doctor.setGender("male");
        System.out.println("Doctor and Father are bother "+ father.getGender());
        System.out.printf("%.2f",salary);
        System.out.print("\n"+jobType);
        System.out.println("\n"+childrenNumber);
        System.out.println(humanName);
        System.out.println(name);

    }

}
