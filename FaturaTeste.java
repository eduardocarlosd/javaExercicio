public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura(1, "Ceular", 1, 2.111);
        System.out.println("Número: " + fatura1.getNumero());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preço " + fatura1.getPreco() + " reais");
        System.out.println("A fatura é: " + fatura1.getTotalFatura() + " reais");
    }
}
