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

    
}
