
Scenario: Add Credit in an existing Customer in Ting
Given that I logged into Ting site
When I search for the Simon Customer to Edit Information
Then I click "Customer Credit" field
And I click "Add Credit" field
Then I add "34" as customer "Amount"
And I select the "Australia" as "creditAddCountryCode"
And I select the "24" as "creditAddExpiryDate_day"
And I select the "July" as "creditAddExpiryDate_month"
And I select the "2019" as "creditAddExpiryDate_year"
And I add "Credit Amount Added" in the Ting Notes
And I click the "Add Credit" button

And I wait for "10" seconds
Then I click "Customer Credit" field
And I wait for "5" seconds
And I click on "AU Credit History" link
And I verify customer credit Value as $34.00
And I verify customer credit Transaction Date as 07/08/2012
And I verify customer credit Expiry Date as 24/07/2013
And I verify customer credit Notes as Credit Amount Added











