
package sueldosdevendedores;

import ENTIDADES.vendedor;
import Servicio.vendedorServicio;


public class SueldosDeVendedores {

  
    public static void main(String[] args) {
            vendedorServicio vs = new vendedorServicio();
            vendedor v1= vs.altaVendedor();
            vs.sueldoMensual(v1);
            vs.vacaciones(v1);
            
            
            
    }
    
}
