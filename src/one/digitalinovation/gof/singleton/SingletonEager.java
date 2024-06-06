package one.digitalinovation.gof.singleton;

/**
 * Singleton "eager".
 *
 * @author zenonxd
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }


}
