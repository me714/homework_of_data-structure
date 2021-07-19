package test4;

public class MaxArea {
    public static void main(String[] args) {
        int[] a = new int[] {4,3,2,1,4};
        System.out.println(maxArea(a));
    }
    public static int maxArea(int[] height){
        int w = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                int c = Math.min(height[i],height[j])*(j-i);
                if (c > w){
                    w =c;
                }

            }

        }
        return w;
    }
}
