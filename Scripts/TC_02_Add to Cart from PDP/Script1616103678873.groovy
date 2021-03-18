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

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.maximizeWindow()

WebUI.enableSmartWait()

WebUI.setText(findTestObject('Swag Labs/Page_Swag Labs/Username'), 'standard_user')

WebUI.setMaskedText(findTestObject('Swag Labs/Page_Swag Labs/Password'), 'secret_sauce')

WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/Button - Login'))

WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/PDN_Sauce Labs Backpack'))

WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/button - ADD TO CART PDP'))

WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/Button - Back PDP'))

WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/PDN_Sauce Labs Fleece Jacket'))

WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/button - ADD TO CART PDP'))

WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/Button - Back PDP'))

WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/Cart'))

'Not relevant for test execution. Wait has been implemented for ease of understanding the flow.\r\n'
WebUI.waitForAlert(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/CHECKOUT'))

WebUI.setText(findTestObject('Swag Labs/Page_Swag Labs/First Name - Checkout'), 'Aakash')

WebUI.setText(findTestObject('Swag Labs/Page_Swag Labs/Last Name - Checkout'), 'Arora')

WebUI.setText(findTestObject('Swag Labs/Page_Swag Labs/Zip Code - Checkout'), '201301')

WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/Button - Continue Checkout'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/FINISH - Checkout'))

WebUI.takeFullPageScreenshot()

'Not relevant for test execution. Wait has been implemented for ease of understanding the flow.\r\n'
WebUI.waitForAlert(1)

WebUI.closeBrowser()

