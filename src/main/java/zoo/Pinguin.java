package zoo;

public class Pinguin extends Animal {

    public Pinguin(String name, int weightPounds, int ageYears) {
        super(name, weightPounds, ageYears);
    }

    @Override
    public String crier() {
        return "CoinCoin";
    }
}