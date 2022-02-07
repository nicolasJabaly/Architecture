public class Niveau {
    private int niveau;

    public Niveau(int niveau) {
        this.niveau = niveau;
    }

    public void infligerDegat(Vie vie) {
        vie.degatRecu(this.niveau);
    }

    public void soigner(Vie vie) {
        vie.soigner(this.niveau);
    }

    public void niveauDessus() {
        this.niveau += 1;
    }

    @Override
    public String toString() {
        return "Niveau{" +
                "niveau=" + niveau +
                '}';
    }
}
