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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://practice-automation.com/file-upload/')

def path1 = RunConfiguration.getProjectDir() + '\\Include\\config\\Dummy.txt'

WebUI.uploadFile(findTestObject('Object Repository/UP/Page_File Upload  Practice Automation/Chose file'), path1)

WebUI.click(findTestObject('Object Repository/UP/Page_File Upload  Practice Automation/input_File Upload_upload-btn'))

WebUI.click(findTestObject('Object Repository/UP/Page_File Upload  Practice Automation/div_Thank you for your message. It has been sent'))

WebUI.verifyTextPresent('Thank you for your message. It has been sent.', false)

WebUI.delay(10)

WebUI.closeBrowser()

