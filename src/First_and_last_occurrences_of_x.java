import com.sun.source.tree.BreakTree;

import java.util.*;

public class First_and_last_occurrences_of_x {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125 };
//        int n = 9, x = 5;
//        System.out.println(find(arr, n, x));

//        int[] arr = {1, 5, 3, 4, 3, 5, 6};
//        int n = 7;
//        System.out.println(firstRepeated(arr, n));

//        Queue<Integer> que = new LinkedList<>();
//        que.add(4);
//        que.add(3);
//        que.add(1);
//        que.add(10);
//        que.add(2);
//        que.add(6);
//        System.out.println(rev(que));

//        String a = "bbbcabadf";
//        System.out.println(FirstNonRepeating(a));

//        int[] arr = {0, 0, 0, 0, 0};
//        int n = arr.length;
//        System.out.println(transitionPoint(arr, n));

//        int[] arr = {2, 3, 2, 3, 5};
//        int n = arr.length, p = 5;
//        frequencyCount(arr, n, p);
//        System.out.println(Arrays.toString(arr));

//        int[] arr = {3,1,2,2,1,2,3,3};
//        int n = arr.length, k = 4;
//        System.out.println(countOccurence(arr, n, k));

//        int[] arr1 = {2, 3, 6, 7, 9};
//        int[] arr2 = {1, 4, 8, 10};
//        int n = arr1.length, m = arr2.length, k = 9;
//        System.out.println(kthElement(arr1, arr2, n, m, k));

//        int[] nums = {10, 3, 5, 6, 2};
//        System.out.println(Arrays.toString(productExceptSelf(nums, nums.length)));

//        int[] arr = {86,39,90,67,84,66,62};
//        int n = arr.length, x = 1, y = 2;
//        System.out.println(minDist(arr, n, x, y));


//        int[] arr = {1, 4, 45, 6, 10, 8};
//        int n = arr.length, x = 8;
//        System.out.println(hasArrayTwoCandidates(arr, n, x));

//        int[][] m = {{0, 1, 0}, {0, 0, 0}, {0, 1, 0}};
//        int n = m.length;
//        System.out.println(celebrity(m, n));

//        int[] a = {-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
//        int n = a.length,  k  = 15;
//        System.out.println(lenOfLongSubarr(a, n, k));

//        int[] price = {100, 80, 60, 70, 60, 75, 85};
//        int n = price.length;
//        System.out.println(Arrays.toString(calculateSpan(price, n)));

//        int[] arr = {4, 2, 1, 5, 3};
//        int n = arr.length;
//        immediateSmaller(arr, n);
//        System.out.println(Arrays.toString(arr));


//        int[] a = {1, 7, 4, 3, 4, 8, 7};
//        int n = a.length, k = 1;
//        System.out.println(firstElementKTime(a, n, k));

//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {1, 2, 3};
//        System.out.println(findUnion(arr1, arr2, arr1.length, arr2.length));

//        int[] a = {89, 2, 2, 11, 23};
//        int[] b = {89, 2, 2};
//        System.out.println(NumberofElementsInIntersection(a, b, a.length, b.length));

        int[] a = {70, 83, 82, 39, 81};
        int n = a.length;
        System.out.println(maxIndexDiff(a, n));
    }

    private static int maxIndexDiff(int[] a, int n) {
        if(n == 2) return 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n - 2; i++){
            int count = 0;
            for(int j = i; j < n; j++){
                if(a[i] <= a[j]){
                    count = j;
                }
            }
            max = Math.max(max, Math.abs(i - count));
        }
        return max;
    }

    private static int NumberofElementsInIntersection(int[] a, int[] b, int n, int m) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int count = 0;
        for (int  i : a) set1.add(i);

        for (int i = 0; i < m; i++) {
            if (set1.contains(b[i]) && !set2.contains(b[i])){
                count++;
                set2.add(b[i]);
            }
        }
        return count;

//        Arrays.sort(a);
//        Arrays.sort(b);
//        int count = 0, a1 = n - 1, b1 = m - 1;
//        while(a1 >= 0 && b1 >= 0){
//            if (a[a1] == b[b1]) {
//                count++;
//                b1--;
//                a1--;
//            }else if(a[a1] >= a[b1]){
//                    b1--;
//            }else{
//                    a1--;
//                }
//            }
//        return count;
    }


    private static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(!al.contains(arr1[i])){
                al.add(arr1[i]);
            }
        }
        for (int i = 0; i < m; i++) {
            if(!al.contains(arr2[i])){
                al.add(arr2[i]);
            }
        }
        return al;
    }


    private static int firstElementKTime(int[] a, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            if (map.get(a[i]) == k){
                return a[i];
            }
        }
        return -1;
    }

    private static void immediateSmaller(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] = -1;
            }
        }
        arr[n - 1] = -1;
    }

    private static int[] calculateSpan(int[] price, int n) {
        int[] ans = new int[n];
        Stack<Integer> stk = new Stack<>();
        ans[0] = 1;
        stk.push(0);
        for (int i = 1; i < n; i++) {

            while (!stk.isEmpty() && price[stk.peek()] <= price[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                ans[i] = i + 1;
            }else{
                ans[i] = i - stk.peek();
            }
            stk.push(i);
        }
        return ans;
    }

    private static int lenOfLongSubarr(int[] a, int n, int k) {
        int max = Integer.MIN_VALUE, sec = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            while (sum > k){
                sum -= Math.abs(a[sec++]);
            }
            if (sum == k){
                max = Math.max(max, Math.abs(i - sec));
                sum -= a[sec++];
            }
        }
        if (max == Integer.MIN_VALUE) return 0;
        return max + 1;
    }


    private static int celebrity(int[][] m, int n) {
        int row=0;
            for (int j = 0; j < n; j++) {
                if (m[0][j] == 1){
                    row = j;
                }
            }
            for (int j = 1; j < n; j++) {
               if (m[j][row] != 1 && j != row){
                   return -1;
               }
            }
        return row;
    }

    private static boolean hasArrayTwoCandidates(int[] arr, int n, int x) {
        HashSet<Integer> set = new HashSet();
        for (int a : arr){
            int diff = x - a;
            if (set.contains(diff)){
                return true;
            }
            set.add(a);
        }
        return false;
    }

    private static int minDist(int[] arr, int n, int x, int y) {
        int sec = -1, first = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
           if (arr[i] == x){
               first = i;
           }else if (arr[i] == y){
               sec = i;
           }
            if (first != -1 && sec != -1) {
                min = Math.min(min, Math.abs(first - sec)) ;
            }
        }

        if (first == -1 || sec == -1) return -1;
        return min;
    }

    private static long[] productExceptSelf(int[] nums, int n) {
        long[] ans = new long[nums.length];
        int pro1 = 1, count = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0){
                pro1 *= nums[i];
            }else {
                count++;
                flag = true;
            }
        }
        if (count > 1){
            return ans;
        }

        for (int i = 0; i < n; i++) {
            if (flag){
                if (nums[i] == 0) {
                    ans[i] = pro1;
                }else {
                        ans[i] = 0;
                    }
                } else {
                    ans[i] = pro1 / nums[i];
                }
            }
        return ans;
    }

    private static long kthElement(int[] arr1, int[] arr2, int n, int m, int k) {
        int[] ans = new int[n + m];
        int i = 0,j = 0, point = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] <= arr2[j]){
                ans[point++] = arr1[i++];
            }else {
                ans[point++] = arr2[j++];
            }
        }

        while (i < arr1.length){
            ans[point++] = arr1[i++];
        }

        while (j < arr2.length){
            ans[point++] = arr2[j++];
        }

        int first = 0, last = ans.length - 1;

        while (first <= last){
            int mid = first + (last - first)  / 2;
            if (mid + 1 == k) {
                return ans[mid];
            }

            if (mid + 1 < k){
                first = mid + 1;
            }else {
                last = mid - 1;
            }
        }
        return 0;
    }

    private static int countOccurence(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> es : map.entrySet()) {
            if (es.getValue() > (n / k)){
                count++;
            }
        }
        return count;
    }

    private static void frequencyCount(int[] arr, int n, int p) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr.length){
                ans[arr[i] - 1]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
    }

    private static int transitionPoint(int[] arr, int n) {

        if (arr[0] == 1) return 0;
        if (arr[n - 1] == 0) return -1;

        int i = 1, j = arr.length - 2;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid - 1] == 0 && arr[mid] == 1) {
                return mid;
            }

            if (arr[mid + 1] == 1 && arr[mid] == 0){
                return mid + 1;
            }

            if (arr[mid] == 0){
                i = mid + 1;
            }else {
                j = mid - 1;
            }
        }
        return -1;
    }

    private static String FirstNonRepeating(String a) {
        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Character> que = new LinkedList<>();
        String ans = "";

        for (int i = 0; i < a.length(); i++) {
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);

            if (map.get(a.charAt(i)) == 1){
                que.add(a.charAt(i));
                ans += que.peek();
            }

            if (map.get(a.charAt(i)) > 1) {
                while((!que.isEmpty()) && map.get(que.peek()) > 1){
                    if (map.get(que.peek()) > 1) {
                        que.remove();
                    }
                }
                if (!que.isEmpty()) {
                    ans += que.peek();
                } else {
                    ans += '#';
                }
            }
        }
        return ans;
    }

    private static Queue<Integer> rev(Queue<Integer> que) {
        Stack<Integer> stk = new Stack<>();
        int n = que.size();

        for (int i = 0; i < n; i++) {
            stk.add(que.remove());
        }
        int n1 = stk.size();
        for (int i = 0; i < n1; i++) {
            que.add(stk.pop());
        }
        return que;
    }

    private static int firstRepeated(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            int count = map.get(arr[i]);
            if (count > 1){
                return i + 1;
            }
        }
        return -1;
    }


    private static ArrayList<Long> find(int[] arr, int n, int x) {
        ArrayList<Long> ans = new ArrayList<>();
        long min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x){
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }
        ans.add(min);
        ans.add(max);
        return ans;
    }
}

