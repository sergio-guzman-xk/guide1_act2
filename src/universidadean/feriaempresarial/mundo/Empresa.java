/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: Empresa.java 587 2008-04-30 16:37:44Z f-vela $
 * Universidad Ean (Bogot� - Colombia)
 * Programa de Ingenier�a de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Bloque de Estudios: Desarrollo de Software
 * Ejercicio: Feria Empresarial
 * Adaptado de: Proyecto CUPI2 - UNIANDES
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package universidadean.feriaempresarial.mundo;

/**
 * Clase que modela una empresa
 */
public class Empresa {
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Tipo de empresa visitante
     */
    public static String VISITANTE = "Visitante";

    /**
     * Tipo de empresa expositora
     */
    public static String EXPOSITORA = "Expositora";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Nombre de la empresa
     */
    private String nombre;

    /**
     * Tipo de empresa
     */
    private String tipo;

    /**
     * N�mero de personas de la empresa
     */
    private int numeroPersonasAsistentes;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor de la empresa con par�metros<br>
     * <b>post: </b>Se cre� un objeto empresa con los valores ingresados por par�metro<br>
     * @param nNombre Nombre de la empresa. nNombre != null, nNombre != ""
     * @param nTipo Tipo de la empresa. Debe pertenecer a uno de los valores de las constantes de la clase
     * @param nNumeroPersonasAsistentes N�mero de personas de la empresa
     */
    public Empresa(String nNombre, String nTipo, int nNumeroPersonasAsistentes) {
        nombre = nNombre;
        tipo = nTipo;
        numeroPersonasAsistentes = nNumeroPersonasAsistentes;
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el nombre de la empresa<br>
     * <b>post: </b>Se retorn� el nombre de la empresa. Nombre != null, Nombre != ""<br>
     * @return Nombre de la empresa
     */
    public String darNombre() {
        return nombre;
    }

    /**
     * Retorna el tipo de la empresa<br>
     * <b>post: </b>Se retorn� el tipo de la empresa. tipo != null, tipo != ""<br>
     * @return Tipo de la empresa
     */
    public String darTipo() {
        return tipo;
    }

    /**
     * Retorna el n�mero de personas de la empresa<br>
     * <b>post: </b>Se retorn� el n�mero de personas de la empresa. N�mero mayor a cero<br>
     * @return N�mero de personas de la empresa
     */
    public int darNumeroPersonasAsistentes() {
        return numeroPersonasAsistentes;
    }

}
