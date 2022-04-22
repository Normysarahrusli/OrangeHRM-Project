package bdd
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class add {

	@Given("User navigates to login page")
	def navigateLoginpage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
	}

	@When("User enters (.*) and (.*)")
	def login(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Login/Page_OrangeHRM/input_LOGIN Panel_txtUsername'),username)
		WebUI.setText(findTestObject('Object Repository/Login/Page_OrangeHRM/input_Username_txtPassword'),password)
		WebUI.click(findTestObject('Object Repository/Login/Page_OrangeHRM/input_Password_Submit'))
	}

	@Given("User navigates to languages page")
	def navigateToLanguagesPage(){
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Admin'))
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Qualifications'))
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Languages'))
	}

	@And("User click on add button")
	def clickaddbutton() {
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Languages_btnAdd'))
	}

	@When("User enter (.*)")
	def entername(String name) {
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__languagename'),name)
	}

	@And("User click save")
	def clicksave () {
		WebUI.click(findTestObject('Object Repository/Admin/large job title/Languages/Page_OrangeHRM/input__btnSave'))
	}


	@Then ("User sucessfully enter new languages")
	def successfullyadd() {
		WebUI.closeBrowser()
	}


	@Then ("Error label will appear")
	def errorlabel() {
		WebUI.closeBrowser()
	}
	

	@Then ("Required label will appear")
	def requiredlabel() {
		WebUI.closeBrowser()
	}

	
}
