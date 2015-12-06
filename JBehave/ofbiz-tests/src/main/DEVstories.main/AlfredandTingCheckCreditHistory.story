Scenario: Verify Credit History in Ting
Given that I logged into Ting site
When I search for the Simon Customer to Edit Information
Then I click "Customer Credit" field
And I wait for "5" seconds
And I click on "AU Credit History" link
And I verify customer credit Transaction Date as 07/08/2012

Scenario: Verify Credit History in Alfred
Given that I logged into alfred site and search Simon Fuller
And I click "Edit" link
And I wait for "20" seconds
And I click on "Add Credit" link
And I wait for "20" seconds
And I click on country "New Zealand"
And I add "1000" as Amount
And I add "31/08/2012" as Expiry Date
And I add "By Prachi" as Notes
And I click the "Save" button
And I click "View History" link
And I see Order on 07/08/2012 for By Prachi
And I see Expires on 31/08/2012 


