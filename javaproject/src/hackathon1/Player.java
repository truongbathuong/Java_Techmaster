package hackathon1;
 
enum Position {
    GK,
    DF,
    MF,
    FW,
}
public class Player {
    private String fullName;
    private Position position;
    private int num;
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public Player() {
    }
    public Player(String fullName, Position position, int num) {
        this.fullName = fullName;
        this.position = position;
        this.num = num;
    }
    public String toString(){
        return fullName +"\t" + position +"\t"+ num;
    }
    
}
