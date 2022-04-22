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

WebUI.click(findTestObject('Recruitment/add vacancy/Page_OrangeHRM/b_Recruitment'))

WebUI.click(findTestObject('Recruitment/add vacancy/a_Vacancies'))

WebUI.click(findTestObject('Recruitment/add vacancy/input_Status_btnAdd'))

WebUI.setText(findTestObject('Recruitment/add vacancy/input__addJobVacancyname'), 'IT Technician')

WebUI.setText(findTestObject('Recruitment/add vacancy/input__addJobVacancyhiringManager'), 'f')

WebUI.click(findTestObject('Recruitment/add vacancy/li_Fiona Grace'))

WebUI.setText(findTestObject('Recruitment/add vacancy/input_Number of Positions_addJobVacancynoOf_9b2c22'), '2')

WebUI.setText(findTestObject('Recruitment/add vacancy/textarea_Description_addJobVacancydescription'), 'Work hard')

WebUI.click(findTestObject('Recruitment/add vacancy/input_httpsopensource-demo.orangehrmlive.co_2ebf7b'))

WebUI.verifyElementPresent(findTestObject('Recruitment/add vacancy/span_Required'), 0)

WebUI.closeBrowser()

