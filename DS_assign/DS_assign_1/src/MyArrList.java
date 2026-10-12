public class MyArrList {
    int[] arr;
    int size;

    MyArrList(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    void add(int value){
        if(arr.length!=size){
     arr[size] = value;
     size++;
     }
        if (arr.length==size){
            int [] arr2 = new int[arr.length*2];
            for(int i = 0;i<arr.length;i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
         }
    }

    void addPos(int value,int position){
    if(arr.length==size){
        int [] arr2 = new int[arr.length*2];
        for(int i = 0;i<arr.length;i++){
            arr2[i] = arr[i];
        }
        arr = arr2;
    }
        for (int i=size-1;i>=position;i--){
            arr[i+1] = arr[i];
        }
        arr[position] = value;
     size++;
    }

    int find(int value) {
        for(int i= 0 ; i<size;i++){
            if (arr[i]==value){
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    void remove(int index){
        for(int i= index+1 ; i<size;i++){
            arr[i-1] = arr[i];
        }
        size--;
    }

    void remove_v(int value){
        for(int i = 0;i<size;i++){
            if(arr[i]==value) {
                remove(i);
                break;
            }
        }
    }

    void reverse(){
        for(int i =0;i< size/2;i++){
            int temp = arr[i];
            arr[i]= arr[size-1-i];
            arr[size-1-i] = temp;

        }
    }


}
