package Poo;

public class Exercico3{

    public int count(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }else if (a > b) {
            return count(a - b, b);
        } else if (a < b) {
            return a;
        } else return b;
    }
}
    

