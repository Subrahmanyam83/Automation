
Scenario: Add Product with extended Fields in ofbiz

Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I enter "newtestskydiving" as "Name"
And I enter the supplier as "Crazy April Fool Experiences"
And I select "Experience" as "Product Type"
And I select "Gold Voucher" as "Voucher Level"
And I enter the Primary category as "Abseiling"
And I enter the Category as "Baby Gift Boxes"
And I enter the Category as "Couples Gift Boxes"
And I enter the Occassion as "Christmas Gifts"
And I enter the Occassion as "Mother's Day Gifts"
And I enter the recipient as "Gifts for Him"
And I enter the recipient as "Gifts for Her"
And I enter the Location as "Sydney & Surrounds"
And I type "Test description" as "Description"
And I type "Test summary" as the "summary"
And I type "test market desc" as "Market Description"
And I type "test print desc" as "Print Description"
And I select "New Zealand" as "Country"
And I enter the "Manly" as "Location Description"
And I enter the "2" as "How many people"
And I enter the Duration as "30 minutes"
And I click the "Venue"
And I type the "Manly south beach" as "Venue"
And I click the "How to get there"
And I type the "Take ferry" as "How to get there"
And I click the "Guidelines"
And I type the "anyone can participate" as "Guidelines"
And I click the "Dress Code"
And I type the "Casual" as "Dress Code"
And I click the "Other Info"
And I type the "found" as "Other Info"
And I click the "Weather"
And I type the "windy and sunny" as "Weather"
And I click the "Numbers on the day"
And I type the "can be anynumber" as "Numbers on the day"
And I click the "Spectators"
And I type the "allowed" as "Spectators"
And I click the "Session Length"
And I type the "can be long" as "Session Length"
And I click the "Cancellation Policy"
And I type the "applicable" as "Cancellation Policy"
And I click the "Accessibility"
And I type the "wheelchair accessible" as "Accessibility"
And I type "test product notes" as Internal Notes
And I enter <commissionsellingprice>
And I enter <levies>
And I enter <commission>
And I enter <rrp>
And I click save button
And I see Congratulations. You just added a new product

And I get the product ID
And I check the value of "Name" as "newtestskydiving"
And I check the value of "Supplier" as "Crazy April Fool Experiences"
And I verify value of "Product Type" as "Experience"
And I verify value of "Voucher Level" as "Gold Voucher"
And I check the value "Primary Category" as "Abseiling"
And I verify "Occasion Tags" value as "Mother's Day Gifts"
And I verify "Occasion Tags" value as "Christmas Gifts"
And I verify "Location Tags" value as "Sydney & Surrounds"
And I verify "Recipient Tags" value as "Gifts for Him"
And I verify "Recipient Tags" value as "Gifts for Her"
And I verify "Category Tags" value as "Couples Gift Boxes"
And I verify "Category Tags" value as "Baby Gift Boxes"
And I must see the "Test summary" as "summary"
And verify the value "Test description" as "Description"
And verify the value "test market desc" as "Market Description"
And verify the value "test print desc" as "Print Description"
And I verify value of "Country" as "New Zealand"
And I check the value "Location Description" as "Manly"
And I check the value "How many people" as "2"
And I check the value "Duration" as "30 minutes"
And I click the "Venue"
And I should see the "Manly south beach" as "Venue"
And I click the "How to get there"
And I should see the "Take ferry" as "How to get there"
And I click the "Session Length"
And I should see the "can be long" as "Session Length"
And I click the "Guidelines"
And I should see the "anyone can participate" as "Guidelines"
And I click the "Dress Code"
And I should see the "Casual" as "Dress Code"
And I click the "Other Info"
And I should see the "found" as "Other Info"
And I click the "Weather"
And I should see the "windy and sunny" as "Weather"
And I click the "Numbers on the day"
And I should see the "can be anynumber" as "Numbers on the day"
And I click the "Spectators"
And I should see the "allowed" as "Spectators"
And I click the "Cancellation Policy"
And I should see the "applicable" as "Cancellation Policy"
And I click the "Accessibility"
And I should see the "wheelchair accessible" as "Accessibility"
And I look for <commissionsellingprice>
And I look for <levies>
And I look for <commission>
And I look for <rrp>
And I verify "Selling Price"
And I verify "Buying Price"



Examples:
|commissionsellingprice|levies|commission|rrp|
|120|25|10|150|