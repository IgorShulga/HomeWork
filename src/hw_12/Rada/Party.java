package hw_12.Rada;

import java.util.List;
import java.util.Objects;

public class Party {
    private List<Deputy> deputies;

    public Party(List<Deputy> deputies) {
        this.deputies = deputies;
    }

    public List<Deputy> getDeputies() {
        return deputies;
    }

    public void setDeputies(List<Deputy> deputies) {
        this.deputies = deputies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Party party = (Party) o;

        return Objects.equals(deputies, party.deputies);
    }

    @Override
    public int hashCode() {
        return deputies != null ? deputies.hashCode() : 0;
    }

    @Override
    public String toString() {
        return deputies + "\n";
    }
}
