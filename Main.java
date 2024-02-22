import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Salut! Que voulez-vous faire?");
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        GestionnaireEmploye gst = new GestionnaireEmploye();
        while (!quit){
            System.out.println("1. Ajouter un employé dans la base de données");
            System.out.println("2. Supprimer un employé de la base de données");
            System.out.println("3. Lister les employés");
            System.out.println("4. Quitter");
            String opt = scan.nextLine();
            switch(opt){
                case "1":
                    Employe emp = new Employe();
                    System.out.println("Nom de l'employé:");
                    String nomEmp = scan.nextLine();
                    emp.setNomEmploye(nomEmp);
                    System.out.println("Date d'embauche:");
                    String dateEmp = scan.nextLine();
                    emp.setDateEmbauche(dateEmp);
                    System.out.println("Rôle:");
                    String roleEmp = scan.nextLine();
                    emp.setRole(roleEmp);
                    System.out.println("Heures de travail:");
                    int heureTrv = Integer.parseInt(scan.nextLine());
                    emp.setHeureTravail(heureTrv);
                    System.out.println("Bonus:");
                    int bonus = Integer.parseInt(scan.nextLine());
                    emp.setBonus(bonus);
                    System.out.println("Heures supplémentaires:");
                    int heureSup = Integer.parseInt(scan.nextLine());
                    emp.setHeureSupp(heureSup);
                    emp.calcSalaire();
                    gst.addEmploye(emp);
                    break;
                case "2":
                    System.out.println("Quel employé voulez-vous supprimer?");
                    String empChoisi = scan.nextLine();
                    gst.rmvEmploye(empChoisi);
                    break;
                case "3":
                    gst.listEmploye();
                    break;
                case "4":
                    quit = true;
                    break;
            }
        }
    }
}