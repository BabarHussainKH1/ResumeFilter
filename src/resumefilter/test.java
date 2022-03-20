/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumefilter;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 *
 * @author BHussain.22048
 */
public class test {

    public static void main(String[] args) {
//        String fileName = "D:\\BAHL Projects\\Resume 2022\\4220130434172_09-Feb-2022_090229 ASGHAR NOOR.docx";
//
//        XWPFDocument document = null;
//        FileInputStream fileInputStream = null;
//        try {
//
//            File fileToBeRead = new File(fileName);
//            fileInputStream = new FileInputStream(fileToBeRead);
//            document = new XWPFDocument(fileInputStream);
//            XWPFWordExtractor extractor = new XWPFWordExtractor(document);
//
//            System.out.println("The Contents of the Word File are ::");
//            System.out.println("--------------------------------------");
//
//            System.out.println(extractor.getText());
//
//        } catch (Exception e) {
//            System.out.println("We had an error while reading the Word Doc");
//        } finally {
//            try {
//                if (document != null) {
//                    document.close();
//                }
//                if (fileInputStream != null) {
//                    fileInputStream.close();
//                }
//            } catch (Exception ex) {
//            }
//        }

        System.out.println("running..");
        String text = "MUHAMMAD HUSNAIN ABBAS Electrical Engineer (Electronics & Communication) To work in an Organization that offers a creative, dynamic and professional environment, where there ismaximum chance of learning and grow as a proficient, innovative and committed person. mhusnainabbas2@gmail.com +92 307 6557305 Thanda Pani, Lehtrar Road NiloreIslamabad, Pakistan 27 October, 1997 linkedin.com/in/m-husnain-abbas-248634171 github.com/mhusnainee stackoverflow.com/users/16451924/m-husnain-abbas SKILLS Matlab Simulink Microsoft Office DevC++ Python Linux Keil uVision Power World Simulator Proteus & Multisim Electric devices Repairing LANGUAGES English Full Professional Proficiency Urdu Native or Bilingual Proficiency Punjabi Native or Bilingual Proficiency INTERESTS Cyber Security Circuit Designing Programming EDUCATION B.Sc. Electrical Engineering University of Engineering and Technology Lahore, Faisalabad Campus 10/2017 - 07/2021,  3.38/4, 84.60 Percent F.Sc. Pre-Engineering Government Post Graduate College Sheikhupura (BISE Lahore) 09/2015 - 05/2017,  883/1100, 80.27 Percent Matriculation Govt. Rashid Minhas Higher Secondary School, HFD (BISE Gujranwala) 04/2013 - 03/2015,  951/1100, 86.45 Percent WORK EXPERIENCE Accurate Pvt. Ltd, Sundar Industial Estate Lahore (11/2021 - 01/2022) Jr. Engineer in Research and Development Department Arista Solar, Sunrise Arcade DHA 2 Islamabad (10/2021 - 11/2021) Trainee Engineer CERTIFICATES Python for Beginners, Sololearn (11/2021 - 12/2021) PERSONAL PROJECTS IOT Based Power Management Unit for Smart Distribution and Consumption (FYP) (03/2020 - 07/2021) IOT based power management unit is for smart distribution and consumption of power within nodes. This project is forremote areas, where there is no AC supply. It is the prototype of DC Smart Grid System. First Person View Quadcopter (08/2019 - 01/2020) FPV quadcopter is used for surveillance and security purposes. Flight controller used is KK2.1.5 and frame used isDJIF450. Digital Clock (05/2019 - 06/2019) This digital clock is based on 8-bit microcontroller, PIC16F84A. The digital displays used are 7 segment displays whichwere made of LEDs. DC Voltmeter (08/2018 - 11/2018) This DC voltmeter can measure DC voltages up to 999 volts. This voltmeter is based on an analog to digital converter,ICL7107CPL. MPPT using P&O and ANN (06/2019 - 02/2020) Maximum power point tracking is used to track the maximum power point of Solar panels and Wind turbines. Thisproject is based on Simulation of MPPT using Perturb and Observe and Artificial neural network Techniques. Comparison of 4G and 5G Technologies (08/2020 - 12/2020) It is a review project. The two technologies were reviewed through a brief comparison between them. CURRICULAR ACTIVITIES, INDUSTRIAL EXPOSURE 1. PLC workshop, Fast Chiniot, Faisalabad (08/2020) 2. CPD Python workshop UET FSD (03/2019) Industrial Visit (11/2019) Fazal Steel Limited , Islamabad Study Tour (12/2018) 500 KV Gatti Grid Station, Faisalabad ";

        String str = "communicATioN";
        String REGEX_FIND_WORD = "(?i).*?\\b%s\\b.*?";
        String regex = String.format(REGEX_FIND_WORD, Pattern.quote(str));
        System.out.println(text.matches(regex));
        
//        System.out.println(Pattern.compile(Pattern.quote("java".rep), Pattern.CASE_INSENSITIVE).matcher(text).find());
//        if (Pattern.compile("").matcher(text).find()) {
//            System.out.println("found");
//        }
//        System.out.println(containsWord(text, str));
//        Map<String, Boolean> map = new HashMap();
//        map.put("java", true);
//        map.put("docker", true);
//        map.put("android", false);
////        for (Map.Entry entry : map.entrySet()) {
//            System.out.println(entry.getKey() + "/" + entry.getValue());
//            if (entry.getKey().equals("java")) {
//                entry.setValue(true);
//            }
//        }
//        map.put("android", Boolean.TRUE);
//        System.out.println(map);
//        System.out.println(getFlag(map));

//        List<String> resultKeys = map.entrySet().stream().filter(Map.Entry::getValue).map(Map.Entry::getKey).collect(Collectors.toList());
//        System.out.println(resultKeys);
//        Collections.sort(resultKeys);
//        System.out.println(String.join("-", resultKeys));
//        String strr = "docker-flutter-java";
//        String arrs[] = strr.split("-");
//        System.out.println(Arrays.toString(arrs));
    }

    public static boolean getFlag(Map<String, Boolean> map) {
        for (Map.Entry entry : map.entrySet()) {
            if (Boolean.FALSE.equals(entry.getValue())) {
                return false;
            }

        }

        return true;
    }

    public static String REGEX_FIND_WORD = "(?i).*?\\b%s\\b.*?";

    public static boolean containsWord(String text, String word) {
        String regex = String.format(REGEX_FIND_WORD, Pattern.quote(word));
        return text.matches(regex);
    }

}
