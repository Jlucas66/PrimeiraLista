package questao01;

public class Cartas {
    private String naipe;
    private String nome;
    private int valor;

    public Cartas(String nome, String naipe, int valor){
        this.nome = nome;
        this.naipe = naipe;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaipe(){
        return naipe;
    }

    public void setNaipe(String naipe){
        this.naipe = naipe;
    }

    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }
}
