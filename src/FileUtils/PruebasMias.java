package FileUtils;

import java.io.File;

public class PruebasMias {
    public static void main(String[] args) {
        File file1 = new File("ficheros");
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.exists());
    }
}

