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

WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/Sauce Labs Bolt T-Shirt_ADD TO CART'))

WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/Sauce Labs Bike Light_ADD TO CART'))

WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/Sauce Labs Backpack_ADD TO CART'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/Cart'))

boolean check = WebUI.verifyElementVisible(findTestObject('Swag Labs/Page_Swag Labs/button - REMOVE Cart'), FailureHandling.OPTIONAL)

while (check == true) {
    WebUI.click(findTestObject('Swag Labs/Page_Swag Labs/button - REMOVE Cart'))

    check = WebUI.verifyElementVisible(findTestObject('Swag Labs/Page_Swag Labs/button - REMOVE Cart'), FailureHandling.OPTIONAL)
}

WebUI.takeScreenshot()

WebUI.closeBrowser()

