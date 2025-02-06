import java.util.Scanner;

 class Game_task {

    public static int getrandomN(int min,int max ){
        return (int)(Math.random()*(max-min+1)+min);
    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int chances = 8;
        int result = 0;
        boolean restart = true;

        System.out.println("Welcome to game !!!"); 
        System.out.println("Hey champ you have only "+chances +" chances");

        while (restart){
            
            
            int random = getrandomN(1,100);
            boolean user_guess = false;

            for(int i = 0;i < chances;i++){

                System.out.println("Change will be "+(i+1)+" "+"Enter your guess");

                int user_choice = sc.nextInt();

                if(user_choice==random){
                    user_guess = true;
                    result+=1;
                    System.out.println("Congrats champ !!! You Won... ");
                    break;

                }
                else if(user_choice > random){
                    System.out.println("Hey champ your call is too High !!! ");

                }
                else{
                    System.out.println("Hey champ your call is too Low !!! ");
                }

            }
            if(user_guess==false){
                System.out.println("Hey champ, You have lost all your chances and the number is : "+random);
            }

            System.out.println("Hey champ, Do you want continue(y/n)");
            String Play_again = sc.next();
            restart = Play_again.equalsIgnoreCase("y");


        }
        System.out.println("Game Over !!!");
        System.out.println("Score is : "+result);
       
    }


    
}
