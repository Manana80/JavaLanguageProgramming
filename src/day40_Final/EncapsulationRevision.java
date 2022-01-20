package day40_Final;
import day39_Recap.day39_Recap_Shape.Circle;
import day39_Recap.day39_Recap_Shape.Square;


public class EncapsulationRevision {
    private Circle circle;

    private Square square;

    public Circle getCircle(){
        return circle;
    }

    public void setCircle  (Circle circle){
        if(circle.getRadius() < 5){
           return;
        }
        this.circle = circle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}
