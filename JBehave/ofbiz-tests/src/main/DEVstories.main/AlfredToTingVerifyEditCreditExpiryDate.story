

Scenario: Edit credit expiry date in AlfRED and Test in Ting
Given that I logged into alfred site and search Simon Fuller
When I click "Edit" link
And I wait for "10" seconds
And I click hover "Edit Credit" button
And I add "07/12/2016" as Expiry Date
And I add "By Prachi" as Notes
And I click on "turnOnSpecialSave" button
And I see Customer credit has been successfully updated
And I see $ 2000 expires on 12/12/2012

And I wait for "10" seconds

Given that I logged into Ting site
When I navigate to the customer search page
Then I add "Simon" as customer "First Name"
And I add "Fuller" as customer "Surname"
And I add "simon@moshtix.com.au" as "Email"
And I click "Search" button
And I verify customer credit "Expiry Date" as "07/12/2016"









