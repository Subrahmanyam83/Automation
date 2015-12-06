
Scenario: Edit credit from AlfRED
Given that I logged into alfred site and search Simon Fuller
When I click "Edit" link
And I wait for "10" seconds
And I click "Add Credit" link
And I click on country "New Zealand"
And I add "7000" as Amount
And I see Customer credit has been successfully updated
And I type "By Prachi" in the Note
And I click on "turnOnSpecialSave" button


And I wait for "10" seconds


Given that I logged into Ting site
When I navigate to the customer search page
Then I add "Simon" as customer "First Name"
And I add "Fuller" as customer "Surname"
And I add "simon@moshtix.com.au" as "Email"
And I click "Search" button


