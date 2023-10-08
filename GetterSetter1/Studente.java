package GetterSetter.GetterSetter1;

public class Studente {
    public String nome;
    public String cognome;
    public int id;

    Studente(String nome, String cognome, int id) {
        this.nome=nome;
        this.cognome=cognome;
        this.id= id;
    }


    @Override
    public String toString() {
        return "student{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", id=" + id +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
    /*Scrivere un programma che contenga una classe che definisce uno Studente che abbia come proprietà nome, cognome ed identificativo.
        Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
        Nel main dichiarare un oggetto di tipo Studente.*/