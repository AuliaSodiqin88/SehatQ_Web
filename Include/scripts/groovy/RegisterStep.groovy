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



class RegisterStep {
	@Given("User navigate to register page")
	def navigateToRegisterPage (){
		println ("\n User Register navigateToRegisterPage")
	}
	@When ("User click close button")
	def clickclosebutton(){
		println ("\n User Register clickclosebutton")
	}
	@And ("User click allow button")
	def clickallowbutton(){
		println ("\n User Register clickallowbutton")
	}
	@And ("User click continue with email")
	def clickcontinuewithemail(){
		println ("\n User Register clickcontinuewithemail")
	}
	@And ("User User click sign up")
	def clicksignup(){
		println ("\n User Register clicksignup")
	}
	@And ("User enters Credentials name and email and password")
	def enterCredentials(){
		println ("\n User Register enterCredentials")
	}
	@And ("User click checkbox")
	def clickcheckbox(){
		println ("\n User Register clickcheckbox")
	}
	@And ("User click continue button")
	def clickcontinuebutton(){
		println ("\n User Register clickcontinubutton")
	}
	@Then ("User navigate to home page")
	def verifyhomepage(){
		println ("\n User Register home page")
	}
}