package exercicioBrinquedo;

public class AcessoBrinquedo implements Brinquedo {
    @Override
    public boolean validaEntrada(String brinquedo, int idade, float altura) {
        if (brinquedo.equals("Montanha Russa") && idade > 16 && altura > 1.55) return true;
        if (brinquedo.equals("Carrossel") && idade > 6 && altura > 1.30) return true;
        if (brinquedo.equals("Roda Gigante")) return true;
        return false;
    }
}
