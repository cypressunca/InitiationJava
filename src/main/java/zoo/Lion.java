package zoo;

public class Lion extends Animal {
    public Lion(String name, int weightPounds, int ageYears) {
        super(name, weightPounds, ageYears);
        // add others things
    }


    public String crier(){
        return "Roar";
    }
}