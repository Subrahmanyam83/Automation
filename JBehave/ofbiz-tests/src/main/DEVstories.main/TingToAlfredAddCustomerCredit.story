
Scenario: Verify added credit for an existing cutomer in Ting 
Given that I logged into Ting site
When I search for the Simon Customer to Edit Information
Then I click "Customer Credit" field
And I see Balance Remaining: AU$89
And I verify customer credit Initial Value as text
And I verify customer credit Initial Value as $45.00
And I verify customer credit Credit Remaining as $45.00
And I verify customer credit Credit Remaining as $45.00
And I verify customer credit "Code" as "Manual/Refund Credit"
And I verify customer credit "Expiry Date" as "23/07/2013"
And I verify customer credit "Locked" as "False"



Scenario: Add Credit in an existing Customer in Ting
Given that I logged into Ting site
When I search for the Simon Customer to Edit Information
Then I click "Customer Credit" field
And I click "Add Credit" field
And I type "34" in the "Add Amount"
And I select the "Australia" as "creditAddCountryCode"
And I select the "24" as "creditAddExpiryDate_day"
And I select the "July" as "creditAddExpiryDate_month"
And I select the "2013" as "creditAddExpiryDate_year"
And I type "Credit Amount Added" in the "Credit Add Notes"
And I click the "Add Credit" button

And I wait for "10" seconds

Given that I logged into alfred site as Customer Experience Manager
When I type "Simon" in the "Search"
Then I click on search
And I click on the customer "Simon Fuller" link
And I wait for "10" seconds
And I see (Current Balance:$ 1000)





