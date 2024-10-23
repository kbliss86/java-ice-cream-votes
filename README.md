# Ice Cream Votes

## Description
This is a Java console application that allows users to vote for their favorite ice cream flavor. The program uses several data structures from the Java Collections framework including Set, Map, and List to organize flavors, votes, and voters. The program will ask family members to vote for their favorite ice cream flavor, tally the votes, and then determine the flavor(s) with the highest votes. 

## Features
- Uses Set to store unique ice cream flavors.
- Uses Map to store flavor vote counts.
- Uses List to store family member names.
- Input validation for voting.
- Allows for ties in the top-voted flavors.

## How to Run
1. Compile and run the Java file.
2. Enter votes for the family members when prompted.
3. After all votes have been entered, the program will display the flavor(s) with the highest number of votes.

## Example Output
```
Let's vote on ice cream flavors. Here are your options:
strawberry
mint chocolate chip
vanilla
chocolate
cookie dough

Which flavor do you want to vote for Elizabeth?
mango
That is not a valid flavor. Please try again.

Which flavor do you want to vote for Elizabeth?
cookie dough
Thank you for your vote Elizabeth!

Which flavor do you want to vote for Charles?
vanilla
Thank you for your vote Charles!

Which flavor do you want to vote for Anne?
chocolate
Thank you for your vote Anne!

Which flavor do you want to vote for Andrew?
cookie dough
Thank you for your vote Andrew!

Which flavor do you want to vote for Edward?
chocolate
Thank you for your vote Edward!

The flavors with the most votes are:
cookie dough
chocolate
```

## Extended Challenge Ideas
- Allow the user to enter flavors at the start instead of hardcoding them.
- Normalize inputs by ignoring case and trimming whitespace.
- Calculate and display the percentage of votes for each flavor.
- Try refactoring without using a Set and initializing the Map with all flavors at 0.