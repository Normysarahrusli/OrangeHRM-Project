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

WebUI.callTestCase(findTestCase('common/admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/sucessfully add job title/input_Job Titles_btnAdd'))

WebUI.setText(findTestObject('Admin/sucessfully add job title/input__jobTitlejobTitle'), '')

WebUI.setText(findTestObject('Admin/sucessfully add job title/textarea_Job Description_jobTitlejobDescription'), 'PHP,Java')

WebUI.setText(findTestObject('Admin/sucessfully add job title/textarea_Note_jobTitlenote'), 'Available')

WebUI.click(findTestObject('Admin/sucessfully add job title/input__btnSave'))

WebUI.verifyElementPresent(findTestObject('Admin/blank job title/span_Required'), 0)

WebUI.closeBrowser()

