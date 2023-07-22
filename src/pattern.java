import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class pattern {
    public static void main(String[] args) {
        int row = 15, col = 15;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (((j >= 5 && j < 10)) || ((i >= 5 && i < 10))){
                        System.out.print(" ");
                }else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
