public class Father extends Human{
    private int numberOfChildren;
    private  String jobType;



    public Father(String name,int numberOfChildren,String job){
        super(name);
        this.numberOfChildren = numberOfChildren;
        this.jobType = job;

    }
    public int getNumberOfChildren() {
        return numberOfChildren;
    }
    public String getJobType() {
        return this.jobType;
    }
    public void eat(){
        System.out.println("Father eats so fast ");
    }
    public void talk(){
        System.out.println("father talks very fast");
    }





}

