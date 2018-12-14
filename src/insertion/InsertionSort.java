package insertion;

public class InsertionSort {
    public void sort(Integer[] array){
        for(int i=1;i<array.length;i++){
            int key=array[i];
            int j=i-1;
            while (j>=0&&key<array[j]){
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                j--;

            }

        }
    }
}
