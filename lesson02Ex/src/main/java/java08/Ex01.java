package java08;

import entities.Int;

public class Ex01
{
    public static void main( String[] args )
    {
        Int number1 = new Int(5);
        Int number2 = new Int(3);
        Int number3 = new Int(7);
        ascNumber(number1, number2,number3);
        System.out.println("result asc order: " + number1 + " " + number2 + " " + number3);
    }

    private static void swap(Int number1, Int number2){
        int temp = number1.value;
        number1.value = number2.value;
        number2.value = temp;
    }

    private static void ascNumber(Int number1, Int number2, Int number3){
        if(number1.value >= number2.value){
            swap(number1, number2);
            if(number2.value > number3.value){
                swap(number2, number3);
            }
        }
    }
}
