
public class CalcularPagamento {
    
    public double processarCashBack(double valor, EstrategiaCashback estrategia){
        if(estrategia == null) {
            throw new IllegalArgumentException("Estrategia de cashback nao definida");
        }
        return estrategia.calcular(valor);    

    }
}