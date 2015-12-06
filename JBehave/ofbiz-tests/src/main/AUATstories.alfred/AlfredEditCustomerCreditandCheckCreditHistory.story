Scenario: Edit credit from AlfRED
Given that I logged into alfred site and search Simon Fuller
When I click "Edit" link
Then I wait for "10" seconds
And I click on "Add Credit" link
And I wait for "5" seconds
And I click on country "New Zealand"
And I add "7230" as Amount
And I add "04/12/2012" as Expiry Date
And I add "By Prachi" as Notes
Then I save Credit
And I see $7230 credit has been successfully added



Given that I logged into alfred site and search Simon Fuller
When I click "Edit" link
Then I wait for "10" seconds
Then I click Edit Credit
And I add "40" as Edit Credit
And I add "By Prachi" as Notes Edit
And I wait for "5" seconds
Then I save Edit Credit
And I wait for "10" seconds
Then I see Customer credit has been successfully updated



And I wait for "10" seconds

And I click "View History" link
And I see Current Credit:
And I see $9050
And I see Expires on 04/12/2012 - by Ben Upton
And I see By Prachi


