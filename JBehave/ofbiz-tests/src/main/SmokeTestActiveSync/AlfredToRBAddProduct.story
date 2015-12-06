
Scenario: Add Product with extended Fields in ofbiz

Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I enter "newproducttest1" as "Name"
And I enter the supplier as "Crazy April Fool Experiences (APR)"
And I select "Experience" as "Product Type"
And I select "Gold Voucher" as "Voucher Level"
And I enter the Primary category as "Abseiling"
And I enter the Category as "Baby Gift Boxes"
And I enter the Category as "Couples Gift Boxes"
And I enter the Occassion as "18th Birthday"
And I enter the Occassion as "All Gifts"
And I enter the recipient as "Husband"
And I enter the recipient as "Baby Girl"
And I enter the Location as "Tropical North Queensland"
And I type "Test description" as "Description"
And I type "Test summary" as the "summary"
And I type "test market desc" as "Market Description"
And I type "test print desc" as "Print Description"
And I select "Australia" as "Country"
And I enter the "Manly" as "Area"
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
And I type the "have fun" as "Other Info"
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

And I enter <commissionsellingprice>
And I enter <levies>
And I enter <commission>
And I enter <rrp>
And I click save button
And I see Congratulations. You just added a new product
And I get the product ID

And I wait for "10" seconds 

Given that I logged into Ting site
When I go to newly added product page
Then I see Crazy April Fool Experiences
And I verify the value "newproducttest1" as "Title"
And I verify the value "newproducttest1" as "Print Title"
And I verify the product code
And I verify the value <rrp>
And I verify Unit Price
And I verify Buy Price
And I verify the value "AU" as "Country"
And I verify the value "Gold" as "Voucher Level"
And I verify the value "30 minutes" as "Experience Length"
And I verify the value "experience" as "Product Type"
And I verify the value "Take ferry" as "How To Get There"
And I verify the value "can be long" as "Availability & Duration"
And I verify the value "Casual" as "Dress Code"
And I verify the value "2" as "Participants"
And I verify the value "can be anynumber" as "Numbers on the Day"
And I verify the value "allowed" as "Spectators"
And I verify the value "anyone can participate" as "Guidelines"
And I verify the value "Manly south beach" as "Venue"
And I verify the value "have fun" as "Other Info"
And I verify the value "windy and sunny" as "Weather"
And I verify the value "applicable" as "Cancellation Policy"
And I verify the value "wheelchair accessible" as "Notes"
And I need to see "Test summary" as "Summary"
And I need to see "Test description" as "Description"
And I need to see "test market desc" as "Marketing Description"
And I need to see "test print desc" as "Print Description"
And I check "Subcategories" as "Baby Gift Boxes"
And I check "Subcategories" as "Couples Gift Boxes"
And I check "Sub-Occasions" as "18th Birthday"
And I check "Sub-Occasions" as "All Gifts"
And I check "Sub-Recipient" as "Husband"
And I check "Sub-Recipient" as "Baby Girl"
And I open "Notes" section




Examples:
|commissionsellingprice|levies|commission|rrp|
|100|25|20|130|
