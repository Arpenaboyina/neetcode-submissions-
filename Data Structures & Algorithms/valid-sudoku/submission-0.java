class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character>[] rows=new HashSet[9];
         HashSet<Character>[] cols=new HashSet[9];
          HashSet<Character>[] box=new HashSet[9];

          for(int i=0;i<9;i++)
          {
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            box[i]=new HashSet<>();
          }


        for(int i=0;i<9;i++)
        {
            
            for(int j=0;j<9;j++)
            {
                   
                   char a=board[i][j];

                   if(a == '.') continue;

                   int bv=(i/3)*3+(j/3);

                   if(rows[i].contains(a) ||cols[j].contains(a) || box[bv].contains(a)) return false;


                   rows[i].add(a);
                   cols[j].add(a);
                   box[bv].add(a);
            }

        }
        return true;
    }
}
