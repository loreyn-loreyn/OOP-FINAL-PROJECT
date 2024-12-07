import java.util.Scanner;

public class CC_Challenges{

    static Scanner in = new Scanner(System.in);
    protected String question, choice_A, choice_B, choice_C, choice_D;
    protected String column_a, column_b;
    protected String scrambled_word;

    static int num;
    static char ans;

    static CC_Functions CC_Functions = new Function();
    
    public CC_Challenges(String question, String choice_A, String choice_B, String choice_C, String choice_D){
        this.question = question;
        this.choice_A = choice_A;
        this.choice_B = choice_B;
        this.choice_C = choice_C;
        this.choice_D = choice_D;
    }

    public CC_Challenges(String column_a, String column_b){
        this.column_a = column_a;
        this.column_b = column_b;
    }

    public CC_Challenges(String scrambled_word){
        this.scrambled_word = scrambled_word;
    }

    public void display_Challenge1(){
        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions.blue + (num+1) + ". " + CC_Functions._blue + question + CC_Functions.reset + "\n");
        System.out.println(CC_Functions.magenta + "\tA. " + CC_Functions.reset +  choice_A);
        System.out.println(CC_Functions.magenta + "\tB. " + CC_Functions.reset +  choice_B);
        System.out.println(CC_Functions.magenta + "\tC. " + CC_Functions.reset +  choice_C);
        System.out.println(CC_Functions.magenta + "\tD. " + CC_Functions.reset +  choice_D + "\n");
        num++;
        Answer_Input_C1();
    }

    public void Answer_Input_C1(){
        CC_Answers CC_Answers = new CC_Answers();
        System.out.print(CC_Functions.lightblack + "Enter the correct answer: " + CC_Functions.reset);
        char ans = in.next().charAt(0);
        CC_Functions.clrscr();
        CC_Answers.C1_Ans(ans);

        if(num==5){
            num = 0;
        }

        if (in.hasNextLine()) {
            in.nextLine();
        }
    }

    public void display_Challenge2(){;
        
        System.out.println("|" + CC_Functions.green + column_a + CC_Functions.reset + "|" + CC_Functions.green + column_b + CC_Functions.reset + "|");
        num++;
        if(num == 5){
            System.out.println("|==============================================|==============================================|\n");
            num = 0;
            Answer_Input_C2();
        }
    }

    public void Answer_Input_C2(){
        CC_Answers CC_Answers = new CC_Answers();
        char[] arr = new char[5];

        for(int x=0; x<5; x++){
            System.out.print(CC_Functions.lightblack + "Enter the answer No. " + (x+1) + ": " + CC_Functions.reset);
            char ans = in.next().charAt(0);
            arr[x] = ans;
        }

        for(int y=0; y<5; y++){
            ans = arr[y];
            CC_Answers.C2_Ans(ans);
        }    

        if(num == 5){
            num = 0;
        }
        
        if (in.hasNextLine()) {
            in.nextLine();
        }
    }

    public void display_Challenge3(){
        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions.blue + (num+1) + ". " + CC_Functions._blue + scrambled_word + "\n" + CC_Functions.reset);
        num++;
        Answer_Input_C3();
    }

    public void Answer_Input_C3(){
        CC_Answers CC_Answers = new CC_Answers();
        System.out.print(CC_Functions.lightblack + "Enter the correct answer: " + CC_Functions.reset);
        String ans = in.nextLine();

        CC_Functions.clrscr();
        CC_Answers.C3_Ans(ans);

        if(num == 5){
            num = 0;
        }
        
    }
}

class Challenge1 extends CC_Challenges{

    public Challenge1(String question, String choice_A, String choice_B, String choice_C, String choice_D){
        super(question, choice_A, choice_B, choice_C, choice_D);
    }

}

class Challenge2 extends CC_Challenges{

    public Challenge2(String column_a, String column_b){
        super(column_a, column_b);
    }

}

class Challenge3 extends CC_Challenges{

    public Challenge3(String scrambled_word){
        super(scrambled_word);
    }

}
