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

WebUI.click(findTestObject('Perfromance/add/b_Performance'))

WebUI.click(findTestObject('Perfromance/add/Page_OrangeHRM/a_Configure'))

WebUI.click(findTestObject('Perfromance/add/a_KPIs'))

WebUI.click(findTestObject('Perfromance/add/input_Key Performance Indicators for Job Ti_00da0f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Perfromance/add/Page_OrangeHRM/Page_OrangeHRM/select_--Select--Automation TesterBTestChie_74a6c3'), 
    '25', true)

WebUI.setText(findTestObject('Perfromance/add/input__defineKpi360keyPerformanceIndicators'), 'positive commitment')

WebUI.setText(findTestObject('Perfromance/add/input__defineKpi360minRating'), '0')

WebUI.setText(findTestObject('Perfromance/add/input__defineKpi360maxRating'), '100')

WebUI.click(findTestObject('Perfromance/add/input_Make Default Scale_defineKpi360makeDefault'))

WebUI.click(findTestObject('Perfromance/add/input__saveBtn'))

WebUI.verifyElementPresent(findTestObject('Perfromance/add/div_Successfully Saved       Close'), 0)

WebUI.click(findTestObject('Perfromance/add/input_Key Performance Indicators for Job Ti_00da0f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Perfromance/add/Page_OrangeHRM/Page_OrangeHRM/select_--Select--Automation TesterBTestChie_74a6c3'), 
    '25', true)

WebUI.setText(findTestObject('Perfromance/add/input__defineKpi360keyPerformanceIndicators'), 'planning methodologies')

WebUI.setText(findTestObject('Perfromance/add/input__defineKpi360minRating'), '0')

WebUI.setText(findTestObject('Perfromance/add/input__defineKpi360maxRating'), '100')

WebUI.click(findTestObject('Perfromance/add/input_Make Default Scale_defineKpi360makeDefault'))

WebUI.click(findTestObject('Perfromance/add/input__saveBtn'))

WebUI.verifyElementPresent(findTestObject('Perfromance/add/div_Successfully Saved       Close'), 0)

WebUI.click(findTestObject('Perfromance/add/input_Key Performance Indicators for Job Ti_00da0f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Perfromance/add/Page_OrangeHRM/Page_OrangeHRM/select_--Select--Automation TesterBTestChie_74a6c3'), 
    '25', true)

WebUI.setText(findTestObject('Perfromance/add/input__defineKpi360keyPerformanceIndicators'), 'sharing knowledge')

WebUI.setText(findTestObject('Perfromance/add/input__defineKpi360minRating'), '0')

WebUI.setText(findTestObject('Perfromance/add/input__defineKpi360maxRating'), '100')

WebUI.click(findTestObject('Perfromance/add/input_Make Default Scale_defineKpi360makeDefault'))

WebUI.click(findTestObject('Perfromance/add/input__saveBtn'))

WebUI.verifyElementPresent(findTestObject('Perfromance/add/div_Successfully Saved       Close'), 0)

WebUI.closeBrowser()

