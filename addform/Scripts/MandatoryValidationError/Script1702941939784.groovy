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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.phptravels.net/admin/login.php')

WebUI.setText(findTestObject('Object Repository/Page_Administrators Login/input_email (1)'), 'admin@phptravels.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Administrators Login/input_password (1)'), 'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('Object Repository/Page_Administrators Login/button_Login (1)'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Settings (1)'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Currencies (1)'))

WebUI.click(findTestObject('Object Repository/Page_Currencies/a_Add'))

WebUI.click(findTestObject('Object Repository/Page_Currencies/a_Save'))

WebUI.delay(3)

WebUI.verifyTextPresent('If you like to update the currencies latest values automatically every day or hour then follow.', 
    false)

WebUI.closeBrowser()

