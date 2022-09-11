public class Cell {
    public enum Status {
        X,
        O,
        EMPTY
    }
    public  Status status_;
    Cell() {
       // System.out.println("Checked");
        status_ = Status.EMPTY;
    }
    public boolean UpdateCell(char x) {
        if(status_ != Status.EMPTY) return false;
        if(x == 'X') status_ = Status.X;
        if(x == 'O') status_ = Status.O;
        return true;
    }
    public char Get_Status() {
        if(status_ == Status.EMPTY) return ' ';
        if(status_ == Status.X) return 'X';
        else return 'O';
    }
}
