

Scenario: Create product in Ting

Given that I logged into Ting site
Then I click "Products"
And I click "Add New Product"
And I select "New Zealand " as country
And I add <productcode> as Product Code in textbox
And I add "Whale diving" as "Product Name"
And I add "Whale diving" as "Print Name"
And I select "Experiencethis" as supplier
And I select "boxed" as product type
And I add <BoxHeight>
And I add <BoxWidth>
And I add <BoxLength>
And I add <BoxWeight>
And I add "Test product summary" in "Summary"
And I add "Test product description" in "Description"
And I add "Test market description" in "Market Description"
And I add "Test print description" in "Print Description"
And I select "Gold Voucher" as Voucher level
And I add "200" as "Buying Price"
And I add "250" as "Sell Price"
And I add "280" as "Was Price"
And I add "285" as "Supplier's RRP"
And I select "Hourly" as Duration
And I select "2" as Voucher valid for
And I add "Manly" as "Short Venue"
And I add "Manly beach south" in "Venue"
And I add "Take ferry" in "How to get there"
And I add "Full day session" in "Session Length"
And I add "Casual wear and have an extra dress" in "Participant Guideline"
And I add "Casual" in "Dress Code"
And I add "No other info" in "Other Info"
And I add "Should be sunny and less windy" in "Weather"
And I add "Any number can fit in" in "Numbers on the day"
And I add "Spectators allowed" in "Spectators"
And I add "You can cancel 3 days prior to event date" in "Cancellation Policy"
And I select "No" as Supplier sign off
And I select "Yes" as New product
And I select "No" as Includes shipping
And I select "New Product" as Update Reason
And I click "Update" button
And I see Product Added successfully
And I click "View Product" link
And I get the value of "Commission Rate"
And I "Logout"
And I wait for "10" seconds 

Given that I logged into alfred site as Product Category Manager
When I click "Search" link
Then I see Product Search
And I enter the <productcode> in the search text box
And I click on search
And I check the value of the "Name" as "Whale diving"
And I check the value of "Supplier" as "Experiencethis"
And I verify value of "Product Type" as "Gift Box"
And I verify value of "Voucher Level" as "Gold Voucher"
And I must see the "Test product summary" as "summary"
And verify the value "Test market description" as "Market Description"
And verify the value "Test print description" as "Print Description"
And I verify value of "Country" as "New Zealand"
And I check the value "Location Description" as "Manly"
And I check the value "How many people" as "2"
And I verify <BoxWidth>
And I verify <BoxHeight>
And I verify <BoxLength>
And I verify <BoxWeight>
And I look for <commissionsellingprice>
And I look for <rrp>
And I verify the "Commission"



Examples:
|productcode|BoxWidth|BoxHeight|BoxLength|BoxWeight|commissionsellingprice|rrp|
|KUL017|101|100|102|103|250|285|
