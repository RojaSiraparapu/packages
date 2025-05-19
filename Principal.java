package com.school.staff;
public class Pricipal{
private String principalName;
private int experienceYears;
public void setprincipalName(String principalName) {
this.principalName = princialName;
}
public void setexperienceYears(int experienceYears) {
this.experienceYears = experienceYears;
}
public String getPrincipalName() {
return principalName;
}
public String getExperienceYears() {
return experienceYears;
}
public void showPrincipalInfo() {
System.out.println("PrincipalName: " + principalName);
System.out.println("ExperienceYears: " + experienceYears);
}
}