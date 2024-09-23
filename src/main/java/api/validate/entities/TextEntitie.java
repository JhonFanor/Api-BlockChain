package api.validate.entities;

public class TextEntitie {
    private String textOne;
    private String textTwo;

    public TextEntitie(String textOne, String textTwo) {
        this.textOne = textOne;
        this.textTwo = textTwo;
    }

    public String getTextOne() {
        return textOne;
    }

    public void setTextOne(String textOne) {
        this.textOne = textOne;
    }

    public String getTextTwo() {
        return textTwo;
    }

    public void setTextTwo(String textTwo) {
        this.textTwo = textTwo;
    }
}
