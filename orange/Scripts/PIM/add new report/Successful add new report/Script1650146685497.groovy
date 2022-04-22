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

WebUI.click(findTestObject('PIM/add/b_PIM'))

WebUI.click(findTestObject('PIM/add/a_Reports'))

WebUI.click(findTestObject('PIM/add/input_Report Name_btnAdd'))

WebUI.setText(findTestObject('PIM/add/input__reportreport_name'), 'Pay roll report')

WebUI.callTestCase(findTestCase('common/add new report'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PIM/add/input_Report Name_btnAdd'))

WebUI.setText(findTestObject('PIM/add/input__reportreport_name'), 'Test report')

WebUI.callTestCase(findTestCase('common/add new report'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PIM/add/input_Report Name_btnAdd'))

WebUI.setText(findTestObject('PIM/add/input__reportreport_name'), 'Emplyee Info report')

WebUI.callTestCase(findTestCase('common/add new report'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

