public class QueuesImplemenUsingArray {
    public static class queues{
        private int f=-1;
        private int r=-1;
        int size=0;
        int arr[]=new int[5];
        public void add(int val){
            if(arr.length-1==r){
                System.out.println("Queues is full!");
                return;
            }
            if(f==-1){
                f=r=0;
                arr[f]=val;
            }else{
                arr[f+1]=val;
                f++;
            }
            size++;
        }
        
        public int remove(){
            if(size==0){
                System.out.println("Queues is Empty!");
                return -1;
            }
            f++;
            size--;
            return arr[f];
        }

        public int peek(){
            if(size==0){
                System.out.println("Queues is Empty!");
                return -1;
            }

            return arr[r];
        }
        public boolean isEmpty(){
            if(arr.length==0){
                return true;
            }
            return false;
        }
        public void display(){
            for(int i=f;i<r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queues obj=new queues();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.display();
    }
}
