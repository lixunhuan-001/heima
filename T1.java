public class T1 {
    /**
     * 利用循环语句，打印一个四行四列的正方形。*/
    public static void main(String[] args) {
        for (int i = 0; i <7 ; i++) {
            for (int j = 0; j <7 ; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}
