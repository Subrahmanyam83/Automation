
Scenario: Add Product in Ting and edit the same product in Alfred

Given that I logged into Ting site
Then I click "Products"
And I click "Add New Product"
And I select "New Zealand " as country
And I add <productcode> as Product Code in textbox
And I add "whale diving" as "Product Name"
And I add "whale diving" as "Print Name"
And I select "Experiencethis " as supplier
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
And I get the value of "Product ID"
And I get the value of "Commission Rate"
And I click Edit under "Categorisation "
And I see Primary and Secondary Subcategories
And I select "Abseiling" as Primary Subcategory under Primary and Secondary Subcategories
And I click "SAVE THESE MAPPINGS" button
And I see Selected mappings added!
And I select "Climbing" as Secondary Subcategories under Primary and Secondary Subcategories
And I click "SAVE THESE MAPPINGS" button
And I see Selected mappings added!
And I wait for "10" seconds
And I select "80th Birthday" under Sub Occassions
And I see Selected mappings added!
And I wait for "10" seconds
And I select "Baby Girl" under Sub Recipients
And I see Selected mappings added!
And I wait for "10" seconds

And I "Logout"

Given that I logged into ofbiz site
When I click "Search" link
Then I see Product Search
And I enter the <productcode> in the search text box
And I click on search
And I check the value of the "Name" as "whale diving"
And I check the value of "Supplier" as "Experiencethis"
And I verify value of "Voucher Level" as "Gold Voucher"
And I verify value of "Product Type" as "Gift Box"
And I check the value "Primary Category" as "Adventure Sports>Abseiling"
And I verify "Occasion Tags" value as "Birthday Gifts>80th Birthday"
And I verify "Recipient Tags" value as "Gifts for Her>Baby Girl"
And I verify "Category Tags" value as "Adventure Sports>Climbing"
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


And I change the value of "Name" as "Cup Yacht Charter"
And I enter the supplier as "World Expeditions"
And I select "Experience" as "Product Type"
And I select "Bronze Voucher" as "Voucher Level"
And I enter the Primary category as "Adventure Sports>Abseiling"
And I enter the Category as "Gift Boxes>Men's Gift Boxes"
And I enter the Category as "Gift Boxes>Couples Gift Boxes"
And I enter the Occassion as "Gift Occasions>New Baby"
And I enter the Occassion as "Valentines Day Gifts>Romantic"
And I enter the recipient as "Gifts for Him>Boyfriend"
And I enter the recipient as "Gifts for Her>Girlfriend"
And I enter the Location as "Tropical North Queensland"
And I type "The America's Cup Sailing Experience is an inspiring day & great for team building" as "Description"
And I type "South America's Cup Yacht Charter" as the "summary"
And I type "30 lucky people will get to try there hand at sailing or sit back, relax and take in all the action on the harbour" as "Market Description"
And I type "Invite your staff or guests onboard" as "Print Description"
And I select "Australia" as "Country"
And I enter the "Collaroy" as "Location Description"
And I enter the "3" as "How many people"
And I enter the Duration as "3 hours"
And I click the "Venue"
And I type the "Collaroy south beach" as "Venue"
And I click the "How to get there"
And I type the "Take bus & ferry" as "How to get there"
And I click the "Guidelines"
And I type the "limited number of people" as "Guidelines"
And I click the "Dress Code"
And I type the "swim suit" as "Dress Code"
And I click the "Other Info"
And I type the "not found" as "Other Info"
And I click the "Weather"
And I type the "sunny" as "Weather"
And I click the "Numbers on the day"
And I type the "only few people" as "Numbers on the day"
And I click the "Spectators"
And I type the "not allowed" as "Spectators"
And I click the "Session Length"
And I type the "should be long" as "Session Length"
And I click the "Cancellation Policy"
And I type the "not applicable" as "Cancellation Policy"
And I click the "Accessibility"
And I type the "wheelchair not accessible" as "Accessibility"

And I enter <newcommissionsellingprice>
And I enter <newcommission>
And I enter <newrrp>
And I click save button
And I see Your changes have been recorded successfully
And I get the product ID
And I wait for "10" seconds

Given that I logged into Ting site
When I go to the newly added product page
Then I see World Expeditions
And I verify the value "Cup Yacht Charter" as "Title"
And I verify the value <newcommission>
And I verify the value <newrrp>
And I verify Unit Price
And I verify Buy Price
And I verify the value "AU" as "Country"
And I verify the value "Bronze" as "Voucher Level"
And I verify the value "3 hours" as "Experience Length"
And I verify the value "experience" as "Product Type"
And I verify the value "Take bus & ferry" as "How To Get There"
And I verify the value "should be long" as "Availability & Duration"
And I verify the value "swim suit" as "Dress Code"
And I verify the value "3" as "Participants"
And I verify the value "only few people" as "Numbers on the Day"
And I verify the value "not allowed" as "Spectators"

And I verify the value "Collaroy south beach" as "Venue"

And I verify the value "sunny" as "Weather"
And I verify the value "not applicable" as "Cancellation Policy"
And I verify the value "wheelchair not accessible" as "Notes"
And I need to see "South America's Cup Yacht Charter" as "Summary"
And I need to see "The America's Cup Sailing Experience is an inspiring day & great for team building" as "Description"
And I need to see "30 lucky people will get to try there hand at sailing or sit back, relax and take in all the action on the harbour" as "Marketing Description"
And I need to see "Invite your staff or guests onboard" as "Print Description"
And I check "Subcategories" as "Men's Gift Boxes"
And I check "Subcategories" as "Couples Gift Boxes"
And I check "Sub-Occasions" as "New Baby"
And I check "Sub-Occasions" as "Romantic"
And I check "Sub-Recipient" as "Boyfriend"
And I check "Sub-Recipient" as "Girlfriend"
And I open "Notes" section

Examples:
|productcode|BoxWidth|BoxHeight|BoxLength|BoxWeight|commissionsellingprice|rrp|newcommissionsellingprice|newrrp|newcommission|
|FAF026|121|110|142|233|250|285|220|210|30|
