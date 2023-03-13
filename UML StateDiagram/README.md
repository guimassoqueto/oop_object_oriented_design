## UML State Diagram 
UML State diagram is a type of behavioral diagram in the Unified Modeling Language (UML) that models the behavior of a system or an object as a finite state machine. A state machine is a mathematical model used to represent the behavior of a system or an object, in which the system or object can be in one of a finite number of states at any given time.

In UML State diagrams, each state represents a specific condition or behavior of the system or object. The states are connected by transitions that represent the actions or events that cause the system or object to move from one state to another. The transitions may be triggered by specific events, conditions or timers, and they can have associated actions that are performed when the transition occurs.

State diagrams can be used to model a wide variety of systems and objects, including software applications, hardware devices, and business processes. They are particularly useful for modeling systems that have complex behaviors or states that depend on multiple factors.

UML State diagrams can be used throughout the software development lifecycle, from requirements analysis and design to implementation and testing. They can also be used to document and communicate the behavior of existing systems or objects.


![UML State](AirlineUMLState.png 'Airline UML')
The airplanes should go through multiple different states. When planes are not in use for a flight they are usually *waiting* to be assigned. Once a plane is chosen to be used for a flight, they are *assigned* to that flight until the airplane is ready for take-off. While the plane is in the air and flying the state is termed *en route*. Once the plane has reached its destination, the plane has to change into a state of *landing* for the airport to prepare for its arrival. Finally, once the plane has successfully landed, the plane is checked to see if it is ready to be assigned to a new flight or if *maintenance* is required. If maintenance is required the plane is *unusable* and if a mechanic decides that the plane cannot be repaired it is removed from the airport and *disposed*.