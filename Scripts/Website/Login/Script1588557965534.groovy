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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.sehatq.com/')

WebUI.click(findTestObject('Register/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/span_'))

WebUI.click(findTestObject('Register/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/button_Allow'))

WebUI.click(findTestObject('Register/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/i_Tidak ada notifikasi_fs icon-profile colo_658490'))

WebUI.click(findTestObject('Register/Page_Login/a_Continue with Email'))

WebUI.setText(findTestObject('Register/Page_Login/input_Email_email'), 'Testing123b@gmail.com')

WebUI.setText(findTestObject('Register/Page_Login/input_show password_password'), 'Koin1234!@')

WebUI.click(findTestObject('Register/Page_Login/button_Continue'))

WebUI.closeBrowser()

