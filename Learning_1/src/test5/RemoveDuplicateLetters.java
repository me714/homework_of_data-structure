package test5;

import java.util.Stack;

public class RemoveDuplicateLetters {
    String removeDuplicateLetters(String s) {
        Stack<Character> stk = new Stack<>();
        boolean[] inStack = new boolean[256];

        for (char c : s.toCharArray()) {
            if (inStack[c]) continue;

            // 插入之前，和之前的元素比较一下大小
            // 如果字典序比前面的小，pop 前面的元素
            while (!stk.isEmpty() && stk.peek() > c) {
                // 弹出栈顶元素，并把该元素标记为不在栈中
                inStack[stk.pop()] = false;
            }

            stk.push(c);
            inStack[c] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!stk.empty()) {
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }

}
