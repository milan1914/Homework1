package HomeWork5;

public class Breed {
    private String breedName;

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        if (!breedName.isEmpty()) {
            this.breedName = breedName;
        } else {
            System.out.println("Invalid Data!");
        }
    }
    public Breed(String breedName) {
        setBreedName(breedName);
    }
}
