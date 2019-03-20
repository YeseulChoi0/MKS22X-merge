public class Merge{
  /*sort the data from least to greatest value. This is a wrapper function*/

  public static void mergesort(int[] data){
    mergesort(data, 0, data.length - 1);
  }

  private static void mergesort(int[] data, int low, int hi){
    if (low >= hi){
      return;
    }
    int middle = (low + hi) / 2;
    mergesort(data, low, middle);
    mergesort(data, middle + 1,hi);
    merge(data, low, middle, hi);
  }

  public static void merge(int data[], int low, int middle, int hi){
    int start = low;
    int[] temp  = new int[hi-low + 1];
    int i2 = middle + 1;
    int i = 0;
    while (i2 <= hi && low <= middle){
      if (data[low] <= data[i2]){
        temp[i] = data[low];
        i++;
        low++;
      }else{
        temp[i] = data[i2];
        i++;
        i2++;
      }
    }
    while (i2 <= hi){
      temp[i] = data[i2];
      i2++;
      i++;
    }
    while (low <= middle){
      temp[i] = data[low];
      low++;
      i++;
    }for (int index = 0; index < temp.length; index++){
      data[start] = temp[index];
      start++;
    }
  }



  //OPTIMIZED VERSION
  // public static void mergesort(int[]data){
  //   int[] temp = new int[data.length/2];
  //   mergesort(data, temp, 0, data.length);
  // }
  // public static void mergesort(int[]data){
  //   int[] temp = new int[data.length/2];
  //   mergesort(data, temp, 0, data.length);
  // }
  //
  // private static void mergesort(int[]data, int[]temp, int lo, int hi){
  //   if (low >= hi){
  //     return temp;
  //   }
  // }
}
