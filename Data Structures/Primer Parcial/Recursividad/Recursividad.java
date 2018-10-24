import java.util.Arrays;

public class Recursividad {
    public static void main(String args[]) {
        
        System.out.println(factorial(5));
        System.out.println(xE(3,6));
        int[] v = {1,2,3,4,5};
        int[] r = new int[v.length];
        System.out.println(Arrays.toString(e1(v, v.length-1, r)));
        int[] a = {1,2,3,4};
        int k = 2;
        int[] comb = new int[k];
        combs(a, a.length, k, 0, comb, 0);
        
    }
    
    public static int factorial(int n){
        if(n == 0) return 1;
        else{
            return n * factorial(n-1);
        }
    }//f
    
    public static int xE(int x ,int e){
        if(e == 0 ) return 1;
        else{
            return x * xE(x,e-1);
        }
    }//xE
    
    public static int[] e1(int[] v, int l, int[] r){
        if(v.length-1 == 0) {r[0] = v[l]; return r;}
        else if(l == -1){return r;}
        else{
            r[l] = 1;
            for(int i = 0; i<v.length; i++){
                if(i != l){
                    r[l] *= v[i];
                }
            }
            return e1(v, l-1, r);
        }
    }//e1


    public static void combs(int a[], int l, int k, int index, int comb[], int i){
       
        if (index == k) {
            for (int j = 0; j < k; j++)
                System.out.print(comb[j] + " ");
            System.out.println("");
            return;
        }

        if (i >= l)
            return;
 
        comb[index] = a[i];
        combs(a, l, k, index + 1, comb, i + 1);
        combs(a, l, k, index, comb, i + 1);

    }
    

}
