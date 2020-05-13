package lesson_1.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrChanger<T extends Object> {
    private T[] nums;

    public ArrChanger(T... nums) {
        this.nums = nums;
    }

    public void changeValue(int indexFirst, int indexSecond) {
        T a = nums[indexFirst];
        nums[indexFirst] = nums[indexSecond];
        nums[indexSecond] = a;
        System.out.println(Arrays.toString(nums));
    }

    public void arrayToList() {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(i, nums[i]);
        }
        System.out.println("Новый ArrayList " + list);
    }

}
