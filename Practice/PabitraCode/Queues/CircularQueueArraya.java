public class CircularQueueArraya {
    public static class cqaOperation{
        private int front=-1;
        private int rear=-1;
        int size=0;
        int arr[]=new int[8];

        public void add(int val) throws Exception{
            if(size==arr.length){
                throw new Exception("Queues is full");
            }else if(size==0){
                front=rear=0;
                arr[0]=val;
            }else if(rear<arr.length-1){
                arr[++rear]=val;
            }else if(rear==arr.length-1){
                rear=0;
                arr[rear]=val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queues Is Empty");
            }else{
                int x=arr[front];
                size--;
                if(front==arr.length-1){
                    front=0;
                    return x;
                }else{
                    front++;
                    return x;
                }
            }
            // else if(front==arr.length-1){
            //     int x=arr[front];
            //     front=0;
            //     retunr x;
            // }else{
            //     int x=arr[front];
            //     front++;
            //     retunr x;
            // }
        }
       public int peek() throws Exception{
           if(size==0){
               throw new Exception("Queues is Empty!");
           }
           return arr[front];
       }

       public boolean isEmpty(){
           if(size==0){
               return true;
           }
           return false;
       }
       public void display() throws Exception{
           if(size==0){
               throw new Exception("Queue is Empty!");
           }else if(front<=rear){
               for(int i=front;i<=rear;i++){
                   System.out.print(arr[i]+"  ");
               }
           }else if(rear<front){
               for(int i=front;i<arr.length;i++){
                   System.out.print(arr[i]+" ");
               }
               for(int i=0;i<=rear;i++){
                   System.out.print(arr[i]+" ");
               }
           }
           System.out.println();
       }
    }
    public static void main(String[] args) throws Exception{
        cqaOperation obj=new cqaOperation();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(6);
        obj.add(7);
        obj.add(8);

        obj.display();//1 2 3 4 5 6 7 8
        System.out.println(obj.remove());//1
        System.out.println(obj.peek());//2
        System.out.println(obj.isEmpty());//false
        obj.display();//2 3 4 5  6 7 8
        System.out.println(obj.size);
        obj.add(9);
        obj.display();
        for(int i=0;i<obj.arr.length;i++){
            System.out.print(obj.arr[i]+" ");
        }
    }
}
