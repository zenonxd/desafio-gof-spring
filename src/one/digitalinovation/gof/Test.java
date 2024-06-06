package one.digitalinovation.gof;

import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.singleton.SingletonEager;
import one.digitalinovation.gof.singleton.SingletonLazy;
import one.digitalinovation.gof.singleton.SingletonLazyHolder;
import one.digitalinovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        //testes relacionados a design pattern singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //estrategia
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivamente();

        Robo robo = new Robo();
        robo.setStrategy(normal);

        robo.mover();
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Olavo", "1515151");
    }
}
