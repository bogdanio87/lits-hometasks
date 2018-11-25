package module;

import java.util.ServiceLoader;
import java.lang.Runtime;

public class Browser {
    private int Identificator;
    private Browser(int Identificator) {
        this.Identificator = Identificator;
    }
    public int getIdentificator() {
        return this.Identificator;
    }
    public void setIdentificator(int Identificator) {
        this.Identificator = Identificator;
    }
    Browser Chrome = new Browser(1);
    Browser FF = new Browser(2);



}
