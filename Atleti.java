public class Atleti extends Persona {
    String sportPraticato;
    TipoDisciplina disciplina;

    public Atleti(String nome, String cognome, String codiceFiscale, int annoNascita, String sportPraticato, TipoDisciplina disciplina) {
        super(nome, cognome, codiceFiscale, annoNascita);
        this.sportPraticato = sportPraticato;
        this.disciplina = disciplina;
    }

    public double PrezzoScontato(){
        if(disciplina == TipoDisciplina.INTERNAZIONALE){
            return prezzo*0.5;
        }else{
            return prezzo*0.7;
        }
    }

    public String toString() {
        if(disciplina == TipoDisciplina.INTERNAZIONALE){
            return getCognome() + " " + getNome() + " " + getCodiceFiscale() + " " + annoNascita + " " + sportPraticato + " " +  "internazionale | tariffa: " + PrezzoScontato();
        }else{
            return getCognome() + " " + getNome() + " " + getCodiceFiscale() + " " + annoNascita + " " + sportPraticato + " " +  "nazionale | tariffa: " + PrezzoScontato();
        }
    }
}
