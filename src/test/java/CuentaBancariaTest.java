
import com.mycompany.cuenta.bancaria.poo.CuentaBancaria;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class CuentaBancariaTest {
    // TODO Adiciona tus pruebas unitarias aquí.
    // Los métodos deben estar anotados con la anotación @Test. Por ejemplo:
    //

    @Test
    public void testRetirar() {
        double saldoEsperado = 20000; 
        CuentaBancaria cuenta1 = new CuentaBancaria("Janier", "34", 30000);
        cuenta1.retirar(10000); 
        double saldoActual = cuenta1.getSaldo(); 
        assertEquals(saldoEsperado, saldoActual, 0); 
    }



@Test
    public void testIngresar() {
        double saldoEsperado = 50000; 
        CuentaBancaria cuenta2 = new CuentaBancaria("Farid", "23", 30000);
        cuenta2.ingresar(20000);
        double saldoActual = cuenta2.getSaldo(); 
        assertEquals(saldoEsperado, saldoActual, 0); 
    }
}
