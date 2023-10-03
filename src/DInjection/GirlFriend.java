package DInjection;

public class GirlFriend {
    private Boyfriend boyfriend;

    public GirlFriend(Boyfriend boyfriend){
        this.boyfriend = boyfriend;
    }
    public void spend(){
        boyfriend.spend();
    }
}
