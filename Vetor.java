/*1) Escreva um programa que leia valores inteiros para um vetor de N posi¸c˜oes, onde
N ≤ 30. Em seguida, o seu programa deve encontrar e informar a quantidade de
elementos do vetor que s˜ao maiores que a m´edia dos elementos do vetor. */

public class Vetor {
    public static int media(int []v){
        int soma = 0;
        
        for(int n:v){
            soma+=n;
        }
        return soma/v.length;
    }

    public static int maiorMedia(int media, int []n){
        int maiores = 0;
        for(int num:n){
            if(num >= media){
                maiores++;
            }
        }
        return maiores;
    }

    public static void main(String[] args){
        int []n = {1,2,3};
        int m = media(n);
        int total = maiorMedia(m,n);
        System.out.println(total);
    }
}
