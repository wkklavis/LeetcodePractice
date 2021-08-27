package Demo02;

import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {
        System.out.println(isValid("(("));
    }
    public static boolean isValid(String s) {
        if (s.length()%2==1)return false;
        char[]arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        char c = '\u0000';
        for (int i = 0; i < arr.length; i++) {
            if (stack.empty()) {
                stack.push(arr[i]);
                continue;
            }
            else c = stack.peek();

            if (arr[i]-c==1||arr[i]-c==2) {
                stack.pop();
                continue;
            }

            switch (c){
                case '{' :  if (arr[i]=='{'||arr[i]=='['||arr[i]=='(')stack.push(arr[i]);
                            else return false;
                            break;
                case '[' :  if (arr[i]=='{'||arr[i]=='['||arr[i]=='(')stack.push(arr[i]);
                            else return false;
                            break;
                case '(' :  if (arr[i]=='{'||arr[i]=='['||arr[i]=='(')stack.push(arr[i]);
                            else return false;
                            break;
                default:return false;
            }
        }
        return stack.empty()?true:false;
    }
}

/*
//绝！！！是左边就放右边；不是就拿出来，拿的出来且相等继续，拿不出来或者不相等说明不对应
class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(')stack.push(')');
            else if(c=='[')stack.push(']');
            else if(c=='{')stack.push('}');
            else if(stack.isEmpty()||c!=stack.pop())return false;
        }
        return stack.isEmpty();
    }
}*/
