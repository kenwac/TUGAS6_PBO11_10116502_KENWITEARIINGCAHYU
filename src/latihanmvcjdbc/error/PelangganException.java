/*
NIM:10116502
NAMA:KEN WITE ARIING CAHYU
KELAS: PBO-11
 */
package latihanmvcjdbc.error;

/**
 *
 * @author ASUS
 */
public class PelangganException extends Exception {

    /**
     * Creates a new instance of <code>PelangganException</code> without detail
     * message.
     */
    public PelangganException() {
    }

    /**
     * Constructs an instance of <code>PelangganException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PelangganException(String msg) {
        super(msg);
    }
}
