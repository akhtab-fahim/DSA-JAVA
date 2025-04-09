public class WildCards {
   

static public class CustomGenericArraylist<T extends Number> {
    private Object data[];
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public CustomGenericArraylist(){
        data = new Object[DEFAULT_SIZE];
    } 


    public T remove(){
        size--;
        T removed = (T)data[size];
        return removed;
    }


    public T get(int index){
        if(index<0 || index>data.length){
            System.out.println("Invalid index");
        }

        return (T)data[index];
    }

    public int size(){ return size;}
    
    public void add(T num){
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

    public void set(int index,T element){
        data[index] = element;

    }
    private boolean isFull(){
        if(this.size == data.length){
            return true;
        }
        return false;

    }
    private void resize(){
        Object temp[] = new Object[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
            
        }
        data = temp;

    }
    
}
    public static void main(String[] args) {
        CustomGenericArraylist<Integer> list = new CustomGenericArraylist<>();
        list.add(12);
        list.get(1);
    }
 
}

