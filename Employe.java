public class Employe {
    private String nomEmploye;
    private int salaire;
    private String dateEmbauche;
    private int heureTravail;
    private int bonus;
    private int heureSupp;
    private String role;

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(String dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public int getHeureTravail() {
        return heureTravail;
    }

    public void setHeureTravail(int heureTravail) {
        this.heureTravail = heureTravail;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getHeureSupp() {
        return heureSupp;
    }

    public void setHeureSupp(int heureSupp) {
        this.heureSupp = heureSupp;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void calcSalaire(){
        int bonus = getBonus();
        int heureSupp = getHeureSupp();
        int heureTrv = getHeureTravail();
        String role = getRole();
        int salaire = 0;
        int salaireRole = 0;
        switch(role){
            case "ingénieur":
                salaireRole = 500;
            case "technicien":
                salaireRole = 200;
            case "directeur":
                salaireRole = 1000;
            }
        salaire += 100 * heureSupp + bonus + salaireRole * heureTrv;
        setSalaire(salaire);
    }
}
