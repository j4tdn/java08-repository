package java08.ex01;

public class UniqueNumbers {

    public static void main(String[] args) {
        int[] array = {3,15, 21, 0, 15, 17, 21};
        int[] arrayUniqueSorted = getUniqueNumbers(array);
        printArray(arrayUniqueSorted);
    }

    private static int[] getUniqueNumbers(int[] array) {
        int count = 0;
        int position = 0;
        int[] arrayUniqueSorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            boolean isUniqueNumber = true;
            for (int j = 0; j < array.length; j++) {
                if ( i != j && array[j] == array[i]) {
                    isUniqueNumber = false;
                    break;
                }
            }

            if (isUniqueNumber) {
                count++;
                arrayUniqueSorted[position++] = array[i];
            }
        }
        int[] arrayNew = new int[count];
        for(int i = 0; i < arrayNew.length; i++){
            arrayNew[i] = arrayUniqueSorted[i];
        }

        return arrayNew;
    }

    private static int[] sortArray(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length - 1; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = array[i];
                }
            }
        }
        return array;
    }

    private static void printArray(int[]array){
        for(int i = 0; i < array.length; i++){

            System.out.println(array[i] + " ");
        }
    }

}
