package Mod15_Exceptions;

/*
Группировка исключений
*/

public class Solution_15_12 {

    public static void main(String[] args) {
        try {
            System.out.println("Программа работает от забора");
            Thread.sleep(1000);
            System.out.println("до обеда");
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Произошло исключение на букву N");
        } catch (IllegalArgumentException | IllegalStateException | InterruptedException e) {
            System.out.println("Произошло исключение на букву I");
        } catch (ClassCastException e) {
            System.out.println("Произошло исключение на букву C");
        }
    }
}

