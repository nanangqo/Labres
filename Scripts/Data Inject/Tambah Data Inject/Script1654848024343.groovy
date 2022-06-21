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

WebUI.navigateToUrl('https://labres.lps.go.id/')

WebUI.setText(findTestObject('Object Repository/Data Inject/Data Neraca/Page_ICS - Integrated Core System  Lembaga _ad6713/input_Masukan username untuk melanjutkan_ma_c440c3'), 
    'ICS.Labres01')

WebUI.click(findTestObject('Object Repository/Data Inject/Data Neraca/Page_ICS - Integrated Core System  Lembaga _ad6713/button_LANJUTKAN'))

WebUI.setEncryptedText(findTestObject('Object Repository/Data Inject/Data Neraca/Page_ICS - Integrated Core System  Lembaga _ad6713/input_Masukan password untuk melanjutkan_ma_649fbb'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Data Inject/Data Neraca/Page_ICS - Integrated Core System  Lembaga _ad6713/span_SIGN IN'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Data Inject/Data Neraca/Page_ICS - Integrated Core System  Lembaga _ad6713/span_Laboratorium Resolusi'))

WebUI.click(findTestObject('Object Repository/Data Inject/Data Neraca/Page_ICS - Integrated Core System  Lembaga _ad6713/span_Data Injection'))

WebUI.click(findTestObject('Object Repository/Data Inject/Data Neraca/Page_ICS - Integrated Core System  Lembaga _ad6713/svg'))

WebUI.setText(findTestObject('Object Repository/Data Inject/Data Neraca/Page_ICS - Integrated Core System  Lembaga _ad6713/input_Skenario Data_mat-input-5'), 
    'BNI')

WebUI.click(findTestObject('Object Repository/Data Inject/Data Neraca/Page_ICS - Integrated Core System  Lembaga _ad6713/span_BANK BNI Test'))

WebUI.scrollToElement(findTestObject('Data Inject/Data Neraca/Page_ICS - Integrated Core System  Lembaga _ad6713/path'), 
    1)

WebUI.click(findTestObject('Object Repository/Data Inject/Data Neraca/Page_ICS - Integrated Core System  Lembaga _ad6713/path'))

WebUI.click(findTestObject('Object Repository/Data Inject/Data Neraca/Page_ICS - Integrated Core System  Lembaga _ad6713/div_2021'))

WebUI.click(findTestObject('Object Repository/Data Inject/Data Neraca/Page_ICS - Integrated Core System  Lembaga _ad6713/div_DES'))
/*
WebUI.uploadFile(findTestObject('Data Inject/Data Neraca/Page_ICS - Integrated Core System  Lembaga _ad6713/div_Drag and drop files or click here'), 
    'D:\\LPS\\Labres\\Inject\\NERACAKAS.XLSX', FailureHandling.STOP_ON_FAILURE)
*/
WebUI.sendKeys(findTestObject('Object Repository/Page_Online Services/UploadSectionArea'),
	'D:\\LPS\\Labres\\Inject\\NERACAKAS.XLSX')

