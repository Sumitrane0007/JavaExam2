public class MonsterTester {
    public static void main(String args[]) 
    {
        FireMonster f1 = new FireMonster("Agnisur");
        f1.display();
        f1.attack();

        StoneMonster s1 = new StoneMonster("Panisur");
        s1.display();
        s1.attack();

        WaterMonster w1 = new WaterMonster("Panisur");
        w1.display();
        w1.attack();
    }
}
