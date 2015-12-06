
Scenario: Add Product in Alfred and edit the same product in Ting and verify in Alfred

Given that I logged into alfred site as Product Category Manager
When I click "Add" link
Then I see Add Product
And I enter "Caving Adventuretest7" as "Name"
And I enter the supplier as "Crazy April Fool Experiences (APR)"
And I select "Experience" as "Product Type"
And I select "Silver Voucher" as "Voucher Level"

And I enter the Primary category as "Adventure Sports > Caving"
And I enter the Category as "Gift Boxes > Baby Gift Boxes"
And I enter the Category as "Gift Boxes > Couples Gift Boxes"
And I enter the Occassion as "Birthday Gifts > 18th Birthday"
And I enter the Occassion as "Father's Day Gifts > All Gifts"
And I enter the recipient as "Gifts for Him > Husband"
And I enter the recipient as "Gifts for Her > Baby Girl"
And I enter the Location as "Tropical North Queensland"

And I click save button
And I see Congratulations. You just added a new product
And I get the product ID
And I wait for "20" seconds

Given that I logged into Ting site
When I open the newly added product page in Ting
Then I see Crazy April Fool Experiences
And I verify the value "Caving Adventuretest7" as "Title"
And I verify the value "Caving Adventuretest7" as "Print Title"
And I verify the product code

And I check "Subcategories" as "Baby Gift Boxes"
And I check "Subcategories" as "Couples Gift Boxes"
And I check "Sub-Occasions" as "18th Birthday"
And I check "Sub-Occasions" as "All Gifts"
And I check "Sub-Recipient" as "Husband"
And I check "Sub-Recipient" as "Baby Girl"
And I check "Sub-Locations" as "Tropical North Queensland"

And I click Edit under "Categorisation "
And I see Primary and Secondary Subcategories

And I click primary category remove button
And I select "Abseiling" as Primary Subcategory under Primary and Secondary Subcategories
And I click "SAVE THESE MAPPINGS" button
And I see Selected mappings added!

And I add "You can cancel 3 days prior to event date" in "Cancellation Policy"
And I select "No" as Supplier sign off
And I select "No" as New product
And I select "No" as Includes shipping
And I select "Other" as Update Reason
And I click "Update" button
And I click "View Product" button
And I get the value of "Commission Rate"

Given that I logged into alfred site as Product Category Manager
When I click "Search" link
Then I see Product Search
And I enter the product ID
And I click on search
And I check the value of the "Name" as "sky diving1"
And I check the value of "Supplier" as "Experiencethis"
And I verify value of "Product Type" as "Gift Box"
And I verify value of "Voucher Level" as "Gold Voucher"
And I must see the "Test product summary" as "summary"

And I check the value "Primary Category" as "Adventure Sports > Abseiling"

And I confirm "Occasion Tags" value as "Birthday Gifts > 18th Birthday"
And I confirm "Occasion Tags" value as "Father's Day Gifts > All Gifts"

And I confirm "Recipient Tags" value as "Gifts for Him > Husband"
And I confirm "Recipient Tags" value as "Gifts for Her > Baby Girl"

And I confirm "Category Tags" value as "Gift Boxes > Baby Gift Boxes"
And I confirm "Category Tags" value as "Gift Boxes > Couples Gift Boxes"


Examples:
|productcode|BoxWidth|BoxHeight|BoxLength|BoxWeight|commissionsellingprice|levies|commission|rrp|newrrp|newcommissionsellingprice|
|KUL015|101|100|102|103|120|0|10|150|285|250|