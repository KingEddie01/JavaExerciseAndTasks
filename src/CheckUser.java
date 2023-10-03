import java.util.ArrayList;
import java.util.List;

public class CheckUser {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Eddie");
        user.setLastName("Udeh");
        String message = user.output();
        System.out.println(message);
        System.out.println(user.getFullName());

        List<User> info = new ArrayList<>();

        String[] firstname = {"james","tony","Caleb","Bright"};
        String[] lastname = {"udeh", "Oti","Okoro", "Femi"};

        for (int count = 0; count< firstname.length; count++){
            User new_User = new User();
            new_User.setFirstName(firstname[count]);
            new_User.setLastName(lastname[count]);
            info.add(new_User);
        }
        for (User names : info){
            System.out.println(names.getFullName() + " ");
        }
        CheckUser cu = new CheckUser();
        cu.printInfo(info.get(0));
    }
    public void printInfo(User value){
        System.out.println(value.getFullName());
    }
}
