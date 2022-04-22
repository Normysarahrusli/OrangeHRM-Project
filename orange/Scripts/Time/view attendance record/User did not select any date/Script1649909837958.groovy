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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('common/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Time/Page_OrangeHRM/Page_OrangeHRM/b_Time'))

WebUI.click(findTestObject('Time/Page_OrangeHRM/Page_OrangeHRM/a_Attendance'))

WebUI.click(findTestObject('Object Repository/Time/Page_OrangeHRM/a_Employee Records'))

WebUI.setText(findTestObject('Object Repository/Time/Page_OrangeHRM/input_Employee Name_attendanceemployeeNameempName'), 
    'fi')

WebUI.click(findTestObject('Object Repository/Time/Page_OrangeHRM/li_Fiona Grace'))

WebUI.click(findTestObject('Object Repository/Time/Page_OrangeHRM/input__btView'))

WebUI.verifyElementPresent(findTestObject('Time/Page_OrangeHRM/Page_OrangeHRM/span_Should be a valid date in yyyy-mm-dd format'), 
    0)

WebUI.closeBrowser()

