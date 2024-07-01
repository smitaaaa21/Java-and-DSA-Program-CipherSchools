public class Loops{
    public static void main(String args[]){
        int i;
        for(i=1;i<=100;i++){
            System.out.println(i);
        }
        System.out.println("i is "+i);
        System.out.println("***********************");

        for(i=0;i<100;i++){
            System.out.println(i);
        }
        System.out.println(i);

        //WHILE LOOP

        int n=5;
        while(n>0){
            System.out.println("Hello");
            n--;
        }
        System.out.println("After while loop n is " +n);

        //DO WHILE - runs atleast once

        n=0;
        do{
            System.out.println(n);
            n--;
        }while(n>0);
        System.out.println("After do-while n is: "+n);
    }
}
