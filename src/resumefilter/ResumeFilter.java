package resumefilter;

import java.io.File;
import java.util.Arrays;
import javax.swing.UIManager;

/**
 *
 * @author BHussain.22048
 */
public class ResumeFilter {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            new Filter().setVisible(true);

//            String st[] = {"JAVA", "cSharp", "HTML"};
//            System.out.println(Arrays.toString(st).toLowerCase());
//            Arrays.sort(st);
//            String dir = String.join("-", Arrays.asList(st));
//
//            File directory = new File("D:\\BAHL Projects\\" + dir.toLowerCase());
//            if (!directory.exists()) {
//                directory.mkdir();
//                System.out.println("created");
//            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
