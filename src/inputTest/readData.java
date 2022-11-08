package inputTest;

public class readData {private int countCharacters;

    private int countRows;

    public void myMethod(String inputText1) {
        countRows++;
        countCharacters = countCharacters + inputText1.length();
    }

    public int getRows() {
        return countRows;
    }

    public int getCharacters() {
        return countCharacters;
    }
}
