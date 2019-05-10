package lesson2;

public class Main {
    public static void main(String[] args) {

     String[][] array = {{"sdsd", "4", "er", "5"},{"9", "!", "1", "rt"},{"34", "(", "3", "er"},{"v", "nm", "y"}};
     String[][] array1 = {{"2", "4", "6", "5"},{"9", "3", "1", "0"},{"34", "5", "3", "2"},{"1", "3", "3"}};

     try {
         System.out.println();
         System.out.println("Сумма всех элементов массива 4х4 равна = " + sumArray(array1));
         System.out.println();
     } catch (MyArraySizeException | MyArrayDataException e) {
         e.printStackTrace();
     }
    }

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) throw new MyArraySizeException();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (array[j].length != 4) throw new MyArraySizeException();

                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);

                }

            }

        }
        return sum;
    }


}









