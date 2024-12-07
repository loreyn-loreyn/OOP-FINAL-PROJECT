import java.io.Console;

abstract class CC_Functions {

    String black = "\u001B[30m", red = "\u001B[31m", green = "\u001B[32m", yellow = "\u001B[33m", blue = "\u001B[34m", magenta = "\u001B[35m", cyan = "\u001B[36m", white = "\u001B[37m", reset = "\u001B[0m";
    String blackbg = "\u001B[40m", redbg = "\u001B[41m", greenbg  = "\u001B[42m", yellowbg = "\u001B[43m", bluebg = "\u001B[44m", magentabg = "\u001B[45m", cyanbg = "\u001B[46m", whitebg = "\u001B[47m", resetbg = "\u001B[0m";
    String boldblack = "\033[1;30m", boldred = "\033[1;31m", boldgreen = "\033[1;32m", boldyellow = "\033[1;33m", boldblue = "\033[1;34m", boldmagenta = "\033[1;35m", boldcyan = "\033[1;36m", boldwhite = "\033[1;37m";
    String bright_boldblack = "\033[1;90m", bright_boldred = "\033[1;91m", bright_boldgreen = "\033[1;92m", bright_boldyellow = "\033[1;93m", bright_boldblue = "\033[1;94m", bright_boldmagenta = "\033[1;95m", bright_boldcyan = "\033[1;96m", bright_boldwhite = "\033[1;97m";
    String lightblack = "\033[0;90m", lightred = "\033[0;91m", lightgreen = "\033[0;92m", lightyellow = "\033[0;93m", lightblue = "\033[0;94m", lightmagenta = "\033[0;95m", lightcyan = "\033[0;96m", lightwhite = "\033[0;97m";
    String _black = "\033[4;30m", _red = "\033[4;31m", _green = "\033[4;32m", _yellow = "\033[4;33m", _blue = "\033[4;34m", _magenta = "\033[4;35m", _cyan = "\033[4;36m", _white = "\033[4;37m"; 

    abstract void EnterKeyError();
    abstract void EnterBackKey();
    abstract void EnterKey();
    abstract void clrscr();

}

class Function extends CC_Functions{

    public void EnterKeyError(){
        System.out.println(red + "\n\n\n\n\n\nNumber of choice is not included in the list of choices in Menu." + reset);
        System.out.println(lightblack + "\nPress enter to continue and try again." + reset);       
        Console c = System.console();
        if (c != null) {
            c.readLine();
            clrscr();
        }
    }

    public void EnterBackKey(){ 
        System.out.println(lightblack + "\nPress enter to go back..." + reset);       
        Console c = System.console();
        if (c != null) {
            c.readLine();
            clrscr();
        }
    }

    public void EnterKey(){
        System.out.println(lightblack + "\nPress enter to continue..." + reset);       
        Console c = System.console();
        if (c != null) {
            c.readLine();
            clrscr();
        }
    }

    public void clrscr(){
        System.out.print("\033[H\033[2J");
        System.out.flush();    
    }

}