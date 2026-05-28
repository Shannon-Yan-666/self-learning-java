package demo03_for;

public class case2 {
    public static void main(String[] args) {
        int count = methon();
        System.out.println("水仙花数量为：" + count);
    }

    public static int methon(){
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int num_ge = i / 1 %10;
            int num_shi = i / 10 %10;
            int num_bai = i / 100 %10;
            int sum = num_ge * num_ge * num_ge + num_shi * num_shi * num_shi + num_bai * num_bai * num_bai;
            if (sum == i) {
                System.out.println("水仙花数：" + i);
                count++;
            };
        }
        return count;
    }
}
