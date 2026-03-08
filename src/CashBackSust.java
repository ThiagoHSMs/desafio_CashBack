public class CashBackSust implements EstrategiaCashback {
    
    @Override
    public double calcular(double valor){
        return valor * 0.1;
    }
}
