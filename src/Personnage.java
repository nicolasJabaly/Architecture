public class Personnage {
    private Vie vie;
    private Niveau niveau;

    public Personnage() {
        this.vie = new Vie(PersonnageDAOConstante.POINT_DE_VIE);
        this.niveau = new Niveau(PersonnageDAOConstante.NIVEAU);
    }

    public Personnage(Vie vie, Niveau niveau) {
        this.vie = vie;
        this.niveau = niveau;
    }


    public void attaque(Personnage personnage) {
        Vie vie = personnage.vie;
        if (!this.equals(personnage) && !vie.estMort() && !this.vie.estMort()) {
            this.niveau.infligerDegat(vie);
            estMort(vie);
        }
    }

    private void estMort(Vie vie) {
        if (vie.estMort()) {
            this.niveau.niveauDessus();
        }
    }

    public void soigne(Personnage personnage) {
        Vie vie = personnage.vie;
        if (!this.equals(personnage) && !vie.estMort() && !this.vie.estMort()) {
            this.niveau.soigner(vie);
        }
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "vie=" + vie.toString() +
                ", niveau=" + niveau.toString() +
                '}';
    }
}
