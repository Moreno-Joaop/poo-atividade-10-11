package application;

public class Main {
    public static void main(String[] args){
        PagamentoCartao pag1 = new PagamentoCartao(200, "Exemplo de Pagamento", "123454323456","Fulano de tal", "11/26", "345",2);

        pag1.exibirDetalhesPagamento();

        Priorizavel pri = pag1;
        Pagamento pag2 = pag1;  

        pri.definirPrioridade(4);

        System.out.println(pag1.obterNivelPrioridade());

        pag1.processar();

        PagamentoBoleto pag3 = new PagamentoBoleto(300, "Exemplo de pagamento");
    
        pag3.exibirDetalhesPagamento();

        Pagamento pagamentos[] = {pag1, pag3};
    
        for(Pagamento p : pagamentos) {
            System.out.println(p.getIdTransacao());
        }
    }   
}