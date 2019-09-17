import java.util.Scanner;
public class if_else_switch {
    public static void main(String[] args) {
        int a = 42;
        int b = 50;


        if(a>b){
        System.out.println(a);
        System.out.println("a er større end b");
        } else if (a<b) {
            System.out.println(b);
            System.out.println("b er større end a");
        } else{
            System.out.println("a og b er lige");
        }
      Scanner x = new Scanner(System.in);
        System.out.println("Skriv dit budget" + " mellem " + " " + "500, 1000, 1500,2500,3500");
        int budget = x.nextInt();

        switch (budget){
         case 500:
             System.out.println("du har et budget på  500kr");
             break;
         case 1000:
             System.out.println("du har et budget på  1000kr");
             break;
         case 1500:
             System.out.println("du har et budget på  1500kr");
             break;
         case 2500:
             System.out.println("du har et budget på  2500kr");
             break;
         case 3500:
             System.out.println("du har et budget på  3500kr");
             break;
     }

    }
}