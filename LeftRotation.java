public class LeftRotation {
    public int[] rotateLeft(int d, int[] arr) {
        int n = arr.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + d) % n];
        }
        return rotated;
    }
}
