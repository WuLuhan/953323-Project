import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://wuluhan.github.io/953323-Project.github.io/login.html')

WebUI.setText(findTestObject('Page_Welcome to CAMT (1)/input_txt'), 'hutton')

WebUI.setText(findTestObject('Page_Welcome to CAMT (1)/input_txt_1'), '123')

WebUI.click(findTestObject('Page_Welcome to CAMT (1)/input_Identity'))

WebUI.click(findTestObject('Page_Welcome to CAMT (1)/input_btn'))

WebUI.click(findTestObject('Page_CMU-CAMT-Home (2)/input'))

WebUI.setText(findTestObject('Page_Document/input_studentNo'), '1')

WebUI.setText(findTestObject('Page_Document/input_passWord'), '3333')

WebUI.setText(findTestObject('Page_Document/input_studentName'), 'dd')

WebUI.setText(findTestObject('Page_Document/input_sex'), 'male')

WebUI.click(findTestObject('Page_Document/input'))

WebUI.closeBrowser()

