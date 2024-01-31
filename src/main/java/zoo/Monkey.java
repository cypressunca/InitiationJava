package zoo;

public class Monkey extends Animal {

    public Monkey(String name, int weightPounds, int ageYears) {
        super(name, weightPounds, ageYears);
    }

    @Override
    public String crier() {
        return "waouf";
    }
}