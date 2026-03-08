public class CashBackBlackF implements EstrategiaCashback {
    
    @Override
    public double calcular(double valor){
        return valor * 0.20;
    }
    
}
