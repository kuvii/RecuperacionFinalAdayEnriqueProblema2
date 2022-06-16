public class DragonFly implements Drone{

    String matricula = "TF 800";
    float energyDelta = 50f;
    int movementCount = 0;
    float maxENERGY = 1000f;
    float energy = maxENERGY;

    @Override
    public float energyLevel() {
        return energy;
    }

    @Override
    public void recharge() {
        energy = maxENERGY;
    }

    @Override
    public void move() {
        if (energy >= energyDelta){
            System.out.println("Moviendo...");
            energy -= energyDelta;
            movementCount++;
        } else {
            System.out.println("No hay bateria, recargar");
        }
    }

    @Override
    public String status() {
        return "El vehiculo " + matricula + " tiene un nivel de carga de: " + energy + " y se ha movido  " + movementCount + " veces";
    }

    @Override
    public void returnHome() {
        for (int i = 0; i < movementCount; i++) {
            if (energy >= energyDelta){
                System.out.println("Volviendo a casa");
            } else {
                System.out.println("Cataploff, ya no tienes dron");
            }
        }
    }
}
