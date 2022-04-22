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

WebUI.click(findTestObject('PIM/add/Page_OrangeHRM/b_PIM'))

WebUI.click(findTestObject('PIM/delete/a_Reports'))

WebUI.click(findTestObject('PIM/delete/input_Report Name_chkSelectRow'))

WebUI.click(findTestObject('PIM/delete/input_Edit_chkSelectRow'))

WebUI.click(findTestObject('PIM/delete/input_Report Name_btnDelete'))

WebUI.click(findTestObject('PIM/delete/p_Delete records'))

WebUI.verifyElementPresent(findTestObject('PIM/delete/input_OrangeHRM - Confirmation Required_dia_9fc7db'), 0)

WebUI.verifyElementPresent(findTestObject('PIM/delete/div_Successfully Deleted       Close'), 0)

WebUI.closeBrowser()

