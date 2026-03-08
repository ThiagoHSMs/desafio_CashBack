public class CashBackVip implements EstrategiaCashback {
    @Override
    public double calcular(double valor){
        return valor * 0.05;
    }
}
