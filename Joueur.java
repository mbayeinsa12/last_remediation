public abstract class Joueur {
    protected String nom;
    protected int score;
    
    public abstract Position choisirCase(Grille grille);
    
    public void ajouterPoints(int points) {
        score += points;
    }
}

