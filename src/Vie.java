public class Vie {
    private int pointDeVie;
    private boolean enVie;

    public Vie(int pointDeVie) {
        this.enVie = true;
        this.pointDeVie = pointDeVie;
    }

    public void degatRecu(int degat) {
        this.pointDeVie -= degat * PersonnageDAOConstante.MULTIPLICATEUR_DEGAT;
    }

    public boolean estMort() {
        if (this.pointDeVie <= 0) {
            this.enVie = false;
            this.pointDeVie = 0;
            return true;
        }
        return false;
    }

    public void soigner(int soins) {
        this.pointDeVie += soins * PersonnageDAOConstante.MULTIPLICATEUR_SOINS;
        if (this.pointDeVie > PersonnageDAOConstante.POINT_DE_VIE) {
            this.pointDeVie = PersonnageDAOConstante.POINT_DE_VIE;
        }
    }

    @Override
    public String toString() {
        return "Vie{" +
                "pointDeVie=" + pointDeVie +
                ", enVie=" + enVie +
                '}';
    }
}
