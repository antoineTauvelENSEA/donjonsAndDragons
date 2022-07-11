public class Character {
    protected final String name;
    protected double lifePoint;
    protected double attackPoint;
    protected double defensePoint;

    public Character(String name, double lifePoint, double attackPoint, double defensePoint) {
        this.name = name;
        this.lifePoint = lifePoint;
        this.attackPoint = attackPoint;
        this.defensePoint = defensePoint;
    }

    public void attackAnother (Character c){
        if (this.lifePoint>0){
            if (this.attackPoint>c.defensePoint){
                c.sustainDamage(attackPoint);
            }
            else {
                System.out.println("No dammage done");}
        }
    }

    public void sustainDamage(double dammage){
        this.lifePoint=this.lifePoint-dammage;
        if (this.lifePoint<0) this.lifePoint=0;
        if (this.lifePoint==0){
            System.out.println("Dragon "+name+" is dead");
        }
    }
}
