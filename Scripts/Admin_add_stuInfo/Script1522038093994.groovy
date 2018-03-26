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

WebUI.setText(findTestObject('Page_Welcome to CAMT/input_txt'), '')

WebUI.setText(findTestObject('Page_Welcome to CAMT/input_txt'), 'hutton')

WebUI.setText(findTestObject('Page_Welcome to CAMT/input_txt_1 (1)'), '123')

WebUI.click(findTestObject('Page_Welcome to CAMT/input_Identity (1)'))

WebUI.click(findTestObject('Page_Welcome to CAMT/input_btn (1)'))

WebUI.click(findTestObject('Page_CMU-CAMT-Home (1)/input'))

WebUI.setText(findTestObject('Page_CMU---CAMT (1)/input_Guest_Name'), '12')

WebUI.setText(findTestObject('Page_CMU---CAMT (1)/input_Guest_Email'), 'c')

WebUI.setText(findTestObject('Page_CMU---CAMT (1)/input_Guest_TEL'), 'sumeer')

WebUI.setText(findTestObject('Page_CMU---CAMT (1)/input_Guest_FAX'), '1')

WebUI.setText(findTestObject('Page_CMU---CAMT (1)/input_Guest_FAX'), '12:00')

WebUI.setText(findTestObject('Page_CMU---CAMT (1)/input_Guest_ADD'), 'hhh')

WebUI.setText(findTestObject('Page_CMU---CAMT (1)/input_Guest_ZIP'), '2')

WebUI.click(findTestObject('Page_CMU---CAMT (1)/input_submit'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://wuluhan.github.io/953323-Project.github.io/login.html')

WebUI.setText(findTestObject('Page_Welcome to CAMT/input_txt'), '')

WebUI.setText(findTestObject('Page_Welcome to CAMT/input_txt'), 'hutton')

WebUI.setText(findTestObject('Page_Welcome to CAMT/input_txt_1 (1)'), '123')

WebUI.click(findTestObject('Page_Welcome to CAMT/input_Identity (1)'))

WebUI.click(findTestObject('Page_Welcome to CAMT/input_btn (1)'))

WebUI.click(findTestObject('Page_CMU-CAMT-Home (1)/input'))

WebUI.setText(findTestObject('Page_CMU---CAMT (1)/input_Guest_Name'), '12')

WebUI.setText(findTestObject('Page_CMU---CAMT (1)/input_Guest_Email'), 'c')

WebUI.setText(findTestObject('Page_CMU---CAMT (1)/input_Guest_TEL'), 'sumeer')

WebUI.setText(findTestObject('Page_CMU---CAMT (1)/input_Guest_FAX'), '1')

WebUI.setText(findTestObject('Page_CMU---CAMT (1)/input_Guest_FAX'), '12:00')

WebUI.setText(findTestObject('Page_CMU---CAMT (1)/input_Guest_ADD'), 'hhh')

WebUI.setText(findTestObject('Page_CMU---CAMT (1)/input_Guest_ZIP'), '2')

WebUI.click(findTestObject('Page_CMU---CAMT (1)/input_submit'))

WebUI.closeBrowser()

