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

WebUI.callTestCase(findTestCase('UserRegistration/Verify-UserRegistration'), [('gender') : 'gender-female', ('firstName') : 'Faith', ('lastName') : 'Kangichu'
        , ('email') : 'faith.mukami@yahoo.com', ('companyName') : 'Mwafrika', ('password') : 'Ilovetellytubbies', ('confirmPassword') : 'Ilovetellytubbies'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('AddingToCart/Verify-SearchingAndAddingToCart'), [('search') : 'Flower Girl Bracelet'], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Dashboard/Button_ShoppingCart'))

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.click(findTestObject('Dashboard/Button_AddToCart'))

WebUiBuiltInKeywords.click(findTestObject('ShoppingCartPage/CheckBox_TermsOfService'))

WebUiBuiltInKeywords.click(findTestObject('ShoppingCartPage/Button_CheckOut'))

WebUiBuiltInKeywords.selectOptionByValue(findTestObject('CheckOutPage/DropDown_Country'), '148', false)

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.setText(findTestObject('CheckOutPage/Input_City'), city)

WebUiBuiltInKeywords.setText(findTestObject('CheckOutPage/Input_Address1'), address)

WebUiBuiltInKeywords.setText(findTestObject('CheckOutPage/Input_ZipCode'), zipCode)

WebUiBuiltInKeywords.setText(findTestObject('CheckOutPage/Input_PhoneNumber'), phoneNumber)

WebUiBuiltInKeywords.setText(findTestObject('CheckOutPage/Input_Fax'), fax)

WebUiBuiltInKeywords.click(findTestObject('CheckOutPage/Button_Continue'))

WebUiBuiltInKeywords.click(findTestObject('CheckOutPage/RadioButton_ShippingOption', [('shipping') : shippingOption]))

WebUiBuiltInKeywords.click(findTestObject('CheckOutPage/Button_Continue2'))

WebUiBuiltInKeywords.click(findTestObject('CheckOutPage/RadioButton_PaymentOption', [('payment') : paymentOption]))

WebUiBuiltInKeywords.click(findTestObject('CheckOutPage/Button_Continue3'))

WebUiBuiltInKeywords.click(findTestObject('CheckOutPage/Button_Confirm'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('CheckOutPage/Message_SuccessfulCheckout'), 2)

WebUiBuiltInKeywords.click(findTestObject('CheckOutPage/Button_Continue4'))

