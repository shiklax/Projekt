import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(Site)

WebUI.setText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_username'), 
    Username)

WebUI.setText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_email'), Email)

WebUI.setText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_password'), 
    Password)

WebUI.setText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_cpassword'), 
    Password)

WebUI.setText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_dob'), BirthDate)

WebUI.setText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_phone'), PhoneNumber)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login  Sign Up Forms/select_Choose Gender                  Male _4c15ff'), 
    Gender, true)

WebUI.click(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_terms'))

WebUI.click(findTestObject('Page_Login  Sign Up Forms/InputSignUp'))

WebUI.delay(0)

if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Login  Sign Up Forms/div_User  email id not available. Please tr_cd3778'), 
    0)) {
    WebUI.click(findTestObject('Object Repository/Page_Login  Sign Up Forms/label_Login'))

    WebUI.setText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Login__txtUserName'), Username)

    WebUI.setText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Login__txtPassword'), Password)

    WebUI.click(findTestObject('Page_Login  Sign Up Forms/Page_Login  Sign Up Forms/input'))

    WebUI.delay(3)

    WebUI.closeBrowser()
} else {
    WebUI.closeBrowser()
}

