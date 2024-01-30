package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> liveAnimals;
    private int addedAnimals;

    public Zoo(){
        System.out.println("Zoo is up & ready  but empty\n Please add animals..");
        liveAnimals=new ArrayList<>();
    }

    public void addAnimal(Animal a){
        System.out.println("adding into the zoo : " + a.toString());
        liveAnimals.add(a);
    }

    public List<Animal> listAnimals(){
        return liveAnimals;
    }


}