package company.fbr5.again;

public class Q157 {
    public int read(char[] buf, int n) {
        int buffCount = 0;
        int buffPointer = 0;
        char[] buff = new char[4];
        int pointer = 0;
        while (pointer < n) {
            if (buffPointer == 0) buffCount = read4(buff);
            while (pointer < n && buffPointer < buffCount) {
                buf[pointer++] = buff[buffPointer++];
            }
            if (buffCount == buffPointer) buffPointer = 0;
            if (buffCount < 4) break;
        }
        return pointer;
    }

    int read4(char[] buf4) {
        return 4;
    }
}
