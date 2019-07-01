# Dark reflective surfaces

A new attraction was added to the park recently: Moe's Mad Mirror Mansion. 
To build the lightshow in this mansion, a contract was made with the company 'Miramir Mirror Masters'. 
Some weird clauses were put in the contract however. 

## Your mission
For the lightshow to work properly, the lightshow module needs to know where all the mirrors are located in the ride. 
However, the contract also states that the mirror location manager module cannot export the package where this data is contained (in the MirrorLocationInMemoryStorage class). 
Currently the park has an attraction that does not function properly. 
It's up to you to fix it.

## Your other mission
The shape of the mirrors changes frequently. 
Usually they are just rectangular shaped, but during eg the christmas period they are shaped like snow flakes and snow men. 
The shape of the mirrors is defined in a properties file located in the 'park-themes' module. 
Implement a way to read this file from the main class in the mirror mansion module.