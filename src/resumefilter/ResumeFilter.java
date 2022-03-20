package resumefilter;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author BHussain.22048
 */
public class ResumeFilter {

    public static void main(String[] args) {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
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
