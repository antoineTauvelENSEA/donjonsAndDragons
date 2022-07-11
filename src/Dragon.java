public class Dragon {
    private static String name;
    private double lifePoint;
    private double attackPoint;
    private double defensePoint;
    private static String scream;

    public Dragon(String name, String scream, double lifePoint, double attackPoint, double defensePoint) {
        this.name=name;
        this.scream=scream;
        this.lifePoint = lifePoint;
        this.attackPoint = attackPoint;
        this.defensePoint = defensePoint;
    }

    public void scream(){
        System.out.println(scream);
    }

    public void sustainDamage(double dammage){
        this.lifePoint=this.lifePoint-dammage;
        if (this.lifePoint<0) this.lifePoint=0;
        if (this.lifePoint==0){
            System.out.println("Dragon "+name+" is dead");
        }
    }

    public void attackAnother (Dragon d){
        if (this.lifePoint>0){
            if (this.attackPoint>d.defensePoint){
                this.sustainDamage(attackPoint);
            }
            else {
                System.out.println("No dammage done");}
        }
    }
}
