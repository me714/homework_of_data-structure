package test2;

//给定两个字符串，当它们分别被输入后，判断二者是否相等，并返回结果。如果相等返回true，不相等返回false。输入字符串可包含 #，它代表退格字符。
//
//如 ab#c 和 ad#c 最后结果都为ac，所以相等。
//
//空文本输入#依然为空。
public class EqualBackspace {
    public static void main(String[] args) {
        System.out.println(equals("","#df##"));
    }
    public static boolean equals(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == '#') {
                if(i==0){
                    str1 = str1.substring(1,str1.length()+1);

                    i = 0;
                }else {
                    str1 = str1.replace(str1.substring(i - 1, i+1), "");
                    i = i -2;

                }
            }

        }

        for (int c = 0; c < str2.length(); c++){
            if (str2.charAt(c) == '#') {
                if(c == 0){
                    str2 = str2.substring(1,str2.length());
                    c = 0;
                }else {
                    str2 = str2.replace(str2.substring(c-1,c+1),"");
                    c = c -2;
                }

            }

                }
        return str1.equals(str2);
            }

    }

