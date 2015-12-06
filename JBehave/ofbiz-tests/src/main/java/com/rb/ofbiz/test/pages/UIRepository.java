package com.rb.ofbiz.test.pages;

import java.util.HashMap;
import java.util.Map;

public class UIRepository {

	// SUPPLIER CONTACT
	// those UI
	public static class Alfred {
		public static Map<String, String> map = new HashMap<String, String>();

		static {

			// customer
			map.put("Customer First Name", "firstname");
			map.put("Customer Surname", "surname");
			map.put("Customer Email", "email");
			map.put("Customer Phone", "phone");
			map.put("Customer Company", "company");
			map.put("Customer Address", "address1");
			map.put("Customer Suburb", "suburb");
			map.put("Customer Postcode", "postcode");
			map.put("Customer State", "state");
			map.put("Customer CountryCode", "countryCode");
			map.put("Edit", "saveChangesToolbar");
			map.put("New Zealand", "gstRadio02");
			map.put("Expiry Date", "expiryDate");
			map.put("Expiry Date Edit", "expiryDateEdit");
			map.put("Amount", "creditAmount");
			map.put("Edit Credit", "creditAmountEdit");
			map.put("Customer's First Name", "firstName");
			map.put("Notes", "addCreditComments");
			map.put("Notes Edit", "editComments");
			map.put("View History", "nzdHistoryLink");
			map.put("Ting Notes", "creditAddNotes");
			map.put("Transfer all unredeemed vouchers to this product code.","effect02");
					
			map.put("Product Code in textbox","productCode");
			
			
			
			//Newletter
			
			map.put("Fun Newsletter", "prefIDs");
			
		
			
			
			//Customer Search Page
			
			map.put("Search String", "searchString");

			// Customer Add Page
			
			map.put("Customer's First Name", "firstName");
			map.put("Customer's Last Name", "lastName");
			map.put("Email Address", "email");
			map.put("Customer's Phone", "phone");
			map.put("Job Title", "jobTitle");
			map.put("Birthday", "birthday");
			map.put("Company", "companyName");
			map.put("Post Code", "postalCode");
			map.put("Subburb", "city");
			map.put("Street", "address1");
			map.put("Discount", "discount");
			map.put("Note", "customerNote");
			
			// supplier
			map.put("supplier company name", "groupName");
			map.put("product code prefix", "groupNameLocal");
			map.put("address", "address1");
			map.put("suburb", "city");
			map.put("post code", "postalCode");
			map.put("country", "countryGeoId");
			map.put("state", "stateProvinceGeoId");
			map.put("phone", "phone");
			map.put("mobile", "mobile");
			map.put("fax", "fax");
			map.put("booking emails", "email");
			map.put("redirect emails", "divertemail");
			map.put("website", "webaddress");
			map.put("Supplier successfully modified",
					"Supplier successfully updated.");
			map.put("Supplier successfully created",
					"Supplier successfully created. You can continue to make further changes.");
			// supplier contact
			map.put("customer email", "contactEmail");
			map.put("First Name", "contactFirstName");
			map.put("Last Name", "contactLastName");
			map.put("Phone", "contactPhoneNumber");
			map.put("Job Tittle", "jobTitleExistingCustomer");
			map.put("new Job Tittle", "jobTitleNewCustomer");
			map.put("current Job Tittle", "jobTitleEdit");
			map.put("addContactEmailNext", "addContactEmailNext");
			map.put("addContactEmailSave", "addContactEmailSave");
			map.put("deleteContactSave", "deleteContactSave");
			map.put("addContactSave", "addContactSave");
			map.put("editContactSave", "editContactSave");
			map.put("contactSuppliersBlock", "contactSuppliersBlock");
			map.put("newCustomerContactEmailElementId",
					"emailContactNewCustomer");
		}

		public static String getValue(String field) {
			return map.get(field);
		}
	}

	public static class OFBizHomePage {
		public static Map<String, String> map = new HashMap<String, String>();
		public static final String NameLocater = "css=label:contains('Name')+input";
		public static final String SupplierLocater = "css=label:contains('Supplier')+input";
		public static final String ProductLocater = "css=label:contains('Product Type')+br+select";
		public static final String VoucherLevelLocater = "css=label:contains('Voucher Level')+br+select";
		public static final String PrimaryCategoryLocater = "css=label:contains('Primary Category')+br+input";
		public static final String DescriptionLocater = "//html/body/div[2]/div[2]/div/div/form/div[26]/div/div[2]/iframe";

		// Category Tags for Deletion - Alfred

		public static final String CategoryDeletionLocator = "xpath=.//*[@id='categoryTags_tagsinput']/span[1]/a";
		public static final String OccasionDeletionLocator = "xpath=.//*[@id='occasionTags_tagsinput']/span[1]/a";
		public static final String RecipientDeletionLocator = "xpath=.//*[@id='recipientTags_tagsinput']/span[1]/a";

		// public static final String
		// DescriptionLocater1="css=label:contains('Description')+div[class='jHtmlArea']>div+div>iframe";

		public static final String SummaryLocater = "css=label:contains('Summary')+div[class='jHtmlArea']>div+div>iframe";
		public static final String MarketDescriptionLocater = "css=label:contains('Market Description')+div[class='jHtmlArea']>div+div>iframe";
		public static final String PrintDescriptionLocater = "css=label:contains('Print Description')+div[class='jHtmlArea']>div+div>iframe";
		// public static final String
		// AreaLocater="css=label:contains('Area')+br+div[class='jHtmlArea']>div+div>iframe";
		public static final String HowManyPeopleLocater = "css=label:contains('How many people')+br+input";
		public static final String AreaLocater = "css=label:contains('Area')+br+input";
		public static final String StateLocater = "css=th:contains('State')+td>select";

		public static final String j_username = "j_username";

		public static final String GuidelinesLocator = "xpath=//div/label[contains(text(),'Guidelines')]/../../div[@class='jHtmlArea']/div[2]/iframe";
		public static final String VenueLocator = "xpath=//div/label[contains(text(),'Venue')]/../../div[@class='jHtmlArea']/div[2]/iframe";
		public static final String HowtogetthereLocator = "xpath=//div/label[contains(text(),'How to get there')]/../../div[@class='jHtmlArea']/div[2]/iframe";
		public static final String DressCodeLocator = "xpath=//div/label[contains(text(),'Dress Code')]/../../div[@class='jHtmlArea']/div[2]/iframe";
		public static final String OtherInfoLocator = "xpath=//div/label[contains(text(),'Other Info')]/../../div[@class='jHtmlArea']/div[2]/iframe";
		public static final String WeatherLocator = "xpath=//div/label[contains(text(),'Weather')]/../../div[@class='jHtmlArea']/div[2]/iframe";
		public static final String NumbersonthedayLocator = "xpath=//div/label[contains(text(),'Numbers on the day')]/../../div[@class='jHtmlArea']/div[2]/iframe";
		public static final String SpectatorsLocator = "xpath=//div/label[contains(text(),'Spectators')]/../../div[@class='jHtmlArea']/div[2]/iframe";
		public static final String SessionLengthLocator = "xpath=//div/label[contains(text(),'Session Length')]/../../div[@class='jHtmlArea']/div[2]/iframe";
		public static final String CancellationPolicyLocator = "xpath=//div/label[contains(text(),'Cancellation Policy')]/../../div[@class='jHtmlArea']/div[2]/iframe";
		public static final String AccessibilityLocator = "xpath=//div/label[contains(text(),'Accessibility')]/../../div[@class='jHtmlArea']/div[2]/iframe";

		// public static final String
		// VenueLocater="xpath=/html/body/div[2]/div[2]/div/div/form/div[31]/div[2]/div[2]/iframe";

		public static final String suppliernotelocator = "noteContent";
		public static final String suppliernoteeditlocator = "note";

		public static final String productnotelocator = "noteContent";
		public static final String productnoteeditlocator = "noteTING_PROD_287936";

		public static final String noteslocator = "//div[@id='mainContentPad']/form/fieldset[10]/legend";

		public static final String addnoteslocator = "xpath=.//*[@id='mainContentPad']/form/fieldset[9]/fieldset/legend";

		public static final String NotesContentLocator = "newnote";

		public static final String deletelocator = "css=a.deleteNote > span";
		public static final String editlocator = "css=a.editNote > span";

		public static final String ShowonsuppliersiteLocator = "showOnSupplierStatus";
		public static final String MarkAsNewLocator = "markAsNewImg";
		public static final String ArchiveLocator = "archive";
		public static final String PublishLocator = "publishingStatus";
		public static final String PublishYesLocator = "xpath=//*[@id='publish-confirm-Yes']/span";
        public static final String FriendlyURLConfirmLocator = "xpath=//*[@id='friendlyURL-OK']/span";
		public static final String HonourYesLocator = "xpath=/html/body/div[4]/div[3]/div/button";
		public static final String HonourNoLocator = "xpath=/html/body/div[4]/div[3]/div/button[2]";
		public static final String ArchiveYesLocator = "xpath=//*[@id='archive-confirm-Yes']/span";
		public static final String MoreLocator = "toolbarMoreButton";
		public static final String CommissionableSellingPriceLocater = "csp";
		public static final String LeviesLocator = "levies";
		public static final String CommissionLocator = "commission";
		public static final String RRPLocator = "rrp";
		public static final String YesImage = "/AlfRED/includes/images/toolbar-onstatus.png";
		public static final String NoImage = "/AlfRED/includes/images/toolbar-offstatus.png";
		public static final String HonouringButtonLocater = "/html/body/div[2]/div[2]/div/div/form/div[4]/ul/li[3]/input";
		public static final String HonourLocater = "honouringStatus";
		public static final String ArchiveMessageLinkLocater = "unarchiveLink";

		// Product Special Start
		public static final String addNewSpecial = "addNewSpecial";
		public static final String markAsSpecial = "markAsSpecial";
		public static final String specialProductName = "specialProductName";
		public static final String specialPrintName = "specialPrintName";
		public static final String specialStartDate = "specialStartDate";
		public static final String specialEndDate = "specialEndDate";
		public static final String specialNumberOfPersons = "specialNumberOfPersons";
		public static final String specialPrice = "specialPrice";
		public static final String specialDiscount = "specialDiscount";
		public static final String specialCommission = "specialCommission";
		public static final String productSpecialSave = "productSpecialSave";
		public static final String productSpecialCancel = "productSpecialCancel";
		public static final String endProductSpecialOk = "turnOffSpecialOk";

		public static final String onButton = "xpath=/html/body/div[2]/div[2]/div/div/form/div[68]/div[2]/div/div/a";

		/*
		 * public static final String onButton =
		 * "xpath=/html/body/div[2]/div[2]/div/div/form/div[65]/div[2]/div/div/a"
		 * ;
		 */

		/*
		 * public static final String editButton=
		 * "xpath=/html/body/div[2]/div[2]/div/div/form/div[65]/div[2]/div/div/a[2]"
		 * ;
		 */
		public static final String editButton = "css=a.buttonEdit";
		public static final String deleteButton = "xpath=/html/body/div[2]/div[2]/div/div/form/div[65]/div[2]/div/div/a[3]";
		// Product Special End

		// Product Categories in Ofbiz
		public static final String productcategoryname = "categoryName";
		public static final String productcategorydescription = "//textarea[@name='description']";
		public static final String friendlyurl = "friendlyUrl";
		public static final String productimageurl = "categoryImageUrl";
		public static final String displayname = "displayName";
		public static final String primartproductcategoryID = "primaryParentCategoryId";
		public static final String productcategorytype = "css=td:contains('Product Category Type')+td+td>select";
		//

		// Custom fields
		public static final String customattribute0 = "//div[@id='needToKnowDynamic']/div[@id='attribute0']/div/input";
		public static final String customattribute1 = "//div[@id='needToKnowDynamic']/div[@id='attribute1']/div/input";
		//

		// Product Accessibility OPtions

		public static final String ProductAccessibilityDisplayname = "displayName";
		public static final String ProductAccessibilityprimaryproductcategory = "primaryParentCategoryId";
		public static final String ProductCategoryName = "categoryName";
		public static final String ProductAccessibilityLongDesc = "longDescription";
		public static final String ProductAccessibilityImage = "categoryImageUrl";
		public static final String content = "//div[@class='button-bar tab-bar']/ul/li/ul/li/a[text()='Content']";
		//

		// Supplier Add

		public static final String CompanyNameLocator = "groupName";
		public static final String ProductCodeLocator = "groupNameLocal";
		public static final String AddressLocator = "address1";
		public static final String SuburbLocator = "city";
		public static final String PostalCodeLocator = "postalCode";
		public static final String CountryLocator = "countryGeoId";
		public static final String StateLocator = "stateProvinceGeoId";

		public static final String PhoneLocator = "phone";
		public static final String MobileLocator = "mobile";
		public static final String FaxLocator = "fax";
		public static final String bookingEmailLocator = "email";
		public static final String RedirrectEmailLocator = "divertemail";
		public static final String WebSitLocator = "webaddress";
		// RBD Queries

		public static final String productaccessibilityverifyfieldsquery = "select * from tblPyramids where categoryName = 'Driving Experiences new test'";
		public static final String productaccessiblityverifyfieldsquery = "select * from TabAccessibilityType where displayName = 'Mobility gift' ";
		public static final String productcategoryverifyfieldsquery = "select * from tblPyramids where categoryName ='Experiences gift_new'";

		// Customer
		public static final String OrderHistoryLocator = "xpath=//form[@id='customerEdit']/fieldset[9]/table/tbody/tr/td[2]";
		public static final String OrderDateLocator = "css=fieldset.collapseable > table > tbody > tr > td";
		public static final String ExperienceLocator = "xpath=//form[@id='customerEdit']/fieldset[9]/table/tbody/tr/td[2]";
		public static final String CreditLocator = "xpath=//form[@id='customerEdit']/fieldset[7]/legend";

		
		
		
		// Customer Search Page

		public static final String CustomerSearchBoxLocator = "searchString";
		public static final String CustomerPersonalDetailsLocator = "css=div.formContent > ul";
		public static final String credit1Locator = "xpath=//div[@id='addProductContainer']/div[15]/ul/li";
		
		// Search Supplier and Product
		public static final String addproductlink = "//a[@href='/AlfRED/control/addProducts']";
		public static final String searchsupplierlink = "//a[@href='/AlfRED/control/searchSuppliersView']";
		public static final String addsupplierlink = "//a[@href='/AlfRED/control/AddSupplier']";
		//

		// search supplier dropdown status
		public static final String activestatus = "activeState";
		public static final String publishstatus = "publishState";
		public static final String countrystatus = "country";
		public static final String contactSuppliersXpath = "xpath=.//*[@id='addSupplierForm']/div[21]/div/div[1]/span[2]/div/a[3]";
		//

//Customer Add Credit
		/*public static final String CreditInitialfirstLocator="xpath=.//*[@id='customerEdit']/fieldset[7]/div[2]/table/tbody/tr/td[2]";
		public static final String CreditInitialsecondLocator="xpath=.//*[@id='customerEdit']/fieldset[7]/div[3]/table/tbody/tr/td[2]";
		public static final String CreditRemainingLocator="xpath=.//*[@id='customerEdit']/fieldset[7]/div[2]/table/tbody/tr/td[3]";
		public static final String CodeLocator="xpath=.//*[@id='customerEdit']/fieldset[7]/div[2]/table/tbody/tr/td[4]";
		public static final String ExpiryDateLocator="xpath=.//*[@id='customerEdit']/fieldset[7]/div[2]/table/tbody/tr/td[4]";
		public static final String LockedLocator="xpath=.//*[@id='customerEdit']/fieldset[7]/div[2]/table/tbody/tr/td[6]";*/
		public static final String AddCreditLocator="xpath=.//*[@id='customerEdit']/fieldset[7]/fieldset/legend";
		public static final String AddAmountLocator="xpath=.//*[@id='customerEdit']/fieldset[7]/fieldset/table/tbody/tr[1]/td/input";
		public static final String AddCountryLocator="xpath=.//*[@id='customerEdit']/fieldset[7]/fieldset/table/tbody/tr[1]/td/input";
		public static final String creditAddNotesLocator="creditAddNotes";
		public static final String NoteLocator="addCreditComments";
		
//Alfred Customer Search		
		public static final String searchLocator="xpath=.//*[@id='searchString']";
		
		// Prachi

		public static final String CreditInitialfirstLocator = "xpath=.//*[@id='customerEdit']/fieldset[7]/div[2]/table/tbody/tr/td[2]";
		public static final String CreditInitialsecondLocator = "xpath=.//*[@id='customerEdit']/fieldset[7]/div[3]/table/tbody/tr/td[2]";
		public static final String CreditRemainingLocator = "xpath=.//*[@id='customerEdit']/fieldset[7]/div[2]/table/tbody/tr/td[3]";
		public static final String CodeLocator = "xpath=.//*[@id='customerEdit']/fieldset[7]/div[2]/table/tbody/tr/td[4]";
		public static final String ExpiryDateLocator = "xpath=.//*[@id='customerEdit']/fieldset[7]/div[2]/table/tbody/tr/td[4]";
		public static final String LockedLocator = "xpath=.//*[@id='customerEdit']/fieldset[7]/div[2]/table/tbody/tr/td[6]";

		// Prachi

		static {
			map.put("Name", NameLocater);
			map.put("Supplier", SupplierLocater);
			map.put("Product Type", ProductLocater);
			map.put("Voucher Level", VoucherLevelLocater);
			map.put("Primary Category", PrimaryCategoryLocater);
			map.put("Description", DescriptionLocater);
			map.put("Summary", SummaryLocater);
			map.put("Market Description", MarketDescriptionLocater);
			map.put("Print Description", PrintDescriptionLocater);
			map.put("Area", AreaLocater);
			map.put("How many people", HowManyPeopleLocater);
			map.put("Guidelines", GuidelinesLocator);
			map.put("Venue", VenueLocator);
			map.put("How to get there", HowtogetthereLocator);
			map.put("Dress Code", DressCodeLocator);
			map.put("Other Info", OtherInfoLocator);
			map.put("Weather", WeatherLocator);
			map.put("Numbers on the day", NumbersonthedayLocator);
			map.put("Spectators", SpectatorsLocator);
			map.put("Session Length", SessionLengthLocator);
			map.put("Cancellation Policy", CancellationPolicyLocator);
			map.put("Accessibility", AccessibilityLocator);
			map.put("Show on supplier site", ShowonsuppliersiteLocator);
			map.put("Mark as new", MarkAsNewLocator);
			map.put("Publish", PublishLocator);
			map.put("More", MoreLocator);
			map.put("Commissionable Selling Price",
					CommissionableSellingPriceLocater);
			map.put("Levies", LeviesLocator);
			map.put("Commission", CommissionLocator);
			map.put("RRP", RRPLocator);
			map.put("Published", PublishLocator);
			map.put("Published Yes", PublishYesLocator);
            map.put("Friendly URL confirm", FriendlyURLConfirmLocator);
			map.put("Honour Yes", HonourYesLocator);
			map.put("Honour No", HonourNoLocator);
			map.put("Archive Yes", ArchiveYesLocator);
			map.put("YesImage", YesImage);
			map.put("NoImage", NoImage);
			map.put("Honouring Button", HonouringButtonLocater);
			map.put("Archive", ArchiveLocator);
			map.put("Honour", HonourLocater);
			map.put("ArchiveMessageLink", ArchiveMessageLinkLocater);

			// Product Special Start
			map.put("Add New Special", addNewSpecial);
			map.put("Mark As Special", markAsSpecial);
			map.put("Append to Product Name", specialProductName);
			map.put("Append to Print Name", specialPrintName);
			map.put("Start Date", specialStartDate);
			map.put("End Date", specialEndDate);
			map.put("Number Of Persons", specialNumberOfPersons);
			map.put("Special Price", specialPrice);
			map.put("Special Discount", specialDiscount);
			map.put("Special Commission", specialCommission);
			map.put("Product Special Save", productSpecialSave);
			map.put("Product Special Cancel", productSpecialCancel);
			map.put("Product Special On Button", onButton);
			map.put("Product Special Off Button", onButton);
			map.put("Product Special Edit Button", editButton);
			map.put("Product Special Delete Button", deleteButton);
			map.put("End Product Special Ok", endProductSpecialOk);
			map.put("State", StateLocater);
			map.put("j_username", "j_username");

			// Product Special End

			// Product Categories in Ofbiz
			map.put("Product Category Name", productcategoryname);
			map.put("Product Category Description", productcategorydescription);
			map.put("Friendly URL", friendlyurl);
			map.put("Display Name", displayname);
			map.put("Primary Product Cateogory ID", primartproductcategoryID);
			map.put("Product Category Image URL", productimageurl);
			map.put("Product Category Type", productcategorytype);
			//

			// Custom fields
			map.put("attribute0", customattribute0);
			map.put("attribute1", customattribute1);
			//

			// Product Accessibility Options
			map.put("Product Category Name", ProductCategoryName);
			map.put("Product Accessibility Long Description",
					ProductAccessibilityLongDesc);
			map.put("Primary Product Cateogory ID",
					ProductAccessibilityprimaryproductcategory);
			map.put("Display Name", ProductAccessibilityDisplayname);
			map.put("Category Image", ProductAccessibilityImage);
			map.put("Content", content);
			//

			// Add Supplier
			map.put("Company Name", CompanyNameLocator);
			map.put("Product Code Prefix", ProductCodeLocator);
			map.put("Address", AddressLocator);
			map.put("Suburb", SuburbLocator);
			map.put("Post Code", PostalCodeLocator);
			map.put("Country", CountryLocator);
			map.put("State", StateLocator);
			map.put("Phone", PhoneLocator);
			map.put("Mobile", MobileLocator);
			map.put("Fax", FaxLocator);
			map.put("Booking Email", bookingEmailLocator);
			map.put("Redirect Email", RedirrectEmailLocator);
			map.put("Website", WebSitLocator);
			// RBD Quries
			map.put("tblPyramids_AccessibilityOptions",
					productaccessibilityverifyfieldsquery);
			map.put("TabAccessibilityType",
					productaccessiblityverifyfieldsquery);
			map.put("tblPyramids_productcategory",
					productcategoryverifyfieldsquery);
			//

			// Search Supplier and Product
			map.put("ProductAdd", addproductlink);
			map.put("SupplierSearch", searchsupplierlink);
			map.put("supplier search page", searchsupplierlink);
			map.put("SupplierAdd", addsupplierlink);
			map.put("Add Supplier page", addsupplierlink);
			//

			// search supplier dropdown status
			map.put("activestatus", activestatus);
			map.put("publishstatus", publishstatus);
			map.put("countrystatus", countrystatus);
			//

			// Add Supplier

			map.put("groupName", "groupName");
			map.put("groupNameLocal", "groupNameLocal");
			// map.put("Company Name", CompanyNameLocator);
			map.put("address1", "address1");
			map.put("city", "city");
			map.put("postalCode", "postalCode");
			map.put("stateProvinceGeoId", "stateProvinceGeoId");
			map.put("speeddial", "speeddial");
			map.put("phone", "phone");
			map.put("mobile", "mobile");
			map.put("email", "email");
			map.put("fax", "fax");
			map.put("divertemail", "divertemail");
			map.put("webaddress", "webaddress");

			// Active Supplier SupplierActive
			map.put("SupplierActive", "activePartyStatusImg");
			map.put("ActiveDeactive supplier", "activeButtonSave");

			// Alfred Product Tags

			map.put("CategoryDeletionLocator", CategoryDeletionLocator);
			map.put("OccassionDeletionLocator", OccasionDeletionLocator);
			map.put("RecipientDeletionLocator", RecipientDeletionLocator);

			// Alfred Product Notes

			map.put("ProductNote", productnotelocator);
			map.put("EditProductNote", productnoteeditlocator);

			// Ting Notes
			map.put("Notes", noteslocator);
			map.put("AddNote", addnoteslocator);
			map.put("NotesContentBox", NotesContentLocator);
			map.put("Delete", deletelocator);
			map.put("Edit", editlocator);

			// Alfred Supplier notes

			map.put("SupplierNote", suppliernotelocator);
			map.put("EditSupplierNote", suppliernoteeditlocator);
			map.put("contactSuppliersXpath", contactSuppliersXpath);

			// Customer

			map.put("Customer Order History", OrderHistoryLocator);
			map.put("Customer Order Date", OrderDateLocator);
			map.put("Customer Experience", ExperienceLocator);
			map.put("Customer Credit", CreditLocator);

			// Customer Search Page
			map.put("Customer Search Page", CustomerSearchBoxLocator);
			map.put("Personal Details", CustomerPersonalDetailsLocator);
			map.put("Customer Credit", credit1Locator);

			// Prachi

			map.put("Customer Order History", OrderHistoryLocator);
			map.put("Customer Order Date", OrderDateLocator);
			map.put("Customer Experience", ExperienceLocator);
			map.put("Customer Credit", CreditLocator);
			map.put("Add Credit",AddCreditLocator);

			map.put("Initial Value1", "CreditInitialfirstLocator");
			map.put("Initial Value2", "CreditInitialsecondLocator");
			map.put("Credit Remaining", "CreditRemainingLocator");
			map.put("Code", "CodeLocator");
			map.put("Expiry Date", "ExpiryDateLocator");
			map.put("Locked", "LockedLocator");
			map.put("Add Amount", AddAmountLocator);
			map.put("Add Country", AddCountryLocator);
			map.put("Credit Add Notes",creditAddNotesLocator);
			map.put("Search",searchLocator);
			map.put("Simon Fuller", "link=Simon Fuller");
			map.put("Note", NoteLocator);
			map.put("Voucher Code", "voucherCode");
			
		}

		public static String getValue(String field) {
			return map.get(field);
		}
	}

}
