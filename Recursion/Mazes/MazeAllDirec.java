public class MazeAllDirec {
    static void allPath(String path,boolean maze[][],int r,int c ){
        if(r == maze.length - 1 && c== maze[0].length - 1 ){
            System.out.println(path);
            return;
        }
        
        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false; //marking the block which have been traversed
        if(r< maze.length-1){
            allPath(path + "D-",maze, r+1, c);
        }

        if(c< maze[0].length-1){
            allPath(path + "R-",maze, r, c+1);
        }
        if(r>0){
            allPath(path + "U-",maze, r-1, c);
        }
        if(c>0){
            allPath(path + "L-",maze, r, c-1);
        }
        //before going out of the function call changes are being reverted
        //backtracking  
        maze[r][c] = true;
    }
    
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        allPath("", maze, 0, 0);
    }
}
