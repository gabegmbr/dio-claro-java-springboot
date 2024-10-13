package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazySingleton = SingletonLazy.getInstance();
        System.out.println(lazySingleton);
        lazySingleton = lazySingleton.getInstance();
        System.out.println(lazySingleton);

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "13513452");
    }
}
