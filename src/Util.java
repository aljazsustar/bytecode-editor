public class Util {

    /***
     *
     * @param arr input array
     * @param start index of first element of the slice
     * @param end index of last element in the slice
     * @return slice of length start - end + 1
     */
    public static byte[] getSlice(byte[] arr, int start, int end) {
        byte[] slice = new byte[start - end + 1];
        int sliceIdx = 0;

        for (int i = start; i <= end; i++) {
            slice[sliceIdx] = arr[i];
            sliceIdx++;
        }

        return slice;
    }

    /***
     *
     * @param bytes bytes to concatenate
     * @return bytes, concatenated into a single integer
     */
    public static int concatBytes(byte[] bytes) {
        assert bytes.length <= 4;
        int res = 0;

        for (int i = 0; i < bytes.length - 1; i++) {
            res |= (bytes[i] & 0x000000FF);
            res = res << 8;
        }

        return res | (bytes[(bytes.length - 1)] & 0x000000FF);
    }
}
