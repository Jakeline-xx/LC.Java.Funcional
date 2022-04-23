package exercicioBrinquedo;

@FunctionalInterface
public interface Brinquedo {
        boolean validaEntrada(String brinquedo, int idade, float altura);
}
