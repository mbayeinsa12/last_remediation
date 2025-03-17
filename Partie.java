import java.util.ArrayList;  
import java.util.List; 

public class Partie {
    private Grille grille;
    private Joueur joueur1;
    private Joueur joueur2;
    private int scoreJoueur1;
    private int scoreJoueur2;
    private List<Coup> coupsJoues;
    
    // Constructeur
    public Partie(Joueur joueur1, Joueur joueur2, Grille grille) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.grille = grille;
        this.scoreJoueur1 = 0;
        this.scoreJoueur2 = 0;
        this.coupsJoues = new ArrayList<>();
    }
    
}

