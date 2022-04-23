package exercicioBrinquedo;

import java.util.function.BiPredicate;

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

        //LAMBDA EXPRESSION
        validaEntradaAnonima((brinquedo, idade, altura) -> {
            if (brinquedo.equals("montanha russa") && idade > 16 && altura > 1.55f) return true;
            if (brinquedo.equals("carrossel") && idade > 6 && altura > 1.30f) return true;
            if (brinquedo.equals("roda gigante")) return true;
            return false;
        });

        //BIPREDICATE
        validaAcessoMontanhaRussaBiPredicate((idade, altura) -> {
            if ((int) idade > 16 && (float) altura > 1.55f) return true;
            return false;
        });

        validaAcessoCarrosselBiPredicate((idade, altura) -> {
            if ((int) idade > 6 && (float) altura > 1.3f) return true;
            return false;
        });

        validaAcessoRodaGiganteBiPredicate((idade, altura) -> {
            return true;
        });

    }

    static void validaEntradaAnonima(Brinquedo crianca) {
        System.out.println(crianca.validaEntrada("montanha russa", 15, 1.70f));
    }

    static void validaAcessoMontanhaRussaBiPredicate(BiPredicate acessoBrinquedo) {
        System.out.println("Usando BiPredicate para validar a entrada na Montanha Russa:");
        System.out.println(acessoBrinquedo.test(18, 1.80f));
    }
    static void validaAcessoCarrosselBiPredicate(BiPredicate acessoBrinquedo) {
        System.out.println("Usando BiPredicate para validar a entrada no Carrossel:");
        System.out.println(acessoBrinquedo.test(18, 1.80f));
    }
    static void validaAcessoRodaGiganteBiPredicate(BiPredicate acessoBrinquedo) {
        System.out.println("Usando BiPredicate para validar a entrada na Roda Gigante:");
        System.out.println(acessoBrinquedo.test(18, 1.80f));
    }
}