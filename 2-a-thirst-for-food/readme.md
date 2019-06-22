# Making some real dough
Selling tickets for the rides brings in some cash, but Andre Disney knows that the real profit margins are found at all the different food and drinks stands scattered around Module land.
The theme park offers a wide variety of places where its guests can go to grab a bite or quench their thirst. 
All shops in the park are fully automated and operate using the same workflow: 
- A client chooses which item he would like to purchase
- The client enters a certain amount of Module land food vouchers
- The system prepares the ordered meal and delivers it to the client using a system of pneumatic tubes

There three shops:
- Cheapskate's ice cream parlor, where all products only cost a single voucher
- Moe's fishy feast, a restaurant specializing in fish and chips dishes
- Wild West Waffle House, a restaurant located in the Wild West section of the park. It is operated by an animatronic named Waffle that looks like a Water Buffalo. 

## Your mission
Andre wants to experiment some more with new types of food stalls. 
To be able to achieve this, some things need to change first.
Hungry Customer should not depend on every type of food store in the park. 
Andre aims for a more 'natural' and 'automatic' way for people to discover which nutritional options are available.
He should be able to quickly add and remove new stores without changing too much code on the consumer side of these relationships.

## Your other mission
You might have noticed that all stores depend on the 'FoodItem' class AND that the customer has to import it himself to be able to use it.
Make it so that the customer nog longer needs to worry about 'require'-ing FoodItems.
