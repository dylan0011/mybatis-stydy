package cn.dylan.type;

/**
 * Created by yuhp@terminus.io on 2017/7/13.
 * Desc:
 */
public class ByteArrayUtils {

    private ByteArrayUtils() {
        //no instance
    }

    static byte[] convertToPrimitiveArray(Byte[] objects) {
        final byte[] bytes = new byte[objects.length];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = objects[i];
        }
        return bytes;
    }

    static Byte[] convertToObjectArray(byte[] bytes) {
        final Byte[] objects = new Byte[bytes.length];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = bytes[i];
        }
        return objects;
    }

}
