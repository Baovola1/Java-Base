package streams;

public class Films {

	private String titre;
    private String realisateur;
    private String genre;
    private int anneeDeSortie;

    
    public Films(String titre, String realisateur, String genre, int anneeDeSortie) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.genre = genre;
        this.anneeDeSortie = anneeDeSortie;
    }
    
    public String getTitre() {
        return titre;
    }
    
    public String getRealisateur() {
        return realisateur;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public int getAnneeSortie() {
        return anneeDeSortie;
    }
}
