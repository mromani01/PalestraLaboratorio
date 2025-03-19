public class Studente extends Persona {
    String uniProvenienza;
    TM tipoCorso;

    public Studente(String nome, String cognome, String codiceFiscale, int annoNascita, String uniProvenienza, TM tipoCorso) {
        super(nome, cognome, codiceFiscale, annoNascita);
        this.uniProvenienza = uniProvenienza;
        this.tipoCorso = tipoCorso;
    }

    public double PrezzoScontato(){
        if(tipoCorso == TM.LT){
            return prezzo*0.6;
        }else{
            return prezzo*0.8;
        }
    }

    public String toString() {
        if(tipoCorso == TM.LT){
            return getCognome() + " " + getNome() + " " + getCodiceFiscale() + " " + annoNascita + " " + uniProvenienza +" LT | tariffa: " + PrezzoScontato();
        }else{
            return getCognome() + " " + getNome() + " " + getCodiceFiscale() + " " + annoNascita + " " + uniProvenienza +" LM | tariffa: " + PrezzoScontato();
        }
    }
}
