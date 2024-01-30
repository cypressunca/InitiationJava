package zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooKeeper {
    private Zoo zoo;

    public ZooKeeper(Zoo zoo) {
        this.zoo = zoo;
    }

    // Méthode pour récupérer les animaux, les appeler, comparer avec une liste de référence
    // et renvoyer le résultat de la comparaison avec la liste de référence.


    public boolean callAnimals() {
        Animal[] list = zoo.listAnimals().toArray(new Animal[0]);
        String[] criRecu = new String[10];
        int index = 0;
        for (Animal animal : list) {
            String cri = animal.crier();
            criRecu[index++] = cri;
        }



        // comparer les 2 listes
        // a partir de quel  indice j ai des chaines vides
        // comparer les tailles des 2 listes

        return compareAnimalLists(criRecu);


    }


    private boolean compareAnimalLists(String[] criRecu) {
        String[] refList = getReferenceList();
        // 1  - trouver taille reeflle criRecu
        int index = 0;
        for(int i=0;i<criRecu.length;i++){
            if(criRecu[i]!=null)
                index++;
        }
        System.out.println("index trouvé"+index);
        return refList.length == index;
    }

    private String[] getReferenceList() {
        String[] list = {"coincoin", "grrrr", "waouf"};
        return list;
    }
}
