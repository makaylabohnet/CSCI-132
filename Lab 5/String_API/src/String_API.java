
public class String_API {
    //feilds
    private String inputString;
    private String charChoice;

    //constructor
    public String_API(String inputString) {
        this.inputString = inputString;

    }

    //menu option 1
    public int countChar(String charChoice) {
        char[] characters = {};
        inputString.getChars(0, -1, characters, 0);
        int count = inputString.indexOf(charChoice) + 1;
        return count;

    }

    //    //menu option 2
    public int countWords() {
        String[] characters = inputString.split("\\s+");
        int size = characters.length;
        return size;
    }

    //menu option 3
    public String noSpaces() {
        String noS = inputString.replaceAll("\\s+", "");
        return noS;
    }

    //menu option 4
    public void reset(String inputString2) {
        inputString = inputString2;
    }
}

