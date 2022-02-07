public class PersonnageService {
    public static void main(String[] args) {
        Personnage p1 = new Personnage();
        Personnage p2 = new Personnage();
        Personnage p3 = new Personnage();

        p2.attaque(p1);
        p1.attaque(p2);
        p1.attaque(p2);


        System.out.println("p1 : " + p1.toString());
        System.out.println("p2 : " + p2.toString());

        p2.soigne(p1);
        p1.soigne(p2);
        p3.soigne(p1);
        System.out.println("============================");
        System.out.println("p1 : " + p1.toString());
        System.out.println("p2 : " + p2.toString());
    }
}
