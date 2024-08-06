package Poo;

public class Exercio2 {

        public int Multi(int x, int y) {
            if (x > y) {
                return Multi(x - y, y);
            } else if (y > x) {
                return Multi(y, x);
            } else return x;
        }
    }
