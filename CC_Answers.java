class CC_Answers{

    static int point;
    static int challenge1_complete, challenge2_complete, challenge3_complete;

    static CC_Functions CC_Functions = new Function();
    
    int n = CC_Challenges.num; // to check the current number

    public void Score(){
        point++;
    }
    
    public void C1_Ans(char ans){
        if((ans == 'a' || ans == 'A') && n == 5){
            System.out.println(CC_Functions.green + "\n\n\n\n\n\nCorrect!" + CC_Functions.reset);
            Score();
            CC_Functions.EnterKey();
        } 
        else if((ans == 'b' || ans == 'B') && (n == 3 || n == 4)){
            System.out.println(CC_Functions.green + "\n\n\n\n\n\nCorrect!" + CC_Functions.reset);
            Score();
            CC_Functions.EnterKey();
        }
        else if((ans == 'c' || ans == 'C') && n == 1){
            System.out.println(CC_Functions.green + "\n\n\n\n\n\nCorrect!" + CC_Functions.reset);
            Score();
            CC_Functions.EnterKey();
        }
        else if((ans == 'd' || ans == 'D') && n == 2){
            System.out.println(CC_Functions.green + "\n\n\n\n\n\nCorrect!" + CC_Functions.reset);
            Score();
            CC_Functions.EnterKey();
        }
        else{
            System.out.println(CC_Functions.red + "\n\n\n\n\n\nUnfortunately, your answer is wrong... :(" + CC_Functions.reset);
            CC_Functions.EnterKey();
            
        }
        challenge1_complete = 1;
        Comment();
    }
    
    public void C2_Ans(char ans){
        n++;
        if((ans == 'a' || ans == 'A') && n == 3){
            Score();
        } 
        else if((ans == 'b' || ans == 'B') && n == 4){
            Score();
        }
        else if((ans == 'c' || ans == 'C') && n == 5){
            Score();
        }
        else if((ans == 'd' || ans == 'D') && n == 1){
            Score();
        }
        else if((ans == 'e' || ans == 'E') && n == 2){
            Score();
        }
        challenge2_complete = 1;
        Comment();
    }

    public void C3_Ans(String ans){
        String n1_ans = "temperature";
        String n2_ans = "greenhouse gas";
        String n3_ans = "climate change";
        String n4_ans = "sea level";
        String n5_ans = "weather";

        ans = ans.toLowerCase();

        if(n == 1 && n1_ans.equals(ans)){
            System.out.println(CC_Functions.green + "\n\n\n\n\n\nCorrect!" + CC_Functions.reset);
            Score();
            CC_Functions.EnterKey();
        } 
        else if(n == 2 && n2_ans.equals(ans)){
            System.out.println(CC_Functions.green + "\n\n\n\n\n\nCorrect!" + CC_Functions.reset);
            Score();
            CC_Functions.EnterKey();
        }
        else if(n == 3 && n3_ans.equals(ans)){
            System.out.println(CC_Functions.green + "\n\n\n\n\n\nCorrect!" + CC_Functions.reset);
            Score();
            CC_Functions.EnterKey();        
        }
        else if(n == 4 && n4_ans.equals(ans)){
            System.out.println(CC_Functions.green + "\n\n\n\n\n\nCorrect!" + CC_Functions.reset);
            Score();
            CC_Functions.EnterKey();        
        }
        else if(n == 5 && n5_ans.equals(ans)){
            System.out.println(CC_Functions.green + "\n\n\n\n\n\nCorrect!" + CC_Functions.reset);
            Score();
            CC_Functions.EnterKey();     
        }
        else{
            System.out.println(CC_Functions.red + "\n\n\n\n\n\nUnfortunately, your answer is wrong... :(" + CC_Functions.reset);
            CC_Functions.EnterKey();
        }
        challenge3_complete = 1;   
        Comment();
    }

    public void Comment(){
        CC_Functions.clrscr();
        if(point == 5 && n == 5){
            System.out.println("\n\n\n\n\n\nCongrats! You've got all of the answers correct out of all 5 questions!\nJob Well Done!");
            point = 0;
            CC_Functions.EnterKey();
        }
        else if((point > 2 && point < 5) && n == 5){
            System.out.println("\n\n\n\n\n\nExcellent! You've got " + point + " answers correct out of all 5 questions!");
            point = 0;
            CC_Functions.EnterKey();
        }
        else if((point > 0 && point < 3) && n == 5){
            System.out.println("\n\n\n\n\n\nYou've got " + point + " answers correct out of all 5 questions. Keep up the good work!");
            point = 0;
            CC_Functions.EnterKey();
        }
        else if(point == 0 && n == 5){
            System.out.println(CC_Functions.red + "\n\n\n\n\n\nUh Ohhh...You've got all of the answers wrong... :(\n" + CC_Functions.reset + CC_Functions.yellow + "Even so... You've still got a long way to go. So CHEER~UP and have a better luck next time! ;)" + CC_Functions.reset);
            point = 0;
            CC_Functions.EnterKey();
        }
    }
}