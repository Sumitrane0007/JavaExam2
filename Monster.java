public class Monster {
    String monstername;

    public Monster(String name)
    {
        monstername = name;
    }

    public void display()
    {
        System.out.println(monstername+" is coming...........");
    }

    public void attack()
    {
        System.out.println("You are attacked by "+monstername+" Run away........");
    }
}
