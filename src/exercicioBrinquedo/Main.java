package exercicioBrinquedo;

public class Main {
    public static void main(String[] args) {

        //FORMA CONVENCIONAL

        AcessoBrinquedo crianca = new AcessoBrinquedo();
        System.out.println(crianca.validaEntrada("Montanha Russa", 17, 1.70f));

        //UTILIZANDO CLASSE ANÔNIMA
        validaEntradaAnonima(new Brinquedo() {
            @Override
            public boolean validaEntrada(String brinquedo, int idade, float altura) {
                if (brinquedo.equals("montanha russa") && idade > 16 && altura > 1.55) return true;
                if (brinquedo.equals("carrossel") && idade > 6 && altura > 1.30) return true;
                if (brinquedo.equals("roda gigante")) return true;
                return false;
            }
        });
    }
    static void validaEntradaAnonima(Brinquedo crianca) {
        System.out.println(crianca.validaEntrada("montanha russa", 15, 1.70f));
    }
}