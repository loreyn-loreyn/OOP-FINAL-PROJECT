import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class User_Name {
    static Scanner in = new Scanner(System.in);
	private String user_name;

    String input_name;

	public String getUser_Name(){
        user_name = input_name;
		return user_name;
	}

}

public class Main {
    static Scanner in = new Scanner(System.in);
    private static int userInput = 0;
    private static List<CC_Info_Format> CC_Info1 = new ArrayList<>();
    private static List<CC_Info_Format> CC_Info2 = new ArrayList<>();
    private static List<CC_Info_Format> CC_Info3 = new ArrayList<>();
    private static List<CC_Challenges> CC_Challenges1 = new ArrayList<>();
    private static List<CC_Challenges> CC_Challenges2 = new ArrayList<>();
    private static List<CC_Challenges> CC_Challenges3 = new ArrayList<>();

    static int choice = 0, complete = 0;
 
    static CC_Functions CC_Functions = new Function();
    static User_Name User_Name = new User_Name();
    
    public static int InvalidInput(){
        while (true) {
            try {
                userInput = in.nextInt();  // Try to read an integer
                return userInput;
            }
            catch (InputMismatchException e) {
                System.out.print(CC_Functions.red + "Invalid input!!!" + CC_Functions.yellow + "\n\nPlease re-enter the number of your choice: " + CC_Functions.reset);
                in.next();  // Consume the invalid input to avoid an infinite loop
            }
        }
    }
    
    public static void main(String[] args){    
        System.out.println("\n\n\n\n\n\nWelcome to Your Cli-Mate Learning Application!\n");

        System.out.print(CC_Functions.white + "To proceed, please enter your name: " + CC_Functions.reset);
        User_Name.input_name = in.nextLine();

        User_Name.getUser_Name();

        while(User_Name.getUser_Name().equals("")){
            System.out.print("\nYou have not yet entered your name. To proceed, please enter your name: ");
            User_Name.input_name = in.nextLine();
        }

        CC_Functions.clrscr();

        System.out.println(CC_Functions.lightyellow + "\n\n\n\n\n\nName Successfully Saved!" + CC_Functions.reset);
        CC_Functions.EnterKey();

        do{
            System.out.println("\n\n\n\n\n");
            System.out.println("Select the course of action you want to do from the menu below.\n");
            System.out.println(CC_Functions.lightcyan + "|==========================================================================================|");  
            System.out.println("| Main Menu                                                                                |");
            System.out.println("|==========================================================================================|");   
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 1. Learn About Climate Change                                                            "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 2. Learn the Important Reasons for Taking Action Against Climate Change                  "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 3. Learn the Solutions for Climate Change, Provided by Natural Resources Defence Council "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 4. Learn Ways to Help Reducing the Impact of Climate Change                              "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 5. Learn Details About Existing Campaigns Fighting Against Climate Change                "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 6. Do Challenges                                                                         "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 7. Check Progress                                                                        "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 8. Learn What Your Cli-Mate Learning Application is About                                "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 9. Exit/Quit                                                                             "+ CC_Functions.lightcyan + "|");
            System.out.println("|==========================================================================================|\n" + CC_Functions.reset);
            System.out.print(CC_Functions.yellow + "Please enter the number of your choice: " + CC_Functions.reset);

            InvalidInput();

            choice = userInput;
            CC_Functions.clrscr();

            switch(choice){
                case 1:
                    About_Climate_Change();
                    break;
                case 2:
                    Reasons();
                    break;
                case 3:
                    Solutions();
                    break;
                case 4:
                    Ways();
                    break;
                case 5:
                    Campaigns();
                    break;
                case 6:
                    Challenges();                
                    break;
                case 7:
                    Progress();
                    break;
                case 8:
                    About();
                    break;
                case 9:
                    System.out.println("\n\n\n\n\nThank you for using Your Cli-Mate Learning Application!\nGoodbye and have a nice day!\n\n\n\n\n");
                    return;
                default: 
                    CC_Functions.EnterKeyError();
            }
        }
        while(choice != 9);

        in.close();
    }

    public static void About_Climate_Change(){

        System.out.println(CC_Functions.green + "\n\n\n\n\n\n-> "  + CC_Functions._green + "What is Climate Change?" + CC_Functions.reset);
        System.out.println("\n\tClimate change refers to significant and lasting changes in the Earth's temperatures and weather patterns. These changes can be from natural causes (such as large volcanic activity) or from human activities. Since the Industrial Revolution in the 1800s, humans have been the main driver of climate change, primarily due to the burning of fossil fuels like coal, oil, and gas.");
        System.out.println(CC_Functions.green + "\n\n-> "  + CC_Functions._green +  "Key Impacts of Climate Change:\n" + CC_Functions.reset);
        System.out.println(CC_Functions.yellow + "\t1) " + CC_Functions._yellow +"Rising Global Temperatures:" + CC_Functions.reset);
        System.out.println("\t\tThe Earth's average temperature has risen by about 1.2°C since the late 19th century, with the last decade being the warmest on record.");
        System.out.println(CC_Functions.yellow + "\n\t2) " + CC_Functions._yellow +"Melting Polar Ice and Rising Sea Levels:" + CC_Functions.reset);
        System.out.println("\t\tThe polar ice caps are melting at an alarming rate, contributing to rising sea levels, which threaten coastal communities worldwide.");
        System.out.println(CC_Functions.yellow + "\n\t3) " + CC_Functions._yellow +"Extreme Weather Events:" + CC_Functions.reset);
        System.out.println("\t\tThe frequency and intensity of hurricanes, droughts, floods, and wildfires are increasing.");
        System.out.println(CC_Functions.yellow + "\n\t4) " + CC_Functions._yellow +"Biodiversity Loss:" + CC_Functions.reset);
        System.out.println("\t\tMany species are facing extinction due to changing habitats and ecosystems, disrupting the balance of natural systems.");

        CC_Functions.EnterKey();

        do{
            System.out.println("\n\n\n\n\n");
            System.out.println("Select the number of the choice that you wish to view or learn about.\n");
            System.out.println(CC_Functions.lightcyan + "|===========================|");
            System.out.println("| About Climate Change Menu |");
            System.out.println("|===========================|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 1. Causes                 "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 2. Effects                "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 3. Scary Facts            "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 4. Articles               "+ CC_Functions.lightcyan + "|"); //State that only titles and their links are provided
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 5. Back                   "+ CC_Functions.lightcyan + "|");
            System.out.println(CC_Functions.lightcyan + "|===========================|\n" + CC_Functions.reset);
            System.out.print(CC_Functions.yellow + "Please enter the number of your choice: " + CC_Functions.reset);
            //choice2 = in.nextInt();

            InvalidInput();

            choice = userInput;
            CC_Functions.clrscr();

            switch(choice){
                case 1:
                    Causes();
                    break;
                case 2:
                    Effects();
                    break;
                case 3:
                    ScaryFacts();
                    break;
                case 4:
                    Articles();
                    break;
                case 5: 
                    return;
                default: 
                    CC_Functions.EnterKeyError();
            }
        }
        while(choice != 5);

        in.close();
    }

    public static void Causes(){
        
        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions._red + "\tAs greenhouse gas emissions blanket the Earth, they trap the sun's heat. This leads to global warming and climate change. The world is now warming faster than at any point in recorded history." + CC_Functions.reset);

        CC_Functions.EnterKey();
            
        do{
            CC_Info1.clear();
            System.out.println("\n\n\n\n\n");
            System.out.println("Select the number of the choice that you wish to view or learn about.\n");
            System.out.println(CC_Functions.lightcyan + "|============================|");
            System.out.println("| Climate Change Causes Menu |");
            System.out.println("|============================|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 1. Generating power        "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 2. Manufacturing goods     "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 3. Cutting down forests    "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 4. Using transportation    "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 5. Producing food          "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 6. Powering buildings      "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 7. Consuming too much      "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 8. Back                    "+ CC_Functions.lightcyan + "|");
            System.out.println("|============================|\n" + CC_Functions.reset);
            System.out.print(CC_Functions.yellow + "Please enter the number of your choice: " + CC_Functions.reset);
            
            InvalidInput();

            choice = userInput;
            CC_Functions.clrscr();

            switch(choice){
                case 1:
                    CC_Info1.add(new Title_Detail("Generating power", 
                        "Generating electricity and heat by burning fossil fuels causes a large chunk of global emissions. Most electricity is still generated by burning coal, oil, or gas, which produces carbon dioxide and nitrous oxide - powerful greenhouse gases that blanket the Earth and trap the sun's heat. Globally, a bit more than a quarter of electricity comes from wind, solar and other renewable sources which, as opposed to fossil fuels, emit little to no greenhouse gases or pollutants into the air."));
                    displayCC_Info1();
                    break;
                case 2:
                    CC_Info1.add(new Title_Detail("Manufacturing goods", 
                        "Manufacturing and industry produce emissions, mostly from burning fossil fuels to produce energy for making things like cement, iron, steel, electronics, plastics, clothes, and other goods. Mining and other industrial processes also release gases, as does the construction industry. Machines used in the manufacturing process often run on coal, oil, or gas; and some materials, like plastics, are made from chemicals sourced from fossil fuels. The manufacturing industry is one of the largest contributors to greenhouse gas emissions worldwide."));
                    displayCC_Info1();
                    break;
                case 3:
                    CC_Info1.add(new Title_Detail("Cutting down forests", 
                        "Cutting down forests to create farms or pastures, or for other reasons, causes emissions, since trees, when they are cut, release the carbon they have been storing. Each year approximately 12 million hectares of forest are destroyed. Since forests absorb carbon dioxide, destroying them also limits nature's ability to keep emissions out of the atmosphere. Deforestation, together with agriculture and other land use changes, is responsible for roughly a quarter of global greenhouse gas emissions."));
                    displayCC_Info1();
                    break;
                case 4:
                    CC_Info1.add(new Title_Detail("Using transportation", 
                        "Most cars, trucks, ships, and planes run on fossil fuels. That makes transportation a major contributor of greenhouse gases, especially carbon-dioxide emissions. Road vehicles account for the largest part, due to the combustion of petroleum-based products, like gasoline, in internal combustion engines. But emissions from ships and planes continue to grow. Transport accounts for nearly one quarter of global energy-related carbon-dioxide emissions. And trends point to a significant increase in energy use for transport over the coming years."));
                    displayCC_Info1();
                    break;
                case 5:
                    CC_Info1.add(new Title_Detail("Producing food", 
                        "Producing food causes emissions of carbon dioxide, methane, and other greenhouse gases in various ways, including through deforestation and clearing of land for agriculture and grazing, digestion by cows and sheep, the production and use of fertilizers and manure for growing crops, and the use of energy to run farm equipment or fishing boats, usually with fossil fuels. All this makes food production a major contributor to climate change. And greenhouse gas emissions also come from packaging and distributing food."));
                    displayCC_Info1();
                    break;
                case 6: 
                    CC_Info1.add(new Title_Detail("Powering buildings", 
                        "Globally, residential and commercial buildings consume over half of all electricity. As they continue to draw on coal, oil, and natural gas for heating and cooling, they emit significant quantities of greenhouse gas emissions. Growing energy demand for heating and cooling, with rising air-conditioner ownership, as well as increased electricity consumption for lighting, appliances, and connected devices, has contributed to a rise in energy-related carbon-dioxide emissions from buildings in recent years."));
                    displayCC_Info1();             
                    break;
                case 7: 
                    CC_Info1.add(new Title_Detail("Consuming too much", 
                        "Your home and use of power, how you move around, what you eat and how much you throw away all contribute to greenhouse gas emissions. So does the consumption of goods such as clothing, electronics, and plastics. A large chunk of global greenhouse gas emissions are linked to private households. Our lifestyles have a profound impact on our planet. The wealthiest bear the greatest responsibility: the richest 1 per cent of the global population combined account for more greenhouse gas emissions than the poorest 50 per cent."));
                    displayCC_Info1();            
                    break;
                case 8: 
                    return;
                default: 
                    CC_Functions.EnterKeyError();
            }
        }
        while(choice != 8);

        in.close();
    }

    public static void Effects(){
        
        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions._red + "\tWarmer temperatures over time are changing weather patterns and disrupting the usual balance of nature. This poses many risks to human beings and all other forms of life on Earth." + CC_Functions.reset);

        CC_Functions.EnterKey();
            
        do{
            CC_Info1.clear();
            System.out.println("\n\n\n\n\n");
            System.out.println("Select the number of the choice that you wish to view or learn about.\n");
            System.out.println(CC_Functions.lightcyan + "|=============================|");
            System.out.println("| Climate Change Effects Menu |");
            System.out.println("|=============================|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 1. Hotter temperatures      "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 2. More severe storms       "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 3. Increased drought        "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 4. A warming, rising ocean  "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 5. Loss of species          "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 6. Not enough food          "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 7. More health risks        "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 8. Poverty and displacement "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 9. Back                     "+ CC_Functions.lightcyan + "|");
            System.out.println("|=============================|\n" + CC_Functions.reset);
            System.out.print(CC_Functions.yellow + "Please enter the number of your choice: " + CC_Functions.reset);
            
            InvalidInput();

            choice = userInput;
            CC_Functions.clrscr();

            switch(choice){
                case 1:
                    CC_Info1.add(new Title_Detail("Hotter temperatures", 
                        "As greenhouse gas concentrations rise, so does the global surface temperature. The last decade, 2011-2020, is the warmest on record. Since the 1980s, each decade has been warmer than the previous one. Nearly all land areas are seeing more hot days and heat waves. Higher temperatures increase heat-related illnesses and make working outdoors more difficult. Wildfires start more easily and spread more rapidly when conditions are hotter. Temperatures in the Arctic have warmed at least twice as fast as the global average."));
                    displayCC_Info1();
                    break;
                case 2:
                    CC_Info1.add(new Title_Detail("More severe storms", 
                        "Destructive storms have become more intense and more frequent in many regions. As temperatures rise, more moisture evaporates, which exacerbates extreme rainfall and flooding, causing more destructive storms. The frequency and extent of tropical storms is also affected by the warming ocean. Cyclones, hurricanes, and typhoons feed on warm waters at the ocean surface. Such storms often destroy homes and communities, causing deaths and huge economic losses."));
                    displayCC_Info1();
                    break;
                case 3:
                    CC_Info1.add(new Title_Detail("Increased drought", 
                        "Climate change is changing water availability, making it scarcer in more regions. Global warming exacerbates water shortages in already water-stressed regions and is leading to an increased risk of agricultural droughts affecting crops, and ecological droughts increasing the vulnerability of ecosystems. Droughts can also stir destructive sand and dust storms that can move billions of tons of sand across continents. Deserts are expanding, reducing land for growing food. Many people now face the threat of not having enough water on a regular basis."));
                    displayCC_Info1();
                    break;
                case 4:
                    CC_Info1.add(new Title_Detail("A warming, rising ocean", 
                        "The ocean soaks up most of the heat from global warming. The rate at which the ocean is warming strongly increased over the past two decades, across all depths of the ocean. As the ocean warms, its volume increases since water expands as it gets warmer. Melting ice sheets also cause sea levels to rise, threatening coastal and island communities. In addition, the ocean absorbs carbon dioxide, keeping it from the atmosphere. But more carbon dioxide makes the ocean more acidic, which endangers marine life and coral reefs."));
                    displayCC_Info1();
                    break;
                case 5:
                    CC_Info1.add(new Title_Detail("Loss of species", 
                        "Climate change poses risks to the survival of species on land and in the ocean. These risks increase as temperatures climb. Exacerbated by climate change, the world is losing species at a rate 1,000 times greater than at any other time in recorded human history. One million species are at risk of becoming extinct within the next few decades. Forest fires, extreme weather, and invasive pests and diseases are among many threats related to climate change. Some species will be able to relocate and survive, but others will not."));
                    displayCC_Info1();
                    break;
                case 6: 
                    CC_Info1.add(new Title_Detail("Not enough food", 
                        "Changes in the climate and increases in extreme weather events are among the reasons behind a global rise in hunger and poor nutrition. Fisheries, crops, and livestock may be destroyed or become less productive. With the ocean becoming more acidic, marine resources that feed billions of people are at risk. Changes in snow and ice cover in many Arctic regions have disrupted food supplies from herding, hunting, and fishing. Heat stress can diminish water and grasslands for grazing, causing declining crop yields and affecting livestock."));
                    displayCC_Info1();   
                    break;
                case 7: 
                    CC_Info1.add(new Title_Detail("More health risks", 
                        "Climate change is the single biggest health threat facing humanity. Climate impacts are already harming health, through air pollution, disease, extreme weather events, forced displacement, pressures on mental health, and increased hunger and poor nutrition in places where people cannot grow or find sufficient food. Every year, environmental factors take the lives of around 13 million people. Changing weather patterns are expanding diseases, and extreme weather events increase deaths and make it difficult for health care systems to keep up."));
                    displayCC_Info1();
                    break;
                case 8: 
                    CC_Info1.add(new Title_Detail("Poverty and displacement", 
                        "Climate change increases the factors that put and keep people in poverty. Floods may sweep away urban slums, destroying homes and livelihoods. Heat can make it difficult to work in outdoor jobs. Water scarcity may affect crops. Over the past decade (2010 - 2019), weather-related events displaced an estimated 23.1 million people on average each year, leaving many more vulnerable to poverty. Most refugees come from countries that are most vulnerable and least ready to adapt to the impacts of climate change."));
                    displayCC_Info1();
                    break;
                case 9: 
                    return;
                default: 
                    CC_Functions.EnterKeyError();
            }
        }
        while(choice != 9);

        in.close();
    }

    public static void ScaryFacts(){

        do{
            CC_Info1.clear();
            System.out.println("\n\n\n\n\n");
            System.out.println("Select the number of the choice that you wish to view or learn about.\n");
            System.out.println(CC_Functions.lightcyan + "|===========================================================|");
            System.out.println("| Climate Change Scary Facts Menu                           |");
            System.out.println("|===========================================================|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 1. Climate change could be irreversible by 2030           "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 2. Greenhouse gas levels are at an all-time high          "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 3. More than 1 million species face extinction            "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 4. Climate change is creating a refugee crisis            "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 5. Our oceans are dying                                   "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 6. We use more of the earth's resources than it can renew "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 7. Back                                                   "+ CC_Functions.lightcyan + "|");
            System.out.println("|===========================================================|\n" + CC_Functions.reset);
            System.out.print(CC_Functions.yellow + "Please enter the number of your choice: " + CC_Functions.reset);

            InvalidInput();

            choice = userInput;
            CC_Functions.clrscr();

            switch(choice){
                case 1:
                    CC_Info1.add(new Title_Detail("Climate change could be irreversible by 2030", 
                        "According to a report conducted by the UN Intergovernmental Panel on Climate Change (IPCC), urgent action is needed to avoid the catastrophic effects of global warming.\n\n\tWithout change, the world's coral reefs could be completely eradicated, and we could see an increase in widespread flooding, extreme heat, drought and poverty."));
                    displayCC_Info1();
                    break;
                case 2:
                    CC_Info1.add(new Title_Detail("Greenhouse gas levels are at an all-time high", 
                        "There are more greenhouse gases in the atmosphere than ever before, and that's causing the earth's temperature to rise.\n\n\tThe burning of fossil fuels, emissions from transport, and the environmental impact of intensive farming have all contributed to high levels of CO2 in our atmosphere. And scientists say this is the fastest and largest increase in CO2 the world has ever seen."));
                    displayCC_Info1();
                    break;
                case 3:
                    CC_Info1.add(new Title_Detail("More than 1 million species face extinction", 
                        "While the expected rate of species extinction is usually around 5 species a year, we're currently losing up to 10,000 times the normal rate - this means that dozens of species go extinct every single day.\n\n\tThis loss of biodiversity reduces water quality and food security, and also results in a loss of natural pest control as predators like frogs and spiders become extinct."));
                    displayCC_Info1();
                    break;
                case 4:
                    CC_Info1.add(new Title_Detail("Climate change is creating a refugee crisis", 
                        "As global temperatures increase, millions of people are fleeing their homes to avoid the impacts of droughts and extreme storms. And these numbers are set to rise. The International Organisation on Migration estimates that up to 200 million people could be displaced by climate change by 2050.\n\n\tAround 50% of all carbon emissions are emitted by the richest 10% of the world's population. Yet global warming is making climate change refugees of the world's poorest."));
                    displayCC_Info1();
                    break;
                case 5:
                    CC_Info1.add(new Title_Detail("Our oceans are dying", 
                        "Our planet is only as healthy as its oceans. And the UN has warned that marine life faces irreparable damage from the millions of tonnes of plastic waste that ends up in the oceans every year.\n\n\tHalf of the world's coral reefs have died in the last 30 years, and two thirds of the Great Barrier Reef have been damaged by coral bleaching - this happens when the sea temperature is too high.\n\n\tWhales, dolphins, porpoises and sea lions all suffer from bycatch from global fishing. In fact, hundreds of thousands of marine mammals are accidentally caught or critically injured by fishing gear every year."));
                    displayCC_Info1();
                    break;
                case 6:
                    CC_Info1.add(new Title_Detail("We use more of the earth's resources than it can renew", 
                        "Earth Overshoot Day is the date when we've used up more from nature than the planet can possibly renew in the entire year - and ever year, that date comes earlier.\n\n\tThe world's superpowers, including the UK and US, use more than double the amount of resources they're able to produce. If we carry on using the earth's resources at our current rate of consumption, we'd need 1.7 planets to support the demand on the earth's ecosystems.\n\n\tEveryone can do their bit to help prevent the effects of climate change, but we can only have an impact on the health of our planet if we act now. Check out our blog for tips on how to combat climate change or switch to Ecotricity, Britain's greenest energy company to get a truly green outcome for your energy bill."));
                    displayCC_Info1();
                    break;    
                case 7: 
                    return;
                default: 
                    CC_Functions.EnterKeyError();
            }
        }
        while(choice != 7);

        in.close();
    }

    public static void Articles(){

        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions.cyan + "Note: The following choices in the article menu only consists of the article's title with a short portion of its content to provide a brief overview about\n      the flow or content of the article. The link for the article is also provided in each choices.");

        CC_Functions.EnterKey();

        do{
            CC_Info2.clear();
            System.out.println("\n\n\n\n\n");
            System.out.println("Select the number of the choice that you wish to view or learn about.\n");
            System.out.println(CC_Functions.lightcyan + "|===============================================================================================================|");
            System.out.println("| Climate Change Article Menu                                                                                   |");
            System.out.println("|===============================================================================================================|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 1. Is the climate change food crisis even worse than we imagined?                                             "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 2. Climate Change Is Altering Animals' Colors                                                                 "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 3. Anthropogenic climate change doubled the frequency of compound drought and heatwaves in low-income regions "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 4. Climate Change Impacts on Air Quality                                                                      "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 5. How is the world doing on tackling climate change?                                                         "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 6. Back                                                                                                       "+ CC_Functions.lightcyan + "|");
            System.out.println("|===============================================================================================================|\n" + CC_Functions.reset);
            System.out.print(CC_Functions.yellow + "Please enter the number of your choice: " + CC_Functions.reset);

            InvalidInput();

            choice = userInput;
            CC_Functions.clrscr();

            switch(choice){
                case 1:
                    CC_Info2.add(new Article_Detail("Climate change impacts", 
                        "Extreme weather and a growing population are driving a food security crisis. What can we do to break the vicious cycle of carbon emissions, climate change and soaring food costs - or is it already too late?",
                        "Michael Le Page",
                        "https://www.newscientist.com/article/mg26435170-800-is-the-climate-change-food-crisis-even-worse-than-we-imagined/"));
                    displayCC_Info2();
                    break;
                case 2:
                    CC_Info2.add(new Article_Detail("Climate Change Is Altering Animals' Colors  ", 
                        "Lizards in France have grown lighter in color and so are many insects and birds across the globe. The effects of a changing climate are plainly visible throughout the animal kingdom",
                        "Marta Zaraska",
                        "https://www.scientificamerican.com/article/climate-change-is-altering-animals-colors/"));
                    displayCC_Info2();
                    break;
                case 3:
                    CC_Info2.add(new Article_Detail("Anthropogenic climate change doubled the frequency of compound drought and heatwaves in low-income regions", 
                        "Compound drought-heatwaves have garnered widespread attention due to their catastrophic consequences. However, little research has investigated inequalities in exposure to compound drought-heatwaves under climate change. Here, we reveal a significant disparity between low-income and high-income regions in terms of global compound drought-heatwave occurrence using observations and climate models. We find that low-income regions experienced a 377% [351 - 403%] increase in the frequency of compound drought-heatwaves from 1981 to 2020, which is twice as fast as the increase observed in high-income regions (184% [153 - 204%]). This inequality is largely attributed to a similar disparity in drought occurrence rather than heatwave occurrence. Climate change attribution suggests that anthropogenic warming has doubled the frequency of compound drought-heatwaves over 31% [14 - 50%] of low-income regions, compared to only 4.7% [0.9 - 8.3%] of high-income regions. The frequency of compound drought-heatwaves would not have increased in low-income regions without anthropogenic climate change but would still have risen in high-income regions.",
                        "Boen Zhang, Shuo Wang & Louise Slater",
                        "https://www.nature.com/articles/s43247-024-01894-7"));
                    displayCC_Info2();
                    break;
                case 4:
                    CC_Info2.add(new Article_Detail("Climate Change Impacts on Air Quality", 
                        "Clean air is critical to human health. It is also important for the health of vegetation and crops.1 It contributes to people's enjoyment of scenic areas, like national parks and wilderness areas.\n\n\tThe effects of climate change on air quality will continue to vary by region. In many areas of the United States, climate change is expected to worsen harmful ground-level ozone, increase people's exposure to allergens like pollen, and contribute to worsening air quality.2 It can also decrease visibility so that it is harder to see into the distance.3 Changes in the amount of outdoor air pollutants can also affect indoor air quality.\n\n\tClimate impacts on air quality will depend on what additional measures are taken to reduce air pollution. Regulatory initiatives, partnership programs, and individual actions can all help reduce air pollutants that harm human health, as well as greenhouse gases that contribute to climate change.",
                        "United States Environmental Protection Agency",
                        "https://www.epa.gov/climateimpacts/climate-change-impacts-air-quality"));
                    displayCC_Info2();
                    break;
                case 5:
                    CC_Info2.add(new Article_Detail("How is the world doing on tackling climate change?", 
                        "Scientists, politicians and world leaders are meeting at the annual UN climate summit, COP29, in Azerbaijan during what is set to be the hottest year on record.\n\n\tWhat progress have countries already made to tackle change?",
                        "Mark Poynting and Georgina Rannard\n   \tBBC Climate & Science",
                        "https://www.bbc.com/news/articles/cwy9dwg7rpeo")); 
                    displayCC_Info2();
                    break;
                case 6: 
                    return;
                default: 
                    CC_Functions.EnterKeyError();
            }
        }
        while(choice != 6);

        in.close();

    }

    public static void Reasons(){

        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions._red + "\tGiven in this menu are two (2) different international organizations that will provide you the reasons why you must take action against climate change. These reasons will help change your views about your current way of living and make you question the right way of living you should have as an individual living on this planet.\n" + CC_Functions.reset);
        CC_Functions.EnterKey();

        do{
            System.out.println("\n\n\n\n\n");
            System.out.println("Select the number of the choice that you wish to view or learn about.\n");
            System.out.println(CC_Functions.lightcyan + "|====================|");
            System.out.println("| Organizations Menu |");
            System.out.println("|====================|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 1. United Nations  "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 2. WWF             "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 3. Back            "+ CC_Functions.lightcyan + "|");
            System.out.println("|====================|\n" + CC_Functions.reset);
            System.out.print(CC_Functions.yellow + "Please enter the number of your choice: " + CC_Functions.reset);

            InvalidInput();

            choice = userInput;
            CC_Functions.clrscr();

            switch(choice){
                case 1:
                    UN_Reasons();
                    break;
                case 2:
                    WWF_Reasons();
                    break;
                case 3:
                    return;
                default: 
                    CC_Functions.EnterKeyError();
            }
        }
        while(choice != 3);

        in.close();
    }

    public static void UN_Reasons(){

        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions._blue + "\tEvery person, in every country in every continent will be impacted in some shape or form by climate change. There is a climate cataclysm looming, and we are underprepared for what this could mean.\n\n\tClimate change is caused by human activities and threatens life on earth as we know it. With rising greenhouse gas emissions, climate change is occurring at rates much faster than anticipated. Its impacts can be devastating and include extreme and changing weather patterns and rising sea levels.\n\n\tIf left unchecked, climate change will undo a lot of the development progress made over the past years. It will also provoke mass migrations that will lead to instability and wars.\n\n\tTo limit global warming to 1.5°C above pre- industrial levels, emissions must already be decreasing and need to be cut by almost half by 2030, just seven years away. But, we are drastically off track from this target.\n\n\tUrgent and transformative going beyond mere plans and promises are crucial. It requires raising ambition, covering entire economies and moving towards climate-resilient development, while outlining a clear path to achieve net-zero emissions. Immediate measures are necessary to avoid catastrophic consequences and secure a sustainable future for generations to come." + CC_Functions.yellow + CC_Functions.lightblack + "\n\n\t- United Nations' SDG Goal 13 : Climate Action" + CC_Functions.reset);

        CC_Functions.EnterKey();

        do{
            CC_Info1.clear();
            System.out.println("\n\n\n\n\n");
            System.out.println("Select the number of the choice that you wish to view or learn about.\n");
            System.out.println(CC_Functions.lightcyan + "|==================================================================|");
            System.out.println("| United Nations' Reasons For Fighting Against Climate Change Menu |");
            System.out.println("|==================================================================|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 1. Humans are responsible for global warming                     "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 2. People are experiencing climate change in diverse ways        "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 3. Every increase in global warming matters                      "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 4. We face a huge challenge but already know many solutions      "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 5. We can pay the bill now, or pay dearly in the future          "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 6. What is the United Nations Organization about?                "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 7. Back                                                          "+ CC_Functions.lightcyan + "|");
            System.out.println("|==================================================================|\n" + CC_Functions.reset);
            System.out.print(CC_Functions.yellow + "Please enter the number of your choice: " + CC_Functions.reset);

            InvalidInput();

            choice = userInput;
            CC_Functions.clrscr();

            switch(choice){
                case 1:
                    CC_Info1.add(new Title_Detail("Humans are responsible for global warming", 
                        "Climate scientists have showed that humans are responsible for virtually all global heating over the last 200 years. Human activities like the ones mentioned above are causing greenhouse gases that are warming the world faster than at any time in at least the last two thousand years.\n\n\tThe average temperature of the Earth's surface is now about 1.2°C warmer than it was in the late 1800s (before the industrial revolution) and warmer than at any time in the last 100,000 years. The last decade (2011-2020) was the warmest on record, and each of the last four decades has been warmer than any previous decade since 1850.\n\n\tMany people think climate change mainly means warmer temperatures. But temperature rise is only the beginning of the story. Because the Earth is a system, where everything is connected, changes in one area can influence changes in all others.\n\n\tThe consequences of climate change now include, among others, intense droughts, water scarcity, severe fires, rising sea levels, flooding, melting polar ice, catastrophic storms and declining biodiversity."));
                    displayCC_Info1();
                    break;
                case 2:
                    CC_Info1.add(new Title_Detail("People are experiencing climate change in diverse ways", 
                        "Climate change can affect our health, ability to grow food, housing, safety and work. Some of us are already more vulnerable to climate impacts, such as people living in small island nations and other developing countries. Conditions like sea-level rise and saltwater intrusion have advanced to the point where whole communities have had to relocate, and protracted droughts are putting people at risk of famine. In the future, the number of people displaced by weather-related events is expected to rise."));
                    displayCC_Info1();
                    break;
                case 3:
                    CC_Info1.add(new Title_Detail("Every increase in global warming matters", 
                        "In a series of UN reports, thousands of scientists and government reviewers agreed that limiting global temperature rise to no more than 1.5°C would help us avoid the worst climate impacts and maintain a livable climate. Yet policies currently in place point to up to 3.1°C of warming by the end of the century.\n\n\tThe emissions that cause climate change come from every part of the world and affect everyone, but some countries produce much more than others.The six biggest emitters (China, the United States of America, India, the European Union, the Russian Federation, and Brazil) togehter accounted for more than half of all global greenhouse gas emissions in 2023. By contrast, the 47 least developed countries accounted for only 3 per cent of global greenhouse gas emissions.\n\n\tEveryone must take climate action, but people and countries creating more of the problem have a greater responsibility to act first."));
                    displayCC_Info1();
                    break;
                case 4:
                    CC_Info1.add(new Title_Detail("We face a huge challenge but already know many solutions", 
                        "Many climate change solutions can deliver economic benefits while improving our lives and protecting the environment. We also have global frameworks and agreements to guide progress, such as the Sustainable Development Goals, the UN Framework Convention on Climate Change and the Paris Agreement. Three broad categories of action are: cutting emissions, adapting to climate impacts and financing required adjustments.\n\n\tSwitching energy systems from fossil fuels to renewables like solar or wind will reduce the emissions driving climate change. But we have to act now. While a growing number of countries is committing to net zero emissions by 2050, emissions must be cut in half by 2030 to keep warming below 1.5°C. Achieving this means huge declines in the use of coal, oil and gas: production and consumption of all fossil fuels need to be cut by at least 30 per cent by 2030 in order to prevent catastrophic levels of climate change.\n\n\tAdapting to climate consequences protects people, homes, businesses, livelihoods, infrastructure and natural ecosystems. It covers current impacts and those likely in the future. Adaptation will be required everywhere, but must be prioritized now for the most vulnerable people with the fewest resources to cope with climate hazards. The rate of return can be high. Early warning systems for disasters, for instance, save lives and property, and can deliver benefits up to 10 times the initial cost."));
                    displayCC_Info1();
                    break;
                case 5:
                    CC_Info1.add(new Title_Detail("We can pay the bill now, or pay dearly in the future", 
                        "Climate action requires significant financial investments by governments and businesses. But climate inaction is vastly more expensive. One critical step is for developed countries to support developing countries so they can adapt and move towards greener economies."));
                    displayCC_Info1();
                    break;
                case 6:
                    CC_Info1.add(new Title_Detail("What is the United Nations Organization about?", 
                        "The United Nations is an international organization founded in 1945. Currently made up of 193 Member States, the UN and its work are guided by the purposes and principles contained in its founding Charter.\n\n\tThe UN has evolved over the years to keep pace with a rapidly changing world.\n\n\tBut one thing has stayed the same: it remains the one place on Earth where all the world's nations can gather together, discuss common problems, and find shared solutions that benefit all of humanity."));
                    displayCC_Info1();
                    break;
                case 7: 
                    return;
                default: 
                    CC_Functions.EnterKeyError();
            }
        }
        while(choice != 7);

        in.close();
    }

    public static void WWF_Reasons(){
        
        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions._blue + "\tWe're all concerned about climate change, but when it looks like a problem for future generations, you ask yourself, \"Will climate change even affect me?\". No matter what you care about, climate change is already affecting our world today." + CC_Functions.yellow + CC_Functions.lightblack + "\n\n\t- WWF" + CC_Functions.reset);

        CC_Functions.EnterKey();
            
        do{
            CC_Info1.clear();
            System.out.println("\n\n\n\n\n");
            System.out.println("Select the number of the choice that you wish to view or learn about.\n");
            System.out.println(CC_Functions.lightcyan + "|======================================================================|");
            System.out.println("| WWF's Reasons For Fighting Against Climate Change Menu               |");
            System.out.println("|======================================================================|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 1. Because snow leopards, turtles and polar bears are awesome        "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 2. Because you need your morning coffee fix                          "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 3. Because coral reefs are amazing                                   "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 4. Because we all need clean water                                   "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 5. Because we all hate the sight of politicians in wellies           "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 6. Because rainforests are incredible                                "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 7. Because we all deserve to breathe clean air                       "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 8. Because clean tech is exciting                                    "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 9. Because we are all affected, no matter where in the world we live "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 10. Because of future generations                                    "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 11. What is the WWWF Organization about?                             "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 12. Back                                                             "+ CC_Functions.lightcyan + "|");
            System.out.println("|======================================================================|\n" + CC_Functions.reset);
            System.out.print(CC_Functions.yellow + "Please enter the number of your choice: " + CC_Functions.reset);
            
            InvalidInput();

            choice = userInput;
            CC_Functions.clrscr();

            switch(choice){
                case 1:
                    CC_Info1.add(new Title_Detail("Because snow leopards, turtles and polar bears are awesome", 
                        "Climate change will mean big changes for animals around the world. So if we care about incredible species, we must care about how a changing climate will make it harder for them to find food, and decrease their habitats - from forest to sea ice to the UK's rivers and chalk streams."));
                    displayCC_Info1();
                    break;
                case 2:
                    CC_Info1.add(new Title_Detail("Because you need your morning coffee fix", 
                        "If you're one of those people who need a coffee hit to get going, mornings may become grim. The effects of climate change on coffee are well-documented and coffee producers are already seeing reduced harvests, and more pests, because of it. Even if you're caffeine-free you're not in the clear - wine production may also be hit."));
                    displayCC_Info1();
                    break;
                case 3:
                    CC_Info1.add(new Title_Detail("Because coral reefs are amazing", 
                        "Finding Nemo or Dory may become harder as their beautiful homes crumble under the stress of our changing climate. Warmer air and ocean temperatures cause coral bleaching, where corals lose their colour and may die. Ocean acidification - from increased CO2 in the atmosphere - compounds the problem. Today, the ocean is 26% more acidic than it was in 1990, and the Great Barrier Reef has just experienced unprecedented back-to-back bleaching events in 2016 and 2017. Climate change is very bad news for anyone hoping to see the Great Barrier Reef one day."));
                    displayCC_Info1();
                    break;
                case 4:
                    CC_Info1.add(new Title_Detail("Because we all need clean water", 
                        "Did you know that 2 in every 3 people worldwide live in regions of severe water scarcity? Even a small increase in global temperatures will destabilise the water cycle and could make water scarcity much worse. Climate change affects rainfall patterns, meaning both drought and flooding will be more common, and more intense. And although it's hardly comparable with life-threatening floods, climate change may already be making you late for work."));
                    displayCC_Info1();
                    break;
                case 5:
                    CC_Info1.add(new Title_Detail("Because we all hate the sight of politicians in wellies", 
                        "Globally temperature records  have been broken in recent years, and flooding in the UK gets worse. Year after year we've seen politicians wading through floods in Somerset, hopping into dinghies in Cornwall and arguing with each other in Westminster. More frequent and more intense extreme weather is a documented result of our greenhouse gas emissions, and the annual cost of flooding in the UK could increase 15-fold by the 2080s. We need to see politicians taking serious action on reducing the UK's carbon footprint, not looking for the next photo opportunity."));
                    displayCC_Info1();
                    break;
                case 6: 
                    CC_Info1.add(new Title_Detail("Because rainforests are incredible", 
                        "Unique, irreplaceable, and often described as 'the world's lungs', rainforests are some of the most precious habitats on the planet. They really are amazing; the Amazon, for example, is home to an astonishing 1 in 10 of all the known species on Earth. Yet over a third of the Amazon rainforest is already threatened by climate change. It's a double-edged sword too: worldwide, forest destruction - mainly for agriculture - is a major cause of climate change, generating an incredible amount of greenhouse gases."));
                    displayCC_Info1();
                    break;
                case 7: 
                    CC_Info1.add(new Title_Detail("Because we all deserve to breathe clean air", 
                        "With increasing carbon emissions, it stands to reason that we face compromised air quality. This affects human health, especially children. Air pollution can lead to asthma, heart and lung disease. Beijing's insidious smog is a visible reminder of this, but bad air quality is also making headlines in the UK, and has been labelled a 'public health emergency' by MPs."));
                    displayCC_Info1();
                    break;
                case 8: 
                    CC_Info1.add(new Title_Detail("Because clean tech is exciting", 
                        "It's not all bad news. Some of the biggest advancements in technology over the past few years have come from trying to limit, and come up with alternatives to, humanity's CO2 dependency. Solar panels, wave-energy conversion and wind farms are allowing us to harness the power of nature in a clean way, harvesting energy without harming our environment or destroying habitats. Meanwhile nifty gadgets - like the Wall-E sized robot that can insulate your house to save energy - are helping to cut carbon in unexpected places. More of this technology could mean a cleaner, healthier future for us and our planet - because clean tech doesn't just help nature, it also has the potential to build better, more accessible and people-friendly cities."));
                    displayCC_Info1();
                    break;
                case 9: 
                    CC_Info1.add(new Title_Detail("Because we are all affected, no matter where in the world we live", 
                        "Climate change won't just impact forest, or coral reefs, or even people in far-off countries - it will affect all of us. From more extreme weather to increasing food prices, to recreation and decreased opportunities to appreciate the natural world, people everywhere will feel its effects. Reducing our carbon footprint is fundamentally necessary to create a world where people and nature thrive."));
                    displayCC_Info1();
                    break;
                case 10: 
                    CC_Info1.add(new Title_Detail("Because of future generations", 
                        "We are fortunate to live in a beautiful, diverse, nurturing, awe-inspiring planet. Our children, and all future generations, deserve the same.\n\n\tIf you're feeling worried by now, you're not alone. Millions of people are working together for our planet. Events like Earth Hour are a brilliant reminder that together, humanity is capable of great things, and we can make change happen for the right reasons.\n\n\tAlready, so much has changed since we first heard about the possible effect of climate change. Beginning with the Rio Earth Summit, then the Kyoto Protocol and the Paris Agreement, action on a global scale is speeding up. Now it is more important than ever that we use our action, our votes and our voices to tell political and business leaders that action on climate is absolutely essential."));
                    displayCC_Info1();
                    break;
                case 11: 
                    CC_Info1.add(new Title_Detail("What is the WWWF Organization about?", 
                        "WWF works to help local communities conserve the natural resources they depend upon; transform markets and policies toward sustainability; and protect and restore species and their habitats.\n\n\tFor more than 60 years, WWF has worked to help people and nature thrive.\n\n\tWWF, as the world's leading conservation organization, works in nearly 100 countries. At every level, WWF collaborate with people around the world to develop and deliver innovative solutions that protect communities, wildlife, and the places in which they live."));
                    displayCC_Info1();
                    break;
                case 12: 
                    return;
                default: 
                    CC_Functions.EnterKeyError();
            }
        }
        while(choice != 12);

        in.close();
    }

    public static void Solutions(){

        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions.lightred + "Some solutions are big and will require billions in investment.\n" + CC_Functions.lightblue+ "Some are small and free.\n" + CC_Functions.yellow + "But one fact remains prevalent among all of these.\n" + CC_Functions.lightblue+ "All are achievable..." + CC_Functions.reset);
        System.out.println(CC_Functions.magenta + "\n\n\n\t\t\t\t\t\t\t\t\t (1/2 pages)");
        CC_Functions.EnterKey();

        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions.green + "\tThinking about climate change can be overwhelming. We've been aware of its causes for decades now, and all around us, we bear witness to its devastating effects on our communities and ecosystems.\n\n\tBut the good news is that we now know exactly what it will take to win the fight against climate change, and we're making measurable, meaningful progress. Game-changing developments in clean energy, electric vehicle technology, and energy efficiency are emerging every single day. And countries - including Canada, China, India, and the United States - are coordinating and cooperating at levels never seen before in order to tackle the most pressing issue of our time.\n\n\tThe bottom line: If the causes and effects of our climate crisis are clearer than ever, so are the solutions." + CC_Functions.reset);
        System.out.println(CC_Functions.magenta + "\n\n\n\t\t\t\t\t\t\t\t\t (2/2 pages)");
        CC_Functions.EnterKey();
            
        do{
            CC_Info1.clear();
            CC_Info3.clear();
            System.out.println("\n\n\n\n\n");
            System.out.println("Select the number of the choice that you wish to view or learn about.\n");
            System.out.println(CC_Functions.lightcyan + "|===============================================================|");
            System.out.println("| Solutions for Climate Change By NRDC Menu                     |");
            System.out.println("|===============================================================|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 1. Ending Our Reliance on Fossil Fuels                        "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 2. Greater Energy Efficiency                                  "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 3. Renewable Energy                                           "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 4. Sutainable Transportion                                    "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 5. Sutainable Buildings                                       "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 6. Better Forestry Management and Sustainable Agriculture     "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 7. Conservation-Based Solutions                               "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 8. Industrial Solutions                                       "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 9. Technological Solutions                                    "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 10. Our choices                                               "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 11. What is Natural Resources Defence Council and Its Mission "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 12. Back                                                      "+ CC_Functions.lightcyan + "|");
            System.out.println("|===============================================================|\n" + CC_Functions.reset);
            System.out.print(CC_Functions.yellow + "Please enter the number of your choice: " + CC_Functions.reset);
            
            InvalidInput();

            choice = userInput;
            CC_Functions.clrscr();

            switch(choice){
                case 1:
                    CC_Info1.add(new Title_Detail("Ending Our Reliance on Fossil Fuels", 
                        "The single-most important thing that we can do to combat climate change is to drastically reduce our consumption of fossil fuels. The burning of coal, oil, and natural gas in our buildings, industrial processes, and transportation is responsible for the vast majority of emissions that are warming the planet - more than 75 percent, according to the United Nations. In addition to altering the climate, dirty energy also comes with unacceptable ecological and human health impacts.\n\n\tWe must replace coal, oil, and gas with renewable and efficient energy sources. Thankfully, with each passing year, clean energy is making gains as technology improves and production costs go down. But according to the Intergovernmental Panel on Climate Change's Special Report on Global Warming of 1.5°C, in order to meet the goal of reducing global carbon emissions by at least 45 percent below 2010 levels before 2030 - which scientists tell us we must do if we're to avoid the worst, deadliest impacts of climate change - we must act faster.\n\n\tThere are promising signs. Wind and solar continue to account for ever-larger shares of electricity generation. In 2021, wind and solar generated a record 10 percent of electricity worldwide. And modeling by NRDC has found that wind, solar, hydro, and nuclear could account for as much as 80 percent of U.S. electricity by the end of this decade. (We can also fully realize our clean energy potential if we invest in repairing our aging grid infrastructure and installing new transmission lines.) While this transformation is taking place, automakers - as well as governments - are preparing for a future when the majority of vehicles on the road will produce zero emissions."));
                    displayCC_Info1();
                    break;
                case 2:
                    CC_Info1.add(new Title_Detail("Greater Energy Efficiency", 
                        "Energy efficiency has been referred to as “the first fuel”; after all, the more energy efficient our systems are, the less actual fuel we have to consume, whether rooftop solar energy or gas power. Considered this way, efficiency is our largest energy resource. As the technology harnessing it has advanced over the past 40 years, efficiency has contributed more to the United States's energy needs than oil, coal, gas, or nuclear power.\n\n\tWhat's more, energy efficiency strategies can be applied across multiple sectors: in our power plants, electrical grids, factories, vehicles, buildings, home appliances, and more. Some of these climate-friendly strategies can be enormously complex, such as helping utility companies adopt performance-based regulation systems, in which they no longer make more money simply by selling more energy but rather by improving the services they provide. Other strategies are extraordinarily simple. For example, weatherproofing buildings, installing cool roofs, replacing boilers and air conditioners with super-efficient heat pumps, and yes, switching out light bulbs from incandescent to LED can all make a big dent in our energy consumption."));
                    displayCC_Info1();
                    break;
                case 3:
                    RenewableEnergy();
                    break;
                case 4:
                    CC_Info1.add(new Title_Detail("Sutainable Transportion", 
                        "Transportation is a top source of greenhouse gases (GHG), so eliminating pollution from the billions of vehicles driving across the planet is essential to achieving net-zero global emissions by 2050, a goal laid out in the 2015 Paris climate agreement.\n\n\tIn 2021, electric vehicles (EVs) accounted for less than 8 percent of vehicle sales globally; by 2035, however, it's estimated that they'll account for more than half of all new sales. Governments around the world aren't just anticipating an all-electric future; they're bringing it into fruition by setting goals and binding requirements to phase out the sale of gas-powered internal combustion engine (ICE) vehicles. That year, 2035, is expected to mark a turning point in the adoption of EVs and in the fight against climate change as countries around the world - as well as numerous automakers - have announced goals to phase out gas-powered cars and light trucks. This shift will also benefit our grid: EVs are like a “battery on wheels” and have the potential to supply electricity back to the network when demand peaks, helping to prevent blackouts.\n\n\tIt's also critical that we consider all of the different ways we get around and build sustainability into each of them. By increasing access to public transportation - such as buses, ride-sharing services, subways, and streetcars - as well as embracing congestion pricing, we can cut down on car trips and keep millions of tons of carbon dioxide out of the atmosphere every year. And by encouraging zero-emission forms of transportation, such as walking and biking, we can reduce emissions even more. Boosting these alternate forms of transportation will require more than just talk. They require funding, planning, and the building out of supportive infrastructure by leaders across the local, state, and national levels.\n\n\tTo address the full set of impacts of the transportation sector, we need holistic and community-led solutions around things like land-use policies and the way we move consumer goods. Communities closest to ports, truck corridors, rail yards, and warehouses are exposed to toxic diesel emissions and face a high risk of developing acute and chronic public health diseases. Like all climate solutions, long-lasting change in the transportation sector requires building the power of historically marginalized communities."));
                    displayCC_Info1();
                    break;
                case 5:
                    CC_Info1.add(new Title_Detail("Sutainable Buildings", 
                        "The energy used in our buildings - to keep the lights on and appliances running; to warm them and cool them; to cook and to heat water - makes them the single-largest source of carbon pollution in most cities across the United States. Making buildings more energy efficient, by upgrading windows and adding insulation to attics and walls, for example, will bring these numbers down. That's why it's all the more important that we raise public awareness of cost- and carbon-saving changes that individuals can make in their homes and workplaces, and make it easier for people to purchase and install energy-efficient technology, such as heat pumps (which can both heat and cool spaces) and certified appliances through programs like Energy Star in the United States or EnerGuide in Canada.\n\n\tBeyond the measures that can be taken by individuals, we need to see a dedication from private businesses and governments to further building decarbonization, which simply means making buildings more efficient and replacing fossil fuel - burning systems and appliances with clean-powered ones. Policy tools can help get us there, including city and state mandates that all newly constructed homes, offices, and other buildings be outfitted with efficient all-electric systems for heating, cooling, and hot water; requirements that municipalities and states meet the latest and most stringent energy conservation standards when adopting or updating their building codes would also be impactful. Indeed, many places around the world are implementing building performance standards, which require existing buildings to reduce their energy use or carbon emissions over time. Most important, if these changes are going to reach the scale needed, we must invest in the affordable housing sector so that efficient and decarbonized homes are accessible to homeowners and renters of all incomes."));
                    displayCC_Info1();
                    break;
                case 6: 
                    CC_Info1.add(new Title_Detail("Better Forestry Management and Sustainable Agriculture", 
                        "Some of our strongest allies in the fight against climate change are the trees, plants, and soil that store massive amounts of carbon at ground level or underground. Without the aid of these carbon sinks, life on earth would be impossible, as atmospheric temperatures would rise to levels more like those found on Venus.\n\n\tBut whenever we clearcut forests for timber or rip out wetlands for development, we release that climate-warming carbon into the air. Similarly, the widespread overuse of nitrogen-based fertilizers (a fossil fuel product) on cropland and generations of industrial-scale livestock farming practices have led to the release of unprecedented amounts of nitrous oxide and methane, powerful greenhouse gases, into our atmosphere.\n\n\tWe can't plant new trees fast enough to replace the ones we clearcut in carbon-storing forests like the Canadian boreal or the Amazon rainforest - nor can rows of spindly young pines serve the same function as old-growth trees. We need a combination of responsible forestry policies, international pressure, and changes in consumer behavior to put an end to deforestation practices that not only accelerate climate change but also destroy wildlife habitat and threaten the health and culture of Indigenous communities that live sustainably in these verdant spaces. At the same time, we need to treat our managed landscapes with as much care as we treat wild ones. For instance, adopting practices associated with organic and regenerative agriculture - cover crops, pesticide use reduction, rotational grazing, and compost instead of synthetic fertilizers - will help nurture the soil, yield healthier foods, and pay a climate dividend too."));
                    displayCC_Info1();  
                    break;
                case 7: 
                    CC_Info1.add(new Title_Detail("Conservation-Based Solutions", 
                        "Intact ecosystems suck up and store vast amounts of carbon: Coastal ecosystems like wetlands and mangroves accumulate and store carbon in their roots; our forests soak up about a third of annual fossil fuel emissions; and freshwater wetlands hold between 20 and 30 percent of all the carbon found in the world's soil. It's clear we're not going to be able to address climate change if we don't preserve nature.\n\n\tThis is one reason why, along with preserving biodiversity, climate experts are calling on global leaders to fully protect and restore at least 30 percent of land, inland waters, and oceans by 2030, a strategy endorsed by the Intergovernmental Panel on Climate Change. To help us reach that goal, we must limit industrial impacts on our public lands and waters, continue to protect natural landscapes, support the creation of marine protected areas, uphold bedrock environmental laws, and follow the lead of Indigenous Peoples, many of whom have been faithfully and sustainably stewarding lands and waters for millennia."));
                    displayCC_Info1();
                    break;
                case 8: 
                    CC_Info1.add(new Title_Detail("Industrial Solutions", 
                        "Heavy industry - the factories and facilities that produce our goods - is responsible for a quarter of GHG emissions in the United States and 40 percent globally, according to the EPA. Most industrial emissions come from making a small set of carbon-intensive products: basic chemicals, iron and steel, cement, aluminum, glass, and paper. (Industrial plants are also often major sources of air and water pollutants that directly affect human health.)\n\n\tComplicating matters is the fact that many industrial plants will stay in operation for decades, so emissions goals for 2050 are really just one investment cycle away. Given these long horizons for building and retrofitting industrial sites, starting investments and plans now is critical. What would successfully decarbonized industrial processes look like? They should sharply reduce heavy industry's climate emissions, as well as local pollution. They should be scalable and widely available in the next decade, especially so that less developed nations can adopt these cleaner processes and grow without increasing emissions. And they should bolster manufacturing in a way that creates good jobs."));
                    displayCC_Info1();
                    break;
                case 9: 
                    CC_Info1.add(new Title_Detail("Technological Solutions", 
                        "Technology alone won't save us from climate change (especially not some of these risky geoengineering proposals). But at the same time, we won't be able to solve the climate crisis without researching and developing things like longer-lasting EV batteries, nonpolluting hydrogen-based solutions, and reliable, safe, and equitable methods for capturing and sequestering carbon. Because, while these tools hold promise, we have to make sure we don't repeat the mistakes of the past. For instance, we can take actions to reduce local harms from mining lithium (a critical component of electric vehicle batteries), improve recycling opportunities for solar cells, and not use carbon capture as an excuse to pollute. To accelerate research and development, funding is the critical third leg of the stool: Governments must make investing in clean energy technologies a priority and spur innovation through grants, subsidies, tax incentives, and other rewards."));
                    displayCC_Info1();
                    break;
                case 10: 
                    CC_Info1.add(new Title_Detail("Our choices", 
                        "It should go without saying that we, as individuals, are key to solving the climate crisis - not just by continuing to lobby our legislators and speak up in our communities but also by taking climate actions in our daily lives. By switching off fossil fuels in our homes and being more mindful of the climate footprint of the food we eat, our shopping habits, how we get around, our use of plastics and fossil fuels, and what businesses we choose to support (or not to support), we can move the needle.\n\n\tBut it's when we act collectively that real change happens - and we can do even more than cut down on carbon pollution. Communities banding together have fought back fracking, pipelines, and oil drilling in people's backyards. These local wins aren't just good news for our global climate but they also protect the right to clean air and clean water for everyone. After all, climate change may be a global crisis but climate action starts in your own hometown.\n\n\tWe have a responsibility to consider the implications of our choices - and to make sure that these choices are actually helping to reduce the burdens of climate change, not merely shifting them somewhere else. It's important to remember that the impacts of climate change - which intersect with and intensify so many other environmental, economic, and social issues - fall disproportionately on certain communities, namely low-income communities and communities of color. That's why our leaders have a responsibility to prioritize the needs of these communities when crafting climate policies. If those on the frontlines aren't a part of conversations around climate solutions, or do not feel the benefits of things like cleaner air and better job opportunities, then we are not addressing the roots of the climate crisis."));
                    displayCC_Info1();
                    break;
                case 11:
                    CC_Info3.add(new NRDC_Mission("To safeguard the earth - its people, its plants and animals, and the natural systems on which all life depends.", 
                        "NRDC works to restore the integrity of the elements that sustain life  -  air, land and water  -  and to defend endangered natural places.\n\n\tThey seek to establish sustainability and good stewardship of the Earth as central ethical imperatives of human society. NRDC affirms the integral place of human beings in the environment.\n\n\tThey also strive to protect nature in ways that advance the long-term welfare of present and future generations.\n\n\tAnd lastlyy, they work to foster the fundamental right of all people to have a voice in decisions that affect their environment. We seek to break down the pattern of disproportionate environmental burdens borne by people of color and others who face social or economic inequities. Ultimately, NRDC strives to help create a new way of life for humankind, one that can be sustained indefinitely without fouling or depleting the resources that support all life on Earth."));     
                    CC_Info3.add(new TD_withLink("Other Detail About the Natural Resources Defence Council(NRDC)", 
                        "The Natural Resources Defense Council (NRDC) is a 501(c)(3) nonprofit organization headquartered in New York, New York, that aims to advocate for policies that support and protect the environment. NRDC works to promote initiatives at the local, state, national and global levels. Supporters consider the group to be \"the nation's most effective environmental action organization.\"",
                        "https://www.nrdc.org/about\n\n"+ CC_Functions.yellow + CC_Functions.cyan+ "-> " +  CC_Functions._cyan + "Contributor of \"What Are the Solutions to Climate Change?\" from NRDC:" + CC_Functions.lightblue+ " Jeff Turrentine" + CC_Functions.reset));
                    displayCC_Info3();
                    break;
                case 12:
                    return;
                default: 
                    CC_Functions.EnterKeyError();
            }
        }
        while(choice != 12);

        in.close();
    }

    public static void RenewableEnergy(){

        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions.lightyellow + "\tTransitioning from fossil fuels to clean energy is the key to winning the fight against climate change." + CC_Functions.reset);

        CC_Functions.EnterKey();

        do{
            CC_Info1.clear();
            System.out.println("\n\n\n\n\n");
            System.out.println("Select the number of the choice that you wish to view or learn about.\n");
            System.out.println(CC_Functions.lightcyan + "|========================================|");
            System.out.println("| Renewable Energy Menu                  |");
            System.out.println("|========================================|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 1. Solar Energy                        "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 2. Wind Energy                         "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 3. Geothermal and Hydroelectric Energy "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 4. Biomass Energy                      "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 5. Back                                "+ CC_Functions.lightcyan + "|");
            System.out.println("|========================================|\n" + CC_Functions.reset);
            System.out.print(CC_Functions.yellow + "Please enter the number of your choice: " + CC_Functions.reset);

            InvalidInput();

            choice = userInput;
            CC_Functions.clrscr();

            switch(choice){
                case 1:
                    CC_Info1.add(new Title_Detail("Solar Energy", 
                        "Solar energy is produced when light from the sun is absorbed by photovoltaic cells and turned directly into electricity. The solar panels that you may have seen on rooftops or at ground level are made up of many of these cells working together. By 2030, at least one in seven U.S. homes is projected to have rooftop solar panels, which emit no greenhouse gases or other pollutants, and which generate electricity year-round (in hot or cold weather) so long as the sun is shining. Solar energy currently accounts for just under 3 percent of the electricity generated in the United States - enough to power 18 million homes - but is growing at a faster rate than any other source. By 2035, it could account for as much as 40 percent of electricity generation. From 2020 through 2026, solar will account for more than half of new electricity generation worldwide.\n\n\tWhat to do when the sun doesn't shine, you might ask. Alongside the boom in solar has been a surge in companion battery storage: More than 93 percent of U.S. battery capacity added in 2021 was paired with solar power plants. Battery storage is key to the clean energy revolution - and adapting to a warming world. Not only are batteries important at night when the sun isn't out, but on hot days when homes draw a lot of electricity to power air conditioners, battery storage can help manage the energy demand and control the threat of power failures."));
                    displayCC_Info1();
                    break;
                case 2:
                    CC_Info1.add(new Title_Detail("Wind Energy", 
                        "Unlike solar panels, which convert the sun's energy directly into electricity, wind turbines produce electricity more conventionally: wind turns the blades of a turbine, which spin a generator. Currently, wind accounts for just above 9 percent of U.S. electricity generation, but it, like solar, is growing fast as more states and utilities come to recognize its ability to produce 100 percent clean energy at a remarkably low cost. Unsurprisingly, states with plenty of wide-open space - including Kansas, Oklahoma, and Texas - have huge capacity when it comes to wind power, but many analysts believe that some of the greatest potential for wind energy exists just off our coasts. Offshore wind even tends to ramp up in the evenings when home electricity use jumps, and it can produce energy during the rainy and cloudy times when solar energy is less available. Smart planning and protective measures, meanwhile, can ensure we harness the massive promise of offshore wind while limiting or eliminating potential impacts on wildlife."));
                    displayCC_Info1();
                    break;
                case 3:
                    CC_Info1.add(new Title_Detail("Geothermal and Hydroelectric Energy", 
                        "Along with sunlight and wind, water - under certain conditions - can also be a source of renewable energy. For instance, geothermal energy works by drilling deep underground and pumping extremely hot water up to the earth's surface, where it is then converted to steam that, once pressurized, spins a generator to create electricity. Hydroelectric energy uses gravity to “pull” water downward through a pipe at high speeds and pressures; the force of this moving water is used to spin a generator's rotor.\n\n\tHumans have been harnessing heat energy from below the earth's surface for eons - just think of the hot springs that provided warmth for the people of ancient Rome. Today's geothermal plants are considered clean and renewable so long as the water and steam they bring up to the surface is redeposited underground after use. Proper siting of geothermal projects is also important, as recent science has linked some innovative approaches to geothermal to an increased risk of earthquakes.\n\n\tHydroelectric plants, when small-scale and carefully managed, represent a safe and renewable source of energy. Larger plants known as mega-dams, however, are highly problematic. Their massive footprint can disrupt the rivers on which people and wildlife depend."));
                    displayCC_Info1();
                    break;
                case 4:
                    CC_Info1.add(new Title_Detail("Biomass Energy", 
                        "With very few exceptions, generating electricity through the burning of organic material like wood (sourced largely from pine and hardwood forests in the United States), agricultural products, or animal waste - collectively referred to as biomass - does little to reduce carbon emissions, and in fact, does far more environmental harm than good. Unfortunately, despite numerous studies that have revealed the true toll of this form of bioenergy, some countries continue to buy the biomass industry's false narrative and subsidize these projects. Attitudes are changing but, given the recent wood pellet boom, there is a lot more work to be done."));
                    displayCC_Info1();
                    break;
                case 5: 
                    return;
                default: 
                    CC_Functions.EnterKeyError();
            }
        }
        while(choice != 5);

        in.close();
    }

    public static void Ways(){
        
        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions._blue + "\tClimate change is affecting everyone everywhere. Extreme weather events are more frequent and intense, sea levels are rising and many species are being driven to extinction. The good news is, you are not alone! People, communities, cities, businesses, schools, faith groups and organizations are taking action to help fight climate change. What changes will you make?" + CC_Functions.reset);

        CC_Functions.EnterKey();
            
        do{
            CC_Info1.clear();
            System.out.println("\n\n\n\n\n");
            System.out.println("Select the number of the choice that you wish to view or learn about.\n");
            System.out.println(CC_Functions.lightcyan + "|=======================================================|");
            System.out.println("| Ways to Help Reduce the Impact of Climate Change Menu |");
            System.out.println("|=======================================================|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 1. Save energy at home                                "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 2. Change your home's source of energy                "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 3. Walk, bike or take public transport                "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 4. Switch to an electric vehicle                      "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 5. Consider your travel                               "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 6. Reduce, reuse, repair and recycle                  "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 7. Eat more vegetables                                "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 8. Throw away less food                               "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 9. Plant native species                               "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 10. Clean up your environment                         "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 11. Make your money count                             "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 12. Speak up                                          "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 13. Back                                              "+ CC_Functions.lightcyan + "|");
            System.out.println("|=======================================================|\n" + CC_Functions.reset);
            System.out.print(CC_Functions.yellow + "Please enter the number of your choice: " + CC_Functions.reset);
            
            InvalidInput();

            choice = userInput;
            CC_Functions.clrscr();

            switch(choice){
                case 1:
                    CC_Info1.add(new Title_Detail("Save energy at home", 
                        "Much of our electricity and heat are powered by coal, oil and gas. Use less energy by reducing your heating and cooling use, switching to LED light bulbs and energy-efficient electric appliances, washing your laundry with cold water, or hanging things to dry instead of using a dryer. Improving your home's energy efficiency, through better insulation for instance, or replacing your oil or gas furnace with an electric heat pump can reduce your carbon footprint by up to 900 kilograms of CO2e per year."));
                    displayCC_Info1();
                    break;
                case 2:
                    CC_Info1.add(new Title_Detail("Change your home's source of energy", 
                        "Ask your utility company if your home energy comes from oil, coal or gas. If possible, see if you can switch to renewable sources such as wind or solar. Or install solar panels on your roof to generate energy for your home. Switching your home from oil, gas or coal-powered energy to renewable sources of energy, such as wind or solar, can reduce your carbon footprint by up to 1.5 tons of CO2e per year."));
                    displayCC_Info1();
                    break;
                case 3:
                    CC_Info1.add(new Title_Detail("Walk, bike or take public transport", 
                        "The world's roadways are clogged with vehicles, most of them burning diesel or gasoline. Walking or riding a bike instead of driving will reduce greenhouse gas emissions -- and help your health and fitness. For longer distances, consider taking a train or bus. And carpool whenever possible. Living car-free can reduce your carbon footprint by up to 2 tons of CO2e per year compared to a lifestyle using a car. Learn more about how to green your travel."));
                    displayCC_Info1();
                    break;
                case 4:
                    CC_Info1.add(new Title_Detail("Switch to an electric vehicle", 
                        "If you plan to buy a car, consider going electric, with more and cheaper models coming on the market. In many countries, electric cars help reduce air pollution and cause significantly fewer greenhouse gas emissions than gas or diesel-powered vehicles. But many electric cars still run on electricity produced from fossil fuels, and the batteries and engines require rare minerals which often come with high environmental and social costs. Switching from a gasoline or diesel-powered car to an electric vehicle can reduce your carbon footprint by up to 2 tons of CO2e per year. A hybrid vehicle can save you up to 700 kilograms of CO2e per year."));
                    displayCC_Info1();
                    break;
                case 5:
                    CC_Info1.add(new Title_Detail("Consider your travel", 
                        "Airplanes burn large amounts of fossil fuels, producing significant greenhouse gas emissions. That makes taking fewer flights one of the fastest ways to reduce your environmental impact. When you can, meet virtually, take a train, or skip that long-distance trip altogether. Taking one less long-haul return flight can reduce your carbon footprint by up to almost 2 tons of CO2e."));
                    displayCC_Info1();
                    break;
                case 6: 
                    CC_Info1.add(new Title_Detail("Reduce, reuse, repair and recycle", 
                        "Electronics, clothes, plastics and other items we buy cause carbon emissions at each point in production, from the extraction of raw materials to manufacturing and transporting goods to market. To protect the climate, buy fewer things, shop second-hand, and repair what you can. Plastics alone generated 1.8 billion metric tonnes of greenhouse gas emissions in 2019 - 3.4 per cent of the global total. Less than 10 per cent is recycled, and once plastic is discarded, it can linger for hundreds of years. Buying fewer new clothes - and other consumer goods - can also reduce your carbon footprint. Every kilogram of textiles produced generates about 17 kilograms of CO2e."));
                    displayCC_Info1();
                    break;
                case 7: 
                    CC_Info1.add(new Title_Detail("Eat more vegetables", 
                        "Eating more vegetables, fruits, whole grains, legumes, nuts, and seeds, and less meat and dairy, can significantly lower your environmental impact. Producing plant-based foods generally results in fewer greenhouse gas emissions and requires less energy, land, and water. Shifting from a mixed to a vegetarian diet can reduce your carbon footprint by up to 500 kilograms of CO2e per year (or up to 900 kilograms for a vegan diet)."));
                    displayCC_Info1();
                    break;
                case 8: 
                    CC_Info1.add(new Title_Detail("Throw away less food", 
                        "When you throw food away, you're also wasting the resources and energy that were used to grow, produce, package, and transport it. And when food rots in a landfill, it produces methane, a powerful greenhouse gas. So purchase only what you need, use what you buy and compost any leftovers. Cutting your food waste can reduce your carbon footprint by up to 300 kilograms of CO2e per year."));
                    displayCC_Info1();
                    break;
                case 9: 
                    CC_Info1.add(new Title_Detail("Plant native species", 
                        "If you have a garden or even just a plant or two outside your home, check for native species. Use a plant identification app to help. And then think about replacing non-natives, especially any considered invasive. Plants, animals and insects depend on each other. Most insects will not eat non-native plants, which means birds and other species lose a food source. Biodiversity suffers. Even a single tree or shrub can offer a refuge - just remember to skip insecticides and other chemicals."));
                    displayCC_Info1();
                    break;
                case 10: 
                    CC_Info1.add(new Title_Detail("Clean up your environment", 
                        "Humans, animals and plants all suffer from land and water contaminated by improperly discarded garbage. Use what you need, and when you have to throw something out, dispose of it properly. Educate others to do the same, and participate in local clean-ups of parks, rivers, beaches and beyond. Every year, people throw out 2 billion tons of trash. About a third causes environment harms, from choking water supplies to poisoning soil."));
                    displayCC_Info1();
                    break;
                case 11: 
                    CC_Info1.add(new Title_Detail("Make your money count", 
                        "Everything we spend money on affects the planet. You have the power to choose which goods and services you support. To reduce your environmental impact, choose products from companies who use resources responsibly and are committed to cutting their gas emissions and waste. If you have money that is being invested for you, through a pension fund for instance, it may be supporting fossil fuels or deforestation. Making sure your savings are invested in environmentally sustainable businesses can greatly reduce your carbon footprint."));
                    displayCC_Info1();
                    break;
                case 12: 
                    CC_Info1.add(new Title_Detail("Speak up", 
                        "Speak up and get others to join in taking action. It's one of the quickest and most effective ways to make a difference. Talk to your neighbors, colleagues, friends, and family. Let business owners know you support bold changes - from plastics-free products and packaging to zero-emissions vehicles. Appeal to local and world leaders to act now. Climate action is a task for all of us. And it concerns all of us. No one can do it all alone - but we can do it together. "));
                    displayCC_Info1();
                    break;
                case 13:
                    return;
                default: 
                    CC_Functions.EnterKeyError();
            }
        }
        while(choice != 13);

        in.close();
    }

    public static void Campaigns(){
                
        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions.blue + "\tClimate action campaigns are organised efforts aimed at raising awareness of and addressing both mitigation and adaptation strategies to combat the impacts of climate change on a micro (individual), mezzo (community), and macro (societal) level. They bring together various stakeholders to create widespread awareness, promote behavioural shifts, influence policies and practices, and mobilise change.\n\n\tIn order for a climate action campaign to be successful, it needs to go beyond mere rhetoric.\n\n\t" + CC_Functions._red + "REMEMBER, every effort counts." + CC_Functions.reset);

        CC_Functions.EnterKey();
            
        do{
            CC_Info1.clear();
            System.out.println("\n\n\n\n\n");
            System.out.println("Select the number of the choice that you wish to view or learn about.\n");
            System.out.println(CC_Functions.lightcyan + "|======================================|");
            System.out.println("| Climate Change Action Campaigns Menu |");
            System.out.println("|======================================|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 1. Show Your Stripes                 "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 2. Fridays for Future                "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 3. Earth Hour                        "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 4. We Are Still In                   "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 5. RE100                             "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 6. Champions of the Earth            "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 7. C40 Cities                        "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 8. Plant a Billion Trees             "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 9. Save the Arctic                   "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 10. TED Countdown                    "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 11. Back                             "+ CC_Functions.lightcyan + "|");
            System.out.println("|======================================|\n" + CC_Functions.reset);
            System.out.print(CC_Functions.yellow + "Please enter the number of your choice: " + CC_Functions.reset);
            
            InvalidInput();

            choice = userInput;
            CC_Functions.clrscr();

            switch(choice){
                case 1:
                    CC_Info1.add(new Title_Detail("Show Your Stripes", 
                        "Every year on the 21st June, to coincide with the Summer Solstice in the Northern Hemisphere, climate advocates and activists across the globe join the call to share a powerful message about our changing climate on Show Your Stripes Day.\n\n\tThe concept behind the 'warming stripes' graphics, around which the awareness campaign is centred, is the brainchild of UK climate scientist Professor Ed Hawkins. He swapped out numerical data points for colours that we intuitively understand - shades of red for warm, and shades of blue for cool - showing global temperature change from 1850 onwards. Each stripe represents one year, with red stripes representing an increase and blue stripes representing a decrease when measured against the average annual temperature, in a specific location, over the period 1961-2010.\n\n\tIf you visit the ShowYourStripes website, you'll find a huge set of interactive graphics based on the change in annual temperatures across regions, countries, and cities over the past 100+ years. In virtually every graphic, you'll notice the blue lines fading away, then red and deep burgundy lines beginning to appear, illustrating the true universality of global warming, and the stark reality that no-one is immune to the threat of climate extremes down the road.\n\n\tHawkins wants people to use the graphics to help start a conversation about climate change with friends, family, or colleagues, and talk about the risks we face, the choices we can make, and the solutions we can adopt."));
                    displayCC_Info1();
                    break;
                case 2:
                    CC_Info1.add(new Title_Detail("Fridays for Future", 
                        "The 'Fridays for Future' movement, which began with Greta Thunberg's solo protest in August 2018, has evolved into a formidable global force. At just 15, she sat outside the Swedish Parliament with a sign reading 'Skolstrejk för Klimatet' ('School Strike for Climate'). Her commitment, combined with her impactful social media presence, sparked a worldwide student strike movement. \n\n\tAlso known as 'Youth for Climate', this initiative calls on political leaders to act on scientific evidence and uphold international climate agreements. By March 2019, it had mobilised over a million participants in 2,200 events across 125 countries, demonstrating its vast reach and influence.\n\n\t'Fridays for Future' transcends being merely a protest; it represents a crucial global call to action fuelled by the youth, exemplifying the power of the internet to unite and mobilise young people worldwide. Backed by a broad coalition of parents, scientists, and activists, this movement advocates for transitioning from fossil fuels to renewable energy, showcasing the transformative impact of youth-led activism in shaping a sustainable future."));
                    displayCC_Info1();
                    break;
                case 3:
                    CC_Info1.add(new Title_Detail("Earth Hour", 
                        "'Earth Hour', initiated by the World Wide Fund for Nature (WWF) in partnership with The Sydney Morning Herald, launched in Sydney, Australia in 2007. The event began as a grassroots effort to raise awareness about climate change and energy conservation by having participants turn off their lights for one hour. \n\n\tDuring its first year, the initiative led to a notable 10.2% reduction in Sydney's energy use, with around 2.2 million people taking part. Its success quickly garnered global attention, and by the following year, famous landmarks like Rome's Colosseum and Venice's city hall had joined the movement.\n\n\tThe primary goal of 'Earth Hour' is to highlight the importance of climate action through this symbolic act. Participants turning off their lights from 8:30 p.m. to 9:30 p.m. local time contribute to reducing carbon emissions and light pollution whilst advocating for more sustainable energy practices. 'Earth Hour' usually takes place in March each year. But remember, you can make an even bigger impact by switching off your lights for a single hour over the other 364 nights of the year."));
                    displayCC_Info1();
                    break;
                case 4:
                    CC_Info1.add(new Title_Detail("We Are Still In", 
                        "Following the United States' withdrawal from the global Paris Agreement in 2017, a coalition called 'We Are Still In' emerged, uniting over 3,900 leaders from various sectors across America, including CEOs, mayors, governors, tribal chiefs, college presidents, faith leaders, and healthcare executives. It shows that, despite federal decisions, environmental leadership and a unified commitment to climate action remains strong.\n\n\tThe coalition organises US participation in annual UN Climate Negotiations and promotes collaboration at key events like the Global Climate Action Summit. Its platform, 'We Are Taking Action', helps institutions set and meet concrete climate goals. By partnering with organisations ranging from McDonald's to New Belgium Brewing, the coalition supports local climate initiatives and fosters essential cross-sector relationships.\n\n\tAdministered by the WWF, Climate Nexus, and Ceres, 'We Are Still In' exemplifies effective co-ordination in advancing climate action and sustaining US efforts. This coalition highlights how collaborative campaigns can drive meaningful environmental progress and unite diverse actors in achieving climate goals."));
                    displayCC_Info1();
                    break;
                case 5:
                    CC_Info1.add(new Title_Detail("RE100", 
                        "Recognising the potential of the business community to make a significant contribution towards accelerating the transition to zero-carbon grids at scale, 'RE100' was launched at the 'Climate Week NYC' charity event in 2014.\n\n\tA global initiative, led by non-profit Climate Group in partnership with CDP (formerly the Carbon Disclosure Project), RE100 has since brought together more than 400 of the world's most influential companies, each of which has made a public commitment to powering their operations with 100% renewable electricity by 2050, and disclosing their environmental data through CPD. The initiative offers members valuable resources, including peer learning, policy support, and market insights.\n\n\tCombined, these 400+ member companies currently consume more electricity annually than the whole of France. In order to achieve renewable electricity interim targets of 60% by 2030 and 90% by 2040, their demand for increased renewable electricity sources continues to intensify. RE100 helps the collective body present a unified front, to send a powerful signal to governments about corporate demand for renewable electricity, and government's duty to support businesses in achieving their targets."));
                    displayCC_Info1();
                    break;
                case 6: 
                    CC_Info1.add(new Title_Detail("Champions of the Earth", 
                        "The UN Environment Programme's 'Champions of the Earth' awards shine a spotlight on individuals and organisations pivotal in reshaping economies, advancing political reforms, and driving sustainable innovations to foster a healthier planet. An important aspect of this UNEP campaign is the Young Champions of the Earth initiative which empowers emerging environmental leaders. Annually, young innovators from six global regions are awarded mentorship, capacity-building workshops, and $20,000 in seed funding. This initiative provides a vital platform for fresh, impactful ideas to thrive and gain global recognition. \n\n\tAmong the 2020 winners, Lefteris Arapakis and Nzambi Matee are tackling the issue of plastic waste from distinct approaches shaped by their local challenges.\n\n\tArapakis, co-founder of Enaleia in Greece, focusses on restoring Mediterranean fish stocks by mobilising fishermen to remove plastic waste into the circular economy, removing over 1.5 tonnes of plastic and 10 tonnes of discarded fishing gear annually. This helps fishermen contribute to the recovery of fish stocks and marine ecosystems whilst generating income from the plastic they collect and bring ashore. He also established Greece's first fishing school and has been named UNEP-MAP's Ambassador for the Mediterranean Coast.\n\n\tMatee, from Kenya, tackles plastic pollution and housing shortages through Gjenge Makers Ltd. Her company converts recycled plastic and sand into affordable, eco-friendly pavers. By partnering with manufacturers and waste collectors, Matee's innovation addresses pressing environmental and housing issues with a sustainable solution."));
                    displayCC_Info1();
                    break;
                case 7: 
                    CC_Info1.add(new Title_Detail("C40 Cities", 
                        "C40 is a global network of almost 100 city mayors dedicated to tackling the climate crisis. By employing science-based and collaborative methods, C40 cities aim to cut emissions by 50% by 2030, and limit global warming to 1.5°C. Their efforts are geared towards creating healthy, equitable communities.\n\n\tThe network drives climate action through strategic initiatives such as 1.5°C climate action plans and innovative high-impact accelerators. These efforts are supported by regional programmes and international advocacy, ensuring a broad and effective approach to scaling up climate solutions. C40's membership is performance-based. Cities are required to meet strict standards that involve adopting and regularly updating climate action plans aligned with the Paris Agreement, using financial and regulatory tools to support equitable climate goals, and demonstrating global climate leadership.\n\n\tSince its founding in 2005, C40 has championed climate action and environmental justice on both local and international stages. Initiatives like 'Women4Climate' and the 'Global Green New Deal' underscore C40's commitment to diverse leadership and ambitious climate goals, aiding cities in transitioning to zero-carbon futures and advocating for sustainable investment."));
                    displayCC_Info1();
                    break;
                case 8: 
                    CC_Info1.add(new Title_Detail("Plant a Billion Trees", 
                        "The Nature Conservancy's 'Plant a Billion Trees' campaign is a leading reforestation initiative designed to combat climate change and biodiversity loss through global forest restoration. Launched in 2008, the campaign began with a focus on Brazil's Atlantic Forest and has since expanded to include projects worldwide. By planting trees in degraded areas, the campaign aims to reduce carbon emissions, bolster biodiversity, and ensure access to clean air and water.\n\n\tForests are vital to life on Earth. They filter water, purify air, and provide habitats for countless species. Restoring forests mitigates climate change and preserves biodiversity, contributing to a healthier and more resilient planet. The ambitious goal of planting a billion trees is achievable through global collaboration and support.\n\n\tThe Nature Conservancy's network of over 400 scientists ensures that reforestation efforts are both scientifically robust and effective. Donations fund not only tree planting but also ongoing maintenance, research, and stewardship to ensure the long-term health of restored forests. By partnering with various organisations, The Nature Conservancy maximises its expertise and resources to drive meaningful reforestation results."));
                    displayCC_Info1();
                    break;
                case 9: 
                    CC_Info1.add(new Title_Detail("Save the Arctic", 
                        "Greenpeace's 'Save the Arctic' campaign is a pivotal effort dedicated to protecting the Arctic's fragile environment from the encroachment of oil drilling and industrial activities. Since its launch in 2012, this global initiative has been working to establish a vast sanctuary around the North Pole to halt further ecological damage.\n\n\tThe campaign underscores the urgent issue of melting polar ice, which is not only accelerating climate change but also endangering wildlife and indigenous communities - all of which are masterfully integrated in the unique 'Save the Arctic' font created by Jamie Wieck. Incorporating no less than 300 illustrations, symbols, letters, and diacritics, the font forms part of an open-source campaign identity and communications strategy, designed to unify hundreds of Greenpeace protests across the globe with visual assets that articulate a cohesive environmental ambition. It provides activists with an on-demand tool to generate all kinds of campaign materials - everything from banners to T-shirts - on the fly.\n\n\tGreenpeace effectively connects everyday actions - like the energy used to open a fridge - with their broader impact on the Arctic, aiming to instil a personal sense of urgency and responsibility. By mobilising millions globally and garnering substantial support, the 'Save the Arctic' campaign advocates for a strong Global Ocean Treaty to create protected zones in the Arctic Ocean. Utilising a dynamic mix of grassroots activism, high-profile endorsements, and strategic protests, Greenpeace drives the push for crucial change. Their efforts emphasise the need for immediate action to preserve the Arctic's unique ecosystems, ensuring that this vital region remains intact for future generations and contributes to global climate stability."));
                    displayCC_Info1();
                    break;
                case 10: 
                    CC_Info1.add(new Title_Detail("TED Countdown", 
                        "'TED Countdown' is a groundbreaking initiative launched by TED in 2020 to drive urgent climate action through a blend of innovation, storytelling, and collaboration. The campaign is dedicated to mobilising a broad spectrum of voices, including thought leaders, scientists, activists, and entrepreneurs, to tackle the climate crisis head-on. The mission of 'TED Countdown' is to accelerate the adoption of climate solutions and catalyse change on a global scale.\n\n\tThe initiative engages audiences through a series of compelling talks, interactive events, and digital content that highlight pioneering solutions and practical strategies for mitigating climate change. By showcasing cutting-edge research and inspiring action, 'TED Countdown' aims to generate momentum towards achieving critical climate targets.\n\n\tCentral to 'TED Countdown' is the concept of 'counting down' to 2030, a pivotal year for global climate commitments. The campaign emphasises actionable steps and fosters a sense of urgency, encouraging individuals, organisations, and governments to take meaningful action. Through its dynamic platform, 'TED Countdown' seeks to turn ideas into impact, making it an essential resource for those committed to creating a sustainable and resilient future."));
                    displayCC_Info1();
                    break;
                case 11:
                    return;
                default: 
                    CC_Functions.EnterKeyError();
            }
        }
        while(choice != 11);

        in.close();
    }
    
    public static void Challenges(){

        System.out.println("\n\n\n\n\n");
        System.out.println("Hello, Cli-mate! There are 3 challenges provided by the app:" + CC_Functions.lightcyan + "\n\n\tChallenge 1 - Multiple Choice\n\tChallenge 2 - Matching Type\n\tChallenge 3 - Word Scramble" + CC_Functions.reset + "\n\n\tEach challenge consists of 5 points and could only be answered consecutively, so returning to the previous page would be impossible until you finish the challenge.\n\n" + CC_Functions.blue + "\tHope you enjoy the challenges and treasure what you learned in this app to heart. Goodluck!" + CC_Functions.reset + CC_Functions.red + " <3" + CC_Functions.reset);
        System.out.println(CC_Functions.magenta + "\n\t~ Your Cli-Mate" + CC_Functions.reset);
        CC_Functions.EnterKey();

        do{
            System.out.println("\n\n\n\n\n");
            System.out.println("Select the number of the choice that you wish to view or learn about.\n");
            System.out.println(CC_Functions.lightcyan + "|=================|");
            System.out.println("| Challenges Menu |");
            System.out.println("|=================|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 1. Challenge 1  "+ CC_Functions.lightcyan + "|");
            System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 2. Challenge 2  "+ CC_Functions.lightcyan + "|");
        System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 3. Challenge 3  "+ CC_Functions.lightcyan + "|");
        System.out.println("|"+ CC_Functions.yellow + CC_Functions.lightmagenta + " 4. Back         "+ CC_Functions.lightcyan + "|");
        System.out.println("|=================|\n" + CC_Functions.reset);
        System.out.print(CC_Functions.yellow + "Please enter the number of your choice: " + CC_Functions.reset);

            InvalidInput();

            choice = userInput;
            CC_Functions.clrscr();

            switch(choice){
                case 1:
                    Challenge1();
                    break;
                case 2:
                    Challenge2();
                    break;
                case 3:
                    Challenge3();
                    break;
                case 4: 
                    return;
                default: 
                    CC_Functions.EnterKeyError();
            }
        }
        while(choice != 4);

        in.close();

    }
    
    public static void Challenge1(){

        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions.red + "-> Challenge 1 - MULTIPLE CHOICES" + CC_Functions.reset);
        CC_Functions.EnterKey();

        CC_Challenges1.clear();
        CC_Challenges1.add(new Challenge1 ("Which on the following choices is true about climate change?",
        "Climate change refers to insignificant and lasting changes in the Earth's ozone and climate patterns.",
        "Climate change refers to insignificant and short-lasting changes in the Earth's temperatures and weather patterns.",
        "Climate change refers to significant and lasting changes in the Earth's temperatures and weather patterns.",
        "Climate change refers to significant and lasting changes in the Earth's ozone and climate patterns."));
        display_Challenges1();
        CC_Challenges1.clear();
        CC_Challenges1.add(new Challenge1 ("Which of the following is the effect of climate change?",
        "Hotter temperatures",
        "Loss of species",
        "More health risks",
        "All of the Above"));
        display_Challenges1();
        CC_Challenges1.clear();
        CC_Challenges1.add(new Challenge1 ("Which of the following is a reason for fighting against climate change provided by the WWF Organization?",
        "Humans are responsible for global warming",
        "Because of future generations",
        "Every increase in global warming matters",
        "Both A and C"));
        display_Challenges1();
        CC_Challenges1.clear();
        CC_Challenges1.add(new Challenge1 ("Which of the following is a renewable energy?",
        "Coal",
        "Biomass",
        "Fossil fuels",
        "Natural gas"));
        display_Challenges1();
        CC_Challenges1.clear();
        CC_Challenges1.add(new Challenge1 ("Which is not a way to help fight agaisnt climate change?",
        "Use coal for cooking",
        "Walk, bike or take public transport",
        "Save energy at home",
        "Speak up"));
        display_Challenges1();

        return;
    }

    public static void Challenge2(){

        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions.red + "-> Challenge 2 - MATCHING TYPE" + CC_Functions.reset);
        CC_Functions.EnterKey();

        System.out.println("\n\n\n\n\n");
        System.out.println("|==============================================|==============================================|");
        System.out.println("|                   " + CC_Functions.blue + "Column A                   " + CC_Functions.reset + "|                    " + CC_Functions.blue + "Column B                  " + CC_Functions.reset+ "|");
        System.out.println("|==============================================|==============================================|");
        CC_Challenges2.clear();
        CC_Challenges2.add(new Challenge2 (" 1. Using transportation                      ", 
        " A. Effects                                   "));
        display_Challenges2();
        CC_Challenges2.clear();
        CC_Challenges2.add(new Challenge2 (" 2. Humans are responsible for global warming ", 
        " B. Campaigns                                 "));
        display_Challenges2();
        CC_Challenges2.clear();
        CC_Challenges2.add(new Challenge2 (" 3. Poverty and displacement                  ", 
        " C. Solutions                                 "));
        display_Challenges2();
        CC_Challenges2.clear();
        CC_Challenges2.add(new Challenge2 (" 4. Plant a Billion Trees                     ", 
        " D. Causes                                    "));
        display_Challenges2();
        CC_Challenges2.clear();
        CC_Challenges2.add(new Challenge2 (" 5. Renewable Energy                          ", 
        " E. Reason                                    "));
        display_Challenges2();

        return;
    }

    public static void Challenge3(){

        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions.red + "-> Challenge 3 - WORD SCRAMBLE" + CC_Functions.reset);
        CC_Functions.EnterKey();

        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions._red + "Caution: In this challenge inputing no answer equats as you forfeating the number hence would be considered as wrong. You would be move onto the next number once you input an empty answer or when you press enter as your answer without any input. Hope you enjoy the challenge, goodluck!" + CC_Functions.reset);
        CC_Functions.EnterKey();

        CC_Challenges3.clear();
        CC_Challenges3.add(new Challenge3 ("ETUERPRAETM"));
        display_Challenges3();
        CC_Challenges3.clear();
        CC_Challenges3.add(new Challenge3 ("UEEHNOGRES SGA"));
        display_Challenges3();
        CC_Challenges3.clear();
        CC_Challenges3.add(new Challenge3 ("ELTMAIC NCGEAH"));
        display_Challenges3();
        CC_Challenges3.clear();
        CC_Challenges3.add(new Challenge3 ("ESA EVELL"));
        display_Challenges3();
        CC_Challenges3.clear();
        CC_Challenges3.add(new Challenge3 ("WTRHEEA"));
        display_Challenges3();        
        
        return;
    }
    
    public static void Progress(){

        int C1_Complete = CC_Answers.challenge1_complete;
        int C2_Complete = CC_Answers.challenge2_complete;
        int C3_Complete = CC_Answers.challenge3_complete;
        
        complete = C1_Complete + C2_Complete + C3_Complete;

        if(complete == 3){
            System.out.println("\n\n\n\n\n");
            System.out.println(CC_Functions.yellow + "Yay! Congrats!!!" + CC_Functions.reset + "\nYou have completed all of the challenges. Hope that you will keep to heart, not just in mind, what you have learned from us. Thank you for using the app!" + CC_Functions.reset);
            CC_Functions.EnterBackKey();
        }

        System.out.println("\n\n\n\n\n");
        System.out.println(CC_Functions.yellow + User_Name.getUser_Name() + "'s Progress: \n" + CC_Functions.reset);
        if(C1_Complete == 1){
            System.out.println("\tChallenge 1: " + CC_Functions.lightgreen+ "Complete" + CC_Functions.reset);
        }
        else{
            System.out.println("\tChallenge 1: " + CC_Functions.lightred + "Incomplete" + CC_Functions.reset);
        }
        if(C2_Complete == 1){
            System.out.println("\tChallenge 2: " + CC_Functions.lightgreen+ "Complete" + CC_Functions.reset);
        }
        else{
            System.out.println("\tChallenge 2: " + CC_Functions.lightred + "Incomplete" + CC_Functions.reset);
        }
        if(C3_Complete == 1){
            System.out.println("\tChallenge 3: " + CC_Functions.lightgreen+ "Complete" + CC_Functions.reset);
        }
        else{
            System.out.println("\tChallenge 3: " + CC_Functions.lightred + "Incomplete" + CC_Functions.reset);
        }
        System.out.println("\nTotal Completed Challenges: " + complete);
        
        CC_Functions.EnterBackKey();
        
        return;
    }

    public static void About(){
        
        System.out.println("\n\n\n\n\n\n\tThis application was created with the intention to give a detailed and compiled information about what climate change is in order to promote awareness as well as help with the SDG's 13th goal about taking action against climate change. This is not only the reason for the creation of this application as this app was intended to also help spread and give knowledge and learnings as well as insights to encourage everyone to help with the fight against climate change such as sharing the reasons why one should take action against climate change and the ways we could help to reduce the impact of the climate change as individuals residing here on Earth and as people who have a fair share of responsibility for what the Earth have become as of now. Because of our continuous use of resources such as fossils and oils as well as our continuous burning of plastic wastes, use of chemicals, cutting of trees, use of transportation operated by non-renewable energy, we slowly contribute to the impact and worsening of the climate change state on our Earth. This app was created to help people learn what they need to learn about climate change and if ever that they have trouble remembering or understanding what it is, the app was additionally given features such as giving challenges or tasks that could help remind as well as teach the users things related to climate change.");
        CC_Functions.EnterBackKey();
        return;
    }

    private static void displayCC_Info1() { //title & detail
        for (CC_Info_Format content : CC_Info1) {
            content.display_details1();
        }
    }

    private static void displayCC_Info2() { // with link
        for (CC_Info_Format content : CC_Info2) {
            content.display_details2();
        }
    }

    private static void displayCC_Info3() { //no backkey in between
        for (CC_Info_Format content : CC_Info3) {
            content.display_details3();
        }
    }

    private static void display_Challenges1(){
        for (CC_Challenges content : CC_Challenges1) {
            content.display_Challenge1();
        }
    }

    private static void display_Challenges2(){
        for (CC_Challenges content : CC_Challenges2) {
            content.display_Challenge2();
        }
    }

    private static void display_Challenges3(){
        for (CC_Challenges content : CC_Challenges3) {
            content.display_Challenge3();
        }
    }
    
}
