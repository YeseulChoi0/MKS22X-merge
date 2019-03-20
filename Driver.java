public class Driver{
  public static void main(String[] commandLine){
    Merge merger = new Merge();
    int[] array = {1, 0, 3, 4, 1, 9, 10, 11, 5, 3};
    merger.mergesort(array);
    System.out.println("");
    for (int i = 0; i < array.length; i++){
      System.out.print(array[i] + ", ");
    }

  }
}
