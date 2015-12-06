

Scenario: Create site data in Ting

Given that I logged into Ting site
When I click "Clients"
Then I click "Sites"
And I click "Create Site"
And I add "au" as "Country Code"
And I add "25" as "Country Id"
And I add "TEST_AU" as "Site Name"
And I add "www" as "siteprefix"
And I add "www.test.com" in "Full Url"
And I add "TEST" as "Display Name"
And I add "test" as "Site Type"
And I add "test090" as "Skin Name"
And I add "0.1" as "GST Rate"
And I add "3.91" as "Transaction Fee"
And I add "0" as "Site Discount"
And I click Next button
And I wait for "5" seconds
And I click "Save" button
And I see Updated successfully

Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I enter "Test Product01" as "Name"
And I enter the supplier as "Crazy April Fool Experiences"
And I select "Experience" as "Product Type"
And I enter "TEST_AU" as "Restricted to Site"
And I click save button
And I see Congratulations. You just added a new product
And I check the value of "Name" as "Test Product01"
And I check the value of "Restricted to Site" as "TEST_AU"