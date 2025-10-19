package array;

public class Main {
    public static void main(String[] args) {

        MyStack<Integer> st = new MyStack<>();


        st.push(10);
        st.push(20);
        st.push(30);


        st.show();


        System.out.println("Top element: " + st.peek());


        System.out.println("Removed: " + st.pop());


        st.show();

        System.out.println("Size: " + st.size());
}
 }
