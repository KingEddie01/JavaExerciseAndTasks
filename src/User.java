public class User {
    private String firstName;
    private String lastName;
    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }

    public String output() {
        return "hi my name is " + firstName + " " + lastName;
        }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setFirstName(String name){
       firstName = name;
    }
    public void setLastName(String lastN){
        lastName = lastN;
    }

}
