import java.util.*;

/**
 * Created by Administrator on 2016/1/15.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Point{
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class Main {
    public static void main(String args[]) {
//        System.out.println(simplifyPath("/a/./b/../../c/"));
//         generateParenthesis(1);
//        int[][] matrix = {{9,9,4},{6,6,8},{2,1,1}};
//        int[][] matrix = {{3, 4, 5}, {3, 2, 6}, {2, 2, 1}};
//        int[][] matrix = {{1,2}};
//        int[][] matrix = {{1,2},
//                          {1,1}};
//        System.out.println(new Solution().longestIncreasingPath(matrix));
//        System.out.println(new Solution().isHappy(19));

//        String s = "010010";
//        List<String> res = new Solution().restoreIpAddresses(s);
//        System.out.println(s.substring(0,s.length()));

//         System.out.println(new Solution().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
//        System.out.println(new Solution().threeSumClosest(new int[]{-1,2,1,-4}, 1));
//        int[][] test = new int[][]{{1,0},{2,0},{3,1},{3,2}};
//        int[][] test2 = new int[][]{{}};
//        new Solution().findOrder(4,test2);
//        int[][] matrix = new int[][]{{1},{2},{3}};
//        List<Integer>  result =  new Solution().spiralOrder(matrix);
//        for( int i : result )
//        {
//            System.out.println(i);
//        }

//        System.out.println(new Solution().numSquares(12));
//          System.out.println(new Solution().titleToNumber("AAA"));
//          System.out.println(new Solution().diffWaysToCompute("2*3-4*5"));
//          System.out.println(new Solution().firstMissingPositive(new int[]{1000,-1}));
//          System.out.println(new Solution().countDigitOne(13));
//        int[][] matrix = {{1,0,1},{1,1,1},{1,1,1}};
//        new Solution().setZeroes(matrix);
//        System.out.println(matrix);
//        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(new Solution().isPalindrome("race a car"));
//        System.out.println(new Solution().isPalindrome("0P"));
//        System.out.println(new Solution().generate(5));
//        System.out.println(new Solution().nthSuperUglyNumber(5,new int[]{2,7,13,19}));
//        System.out.println(new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
//        System.out.println(new Solution().threeSum(new int[]{-1, 1, -1, 0, -1, 1, -1, 1}));
//        System.out.println(new Solution().grayCode(3));
//        int i = 0;
//        System.out.println(i ^ i >> 1);
//        System.out.println(new Solution().majorityElement(new int[]{1,1,2}));

//        new Solution().containsNearbyAlmostDuplicate(new int[]{1,1,2}, 9, 19);
//        Scanner scanner = new Scanner(System.in);
//        int T = scanner.nextInt();
//        scanner.nextLine();
//        for(int i = 0; i < T; i++) {
//            int N = scanner.nextInt();
//            scanner.nextLine();
//            int input[][] = new int[N][4];
//            for(int j = 0; j < N; j++) {
//                for(int k = 0; k < 4; k++) {
//                    input[j][k] = scanner.nextInt();
//                }
//                scanner.nextLine();
//            }
//            new Solution().testFunc(input, N);
//        }
//        System.out.println(new Solution().reverseBits(1 ));
//        System.out.println(new Solution().uniquePaths(3,3));
//        System.out.println(new Solution().removeDuplicateLetters("bcabc"));
//        Solution s = new Solution();

//        Point points[] = new Point[4];
//        points[0] = new Point(1, 1);
//        points[1] = new Point(2, 2);
//        points[2] = new Point(4, 3);
//        points[3] = new Point(3, 3);
//        System.out.println(new Solution().maxPoints(points));
//        int[]  a = {5334,6299,4199,9663,8945,3566,9509,3124,6026,6250,7475,5420,9201,9501,38,5897,4411,6638,9845,161,9563,8854,3731,5564,5331,4294,3275,1972,1521,2377,3701,6462,6778,187,9778,758,550,7510,6225,8691,3666,4622,9722,8011,7247,575,5431,4777,4032,8682,5888,8047,3562,9462,6501,7855,505,4675,6973,493,1374,3227,1244,7364,2298,3244,8627,5102,6375,8653,1820,3857,7195,7830,4461,7821,5037,2918,4279,2791,1500,9858,6915,5156,970,1471,5296,1688,578,7266,4182,1430,4985,5730,7941,3880,607,8776,1348,2974,1094,6733,5177,4975,5421,8190,8255,9112,8651,2797,335,8677,3754,893,1818,8479,5875,1695,8295,7993,7037,8546,7906,4102,7279,1407,2462,4425,2148,2925,3903,5447,5893,3534,3663,8307,8679,8474,1202,3474,2961,1149,7451,4279,7875,5692,6186,8109,7763,7798,2250,2969,7974,9781,7741,4914,5446,1861,8914,2544,5683,8952,6745,4870,1848,7887,6448,7873,128,3281,794,1965,7036,8094,1211,9450,6981,4244,2418,8610,8681,2402,2904,7712,3252,5029,3004,5526,6965,8866,2764,600,631,9075,2631,3411,2737,2328,652,494,6556,9391,4517,8934,8892,4561,9331,1386,4636,9627,5435,9272,110,413,9706,5470,5008,1706,7045,9648,7505,6968,7509,3120,7869,6776,6434,7994,5441,288,492,1617,3274,7019,5575,6664,6056,7069,1996,9581,3103,9266,2554,7471,4251,4320,4749,649,2617,3018,4332,415,2243,1924,69,5902,3602,2925,6542,345,4657,9034,8977,6799,8397,1187,3678,4921,6518,851,6941,6920,259,4503,2637,7438,3893,5042,8552,6661,5043,9555,9095,4123,142,1446,8047,6234,1199,8848,5656,1910,3430,2843,8043,9156,7838,2332,9634,2410,2958,3431,4270,1420,4227,7712,6648,1607,1575,3741,1493,7770,3018,5398,6215,8601,6244,7551,2587,2254,3607,1147,5184,9173,8680,8610,1597,1763,7914,3441,7006,1318,7044,7267,8206,9684,4814,9748,4497,2239};
//        int[] a = {2, 3, 1, 2, 4, 3};
//        System.out.println(new Solution().minSubArrayLen(697439, a));
//        System.out.println(new Solution().getRow(5));
//        Trie t = new Trie();
//        t.insert("aaa");
//        t.insert("aab");
//        t.insert("abb");
//        System.out.println(t.search("aaa"));
//        System.out.println(t.startsWith("ab"));
        String[] strs = {"ba", "aa","cb" ,"ca"};
        System.out.println(new Solution().longestCommonPrefix(strs));
    }


    public static String shortestPalindrome(String s) {
        StringBuilder result = new StringBuilder(s);
        int k = 0;
        for (int i = 0, j = s.length(); i < j; i++, j--) {

        }

        return result.toString();
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        dfs(result, n, n, "");

        for (String s : result) {
            System.out.println(s);
        }
        return result;
    }

    public static void dfs(List<String> list, int n, int m, String str) {

        if (n > m) {
            return;
        }

        if (n > 0) {
            dfs(list, n - 1, m, str + "(");
        }
        if (m > 0) {
            dfs(list, n, m - 1, str + ")");
        }
        if (n == 0 && m == 0) {
            list.add(str);
            return;
        }
    }

//    public static String simplifyPath(String path) {
//        String result = "";
//        Deque<String> stack = new LinkedList<>();
//        Set<String> skip = new HashSet<String>(Arrays.asList("." ,"/", ""));
//        for(String s : path.split("/"))
//        {
//            if(skip.contains(s))
//            {
//                continue;
//            }
//            else if(s.equals("..") && !stack.isEmpty())
//            {
//                stack.pop();
//            }
//            else
//            {
//                stack.push(s);
//            }
//        }
//
//        for(String s : stack) {
//            result += "/" + s;
//        }
//        return result.isEmpty() ? "/" : result;
//    }
}

class Solution {

    Solution() {

    }


    int testFunc(int[][] input, int N) {


        for (int[] row : input) {
            for (int ele : row) {
                System.out.print(ele +" ");
            }
            System.out.println();
        }

        return 0;
    }

    static final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int max = 1;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] cache = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int len = dfs(matrix, i, j, m, n, cache);
                max = Math.max(len, max);
            }
        }
        return max;
    }

    public int dfs(int[][] matrix, int i, int j, int m, int n, int[][] cache) {
        int max = 1;
        if (cache[i][j] != 0) {
            return cache[i][j];
        }

        for (int[] dir : dirs) {
            int x = dir[0] + i, y = dir[1] + j;
            if (x < 0 || x >= m || y < 0 || y >= n || matrix[x][y] <= matrix[i][j]) {
                continue;
            }
            int len = 1 + dfs(matrix, x, y, m, n, cache);
            max = Math.max(len, max);
        }
        cache[i][j] = max;
        return max;
    }

    public boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();

        while (inLoop.add(n)) {
            int sum = 0;
            while (n > 0) {
                int temp = n % 10;
                sum += temp * temp;
                n = n / 10;
            }
            if (sum == 1) {
                return true;
            } else {
                n = sum;
            }
        }
        return false;
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        dfs(res, s, 0, 0, "", s.length());
        for (String dd : res) {
            System.out.println(dd);
        }
        return res;
    }

    public void dfs(List<String> res, String ip, int count, int idx, String s, int len) {
        if (count == 4 && idx == len) {
            res.add(s);
            return;
        }

        if (count == 4 && idx < len) {
            return;
        }

        if (count > 4) {
            return;
        }

        for (int i = 3; i >= 1; i--) {
            if (idx + i > len) {
                continue;
            }
            String segment = ip.substring(0, i);
            if (Integer.parseInt(segment) > 255 || (segment.startsWith("0") && segment.length() > 1)) {
                continue;
            }

            dfs(res, ip.substring(i), count + 1, idx + i, s + (count == 0 ? "" : ".") + segment, len);
        }
    }

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int result = 0;
            for (int j = i; j < nums.length; j++) {
                result += nums[j];
                if (result > max) {
                    max = result;
                }
            }
        }
        return max;
    }

    public int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        int result = 0;
        int offset = Integer.MAX_VALUE;
        int[] b = Arrays.copyOf(nums, nums.length);

        Arrays.sort(b);

        for (int i = 0; i < b.length - 2; i++) {
            int start = i + 1;
            int end = b.length - 1;
            while (start < end) {
                sum = b[i] + b[start] + b[end];
                int temp = target - sum;
                if (temp > 0) {
                    start++;
                } else if (temp < 0) {
                    end--;
                } else {
                    return sum;
                }
                if (Math.abs(offset) > Math.abs(temp)) {
                    result = sum;
                    offset = temp;
                }
            }
        }
        return result;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        if (numCourses <= 0)
            return new int[0];

        int[] result = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        int[] Indegree = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            Indegree[prerequisites[i][0]]++;
        }
        for (int i = 0; i < Indegree.length; i++) {
            if (Indegree[i] == 0) {
                queue.offer(i);
                //break;????
            }
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int index = queue.poll();
            result[count++] = index;
            for (int i = 0; i < prerequisites.length; i++) {
                int next = 0;
                if (prerequisites[i][1] == index) {
                    next = prerequisites[i][0];
                    if (--Indegree[next] == 0) {
                        queue.offer(next);
                    }
                }
            }
        }
        int i = 0;
        for (i = 0; i < Indegree.length; i++) {
            if (Indegree[i] != 0) {
                break;
            }
        }

//        for( int m : result )
//        {
//            System.out.println(m);
//        }

        if (i < Indegree.length) {
            return new int[0];
        } else {
            return result;
        }
    }

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        if (matrix.length == 0) {
            return result;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int total = m * n;
        int x = 0;
        int y = 0;
        while (n > 0 && m > 0) {
            int i = 0;
            int j = 0;
            for (; j < n; j++) {
                result.add(matrix[i + x][j + y]);
            }
            --j;

            if (result.size() == total) {
                return result;
            }

            for (i = 1; i < m - 1; i++) {
                result.add(matrix[i + x][j + y]);
            }

            for (j = n - 1; j >= 0; j--) {
                result.add(matrix[i + x][j + y]);
            }
            j++;
            if (result.size() == total) {
                return result;
            }

            for (i = m - 2; i > 0; i--) {
                result.add(matrix[i + x][j + y]);
            }

            x = x + 1;
            y = y + 1;
            m = m - 2;
            n = n - 2;
        }
        return result;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        if (root == null) {
            return null;
        }

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode t = root;
//        TreeNode t = root;
        while (t != null) {
            stack.push(t);
            t = t.left;
        }

        while (!stack.isEmpty()) {
            t = stack.pop();
            result.add(t.val);

            if (t.right != null) {
                t = t.right;
                while (t != null) {
                    stack.push(t);
                    t = t.left;
                }
            }
        }


        return result;
    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int j = 1;
            int min = Integer.MAX_VALUE;

            while (i - j * j >= 0) {
                min = Math.min(min, dp[i - j * j] + 1);
                j++;
            }
            dp[i] = min;
        }
        return dp[n];
    }

    public int titleToNumber(String s) {
        int result = 0;

        char[] arr = s.toCharArray();


        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            int diff = arr[i] - 'A';
            if (0 == j) {
                result += arr[i] - 'A' + 1;
            } else {
                result += (int) Math.pow(26, j) + diff * (int) Math.pow(26, j);
            }


        }

        return result;
    }

    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new LinkedList<>();
        if (input == null || input.equals("")) {
            return result;
        }

//        System.out.println("abc".substring(0,0));
        List<String> strs = new ArrayList<>();
        int j = 0;
        int i;
        for (i = 0; i < input.length(); i++) {
            if (input.charAt(i) < '0') {
                strs.add(input.substring(j, i));
                strs.add(input.charAt(i) + "");
                j = i + 1;
            }
        }
        strs.add(input.substring(j));

        result = computes(strs, 0, strs.size() - 1);

//        strs.add(input.charAt(j-1)+"");

//        for(String s : strs)
//        {
//            System.out.println(s);
//        }
        return result;
    }

    List<Integer> computes(List<String> strs, int low, int high) {
        List<Integer> result = new ArrayList<>();
        if (low == high) {
            result.add(Integer.valueOf(strs.get(low)));
            return result;
        }

        for (int i = low + 1; i <= high - 1; i += 2) {
            List<Integer> leftRes = computes(strs, low, i - 1);
            List<Integer> rightRes = computes(strs, i + 1, high);
            String operator = strs.get(i);
            for (int left : leftRes) {
                for (int right : rightRes) {
                    if (operator.equals("+")) {
                        result.add(left + right);
                    } else if (operator.equals("-")) {
                        result.add(left - right);
                    } else {
                        result.add(left * right);
                    }

                }
            }

        }
        return result;
    }

    int minDepth = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        MinDepth(root, 1);
        return minDepth;
    }

    public void MinDepth(TreeNode t, int depth) {
        if (t == null) {
            return;
        }
        if (t.right == null && t.left == null) {
            minDepth = Math.min(minDepth, depth);
        }
        MinDepth(t.left, depth + 1);
        MinDepth(t.right, depth + 1);
    }

    public int findMin(int[] nums) {

        if (nums == null) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int min = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                min = nums[i + 1];
                break;
            }
        }
        if (min == Integer.MIN_VALUE) {
            min = nums[i + 1];
        }
        return min;
    }

    public int firstMissingPositive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 1;
        }
        int result = 0;
        BitSet bs = new BitSet();

        for (int i : nums) {
            if (i > 0) {
                bs.set(i);
            }
        }

        int firstOnebit = bs.nextSetBit(0);
        if (firstOnebit == -1) {
            return 1;
        }
        if (firstOnebit > 1) {
            return 1;
        }
        result = bs.nextClearBit(firstOnebit);
        return result;
    }

    public int firstMissingPositive2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                swap(nums, nums[i] - 1, i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int countDigitOne(int n) {

        int result = 0;

        if (n < 0) {
            return 0;
        }

        for (long i = 1; i <= n; i *= 10) {
            long lowerNum = n - (n / i) * i;
            long curNum = (n / i) % 10;
            long higerNum = n / (i * 10);

            if (curNum == 0L) {
                result += i * higerNum;
            } else if (curNum == 1L) {
                result += higerNum * i + lowerNum + 1;
            } else {
                result += (higerNum + 1) * i;
            }

        }

        return result;
    }

    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix[0].length == 0) {
            return;
        }

//        int[] rowList = new int[matrix.length];
//        int[] colList = new int[matrix[0].length];
        HashSet<Integer> rowList = new HashSet<>();
        HashSet<Integer> colList = new HashSet<>();
//        int rowCount = 0;
//        int colCount = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
//                    rowList[rowCount++] = row;
                    rowList.add(row);
                    colList.add(col);
                }
            }
        }

        for (int row : rowList) {
            Arrays.fill(matrix[row], 0);
        }

        for (int col : colList) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = 0;
            }
        }
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean result = false;

        if (numCourses == 0 || prerequisites == null || prerequisites.length == 0) {
            return result;
        }

        if (prerequisites.length == 1) {
            return true;
        }

        int[] inDegree = new int[numCourses];
//        Arrays.fill(inDegree, -1);

        int count = 0;
        int courseNo = 0;

        for (int i = 0; i < prerequisites.length; i++) {
            inDegree[prerequisites[i][0]]++;
        }

        ArrayList<Integer> toplogist = new ArrayList<>();
//        boolean cycle = true;
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                toplogist.add(i);
            }
        }

        if (toplogist.size() == 0) {
            return result;
        }

        ArrayList<Integer> temp = new ArrayList<>();
        while (!toplogist.isEmpty()) {
            courseNo = toplogist.remove(0);
            temp.add(courseNo);
            for (int i = 0; i < prerequisites.length; i++) {
                if (prerequisites[i][1] == courseNo) {
                    inDegree[prerequisites[i][0]]--;
                    if (inDegree[prerequisites[i][0]] == 0) {
                        toplogist.add(prerequisites[i][0]);
                    }
                }
            }
        }
        if (temp.size() == numCourses) {
            result = true;
        }

        return result;

    }

    public boolean isPalindrome(String s) {
        boolean result = true;

        if (s == null || s.length() == 0 || s.equals("")) {
            return result;
        }

        s = s.toLowerCase();

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char front = s.charAt(i);
            char rear = s.charAt(j);
            if ((front < 'a' || front > 'z') && (front < '0' || front > '9')) {
                i++;
                continue;
            }
            if ((rear < 'a' || rear > 'z') && (rear < '0' || rear > '9')) {
                j--;
                continue;
            }
            if (front != rear) {
                result = false;
                break;
            }
            i++;
            j--;

        }

        return result;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> first = new ArrayList<>();
        first.add(0, 1);
        result.add(first);
        if (numRows == 1) {
            return result;
        }

        for (int i = 2; i <= 5; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    temp.add(1);
                } else if (j == i - 1) {
                    temp.add(1);
                } else {
                    temp.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
                }
            }
            result.add(temp);
        }

        return result;
    }

    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int result = 0;
        int[] offset = new int[prices.length - 1];

        for (int i = 0; i < offset.length; i++) {
            offset[i] = prices[i + 1] - prices[i];
        }

        int maxTemp = Integer.MIN_VALUE;
        int maxIndex = 0;
        int sum = 0;

        for (int i = 0; i < offset.length; i++) {
            if (sum >= 0) {
                sum += offset[i];
            } else {
                sum = 0;
            }

            if (sum > maxTemp) {
                maxTemp = sum;
            }
        }

        return result;
    }

    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] pos = new int[primes.length];

        ugly[0] = 1;
        for (int i = 1; i < n; i++) {
            ugly[i] = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[pos[j]]);
            }

            for (int j = 0; j < primes.length; j++) {
                if (primes[j] * ugly[pos[j]] == ugly[i]) {
                    pos[j]++;
                }
            }
        }

        return ugly[n - 1];
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        int length = nums.length;
        if (nums == null || length < 3) {
            return result;
        }

        int[] a = Arrays.copyOf(nums, length);
        Arrays.sort(a);

        int start = 0;
        int end = length - 1;
        int sum = 0;

        for (int i = 0; i < length - 2; i++) {
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }
            start = i + 1;
            end = length - 1;

            while (start < end) {
                sum = a[i] + a[start] + a[end];
                if (sum == 0) {
                    result.add(Arrays.asList(a[i], a[start], a[end]));
                    while (start < end && a[start] == a[start + 1]) {
                        start++;
                    }
                    while (start < end && a[end] == a[end - 1]) {
                        end--;
                    }
                    start++;
                    end--;
                } else if (sum > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        return result;
    }
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        List<StringBuilder> temp = new ArrayList<>();

        if (n == 0) {
            result.add(0);
            return  result;
        }

        if (n == 1) {
            result.add(0);
            result.add(1);
            return result;
        }

        temp.add(new StringBuilder("0"));
        temp.add(new StringBuilder("1"));

//        StringBuilder sb = new StringBuilder();

       for( int i = 2; i <= n; i++) {
            for( int j = temp.size() - 1; j >= 0; j--) {
                StringBuilder curr = temp.get(j);
                StringBuilder tail = new StringBuilder(curr.toString());
                curr.insert(0, '0');
                tail.insert(0, '1');
                temp.add(tail);

            }
       }
//        System.out.println(Integer.parseInt(temp.get(4).toString(),2));

        for (StringBuilder s : temp) {
            result.add(Integer.parseInt(s.toString(),2));
        }

        return result;
    }
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int times = 0;
        for(int i = 0; i < nums.length; i++) {
            if (times == 0) {
                candidate = nums[i];
                times++;
            }
            else {
                if (candidate == nums[i]) {
                    times++;
                }else {
                    times--;
                }
            }

        }

        return candidate;
    }
    public int minPatches(int[] nums, int n) {
        int result = 0;
        int i = 0;
        long currSum = 1;
        while (currSum <= n) {
            if(i < nums.length && nums[i] <= currSum)
            {
                currSum += nums[i++];
            }
            else
            {
                currSum <<= 1;
                result++;
            }
        }

        return result;
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        boolean result = false;

        if (nums == null || k < 1 || t < 0) {
            return result;
        }

        TreeSet<Long> treeSet = new TreeSet<>();
        for( int i = 0; i < nums.length; i++) {
            final Long floor = treeSet.floor((long) nums[i] + t);
            final Long ceil = treeSet.ceiling((long) nums[i] - t);

            if ((floor != null && floor >= nums[i]) || (ceil != null && ceil <= nums[i])) {
                return true;
            }

            treeSet.add((long) nums[i]);

            if (i - k >= 0) {
                treeSet.remove((long) nums[i - k]);
            }

        }

        return  result;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        if (matrix == null || matrix[0] == null || matrix[0].length == 0) {
            return result;
        }

        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                result = true;
                break;
            } else if (target > matrix[row][col]) {
                row++;
            }else {
                col--;
            }
        }


        return result;
    }
    public boolean searchMatrix1(int[][] matrix, int target) {
        boolean result = false;
        if (matrix == null || matrix[0] == null || matrix[0].length == 0) {
            return result;
        }

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if( target < matrix[row][col])
            {
                col--;
            }
            else if(target > matrix[row][col])
            {
                row++;
            }
            else
            {
                result = true;
                break;
            }
        }


        return result;
    }
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;

        for(int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;
            if (i < 31) {
                result <<= 1;
            }
        }

        return  result;
    }
//    int uniquePathsResult = 0;
    public int uniquePaths(int m, int n) {
        int row[] = new int[m];
        row[0] = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < m; j++) {
                row[j] = row[j - 1] + row[j];
            }
        }

        return row[m-1];
    }


//    void uniquePathsDfs(int m, int n, int i, int j, int len) {
//        if( i >= m || j >= n ){
//            return ;
//        }
//        if (len == m + n -1) {
//            uniquePathsResult++;
//            return;
//        }
//        uniquePathsDfs(m, n, i , j + 1, len + 1) ;
//        uniquePathsDfs(m, n, i + 1 , j, len + 1);
//
//    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        BitSet bs = new BitSet(n);
        int result[] = new int[n];

        long totalProduct = 1L;

        for(int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                totalProduct *= nums[i];
            }else {
                bs.set(i);
            }
        }
        int count = bs.cardinality();
        int index = Integer.MIN_VALUE;
        switch (count) {
            case 0:
            {
                for(int i = 0; i < n; i++) {
                    result[i] = (int)(totalProduct / nums[i]);
                }
                break;
            }
            case 1:
            {
                index = bs.nextSetBit(0);
                result[index] = (int) totalProduct;
                break;
            }
            default:
            {
                return result;
            }
        }

        return result;
    }

    public String removeDuplicateLetters(String s) {
        StringBuilder sb = new StringBuilder();
        char[] input = s.toCharArray();
        boolean[] inserted = new boolean[26];
        Arrays.fill(inserted, false);
        int count[] = new int[26];
        char a = 'a';
        int current = 0;

        for (char c : input) {
            count[c - a]++;
        }

        for(int i = 0; i < input.length; i++) {
            current = input[i] - a;
            count[current]--;
            if (inserted[current]) {
                continue;
            }

            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > input[i] && count[sb.charAt(sb.length() -1) - a] > 0) {
                inserted[sb.charAt(sb.length() -1) - a] = false;
                sb.deleteCharAt(sb.length() -1);
            }
            sb.append(input[i]);
            inserted[current] = true;
        }
        return sb.toString();
    }


    int generateGCD(int x, int y) {
        if (y == 0) {
            return x;
        }else {
            return generateGCD(y, x % y);
        }
    }

    public int maxPoints(Point[] points) {
        int result = 0;

        if (points == null) {
            return 0;
        }
        if (points.length <= 2) {
            return points.length;
        }

        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for(int i = 0; i < points.length - 1; i++) {
            map.clear();
            int overlap = 0;
            int max = 0;
            for(int j = i + 1; j < points.length; j++) {
                int x = points[j].x - points[i].x;
                int y = points[j].y - points[i].y;

                if (x == 0 && y == 0) {
                    overlap++;
                    continue;
                }
                int gcd = generateGCD(x, y);
                if (gcd != 0) {
                    x /= gcd;
                    y /= gcd;
                }
                if (map.containsKey(x)) {
                    if (map.get(x).containsKey(y)) {
                        map.get(x).put(y, map.get(x).get(y) + 1);
                    }else {
                        map.get(x).put(y, 1);
                    }
                }else {
                    HashMap<Integer, Integer> temp = new HashMap<>();
                    temp.put(y, 1);
                    map.put(x, temp);
                }
                max = Math.max(max, map.get(x).get(y));
            }
            result = Math.max(result, max + 1 + overlap);
        }

        return result;
    }

    public int minSubArrayLen(int s, int[] nums) {
        int result = 0;

        if (nums == null || nums.length == 0) {
            return  result;
        }
        result = Integer.MAX_VALUE;

        Deque<Integer> deque = new ArrayDeque<>();
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            deque.addLast(nums[i]);
            if (sum >= s) {
                while (deque.size() > 0 && sum >= s) {
                    sum -= deque.poll();
                }
                result = Math.min(result, deque.size() + 1);
            }
        }

//        System.out.println(deque);
        return Integer.MAX_VALUE == result ? 0 : result;
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int result = 0;

        if (triangle == null || triangle.size() == 0 || triangle.get(0) == null || triangle.get(0).size() == 0) {
            return result;
        }

        int min = Integer.MAX_VALUE;
        int element = 0;
        for(int row = triangle.size() - 2; row >=0; row--) {
            for(int col = 0; col <= row; col++) {
                min = Math.min(triangle.get(row + 1).get(col), triangle.get(row + 1).get(col + 1));
                element = triangle.get(row).get(col);
                triangle.get(row).set(col, min + element);
            }
        }

        return triangle.get(0).get(0);
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> cache = new ArrayList<>();
        integers.add(1);
        if (rowIndex == 0) {
            return integers;
        }

        integers.add(1);
        if (rowIndex == 1) {
            return integers;
        }

        int insert = 0;

        for(int row = 2; row <= rowIndex; row++) {
            cache.add(1);
            for(int col = 1; col < row; col++ ) {
                insert = integers.get(col) + integers.get(col - 1);
                cache.add(insert);
            }
            cache.add(1);
            integers.add(-1);
            Collections.copy(integers, cache);
            cache.clear();
        }

        String s = "dd";
        for(char c : s.toCharArray()) {

        }

        return integers;
    }





    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();

        if (intervals == null ){
            return result;
        }

        Interval interval = null;
        int i;
        for (i = 0; i < intervals.size(); i++) {
            interval = intervals.get(i);
            if (newInterval.end < interval.start) {
                break;
            } else if (newInterval.start > interval.end) {
                result.add(interval);
            } else {
                newInterval.start = Math.min(newInterval.start, interval.start);
                newInterval.end = Math.max(newInterval.end, interval.end);
            }
        }
        result.add(newInterval);

        for(int j = i; j < intervals.size(); j++) {
            result.add(intervals.get(i));
        }

        return result;
    }

    List<List<Integer>> pathSumResult = new ArrayList<>();
    Stack<Integer> pathSumStack = new Stack<>();

    void procPathSum(TreeNode node, int sum, int result) {
        pathSumStack.push(node.val);
        result = result + node.val;
        if (node.right == null && node.left == null) {
            if (result == sum) {
                List<Integer> temp = new ArrayList<>();
                for (Integer i : pathSumStack) {
                    temp.add(i);
                }
                pathSumResult.add(temp);
            }
            return;
        }
        if (node.left != null) {
            procPathSum(node.left, sum, result);
        }
        if (node.right != null) {
            procPathSum(node.right, sum, result);
        }
        pathSumStack.pop();
        return;
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        if (root == null) {
            return pathSumResult;
        }
        procPathSum(root, sum, 0);

        return  pathSumResult;
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        if (strs == null || strs.length == 0) {
            return sb.toString();
        }

        int minLen = Integer.MAX_VALUE;

        for (String s : strs) {
            minLen = Math.min(minLen, s.length());
        }

        char c = ' ';
        for(int i = 0; i < minLen; i++) {
            c = strs[0].charAt(i);
            for(String s : strs) {
                if (i < s.length() && c == s.charAt(i)) {
                    continue;
                }
                return sb.toString();
            }
            sb.append(c);
        }

        return sb.toString();
    }

    public int findMin1(int[] nums) {
        int result = Integer.MAX_VALUE;

        if (nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }

        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                result = nums[i + 1];
                break;
            }
        }

        return Math.min(result, nums[0]);
    }


    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0), dummy2 = new ListNode(0);  //dummy heads of the 1st and 2nd queues
        ListNode curr1 = dummy1, curr2 = dummy2;      //current tails of the two queues;
        while (head!=null){
            if (head.val<x) {
                curr1.next = head;
                curr1 = head;
            }else {
                curr2.next = head;
                curr2 = head;
            }
            head = head.next;
        }
        curr2.next = null;          //important! avoid cycle in linked list. otherwise u will get TLE.
        curr1.next = dummy2.next;
        return dummy1.next;
    }
}
