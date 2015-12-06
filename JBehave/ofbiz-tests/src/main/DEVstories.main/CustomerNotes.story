Scenario:- Create a note in AlfRED and check in Ting

Given that I logged into alfred site as Customer Service Manager
When I search for christy2@tpg.com.au on "Customer Search Page"
Then I see Christy Burrows  - christy2@tpg.com.au
And I click "Christy Burrows" link
And I click "Edit" link
And I click "Add Notes" link
And I type "Add Customer Notes Test" in the "ProductNote"
And I click Add Notes button
And I see Add Customer Notes Test
And I wait for "10" seconds


Given that I logged into Ting site
When I navigate to the customer search page
And I add the "Christy" as Customer First Name
And I add the "Burrows" as Customer Surname
And I add the "christy2@tpg.com.au" as Customer Email
And I click "Search" button
And I see Christy
And I click the Edit Customer Image
And I click "Notes" field
And I see Add Customer Notes Test


Scenario:- Create a note in Ting and check in AlfRED

Given that I logged into Ting site
When I navigate to the customer search page
And I add the "Christy" as Customer First Name
And I add the "Burrows" as Customer Surname
And I add the "christy2@tpg.com.au" as Customer Email
And I click "Search" button
And I see Christy
And I click the Edit Customer Image
And I click "Notes" field
And I click "Add Note" field
And I type "Adding New Note on Ting" in the "NotesContentBox"
And I click the Add Notes button
And I wait for "10" seconds


Given that I logged into alfred site as Customer Service Manager
When I search for christy2@tpg.com.au on "Customer Search Page"
Then I see Christy Burrows  - christy2@tpg.com.au
And I click "Christy Burrows" link
And I see Adding New Note on Ting

Scenario:- Edit an existing note in AlfRED and check changes saved and (edited date) updated

Given that I logged into alfred site as Customer Service Manager
When I search for christy2@tpg.com.au on "Customer Search Page"
Then I see Christy Burrows  - christy2@tpg.com.au
And I click "Christy Burrows" link
And I see Adding New Note on Ting
And I click "Edit" link
And I type the "New Note Edited" as "EditProductNote"
And I click the save button
And I see New Note Edited
And I should see the Edit Date as Current Date

Scenario:- Delete an existing note and see if note deleted

Given that I logged into alfred site as Customer Service Manager
When I search for christy2@tpg.com.au on "Customer Search Page"
Then I see Christy Burrows  - christy2@tpg.com.au
And I click "Christy Burrows" link
And I see New Note Edited
And I click on "Delete"
And I click on Yes Pop Up
And I verify the note to be deleted