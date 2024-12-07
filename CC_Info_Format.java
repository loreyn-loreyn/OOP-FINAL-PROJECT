abstract class CC_Info_Format{
    
    protected String title, details, creator;

    static CC_Functions CC_Functions = new Function();
    
    public CC_Info_Format(String title, String details){
        this.title = title;
        this.details = details;
    }

    public CC_Info_Format(String title, String details, String creator){
        this.title = title;
        this.details = details;
        this.creator = creator;
    }

    public void display_details1(){ //For those without links and authors
        System.out.println("\n\n\n\n\n\n" + CC_Functions.blue + "-> " + CC_Functions. _blue + title + CC_Functions.reset + "\n");
        System.out.println("\t" +  details);
        CC_Functions.EnterBackKey();
    }

    public void display_details2(){ //For those with links & authors
        System.out.println("\n\n\n\n\n\n" + CC_Functions.blue + "-> " + CC_Functions. _blue + title + CC_Functions.reset + "\n");
        System.out.println(CC_Functions.lightblack + "   Written By: " + creator + "\n" + CC_Functions.reset);
        System.out.println("\t" +  details);
    }

    public void display_details3(){ //For those with links
        System.out.println(CC_Functions.blue + "\n-> " + CC_Functions. _blue + title + CC_Functions.reset + "\n");
        System.out.println("\t" +  details);
    }
}

class Title_Detail extends CC_Info_Format{

    public Title_Detail(String title, String details){
        super(title, details);
    }

}

class Article_Detail extends CC_Info_Format{
    private String link;

    public Article_Detail(String title, String details, String creator, String link){
        super(title, details);
        this.creator = creator;
        this.link = link;
    }

    @Override
    public void display_details2(){
        super.display_details2();
        System.out.println(CC_Functions.yellow + "\n\nClick the link to read more: " + CC_Functions. _white + link + CC_Functions.reset);
        CC_Functions.EnterBackKey();
    }
}

class TD_withLink extends CC_Info_Format{
    private String link;

    public TD_withLink(String title, String details, String link){
        super(title, details);
        this.link = link;
    }

    @Override
    public void display_details3(){
        System.out.println("\n\n\n\n");
        super.display_details3();
        System.out.println(CC_Functions.yellow + "\n\nClick the link to read more: " + CC_Functions. _white + link + CC_Functions.reset);
        System.out.println(CC_Functions.magenta + "\n\n\n\t\t\t\t\t\t\t\t\t (2/2 pages)");
        CC_Functions.EnterBackKey();
    }

}

class NRDC_Mission extends CC_Info_Format{

    public NRDC_Mission(String title, String details){
        super(title, details);
    }

    @Override
    public void display_details3(){
        System.out.println(CC_Functions.boldwhite + "\n\n\n\n\n\nWHAT IS NATURAL RESOURCES DEFENCE COUNCIL ABOUT AND ITS MISSION" + CC_Functions.reset);
        super.display_details3();
        System.out.println(CC_Functions.magenta + "\n\n\n\t\t\t\t\t\t\t\t\t (1/2 pages)");
        CC_Functions.EnterKey();
    }

}