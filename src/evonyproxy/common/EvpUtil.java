/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy.common;


/**
 *
 * @author HP_Administrator
 * Formerly just called Util.
 */
public class EvpUtil {

    public static final int TCP_IP_HEADER_LENGTH = 54;
    public static final byte[] policyRequest = new byte[]{(byte) 0x02, (byte) 0x00, (byte) 0x4c, (byte) 0x4f, (byte) 0x4f, (byte) 0x50, (byte) 0x02,
        (byte) 0x00, (byte) 0x4c, (byte) 0x4f, (byte) 0x4f, (byte) 0x50, (byte) 0x08, (byte) 0x00, (byte) 0x45, (byte) 0x00, (byte) 0x00,
        (byte) 0x3f, (byte) 0x53, (byte) 0x43, (byte) 0x40, (byte) 0x00, (byte) 0x80, (byte) 0x06, (byte) 0x93, (byte) 0x62, (byte) 0x0a,
        (byte) 0x00, (byte) 0x00, (byte) 0x0a, (byte) 0x0a, (byte) 0x00, (byte) 0x00, (byte) 0x0a, (byte) 0x44, (byte) 0x73, (byte) 0x01,
        (byte) 0xbb, (byte) 0x86, (byte) 0x26, (byte) 0xae, (byte) 0x5d, (byte) 0xd8, (byte) 0x46, (byte) 0x59, (byte) 0xa7, (byte) 0x50,
        (byte) 0x18, (byte) 0x44, (byte) 0x70, (byte) 0x9e, (byte) 0x59, (byte) 0x00, (byte) 0x00, (byte) 0x3c, (byte) 0x70, (byte) 0x6f, (byte) 0x6c,
        (byte) 0x69, (byte) 0x63, (byte) 0x79, (byte) 0x2d, (byte) 0x66, (byte) 0x69, (byte) 0x6c, (byte) 0x65, (byte) 0x2d, (byte) 0x72,
        (byte) 0x65, (byte) 0x71, (byte) 0x75, (byte) 0x65, (byte) 0x73, (byte) 0x74, (byte) 0x2f, (byte) 0x3e, (byte) 0x00};
    public static final String policyRequestString = "<policy-file-request/> ";

    public static String byteArrayToChars(byte[] b) {
        String str = "";
        for (byte eightBits : b) {
            str += (((char) eightBits) + " ");
        }
        return str;
    }

    @Deprecated
    public static byte[] resizeByteArray(byte[] b, int size) {
        byte[] temp = new byte[size];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = Byte.valueOf(b[i]);
        }
        return temp;
    }

    @Deprecated
    public static byte[] stripTcpIpHeader(byte[] b) {
        if (b.length <= TCP_IP_HEADER_LENGTH) {
            return b;
        }
        byte[] temp = new byte[b.length - TCP_IP_HEADER_LENGTH];
        for (int i = TCP_IP_HEADER_LENGTH; i < b.length; ++i) {
            temp[i - TCP_IP_HEADER_LENGTH] = Byte.valueOf(b[i]);
        }
        return temp;
    }

    @Deprecated
    public static int tcpPacketHashcode(byte[] b) {
        b = stripTcpIpHeader(b);
        return b.hashCode();
    }

    /*
    public static void main(String[] args) {


        String policyString = "<policy-file-request/> ";

        byte[] headlessRequest = stripTcpIpHeader(policyRequest);
        System.out.println("Headless policy request: ");
        System.out.println(ByteArrayToFromHexDigits.bytesToHexString(headlessRequest));

        System.out.println("String Hash: " + policyString.getBytes().hashCode());
        System.out.println("headlessRequest Hash: " + tcpPacketHashcode(policyRequest));
    }
     */

}
