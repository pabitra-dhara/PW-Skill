public class StackUsingArraya {
    public static class Stack{
        private int arr[]=new int[10];
        private int idx=0;
        void push(int x){
            
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is Underflow!!");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty!!");
                return -1;
            } 
            int x=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return x;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();//1 2 3 4
        System.out.println(st.peek());// 4
        st.display();// 1 2 3 4
        st.pop();
        st.display();//1 2 3
        System.out.println("size of stack:"+st.size());
        System.out.println(st.isEmpty());
    }
}
