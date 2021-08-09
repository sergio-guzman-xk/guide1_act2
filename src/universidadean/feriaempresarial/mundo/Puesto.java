/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: Puesto.java  $
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
 * Clase que modela un puesto
 */
public class Puesto {
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Estado disponible del puesto
     */
    public static final String ESTADO_DISPONIBLE = "Estado disponible";

    /**
     * Estado ocupado del puesto
     */
    public static final String ESTADO_OCUPADO = "Estado ocupado";

    /**
     * Zona norte
     */
    public static final String ZONA_NORTE = "Zona norte";

    /**
     * Zona sur
     */
    public static final String ZONA_SUR = "Zona sur";

    /**
     * Zona oriente
     */
    public static final String ZONA_ORIENTE = "Zona oriente";

    /**
     * Zona occidente
     */
    public static final String ZONA_OCCIDENTE = "Zona occidente";

    /**
     * Zona centro
     */
    public static final String ZONA_CENTRO = "Zona centro";
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * N�mero del puesto
     */
    private int numero;

    /**
     * Zona del puesto
     */
    private String zona;

    /**
     * Estado del puesto
     */
    private String estado;

    /**
     * Nombre de la empresa que ocupa el puesto
     */
    private String nombreEmpresa;

    /**
     * N�mero m�nimo de personas en el puesto
     */
    private int numMinimoPersonas;

    /**
     * N�mero m�ximo de personas en el puesto
     */
    private int numMaximoPersonas;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del puesto con par�metros. Inicializa los atributos de la clase con los par�metros ingresados<br>
     * <b>post:</b> Inicializa el atributo estado la constante de la clase que indica que esta disponible<br>
     * Inicializa el nombre de el empresa vac�o(nombreEmpresa = "")<br>
     * @param nNumero Es el n�mero del puesto. nNumero > 0
     * @param nZona Es la zona de ubicaci�n del puesto. nUbicacion != null, nUbicacion != ""
     * @param nNumMinimoPersonas Es el n�mero m�nimo de personas en el puesto. nNumMinimoPersonas > 0
     * @param nNumMaximoPersonas Es el n�mero m�ximo de personas en el puesto. nNumMaximoPersonas > 0
     */
    public Puesto(int nNumero, String nZona, int nNumMinimoPersonas, int nNumMaximoPersonas) {
        numero = nNumero;
        zona = nZona;
        numMinimoPersonas = nNumMinimoPersonas;
        numMaximoPersonas = nNumMaximoPersonas;

        estado = ESTADO_DISPONIBLE;
        nombreEmpresa = "";
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el nombre de la empresa que ocupa el puesto<br>
     * <b>post: </b> Se ha retornado el n�mero del puesto. N�mero mayor a cero <br>
     * @return N�mero del puesto
     */
    public int darNumero() {
        return numero;
    }

    /**
     * Retorna la zona del puesto<br>
     * <b>post: </b> Se ha retornado la zona del puesto. zona != null, zona != "" <br>
     * @return Zona del puesto
     */
    public String darZona() {
        return zona;
    }

    /**
     * Retorna el n�mero m�nimo de personas en el puesto<br>
     * <b>post: </b> Se retorn� el n�mero m�nimo de personas en el puesto. N�mero mayor a cero <br>
     * @return N�mero m�nimo de personas en el puesto
     */
    public int darNumMinimoPersonas() {
        return numMinimoPersonas;
    }

    /**
     * Retorna el n�mero m�ximo de personas en el puesto<br>
     * <b>post: </b> Se retorn� el n�mero m�ximo de personas en el puesto. N�mero mayor a cero <br>
     * @return N�mero m�ximo de personas en el puesto
     */
    public int darNumMaximoPersonas() {
        return numMaximoPersonas;
    }

    /**
     * Retorna el nombre de la empresa que ocupa el puesto <br>
     * <b>pre: </b> El puesto esta ocupado <br>
     * <b>post: </b> Retorna el nombre de la empresa que ocupa el puesto <br>
     * nombreEmpresa != null, nombreEmpresa != ""<br>
     * @return El nombre de la empresa que ocupa el puesto
     */
    public String darNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * Retorna si el puestos esta ocupado o no<br>
     * <b>post: </b> Se retorn� si el puesto esta ocupado o no<br>
     * @return true si esta ocupado, false de lo contrario
     */
    public boolean estaOcupado() {
        boolean ocupado = false;
        if (estado.equals(ESTADO_OCUPADO)) {
            ocupado = true;
        }

        return ocupado;
    }

    /**
     * Ocupa el puesto <br>
     * <b>pre: </b> El estado del puesto es disponible <br>
     * <b>post: </b> El puesto cambi� su estado a ocupado <br>
     * El nombre de la empresa ha sido inicializado con el nombre ingresado por par�metro<br>
     * @param nNombreEmpresa Nombre de la empresa que ocupar� el puesto
     */
    public void ocuparPuesto(String nNombreEmpresa) {
        estado = ESTADO_OCUPADO;
        nombreEmpresa = nNombreEmpresa;
    }

    /**
     * Desocupar el puesto <br>
     * <b>pre: </b> El estado del puesto es ocupado <br>
     * <b>post: </b> El puesto cambi� su estado a disponible <br>
     * El nombre de la empresa ha sido inicializado en la cadena vac�a ""<br>
     */
    public void desocuparPuesto() {
        estado = ESTADO_DISPONIBLE;
        nombreEmpresa = "";
    }

}
