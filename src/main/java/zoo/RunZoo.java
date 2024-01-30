package zoo;

/**
 * Runs the Zoo, instantiate objects and ask the zookeeper to  do his job...
 */

public class RunZoo {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Lion("Arthur",500,12));
        zoo.addAnimal(new Lion("Simba",250,2));
        zoo.addAnimal(new Pinguin("Tobby",12,1));

        ZooKeeper manfred = new ZooKeeper(zoo);
        boolean result =manfred.callAnimals();

        System.out.println("callAnimals returns ="+ result);
    }
}