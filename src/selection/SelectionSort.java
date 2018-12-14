package selection;

public class SelectionSort {
    public void sort(Integer[] array){
           for(int i=0;i<array.length;i++){
               int minValue=array[i];
               int minIndex=i;
               for(int j=i;j<array.length;j++){
                   if(array[j]<minValue){
                       minValue=array[j];
                       minIndex=j;
                   }
               }
               if(minValue<array[i]){
                   int temp=array[i];
                   array[i]=array[minIndex];
                   array[minIndex]=temp;
               }
           }
    }
}
