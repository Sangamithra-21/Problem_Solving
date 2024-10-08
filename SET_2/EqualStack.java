package SET_2;

import java.util.Stack;

public class EqualStack {
    public static void main(String[] args) {

        int[] row1 = {3,2,1,1,1};
        int[] row2 = {4,3,2};
        int[] row3 = {1,1,4,1};

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        fillStack(stack1,row1);
        fillStack(stack2,row2);
        fillStack(stack3,row3);

        while(!stack1.isEmpty() && !stack2.isEmpty() && !stack3.isEmpty())
        {
            if(stack1.peek()==stack2.peek() && stack2.peek()==stack3.peek())
            {
                System.out.println("Height : "+stack1.pop());
                return;
            }

            if(stack1.peek()>stack2.peek() && stack1.peek()>stack3.peek())
            {
                stack1.pop();
            }
            else if(stack2.peek()>stack1.peek() && stack2.peek()>stack3.peek())
            {
                stack2.pop();
            }
            else {
                stack3.pop();
            }
        }



    }

    private static void fillStack(Stack<Integer> stack, int[] row) {
        int val = 0;
        for(int i=row.length-1;i>=0;i--)
        {
            val = val+row[i];
            stack.push(val);
        }
    }
}
