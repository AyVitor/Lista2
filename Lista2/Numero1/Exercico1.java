package Poo;

public class Exercico1 { 
    public int Ncount(int N, int K){

        if (N == 0) {
            return 0;
        }
        int last = N % 10;
        int proximonumber = Ncount(N/10, K);

        if(last == K ){

            return 1+ proximonumber;
        }
        return proximonumber;
    }
}
    

