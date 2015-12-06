
Scenario: Record a note and verify its presence under notes section

Given that I logged into alfred site as Product Analyst
And I'm on supplier "Test Rafting Manly" page in Alfred
And I click "Add Notes" link
And I type "Reminder Note - please send in a photo of an experience for the website." in the "SupplierNote"
And I click Add Notes button
And I see the note Reminder Note - please send in a photo of an experience for the website.

Scenario: Review existing Supplier Notes
Given that I logged into alfred site as Product Analyst
And I'm on supplier "Test Rafting Manly" page in Alfred
And I see the note Reminder Note - please send in a photo of an experience for the website.


Scenario: Edit a recorded note and verify its updation

Given that I logged into alfred site as Product Analyst
And I'm on supplier "Test Rafting Manly" page in Alfred
And I click "Add Notes" link
And I type "Creating a note to Edit." in the "SupplierNote"
And I click Add Notes button
And I see the note Creating a note to Edit.
And I click on "Edit"
And I type the "New Note Edited" as "EditSupplierNote"
And I click the save button
And I should see the Edit Date as Current Date


Scenario: Delete a recorded note and verify its updation

Given that I logged into alfred site as Product Analyst
And I'm on supplier "Test Rafting Manly" page in Alfred
And I click "Add Notes" link
And I type "Adding note to delete." in the "SupplierNote"
And I click Add Notes button
And I see the note Adding note to delete.
And I click on "Delete"
And I click on "Yes" Pop Up
And I verify the note to be deleted


Scenario:- Create a note in AlfRED supplier section and check in Ting supplier section

Given I'm logged in to AlfRED as user alfred and password ofbiz
And I'm on supplier "Zoos Victoria" page in Alfred
And I click "Add Notes" link
And I type "Adding Note to Verify on Ting." in the "SupplierNote"
And I click Add Notes button
And I see the note Adding Note to Verify on Ting.

Given that I logged into Ting site
When I search for the Supplier
Then I see Zoos Victoria
And I click "Notes" field
And I see the note Adding Note to Verify on Ting.




Scenario:- Edit an existing note in AlfRED supplier section and check in Ting supplier section

Given I'm logged in to AlfRED as user alfred and password ofbiz
And I'm on supplier "Zoos Victoria" page in Alfred
And I click "Add Notes" link
And I type "Adding Note to Edit and Verify on Ting." in the "SupplierNote"
And I click Add Notes button
And I see the note Adding Note to Edit and Verify on Ting.
And I click on "Edit"
And I type the "Editing Note to Verify on Ting." as "EditSupplierNote"
And I click the save button

Given that I logged into Ting site
When I search for the Supplier
Then I see Zoos Victoria
And I click "Notes" field
And I see the note Editing Note to Verify on Ting.

Scenario:- Create a note in Ting supplier section and check in AlfRED supplier section

Given that I logged into Ting site
When I search for the Supplier
Then I see Zoos Victoria
And I click "Notes" field
And I click "Add Note" field
And I type "Adding Note in Ting to verify on Alfred" in the "NotesContentBox"
And I click the Add Notes button

Given I'm logged in to AlfRED as user alfred and password ofbiz
And I'm on supplier "Zoos Victoria" page in Alfred
And I see the note Adding Note in Ting to verify on Alfred