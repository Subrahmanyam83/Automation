


Scenario: Edit site data in Ting and Verify in Alfred

Given that I logged into Ting site
When I click "Clients"
Then I click "Sites"
And I click "Search Sites"
And I add "CoastShop" as the "siteName"
And I click "Search" button
And I click to open "CoastShop" site details page
And I click "Edit" button
And I add "CoastShopTest" as "Site Name"
And I add "coastshoptest" as "siteprefix"
And I click "Save" button
And I see Updated successfully

Given that I logged into alfred site as Product Category Manager
When I click "Add" link
Then I see Add Product
And I enter "Test Product01" as "Name"
And I enter the supplier as "Crazy April Fool Experiences (APR)"
And I select "Experience" as "Product Type"
And I enter the Restricted Site Name as "CoastShopTest"
And I click save button
And I see Congratulations. You just added a new product
And I check the value of "Name" as "Test Product01"
And I check the value of "Restricted to Site" as "CoastShopTest"
