public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    public boolean insert(int item) throws Exception {
        if(isEmpty()){
            int temp[] = new int[data.length*2];
            for (int i = 0; i < (front+1)%data.length; i++) {
                temp[i] = data[i];
            }
            front = 0;
            end = data.length;
            data = temp;

        }
        
        return super.insert(item);
    }
}
