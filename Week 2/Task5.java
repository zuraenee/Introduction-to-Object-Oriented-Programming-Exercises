public class Task5 {
    public Task5() {
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{6, 7, 8, 9, 10};

        for(int i = 0; i < array1.length; ++i) {
            System.out.print(array1[i] + "\t");
        }

        System.out.println();
        int[] var7 = array2;
        int var4 = array2.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int e = var7[var5];
            System.out.print("" + e + "\t");
        }

        System.out.println();
    }
}
