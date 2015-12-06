Scenario:- Create a note in AlfRED and check in Ting

Given that I logged into ofbiz site
When I click "Search" link
Then I see Product Search
And I enter the <searchterm> in the search text box
And I click on search

And I check the value of the "Name" as "Porsche 911 or 997 Carrera for a Weekend"
And I click "Add Notes" link
And I type "Add Notes Test" in the "ProductNote"
And I click Add Notes button

Examples:
|searchterm|
|SWR001|

Given that I logged into Ting site
When I search for the Product
Then I see Porsche 911 or 997 Carrera for a Weekend
And I click "Notes" field
And I verify the note to be present



Scenario:- Create a note in Ting and check in AlfRED


Given that I logged into Ting site
When I search for the Product
Then I see Porsche 911 or 997 Carrera for a Weekend
And I click "Notes" field
And I type "Adding New Note" in the "NotesContentBox"
And I click the Add Notes button


Given that I logged into ofbiz site
When I click "Search" link
Then I see Product Search
And I enter the <searchterm> in the search text box
And I click on search

And I check the value of the "Name" as "Porsche 911 or 997 Carrera for a Weekend"
And I verify the note to be present

Scenario:- Edit an existing note in AlfRED and check changes saved and (edited date) updated

Given that I logged into ofbiz site
When I click "Search" link
Then I see Product Search
And I enter the <searchterm> in the search text box
And I click on search

And I check the value of the "Name" as "Porsche 911 or 997 Carrera for a Weekend"
And I verify the note to be present

And I click the "Edit" Button
And I type the "New Note Edited" as "EditProductNote"
And I click the save button
And I should see the Current Date


Scenario:- Delete an existing note and see if note deleted


Given that I logged into ofbiz site
When I click "Search" link
Then I see Product Search
And I enter the <searchterm> in the search text box
And I click on search

And I check the value of the "Name" as "Porsche 911 or 997 Carrera for a Weekend"
And I verify the edited note to be present
And I click on "Delete"
And I click on "Yes" Pop Up
And I verify the note to be present
And I verify the note to be deleted