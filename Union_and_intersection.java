import java.util.*;
public class Union_and_intersection {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        System.out.println("Union: " + UnionNoSet.union(arr1, arr2));        // [1, 2, 3, 4, 5, 6, 7]
        System.out.println("Intersection: " + Union_and_intersection.UnionNoSet.IntersectionNoSet.intersection(arr1, arr2));
	}
	public class UnionNoSet {
	    public static List<Integer> union(int[] a, int[] b) {
	        List<Integer> result = new ArrayList<>();
	        int i = 0, j = 0;

	        while (i < a.length && j < b.length) {
	            if (a[i] < b[j]) {
	                result.add(a[i++]);
	            } else if (a[i] > b[j]) {
	                result.add(b[j++]);
	            } else {
	                result.add(a[i]); // or b[j], both are equal
	                i++;
	                j++;
	            }
	        }

	        // Add remaining elements
	        while (i < a.length) result.add(a[i++]);
	        while (j < b.length) result.add(b[j++]);

	        return result;
	    }
	 
	public class IntersectionNoSet {
	    public static List<Integer> intersection(int[] a, int[] b) {
	        List<Integer> result = new ArrayList<>();
	        int i = 0, j = 0;

	        while (i < a.length && j < b.length) {
	            if (a[i] < b[j]) {
	                i++;
	            } else if (a[i] > b[j]) {
	                j++;
	            } else {
	                result.add(a[i]);  // common element
	                i++;
	                j++;
	            }
	        }

	        return result;
	    }
}
}
}