public class App {
    public static void main(String[] args) throws Exception {

        CalcularPagamento calculadora = new CalcularPagamento();


        EstrategiaCashback estrategia = CashBackFatory.obterEstrategia("VIP", true);

        // Se fosse uma promoção sustentável, bastaria trocar a instância:
        // estrategia = new CashbackSustentavel();

        double resultado = calculadora.processarCashBack(1090.0, estrategia);

        System.out.println("O valor do cashback é: R$" + resultado);

    }
}
