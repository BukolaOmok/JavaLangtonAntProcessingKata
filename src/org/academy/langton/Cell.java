package org.academy.langton;

public class Cell {
    private String stateColor;
    private final GridPosition gridPosition;

    public Cell(int x, int y){
        gridPosition = new GridPosition(x, y);
        stateColor = "white";
    }

    public String toggleActive(){
        if (stateColor == "white"){
            stateColor = "black";
        } else if (stateColor == "black"){
            stateColor = "red";
        } else if (stateColor == "red"){
            stateColor = "white";
        }
        return stateColor;
    }

    public void setActive(int value){
        stateColor = String.valueOf(value);
    }

    public String stateColor() {
        return stateColor;
    }

    public GridPosition gridPosition(){
        return gridPosition;
    }
}
