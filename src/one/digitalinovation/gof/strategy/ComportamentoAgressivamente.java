package one.digitalinovation.gof.strategy;

public class ComportamentoAgressivamente implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
