

public class CustomArraylist {
    private int data[];
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArraylist(){
        this.data = new int[DEFAULT_SIZE];

    }

    public int remove(){
        size--;
        int removed = data[size];
        return removed;
    }


    public int get(int index){
        if(index<0 || index>data.length){
            System.out.println("Invalid index");
        }

        return data[index];
    }

    public int size(){ return size;}
    
    public void add(int num){
        if(isFull()){
            resize();
        }
        
        size++;
        data[size] = num;
        
    }

    public boolean isEmpty(){
        if(this.size == 0){
            return true;
        }
        return false;

    }

    public void set(int index,int element){
        data[index] = element;

    }
    private boolean isFull(){
        if(this.size == data.length){
            return true;
        }
        return false;

    }
    private void resize(){
        int temp[] = new int[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
            
        }
        data = temp;

    }




    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();
        // list.add(12);
        // list.remove(0);
        // list.get(0);
        // list.set(1, 12);
        // list.isEmpty();
        CustomArraylist list = new CustomArraylist();
        list.add(12);
        list.add(121);
        list.add(2);
        System.out.println(list.get(1));
        System.out.println(list);
    }
}
