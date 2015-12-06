
Scenario: Add credit from AlfRED
Given that I logged into alfred site and search Simon Fuller
When I click "Edit" link
Then I wait for "10" seconds
And I click on "Add Credit" link
And I wait for "20" seconds
And I click on country "New Zealand"
And I add "1000" as Amount
And I add "31/08/2012" as Expiry Date
And I add "By Prachi" as Notes
And I wait for "10" seconds
Then I save Credit

And I wait for "10" seconds

Then I click "View History" link
And I see Current Credit:
And I see $1000
And I see By Prachi.
And I see Expired Credits:
And I see $0

