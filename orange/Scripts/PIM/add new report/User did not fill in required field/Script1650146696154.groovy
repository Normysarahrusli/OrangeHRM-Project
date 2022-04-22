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

WebUI.setText(findTestObject('PIM/add/input__reportreport_name'), '')

WebUI.selectOptionByValue(findTestObject('PIM/add/select_Employee NamePay GradeEducationEmplo_8a679c'), 
    'pay_grade', true)

WebUI.selectOptionByValue(findTestObject('PIM/add/select_Current Employees OnlyCurrent and Pa_5c2d89'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('PIM/add/select_Personal Contact Details Emergency C_da5165'), 
    'display_group_2', true)

WebUI.selectOptionByValue(findTestObject('PIM/add/select_AddressHome TelephoneMobileWork Tele_41b387'), 
    'display_field_22', true)

WebUI.click(findTestObject('PIM/add/a_Add'))

WebUI.click(findTestObject('PIM/add/input_Contact Details (Include Header)_disp_1f834e'))

WebUI.click(findTestObject('PIM/add/input__btnSave'))

WebUI.verifyElementPresent(findTestObject('PIM/add/span_Required'), 0)

WebUI.closeBrowser()

