
Scenario: Add credit from AlfRED
Given that I logged into alfred site and search Simon Fuller
When I click "Edit" link
And I wait for "10" seconds
And I click "Add Credit" link
And I click on country "New Zealand"
And I add "1000" as Amount
And I add "04/12/2012" as Expiry Date
And I type "By Prachi" in the Note
And I click on "turnOnSpecialSave" button

And I wait for "10" seconds



Given that I logged into Ting site
When I navigate to the customer search page
Then I add "Simon" as customer "First Name"
And I add "Fuller" as customer "Surname"
And I add "simon@moshtix.com.au" as "Email"
And I click "Search" button
And I click the Edit Customer Image
And I see Balance Remaining: AU$1000

