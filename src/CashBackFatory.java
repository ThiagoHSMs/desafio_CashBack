public class CashBackFatory {
    public static EstrategiaCashback obterEstrategia(String tipo, boolean isSustentavel){
        if(isSustentavel){
            return new CashBackSust();
        }
        
        return switch (tipo.toUpperCase()){
            case "VIP" -> new CashBackVip();
            case "COMUM" -> new CashBackComun();
            case "BLACK" -> new CashBackBlackF();
            default -> throw new IllegalArgumentException("Tipo de cliente desconhecido");

        };
    }

    
}
