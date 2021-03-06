package com.kodilla.rockpaperscissorsgame.enums;

public enum ResultsEnum {
    PLAYER_WINS("Gracz wygrywa"), 
    DRAW("Remis"), 
    COMPUTER_WINS("Komputer wygrywa");
    
    private final String description;

    ResultsEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    } 
}
