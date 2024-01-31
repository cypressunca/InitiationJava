package zoo;

import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooKeeper {
    private Zoo zoo;

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    private String name;

    public ZooKeeper(Zoo zoo) {
        this.zoo = zoo;
    }



    // Méthode pour récupérer les animaux, les appeler, comparer avec une liste de référence
    // et renvoyer le résultat de la comparaison avec la liste de référence.


    public boolean callAnimals() {
        List<Animal> list = zoo.listAnimals();
        System.out.println("animalsList:"+  list);
        List<String> criRecu = new ArrayList<>();

        for (Animal animal : list) {
            String cri = animal.crier();
            criRecu.add(cri);
        }

        System.out.println("crIrecu ="+ criRecu);
        // comparer les 2 listes
        // a partir de quel  indice j ai des chaines vides
        // comparer les tailles des 2 listes

        return compareAnimalLists(criRecu);

    }


    private boolean compareAnimalLists(List<String> criRecu) {
     //   public static void compareAnimalLists(List<String> criRecu) {
     //   List<String> refList = getReferenceList();
        Map<String, Integer> animalSounds = new HashMap<>();

        // Ajouter des cris d'animaux à la Map
        animalSounds.put( "Roar",1);
        animalSounds.put( "CoinCoin",1);
        animalSounds.put("waouf", 1);
        //animalSounds.put("Cat", "Meow");

        Map<String,Integer> crisRecusMap = new HashMap<>();
        for(String cri:criRecu){
            if(crisRecusMap.containsKey(cri)){
                System.out.println(cri + " already in map");
                int oldValue = crisRecusMap.get(cri);
                oldValue++;
                crisRecusMap.put(cri,Integer.valueOf(oldValue));
            }
            else{
                crisRecusMap.put(cri,1);
            }
        }
        System.out.println("CrisRecusMap :"+ crisRecusMap);
        System.out.println("AnimalSoundsMap :"+ animalSounds);
        return Maps.difference(animalSounds,crisRecusMap).areEqual();//animalSounds.equals(crisRecusMap);

    }

//    private List<String> getReferenceList() {
//        List<String> list = new ArrayList<>();
//        list.add("coincoin");
//        list.add( "grrrr");
//        list.add( "waouf");
//        return list;
//    }
}
