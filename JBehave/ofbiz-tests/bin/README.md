# JBehaviour tests using jbehave, selenium and spring

This  uses JBehave 3.x and Selenium 2.x to test 

<img src="http://jbehave.org/reference/preview/images/jbehave-logo.png" alt="JBehave logo" align="right" />

## Running the stories

This will run the build and (after a minute or so) Firefox will open and test the etsy.com website:

    mvn install 

You should see Firefox (installed on your system) flicker as it tests the site

This will run a single story (one contained in a etsy_cart.story file):

    mvn install -DstoryFilter=<story name>

This will run a suite based on the meta filters in the three story files:

    mvn install -Dmeta.filter="+color red"

## Viewing the results

In a directory target/view, a page named 'reports.html' has been generated.  
If you open that in any brower you can see the stories that have run and their execution status.

There should be a row for each story.  The story reports are clickable to via links on the right-most column.


