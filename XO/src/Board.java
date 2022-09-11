public class Board {
    public Cell[][] cell_ = new Cell[4][4];
    public char cell_val_[][] = new char[4][4];
    Board() {
       // System.out.println("Checked");
        for(int i = 1; i < 4; i++)
            for(int j = 1; j < 4; j++) cell_[i][j] = new Cell();
    }
    public void Get_Cell(int pos1, int pos2) {
        System.out.println(cell_[pos1][pos2].Get_Status());
    }

    public boolean Update(int x, int y, char t) {
        if(x > 3 || y > 3 || x < 1 || y < 1)  return false;
        return cell_[x][y].UpdateCell(t);
    }

    public void Show_Board() {
        for(int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++)
                System.out.print("[" + cell_[i][j].Get_Status() + "]");
            System.out.print('\n');
        }
    }

    public int Compare(char a, char b, char c) {
        int num_a = a;
        int num_b = b;
        int num_c = c;
        if(num_a == num_b && num_b == num_c && a != ' ') return 1;
        return 0;
    }

    public boolean Check_Board() {
        for(int i = 1; i < 4; i++)
            for(int j = 1; j < 4; j++)
                if(cell_[i][j].Get_Status() == ' ') return true;
        return false;
    }
    public boolean Game_Over() {
        for(int i = 1; i < 4; i++)
            for(int j = 1; j < 4; j++) {
                cell_val_[i][j] = cell_[i][j].Get_Status();
            }

        if(Compare(cell_val_[1][1], cell_val_[1][2], cell_val_[1][3]) == 1) return true;

        if(Compare(cell_val_[2][1], cell_val_[2][2], cell_val_[2][3]) == 1) return true;

        if(Compare(cell_val_[3][1], cell_val_[3][2], cell_val_[3][3]) == 1) return true;

        if(Compare(cell_val_[1][1], cell_val_[2][1], cell_val_[3][1]) == 1) return true;

        if(Compare(cell_val_[1][2], cell_val_[2][2], cell_val_[3][2]) == 1) return true;

        if(Compare(cell_val_[1][3], cell_val_[2][3], cell_val_[3][3]) == 1) return true;

        if(Compare(cell_val_[1][1], cell_val_[2][2], cell_val_[3][3]) == 1) return true;

        if(Compare(cell_val_[1][3], cell_val_[2][2], cell_val_[3][1]) == 1) return true;

        return false;
    }
}
