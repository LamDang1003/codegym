package _3_array_and_method.exercise.e5;

public class FindMinValue {
    public static void main(String[] args) {
        int[] a= {20,2,3,1,4,7,9};
        int res = a[0];
        for (int i = 0; i < a.length; i++) {
            if(res>a[i])
                res= a[i];
        }
        System.out.println(res);
    }
}
