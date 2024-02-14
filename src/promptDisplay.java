public class promptDisplay
{

    /* Store info of prompts
    */
    public static String[][] promptInfo =
            {
                    {"Combat","Attack","Guard","Spells","Items","Run Away"},
                    {"Exploration","Continue Forward","Check Status","Spells","Items"}
            };

    public void display(String menuType)
    {
        /*
        Menu type will probably be manually indexed with numbers, I don't know how to add dictionaries
        Switch statements will evaluate given menu type to get the index of promptInfo
         */
        int promptNum;
        switch(menuType)
        {
            case "Combat":
                promptNum = 0;
                break;
            case "Exploration":
                promptNum = 1;
                break;
            default:
                promptNum = 0;
                break;
        }
        /*
        For loop to run through items in promptInfo to print out the prompt
        Count variable "i" starts at 1 to ignore the first value
         */
        for (int i = 1;i<promptInfo[promptNum].length;i++)
        {
            String printString = "["+Integer.toString(i)+"]"+" - "+promptInfo[promptNum][i];
            System.out.println(printString);
        }
        System.out.println("----------------");
    }


    @Override
    public String toString()
    {
        return "";
    }
}
