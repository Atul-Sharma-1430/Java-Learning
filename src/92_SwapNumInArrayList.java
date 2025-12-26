import java.util.*;
class SwapNumInArrayList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,6,8,9);
        try {
            Collections.swap(list, 04,  1);
        } catch(IndexOutOfBoundsException IOBe) {
            System.out.println(IOBe.getMessage());
        }

        System.out.println(list);
    }

    // Method 2
    public static void reverse(List<Integer> list) {
        for(int i = 0; i < list.size() / 2; i++) {
            swap(list, i, list.size() - i - 1);
        }
    }

    public static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

}

    