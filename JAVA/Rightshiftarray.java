import java.util.Arrays;

class Rightshiftarray {
    public static void main (String [] args) {
        int ar[] = {1,2,3,4};
        int temp2=0;
        int temp=ar[0];
        for (int i = 0; i < ar.length-1; i++) {
            temp2 = ar [i+1];
            ar [i+1] = temp;
            temp = temp2;
        }
        ar[0]=temp;
        System.out.println(Arrays.toString(ar));
    }
}