package test2;

//���������ַ����������Ƿֱ�������ж϶����Ƿ���ȣ������ؽ���������ȷ���true������ȷ���false�������ַ����ɰ��� #���������˸��ַ���
//
//�� ab#c �� ad#c �������Ϊac��������ȡ�
//
//���ı�����#��ȻΪ�ա�
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

