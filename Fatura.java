public class Fatura {

    private int numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public int getNumero() {
        return numero;
    }

    public void setNumero() {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Fatura (int numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public double getTotalFatura () {
        double total = this.quantidade * this.preco;
        if (total < 0) {
            total = 0.0;
        }
        return total;
    }

    public void quantidade () {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    public void preco () {
        if (preco > 0.0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;
        }
    }
}
