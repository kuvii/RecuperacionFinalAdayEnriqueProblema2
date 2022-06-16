public class Main{


    public static void main(String[] args) {
        DragonFly dragonFly = new DragonFly();

        System.out.println(dragonFly.energyLevel());
        dragonFly.move();
        dragonFly.move();
        dragonFly.move();
        dragonFly.move();
        dragonFly.move();
        dragonFly.recharge();
        dragonFly.status();
        dragonFly.returnHome();
    }


}
