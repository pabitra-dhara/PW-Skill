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
        public int remove() throws Exception{
            int val=arr[0];
            if(size==0){
                throw new Exception("Queue is Empty!");
            }else if(size==1){
                arr[0]=0;
            }else{
                for(int i=0;i<size;i++){
                arr[i]=arr[i+1];
                }
            }
            rear--;
            size--;
            return val;
        }
        public int removeFirst() throws Exception{
            int val=arr[0];
            if(size==0){
                throw new Exception("Queue is Empty!");
            }else if(size==1){
                arr[0]=0;
            }else{
                for(int i=0;i<size;i++){
                arr[i]=arr[i+1];
                }
            }
            rear--;
            size--;
            return val;
        }
        public int removeLast() throws Exception{
            int val=arr[rear];
            if(size==0){
                throw new Exception("Queue is Empty!");
            }else if(size==1){
                arr[1]=0;
            }else{
                arr[rear]=0;
            }
            size--;
            rear--;
            return val;
        }
        public int peek() throws Exception{
            if(size==0){
                throw new  Exception("Queue if Underflow!");
            }
            return arr[0];
        }

        public void display(){
            for(int i=front;i<size;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        dqa obj=new dqa();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.display();//1 2 3 4 5 
        System.out.println("Remove Element:"+obj.remove());//1
        obj.display();//2 3 4 5
        System.out.println(obj.peek());//2
        System.out.println(obj.remove());//2
        obj.display();//3 4 5 
        obj.add(6);
        obj.display();
        System.out.println(obj.removeLast());
        obj.display();
    }
}
