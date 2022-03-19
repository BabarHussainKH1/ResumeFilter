/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumefilter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String text = "Q A I S E R K H A N  Front End Developer Co- Founder/ CMO of Team ALIF     qaiserkhattak1999@gmail.com 03049731678   Taxila SKILLS   Html5, CSS3 Bootstrap4  Adobe Tools Graphic Designing Email Marketing SEO UI/UX Social media content creation Flutter System analysis and design PROJECTS   FundPak (Android/IOS) Hotel management (C++) Attendance Management System (Java & Database)   Taka-Tak pizza Website  Digital Image Processing E- Health Care Quiz App(Android)  OBJECTIVE   I personally believe that nothing is impossible in this world. We just have to put efforts in right way. I am Email Marketing expert with Frontend website and app developer with some work experience in UI/UX, website and application design and development looking for a role as Marketing Specialist or front-end developer to leverage my knowledge and experience. My aim is to seek a suitable position in reputed Organization to enhance and utilize my knowledge and skills in order to cope with the challenges of the industry. EXPERIENCE   FRONT END WEB DEVELOPER MISTIQUBE / MAY 2020 – August 2020 • Worked as a web developer and used Html, CSS and Bootstrap to work on organization’s website. • Designed forms, pages and completed every task given to me by senior developers.    Email Marketing and Campaign Management FIVERR / March 2019 – 2021 • Worked in the field of Email Marketing and Campaigns Management on fiverr. I am almost level 2 seller and still going, providing my services to different organizations. Overall, I have 5-star ratings from more than 100 international buyers. • Used Mailchimp, Klaviyo, Send in Blue, Constant Contact, Active Campaign, and other email marketing tools for my work. • Working in the field for 3 years know I have great knowledge about the Digital Marketing, SEO and how to run campaigns and make Email Templates. It is one my strongest area to work. • My main goal has always been the satisfaction of my clients. You can visit my profile to have a look at my work. Link: https://www.fiverr.com/users/web_dvlpr/seller_dashboard Username: Web_Dvlr                                                             SOCIAL MEDIA CONTENT CREATION MULTIINSIGHT / January 2021 – March 2021 • Did my internship in Graphic designing and social media content creation at MultiInsight, Islamabad • I do have the certificate and the heads of this organization were very happy with my performance.  CERTIFICATIONS  Gold Medal For scoring good marks in matric Silver Medal For scoring good marks in FSC Photoshop Certificate For attending photoshop workshop in university Certificate of Appreciation Organizer and Manager of university event - TECHSALVO  Scholarship Certificates 5th, 8th, matric and FSc scholarships QUIZ Competition Certificate College level winner  Presentation Competition Certificate College level winner Speech Competition Certificate College level winner   Graphics Training Certificate DigiSkillls (Virtual University) Creative Writing Certificate DigiSkillls (Virtual University) Freelancing Certificate DigiSkillls (Virtual University) Html-CSS Certificate Udemy  SOFTWARES   Android Studio Visual Studio Adobe Tools Star UML Eclipse Brackets FLUTTER DEVELOPER • Did online work as a frontend app developer creating many projects and learning at the same time. Used flutter to work on developing my Final Year Project.  • Made Android and IOS app of FYP. • Designed certain screens and did changings regarding modifications in the GUI of existing app.  EDUCATION    BS (Hons.) Software Engineering Oct 2017 – July 2021  UNIVERSITY OF ENGINEERING AND TECHNOLOGY, TAXILA, PAKISTAN CGPA: 3.21 / 4.00 (81%)  Specialized in Email Marketing, Front End web development,UI/UX development with knowledge of desktop application development. Actively participated in team projects to create real-world applications. Served as an active member for development of final year project of a Crowd Funding Platform web and mobile application. Acted as IT Head of a society named SoftDesk from 2020 to 2021.  Intermediate (Pre-Engineering) Sept 2015 – Sept 2017  SUPERIOR COLLEGE FOR GIRLS, GUJAR KHAN, PAKISTAN Marks: 963 / 1100 (87.54%)  Studies focused in engineering subjects such as Mathematics, Algebra, Physics and Chemistry. Learned basic concepts and applied these concepts to practical issues.  Matriculation (Science) Apr 2013 – July 2015  Army Public School and College (APSACS), MULTAN, PAKISTAN Marks: 933 / 1100 (89%)  Studies focused in Science subjects such as Mathematics, Physics, Chemistry and Biology. Learned basic concepts and their real-life applications.  FINAL YEAR PROJECT    FUNDPAK (Pakistan’s First Crowd Funding App) Android, IOS & WEB App • Developed an application using flutter and firebase for the entrepreneurs and small businesspersons. • This project is initialized to help people to engulf the bridge b/w entrepreneurs and the investors of Pakistan. • Followed agile devlp life cycle and perform all testing               ";
			text ="Q A I S E R" + 
					" K H A N " + 
					" " + 
					"Front End Developer " + 
					"Co- Founder/ CMO of Team ALIF " + 
					" " + 
					" " + 
					" " + 
					" qaiserkhattak1999@gmail.com" + 
					" 03049731678 " + 
					"  Taxila " + 
					"SKILLS " + 
					" " + 
					" " + 
					"Html5, CSS3 " + 
					"Bootstrap4  " + 
					"Adobe Tools " + 
					"Graphic Designing " + 
					"Email Marketing " + 
					"SEO " + 
					"UI/UX " + 
					"Social media content creation " + 
					"Flutter " + 
					"System analysis and design " + 
					"PROJECTS " + 
					" " + 
					" " + 
					"FundPak (Android/IOS) " + 
					"Hotel management (C++) " + 
					"Attendance Management " + 
					"System (Java & Database)   " + 
					"Taka-Tak pizza Website  " + 
					"Digital Image Processing " + 
					"E- Health Care " + 
					"Quiz App(Android) " + 
					" " + 
					"OBJECTIVE " + 
					" " + 
					" " + 
					"I personally believe that nothing is impossible in this world. We just have to " + 
					"put efforts in right way. I am Email Marketing expert with Frontend website " + 
					"and app developer with some work experience in UI/UX, website and " + 
					"application design and development looking for a role as Marketing " + 
					"Specialist or front-end developer to leverage my knowledge and " + 
					"experience. My aim is to seek a suitable position in reputed Organization to " + 
					"enhance and utilize my knowledge and skills in order to cope with the " + 
					"challenges of the industry. " + 
					"EXPERIENCE " + 
					" " + 
					" " + 
					"FRONT END WEB DEVELOPER " + 
					"MISTIQUBE / MAY 2020 – August 2020 " + 
					"• Worked as a web developer and used Html, CSS and Bootstrap to " + 
					"work on organization’s website. " + 
					"• Designed forms, pages and completed every task given to me by " + 
					"senior developers. " + 
					"   Email Marketing and Campaign Management " + 
					"FIVERR / March 2019 – 2021 " + 
					"• Worked in the field of Email Marketing and Campaigns " + 
					"Management on fiverr. I am almost level 2 seller and still going, " + 
					"providing my services to different organizations. Overall, I have 5-" + 
					"star ratings from more than 100 international buyers. " + 
					"• Used Mailchimp, Klaviyo, Send in Blue, Constant Contact, Active " + 
					"Campaign, and other email marketing tools for my work. " + 
					"• Working in the field for 3 years know I have great knowledge " + 
					"about the Digital Marketing, SEO and how to run campaigns " + 
					"and make Email Templates. It is one my strongest area to " + 
					"work. " + 
					"• My main goal has always been the satisfaction of my clients. " + 
					"You can visit my profile to have a look at my work. " + 
					"Link: https://www.fiverr.com/users/web_dvlpr/seller_dashboard " + 
					"Username: Web_Dvlr" + 
					"                                                             SOCIAL MEDIA CONTENT CREATION " + 
					"MULTIINSIGHT / January 2021 – March 2021 " + 
					"• Did my internship in Graphic designing and social media content " + 
					"creation at MultiInsight, Islamabad " + 
					"• I do have the certificate and the heads of this organization were " + 
					"very happy with my performance. " + 
					" " + 
					"CERTIFICATIONS " + 
					" " + 
					"Gold Medal " + 
					"For scoring good " + 
					"marks in matric " + 
					"Silver Medal " + 
					"For scoring good " + 
					"marks in FSC " + 
					"Photoshop Certificate " + 
					"For attending photoshop " + 
					"workshop in university " + 
					"Certificate of Appreciation " + 
					"Organizer and Manager of " + 
					"university event - TECHSALVO " + 
					" Scholarship Certificates " + 
					"5th, 8th, matric and " + 
					"FSc scholarships " + 
					"QUIZ Competition Certificate " + 
					"College level winner  " + 
					"Presentation Competition " + 
					"Certificate " + 
					"College level winner " + 
					"Speech Competition " + 
					"Certificate " + 
					"College level winner " + 
					"  Graphics Training Certificate " + 
					"DigiSkillls (Virtual University) " + 
					"Creative Writing Certificate " + 
					"DigiSkillls (Virtual University) " + 
					"Freelancing Certificate " + 
					"DigiSkillls (Virtual University) " + 
					"Html-CSS Certificate " + 
					"Udemy " + 
					" " + 
					"SOFTWARES " + 
					" " + 
					" " + 
					"Android Studio " + 
					"Visual Studio " + 
					"Adobe Tools " + 
					"Star UML " + 
					"Eclipse " + 
					"Brackets " + 
					"FLUTTER DEVELOPER " + 
					"• Did online work as a frontend app developer creating many " + 
					"projects and learning at the same time. Used flutter to work on " + 
					"developing my Final Year Project.  " + 
					"• Made Android and IOS app of FYP. " + 
					"• Designed certain screens and did changings " + 
					"regarding modifications in the GUI of existing app. " + 
					" " + 
					"EDUCATION " + 
					"   " + 
					"BS (Hons.) Software Engineering Oct 2017 – July 2021  " + 
					"UNIVERSITY OF ENGINEERING AND TECHNOLOGY, TAXILA, PAKISTAN " + 
					"CGPA: 3.21 / 4.00 (81%)  " + 
					"Specialized in Email Marketing, Front End web development,UI/UX " + 
					"development with knowledge of desktop application development. " + 
					"Actively participated in team projects to create real-world applications. " + 
					"Served as an active member for development of final year project of a " + 
					"Crowd Funding Platform web and mobile application. Acted as IT Head of " + 
					"a society named SoftDesk from 2020 to 2021.  " + 
					"Intermediate (Pre-Engineering) Sept 2015 – Sept 2017  " + 
					"SUPERIOR COLLEGE FOR GIRLS, GUJAR KHAN, PAKISTAN " + 
					"Marks: 963 / 1100 (87.54%)  " + 
					"Studies focused in engineering subjects such as Mathematics, Algebra, " + 
					"Physics and Chemistry. Learned basic concepts and applied these " + 
					"concepts to practical issues.  " + 
					"Matriculation (Science) Apr 2013 – July 2015 " + 
					" Army Public School and College (APSACS), MULTAN, PAKISTAN " + 
					"Marks: 933 / 1100 (89%)  " + 
					"Studies focused in Science subjects such as Mathematics, Physics, " + 
					"Chemistry and Biology. Learned basic concepts and their real-life " + 
					"applications.  " + 
					"FINAL YEAR PROJECT " + 
					"   " + 
					"FUNDPAK (Pakistan’s First Crowd Funding App) " + 
					"Android, IOS & WEB App " + 
					"• Developed an application using flutter and firebase for the " + 
					"entrepreneurs and small businesspersons. " + 
					"• This project is initialized to help people to engulf the bridge " + 
					"b/w entrepreneurs and the investors of Pakistan. " + 
					"• Followed agile devlp life cycle and perform all testing  ";
        String str = "javA";
//        String pattern = "(?<=_|\\b)" + str + "(?=_|\\b)";
//        if (Pattern.compile(pattern).matcher(text).find()) {
//            System.out.println("found");
//        }

//        System.out.println(Pattern.compile(Pattern.quote("java".rep), Pattern.CASE_INSENSITIVE).matcher(text).find());
//        if (Pattern.compile("").matcher(text).find()) {
//            System.out.println("found");
//        }
       

        System.out.println(containsWord(text, str));
    }

    public static String REGEX_FIND_WORD = "(?i).*?\\b%s\\b.*?";

    public static boolean containsWord(String text, String word) {
        String regex = String.format(REGEX_FIND_WORD, Pattern.quote(word));
        return text.matches(regex);
    }

}
