package ValueObjects;

public class Nome {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome.trim();
        if (nome.contains(" ")) {
            this.nome = nome;
        }
        else {
            throw new RuntimeException("Insira um nome completo");
        }
    }
}
