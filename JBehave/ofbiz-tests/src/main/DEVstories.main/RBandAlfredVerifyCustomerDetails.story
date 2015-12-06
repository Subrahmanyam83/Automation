Scenario: RB and Alfred verify Customer - Personal Details

Given that I logged into Ting site
When I search for the Customer to Edit Information
Then I should check "Teresa" as "Customer First Name"
And I should check "Hook" as "Customer Surname"
And I should check "aout@adventureout.com.au" as "Customer Email"
And I should check "08 9472 3979" as "Customer Phone"
And I should check "Adventure Out Australia" as "Customer Company"
And I should check "PO Box 197	PO Box 197" as "Customer Address"
And I should check "Victoria Park" as "Customer Suburb"
And I should check "6109" as "Customer Postcode"
And I should check "WA" as "Customer State"
Then I check the value of "countryCode" as the "AU"


Scenario: RB and Alfred verify Customer - Current Credits and Last Order

Given that I logged into Ting site
When I search for the Customer to Edit Information
Then I should check "Teresa" as "Customer First Name"
And I should check "Hook" as "Customer Surname"
And I should check "aout@adventureout.com.au" as "Customer Email"
And I should check "08 9472 3979" as "Customer Phone"
And I click "Customer Credit" field
And I see Balance Remaining: AU$0
And I click "Customer Order History" field
And I see Fresh And Fragrant Vietnamese Cooking Class
And I see 20/03/2012
