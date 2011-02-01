/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy;

/**
 * @version .01
 * @author Michael Archibald
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 */
public class MalformedPacketException extends Exception {
    private static final String MSG = "Recieved malformed packet from ";
    private AbstractEvony dataSource = null;
    private byte[] data = null;
    private String message;

    MalformedPacketException(AbstractEvony dataSource, byte[] data) {
//        super(MSG + dataSource.getClass().getName() + ".");
        super(MSG + dataSource.currentThread().getName() + ".");
        this.dataSource = dataSource;
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public AbstractEvony getDataSource() {
        return dataSource;
    }

    public void setDataSource(AbstractEvony dataSource) {
        this.dataSource = dataSource;
    }
}
