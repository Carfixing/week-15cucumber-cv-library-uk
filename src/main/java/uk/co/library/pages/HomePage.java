package uk.co.library.pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearch;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryType;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobType;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobs;


    public void enterJobTitle(String jobTitle){
        log.info("Enter the job title "+jobTitle.toString());
        sendTextToElement(jobTitleField,jobTitle);
    }
    public void enterLocation(String location){
        log.info("enter the location"+locationField.getText());
        sendTextToElement(locationField,location);
    }
    public void selectDistance(String distance){
        log.info("select the Distance "+ distanceDropDown.getText());
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        log.info("click on more option link "+ moreSearch.getText());
        clickOnElement(moreSearch);
    }
    public void enterMinSalary(String salary){
        log.info("enter the minimun salary" + salaryMin.getText());
        sendTextToElement(salaryMin,salary);
    }
    public void enterMaxSalary(String salary){
        log.info("enter the maximum salary " + salaryMax.getText());
        sendTextToElement(salaryMax,salary);
    }
    public void selectSalaryType(String sType){
        log.info("select the salary type"+ salaryType.getText());
        sendTextToElement(salaryType,sType);
    }
    public void selectJobType(String jType){
        log.info("select the job type " + jobType);
        selectByVisibleTextFromDropDown(jobType,jType);
    }
    public void clickOnJobsButton(){
        log.info("click on job button" + findJobs.getText());
        clickOnElement(findJobs);
    }


}
