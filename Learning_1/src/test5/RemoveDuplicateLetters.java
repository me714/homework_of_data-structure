package test5;

import java.util.Stack;

public class RemoveDuplicateLetters {
    String removeDuplicateLetters(String s) {
        Stack<Character> stk = new Stack<>();
        boolean[] inStack = new boolean[256];

        for (char c : s.toCharArray()) {
            if (inStack[c]) continue;

            // ����֮ǰ����֮ǰ��Ԫ�رȽ�һ�´�С
            // ����ֵ����ǰ���С��pop ǰ���Ԫ��
            while (!stk.isEmpty() && stk.peek() > c) {
                // ����ջ��Ԫ�أ����Ѹ�Ԫ�ر��Ϊ����ջ��
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
