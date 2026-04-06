public class CelsiusRankine implements Conversor {
    
    @Override
    public double converte(double origem) {
        return (origem * 1.8) + 491.67;
    }

    @Override
    public String nomeOrigem() {
        return "Celsius";
    }

    @Override
    public String nomeDestino() {
        return "Rankine";
    }

    @Override
    public String simboloOrigem() {
        return "C";
    }

    @Override
    public String simboloDestino() {
        return "R";
    }
}