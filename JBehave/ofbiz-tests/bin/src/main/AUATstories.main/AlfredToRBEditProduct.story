

Scenario: Add Product in Alfred and edit the same product in Ting and verify in Alfred

Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I enter "Caving Adventuretest6" as "Name"
And I enter the supplier as "Driver Dynamics"
And I select "Experience" as "Product Type"
And I select "Silver Voucher" as "Voucher Level"
And I enter the Primary category as "Caving"
And I enter the Category as "Baby Gift Boxes"
And I enter the Category as "Couples Gift Boxes"
And I enter the Occassion as "18th Birthday"
And I enter the Occassion as "All Gifts"
And I enter the recipient as "Husband"
And I enter the recipient as "Baby Girl"
And I enter the Location as "Tropical North Queensland"
And I type "From Yarra Junction we will take you in our shuttle vehicle up a winding dirt road to the secluded cave site" as "Description"
And I type "Introduction to Caving Day Trip (Suits Beginners)" as the "summary"
And I type "Discover the intrigue of caving in one day!" as "Market Description"
And I type "you will explore granite boulder caves during an epic underground adventure" as "Print Description"
And I select "New Zealand" as "Country"
And I enter the "Yarra junction" as "Location Description"
And I enter the "5" as "How many people"
And I enter the Duration as "5 hours"
And I click the "Venue"
And I type the "Pick-up is available from Dandenong or Ringwood, Victoria" as "Venue"
And I click the "How to get there"
And I type the "We can pick you up from Dandenong Train Station or Ringwood Train Station" as "How to get there"
And I click the "Guidelines"
And I type the "You will need to have an average level of fitness and a bit of flexibility to participate in this experience" as "Guidelines"
And I click the "Dress Code"
And I type the "wear comfortable shoes with good grip" as "Dress Code"
And I click the "Other Info"
And I type the "A picnic lunch is provided on the day" as "Other Info"
And I click the "Weather"
And I type the "Caving takes place underground and is therefore not usually affected by the weather" as "Weather"
And I click the "Numbers on the day"
And I type the "The price quoted is for one person" as "Numbers on the day"
And I click the "Spectators"
And I type the "Not suitable for spectators" as "Spectators"
And I click the "Session Length"
And I type the "This experience generally takes place once a month on the weekend" as "Session Length"
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
And I wait for "20" seconds 

Given that I logged into Ting site
When I go to newly added product page
Then I see Driver Dynamics
And I verify the value "Caving Adventuretest6" as "Title"
And I verify the value "Caving Adventuretest6" as "Print Title"
And I verify the product code
And I verify the value <commission>
And I verify the value <rrp>
And I verify Unit Price
And I verify Buy Price

And I verify the value "Silver" as "Voucher Level"
And I verify the value "5 hours" as "Experience Length"
And I verify the value "experience" as "Product Type"
And I verify the value "We can pick you up from Dandenong Train Station or Ringwood Train Station" as "How To Get There"
And I verify the value "This experience generally takes place once a month on the weekend" as "Availability & Duration"
And I verify the value "wear comfortable shoes with good grip" as "Dress Code"
And I verify the value "5" as "Participants"
And I verify the value "The price quoted is for one person" as "Numbers on the Day"
And I verify the value "Not suitable for spectators" as "Spectators"
And I verify the value "You will need to have an average level of fitness and a bit of flexibility to participate in this experience" as "Guidelines"
And I verify the value "Pick-up is available from Dandenong or Ringwood, Victoria" as "Venue"
And I verify the value "A picnic lunch is provided on the day" as "Other Info"
And I verify the value "Caving takes place underground and is therefore not usually affected by the weather" as "Weather"
And I verify the value "applicable" as "Cancellation Policy"
And I verify the value "wheelchair accessible" as "Notes"
And I need to see "Introduction to Caving Day Trip (Suits Beginners)" as "Summary"
And I need to see "From Yarra Junction we will take you in our shuttle vehicle up a winding dirt road to the secluded cave site" as "Description"
And I need to see "Discover the intrigue of caving in one day!" as "Marketing Description"
And I need to see "you will explore granite boulder caves during an epic underground adventure" as "Print Description"
And I check "Subcategories" as "Baby Gift Boxes"
And I check "Subcategories" as "Couples Gift Boxes"
And I check "Sub-Occasions" as "18th Birthday"
And I check "Sub-Occasions" as "All Gifts"
And I check "Sub-Recipient" as "Husband"
And I check "Sub-Recipient" as "Baby Girl"


And I click Edit under "Details "
And I select "New Zealand " as country
And I add "sky diving1" as "Product Name"
And I add "sky diving1" as "Print Name"
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
And I select "No" as New product
And I select "No" as Includes shipping
And I select "Other" as Update Reason
And I click "Update" button
And I click "View Product" button
And I get the value of "Commission Rate"



Given that I logged into ofbiz site
When I click "Search" link
Then I see Product Search
And I enter the product ID
And I click on search
And I check the value of the "Name" as "sky diving1"
And I check the value of "Supplier" as "Experiencethis"
And I verify value of "Product Type" as "Gift Box"
And I verify value of "Voucher Level" as "Gold Voucher"
And I must see the "Test product summary" as "summary"
And verify the value "Test product description" as "Description"
And verify the value "Test market description" as "Market Description"
And verify the value "Test print description" as "Print Description"
And I verify value of "Country" as "New Zealand"
And I check the value "Location Description" as "Manly"
And I check the value "How many people" as "2"
And I verify <BoxWidth>
And I verify <BoxHeight>
And I verify <BoxLength>
And I verify <BoxWeight>
And I look for <newrrp>
And I look for <newcommissionsellingprice>
And I verify the "Commission"




Examples:
|productcode|BoxWidth|BoxHeight|BoxLength|BoxWeight|commissionsellingprice|levies|commission|rrp|newrrp|newcommissionsellingprice|
|KUL015|101|100|102|103|120|0|10|150|285|250|


