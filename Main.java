//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona[] persone = new Persona[100];

        persone[0] = new Persona("Mario", "Rossi", "1", 1950);
        persone[1] = new Persona("Carla", "Rossi", "2", 1990);
        persone[2] = new Studente("Giovanni", "Bianchi", "3", 1995, "UNITN", TM.LT);
        persone[3] = new Studente("Anna", "Bianchi", "4", 1990, "UNIPD", TM.LM);
        persone[4] = new Atleti("Giacomo", "Verdi", "5", 1992, "nuoto", TipoDisciplina.NAZIONALE);
        persone[5] = new Atleti("Alice", "Verdi", "6", 1967, "curling", TipoDisciplina.INTERNAZIONALE);

        System.out.println(" ");
        System.out.println("=== ABBONATI - TUTTI ===");
        for (int i = 0; i < 6; i++) {
            if (persone[i] instanceof Atleti) {
                if (((Atleti) persone[i]).disciplina == TipoDisciplina.INTERNAZIONALE) {
                    System.out.println(persone[i]);
                } else {
                    System.out.println(persone[i]);
                }
            } else if (persone[i] instanceof Studente) {
                if (((Studente) persone[i]).tipoCorso == TM.LT) {
                    System.out.println(persone[i]);
                } else {
                    System.out.println(persone[i]);
                }
            } else {
                System.out.println(persone[i]);
            }
        }
        System.out.println(" ");
        System.out.println("=== ABBONATI - STUDENTI ===");
        for (int i = 0; i < 6; i++) {
            if (persone[i] instanceof Studente) {
                if (((Studente) persone[i]).tipoCorso == TM.LT) {
                    System.out.println(persone[i]);
                } else {
                    System.out.println(persone[i]);
                }
            }
        }

        System.out.println(" ");
        System.out.println("=== ABBONATI - ATLETI ===");
        for (int i = 0; i < 6; i++) {
            if (persone[i] instanceof Atleti) {
                if (((Atleti) persone[i]).disciplina == TipoDisciplina.INTERNAZIONALE) {
                    System.out.println(persone[i]);
                } else {
                    System.out.println(persone[i]);
                }
            }
        }
    }
}