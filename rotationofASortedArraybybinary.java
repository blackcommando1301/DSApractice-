import java.util.*;

public class rotationofASortedArraybybinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int st = 0;
        int end = n - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == k) {
                System.out.println(mid + 1);
                return;
            } else if (arr[mid] > arr[end]) {
                if (arr[st] > k) {
                        st=mid+1;
                } else if (arr[mid] > k) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (arr[mid] > k) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }

        }
        System.out.println("-1");

    }
}
