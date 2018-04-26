import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumaTest {
    Suma objeto;
    Suma objetoDos;
    Suma objetoTres;

    @Before
    public void setUp() throws Exception {
        objeto = new Suma(2, 3);
        objetoDos = new Suma(-2, -3);
        objetoTres = new Suma(2, -3);
    }

    @Test
    public void sumar() throws Exception {
        int esperado = 5;
        int actual = this.objeto.sumar();
        assertEquals(esperado, actual, 0.000);

    }

    @Test
    public void sumarNegativos() throws Exception {
        int esperado = -5;
        boolean resultado;
        if (this.objetoDos.sumar() == esperado) {
            resultado = true;
        } else {
            resultado = false;
        }
        assertTrue(resultado);
    }

    @Test
    public void sumarNegativoPositivo() throws Exception {
        int esperado = -1;
        boolean resultado;
        resultado = this.objetoTres.sumar() != esperado ? true : false;
        assertFalse(resultado);

    }

}