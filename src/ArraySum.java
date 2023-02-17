public class ArraySum {
    //5, 6, 7
    //5 + index+1
    public int sumOfArray (Integer[] a,int index){
        if(index < 0)return 0;

        return a[index] + sumOfArray( a, index-1);

    }
}
