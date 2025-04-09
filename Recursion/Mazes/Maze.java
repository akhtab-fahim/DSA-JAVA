
import java.util.ArrayList;

public class Maze {
    static int maze(int r,int c ){
        if(r==1 || c==1 ){
            return 1;
        }
        int left = maze(r-1, c);
        int right = maze(r, c-1);
        return left+right;
    }
    static void mazePath(String path,int r,int c ){
        if(r==1 && c==1 ){
            System.out.println(path+"Reached" );
            return;
        }
        if(r>1){
            mazePath(path + "D-", r-1, c);
        }
        if(c>1){
            mazePath(path + "L-", r, c-1);
        }
   }
   //theres an river in the 1,1 place 
   static void mazeObstacle(String path,boolean maze[][],int r,int c ){
    if(r==maze.length-1 && c==maze[0].length-1 ){
        System.out.println(path+"Reached" );
        return;
    }
    if(maze[r][c] == false){
        return;
    }
    if(r<maze.length-1){
        mazeObstacle(path + "D-",maze, r+1, c);
    }
    if(c<maze[0].length-1){
        mazeObstacle(path + "L-",maze, r, c+1);
    }
}
   static ArrayList<String> mazePathList(String path,int r,int c ){
    if(r==1 && c==1 ){
        ArrayList<String> list = new ArrayList<>();
        list.add(path);
        return list;
    }
    ArrayList<String> list = new ArrayList<>();

    if(r>1){
        list.addAll(mazePathList(path + "D", r-1, c));
    }
    if(c>1){
        list.addAll(mazePathList(path + "L", r, c-1));
    }
    return list;
}

static ArrayList<String> mazeDiagonal(String path,int r,int c ){
    if(r==1 && c==1 ){
        ArrayList<String> list = new ArrayList<>();
        list.add(path);
        return list;
    }
    ArrayList<String> list = new ArrayList<>();
    if(r>1 && c>1){
        list.addAll(mazeDiagonal(path + "d", r-1, c-1));
    }
    if(r>1){
        list.addAll(mazeDiagonal(path + "H", r-1, c));
    }
    if(c>1){
        list.addAll(mazeDiagonal(path + "V", r, c-1));
    }
    return list;
}
    public static void main(String[] args) {
        System.out.println(maze(3, 3));
        mazePath("",3, 3); 
        System.out.println(mazeDiagonal("", 3, 3));
        boolean board[][]={
            {true,true,true},
            {true,false,true},
            {true,true,true},
        };
        mazeObstacle("", board, 3, 3);
    }
        
}
