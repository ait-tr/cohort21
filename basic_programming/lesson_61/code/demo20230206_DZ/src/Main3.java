public class Main3 {
    /*
    List<Integer> marge (List< List<Integer> > list)
    {
        {3, 6, 7, 9}
        {2, 8, 9,9, 12}
        {-13, 0}
     }

    -> {-13, 0, 2,3, 6, 7,8, 9,9,9,12}
    */


    public static int[] marge(int[] arr1, int[] arr2){
        if(arr1==null|| arr1.length==0) return arr2;
        if(arr2==null|| arr2.length==0) return arr1;

        int[] res = new int[arr1.length+arr2.length];
        int i=0, i1=0, i2=0;
        for (i = 0; i1 < arr1.length && i2<arr2.length; i++) {
            res[i] = arr1[i1] < arr2[i2] ? arr1[i1++] : arr2[i2++];
        }
        while (i1<arr1.length){
            res[i++]=arr1[i1++];
        }
        while (i2<arr2.length){
            res[i++]=arr2[i2++];
        }
        return res;
    }


}
