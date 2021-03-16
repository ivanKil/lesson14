public class Les14 {
    public static void main(String[] args) {

    }

    public static int[] getSubArrayAfterVal(int[] array, int val) {
        int[] subArray = null;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == val) {
                subArray = new int[array.length - i - 1];
                break;
            }
        }
        if (subArray != null) {
            System.arraycopy(array, array.length - subArray.length, subArray, 0, subArray.length);
        } else {
            throw new RuntimeException("Во входящем массиве нет элемента со значением " + val);
        }
        return subArray;
    }

    public static boolean isHas4and1(int[] array) {
        if (array == null)
            return false;
        boolean has4 = false;
        boolean has1 = false;
        for (int i : array) {
            has4 = has4 || (i == 4);
            has1 = has1 || (i == 1);
            if (has1 && has4) {
                return true;
            }
        }
        return false;
    }
}