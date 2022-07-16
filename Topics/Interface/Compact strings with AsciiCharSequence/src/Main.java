import java.util.*;

class AsciiCharSequence implements CharSequence {

    byte[] bytes;

    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes.clone();
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) bytes[index];
    }

    @Override
    public String toString() {
        return new String(bytes);
    }

    @Override
    public CharSequence subSequence(int beginIndex, int endIndex) {
        return new AsciiCharSequence(Arrays.copyOfRange(bytes, beginIndex, endIndex));
    }
}