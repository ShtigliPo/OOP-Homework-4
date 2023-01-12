package ru.gb;

public class BeginsWith extends Module<String> {

    private String elementsBeginner;

    public BeginsWith(String elementsBeginner) {
        this.elementsBeginner = elementsBeginner;
    }

    public String getElementsBeginner() {
        return elementsBeginner;
    }

    @Override
    public boolean isGood(String item) {
        return item.startsWith(elementsBeginner);
    }
    
}