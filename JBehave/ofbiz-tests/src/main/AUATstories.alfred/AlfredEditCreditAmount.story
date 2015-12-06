Scenario: Edit credit from AlfRED
Given that I logged into alfred site and search Simon Fuller
When I click "Edit" link
Then I wait for "10" seconds
And I click on "Add Credit" link
And I wait for "5" seconds
And I click on country "New Zealand"
And I add "7000" as Amount
And I add "04/12/2012" as Expiry Date
And I add "By Prachi" as Notes
Then I save Credit
And I see $7000 credit has been successfully added
And I see You can continue to make further changes.
And I click "Logout" link

And I wait for "10" seconds

Scenario:  Edit credit amount in AlfRED and Test in AlfRED view page/Edit page
Given that I logged into alfred site and search Simon Fuller
When I click "Edit" link
Then I wait for "10" seconds
Then I click Edit Credit
And I add "4000" as Edit Credit
And I add "By Prachi" as Notes Edit
And I wait for "5" seconds
Then I save Edit Credit
And I wait for "10" seconds
Then I see Customer credit has been successfully updated
