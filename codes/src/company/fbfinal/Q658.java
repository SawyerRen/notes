package company.fbfinal;

import java.util.ArrayList;
import java.util.List;

public class Q658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int count = arr.length - k;
        int i = 0, j = arr.length - 1;
        while (count > 0) {
            if (Math.abs(arr[i] - x) > Math.abs(arr[j] - x)) i++;
            else j--;
            count--;
        }
        List<Integer> res = new ArrayList<>();
        for (int l = i; l < i + k; l++) {
            res.add(arr[l]);
        }
        return res;
    }

    public List<Integer> findClosestElements1(int[] arr, int k, int x) {
        int left = 0, right = arr.length - k;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (x - arr[mid] > arr[mid + k] - x) left = mid + 1;
            else right = mid;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            res.add(arr[i]);
        }
        return res;
    }
}
