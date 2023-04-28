# OOP-Final-Project:

We want to design a program that computes household and firms’ energy consumption and
carbon emission in an area/region and, if above a certain threshold, taxes the various
households and firms. It also produces a report that gives the average tax and carbon emission.
per household/firm and ways to reduce their emissions. Our program consists of one interface,
five classes and one collection. Our program has a Sector abstract class that classes Firms and
Households inherit from. The household and firms calculate the carbon emissions using the tax.
class. The next class is the appliance class. This class creates objects of the various appliances.
used in households or firms. These appliances may include kettles, cookers, machinery etc.,
that consume energy. The class takes the names, dates of manufacturing dates, energy ratings.
of the appliances and the prices of the appliances. The appliances of a firm or household are.
put into a collection, and our collection of choice is an ArrayList.
A newly added vehicle class creates vehicle objects for household class to use. It provides the opportunity for households to calculate the carbon emissions for vehicles on fossil fuels.
The class also makes us calculate the tax for carbon emissions from each vehicle.
A tax class calculates the taxes each firm and household will pay if they cross the carbon.
emission footprint threshold. The class then generates a report on the tax calculations. The
calculations are based on the carbon ratings of the house or firm. The taxable interface then
contains methods that will be implemented by the household and firm classes through the
abstract taxable. This will help avoid repetitions.

**Load all files to your IDE and run the "testFirm" and "testHousehold"" class to run the code**
