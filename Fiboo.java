package Fiboo;

public class Fiboo {
    public static void main(String args[]){
        int a=0;
        int a1=1;
        System.out.print(a+" "+a1);
        for(int i=0;i<13;i++){
            int sum = a+a1;
            a=a1;
            a1=sum;
            System.out.print(" "+sum);
        }

    }
}
