import java.util.*;

public class GestionnaireEmploye {
    List<Employe> list = new ArrayList<Employe>();
    public void addEmploye(Employe emp){
        list.add(emp);
    }
    public void rmvEmploye(String empNm){
        for (Employe emp: list) {
            String name = emp.getNomEmploye();
            if (Objects.equals(empNm, name)){
                list.remove(emp);
            } else {
                System.out.println("Cet employé n'existe pas");
            }

        }
    }
    public void listEmploye(){
        for (Employe emp: list){
            String nomEmp = emp.getNomEmploye();
            int salaireEmp = emp.getSalaire();
            String dateEmp = emp.getDateEmbauche();
            System.out.println("Nom de l'employé: " + nomEmp);
            System.out.println("Salaire de l'employé: " + salaireEmp);
            System.out.println("Date d'embauche: " + dateEmp);
            System.out.println("--------------------------");
        }
    }
}
