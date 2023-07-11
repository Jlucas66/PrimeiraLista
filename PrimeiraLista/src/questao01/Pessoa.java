package questao01;

public abstract class Pessoa {
    private String mao;
    private String nome;
    private int cartasNaMao;

    public Pessoa(String mao, String nome, int cartasNaMao ){
        this.mao = mao;
        this.nome = nome;
        this.cartasNaMao = cartasNaMao;
    }

    public String getMao(){
        return mao;
    }

    public void setMao(String mao){
        this.mao = mao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getCartasNaMao () {
        return cartasNaMao;
    }

    public void setCartasNaMao (int cartasNaMao) {
        this.cartasNaMao = cartasNaMao;
    }
    
}
