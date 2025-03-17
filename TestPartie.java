public class TestPartie {

    public static void main(String[] args) {

        Grille grille = new Grille(5);

        JoueurHumain joueur1 = new JoueurHumain("Joueur 1");

        JoueurOrdinateur joueur2 = new JoueurOrdinateur("Ordinateur");
        
        Partie p = new Partie(joueur1, joueur2, grille);
        
    }
}


