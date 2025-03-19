public class Persona {
    static final double prezzo = 1000;
    private String nome;
    private String cognome;
    private String codiceFiscale;
    int annoNascita;

    public Persona(String nome, String cognome, String codiceFiscale, int annoNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.annoNascita = annoNascita;
    }

    public Persona(String nome, String cognome, int annoNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public double PrezzoScontato(){
        if(annoNascita <= 1968){
            return prezzo*0.65;
        }else{
            return prezzo;
        }
    }

    public String toString() {
        return cognome + " " + nome + " " + codiceFiscale + " " + annoNascita + " | tariffa: " + PrezzoScontato();
    }
}
