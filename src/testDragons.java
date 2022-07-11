public class testDragons {
    public static void main(String[] args){
        Dragon a = new Dragon("Azathot","Wesh bro !",20,10,5);
        Dragon b = new Dragon("Shub-Niggurath","Yala !",100,30,10);
        a.scream();
        a.attackAnother(b);
        b.attackAnother(a);
        System.out.println(a);
    }

}
