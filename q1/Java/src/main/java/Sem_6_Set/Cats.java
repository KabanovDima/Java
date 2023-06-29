package Sem_6_Set;

import java.util.Objects;

public class Cats {
    private String name;
    private String colour;
    private String breed;

    public Cats(String name, String colour, String breed) {
        this.name = name;
        this.colour = colour;
        this.breed = breed;
    }

    public Cats() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cats cats = (Cats) o;
        return Objects.equals(name, cats.name) && Objects.equals(colour, cats.colour) && Objects.equals(breed, cats.breed);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, colour, breed);
    }

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
