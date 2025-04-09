
import java.util.Arrays;

public class PrintPath {
    static void allPathPrint(String p,boolean maze[][],int r,int c,int level,int path[][] ){
        if(r == maze.length - 1 && c== maze[0].length - 1 ){
            path[r][c] = level;
            for(int arr[]:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println("");
            
            return;
        }
        
        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false; //marking the block which have been traversed

        path[r][c] = level;

        if(r< maze.length-1){
            allPathPrint(p + "D-",maze, r+1, c,level+1,path);
        }

        if(c< maze[0].length-1){
            allPathPrint(p + "R-",maze, r, c+1,level+1,path);
        }
        if(r>0){
            allPathPrint(p + "U-",maze, r-1, c,level+1,path);
        }
        if(c>0){
            allPathPrint(p + "L-",maze, r, c-1,level+1,path);
        }
        //before going out of the function call changes are being reverted
        //backtracking  
        maze[r][c] = true;
        path[r][c] = 0;
    }
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        int path[][] = new int[maze.length][maze[0].length];
        allPathPrint("", maze, 0, 0, 0, path);
    }
}
