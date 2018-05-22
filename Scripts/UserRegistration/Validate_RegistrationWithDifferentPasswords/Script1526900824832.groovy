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

WebUI.openBrowser(GlobalVariable.browserUrl)

WebUI.maximizeWindow()

WebUI.click(findTestObject('StartPage/Link_Register'))

WebUI.click(findTestObject('RegisterPage/RadioButton_Gender', [('gender') : gender]))

WebUI.setText(findTestObject('RegisterPage/Input_FirstName'), firstName)

WebUI.setText(findTestObject('RegisterPage/Input_LastName'), lastName)

WebUI.selectOptionByValue(findTestObject('RegisterPage/Input_DateOfBirthDay'), '1', false)

WebUI.selectOptionByValue(findTestObject('RegisterPage/Input_DateOfBirthMonth'), '1', false)

WebUI.selectOptionByValue(findTestObject('RegisterPage/Input_DateOfBirthYear'), '1989', false)

WebUI.setText(findTestObject('RegisterPage/Input_Email'), email)

WebUI.setText(findTestObject('RegisterPage/Input_Company'), companyName)

WebUI.click(findTestObject('RegisterPage/CheckBox_Newsletter'))

WebUI.setText(findTestObject('RegisterPage/Input_Password'), password)

WebUiBuiltInKeywords.setText(findTestObject('RegisterPage/Input_ConfirmPassword'), confirmPassword)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('RegisterPage/Message_PasswordsDontMatch'), 2)

