import com.school.management.School;
import com.school.staff.Principal;
public class SchoolApp {
public static void main(String[] args) {
School school = new School();
school.setName("ABS");
school.setLocation("Kerala");
Principal principal=new Principal();
principal.setPrinipalName("Kumar");
principal.setExperienceYears("20");
// Display details
School.showSchoolInfo();
System.out.println();
manufacturer.showPrincipalInfo();
}
}