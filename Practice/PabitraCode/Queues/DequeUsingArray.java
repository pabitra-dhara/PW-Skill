public class DequeUsingArray {
    public static class dqa{
        int arr[]=new int[8];
        int size=0;
        int rear=-1;
        int front=-1;
        public void add(int x) throws Exception{
            if(arr.length==size){
                throw new Exception("Queue is full!");
            }else if(size==0){
                front=rear=0;
                arr[0]=x;
            }else if(rear<arr.length-1){
                arr[++rear]=x;
            }
            size++;
        }
        public int remove(){
            
        }


        public int peek() throws Exception{
            if(size==0){
                throw new  Exception("Queue if Underflow!");
            }
            return arr[0];
        }
    }
    public static void main(String[] args) throws Exception{
        
    }
}
