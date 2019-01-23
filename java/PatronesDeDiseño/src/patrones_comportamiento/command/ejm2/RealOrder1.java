
package patrones_comportamiento.command.ejm2;

/**
 *
 * @author User
 */
public class RealOrder1 implements Order{
    private Receiver1 receive1;

    public RealOrder1(Receiver1 receiver1) {
        this.receive1=receiver1;
    }
    
    @Override
    public void execute() {
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public void icon() {
    }
    
}
