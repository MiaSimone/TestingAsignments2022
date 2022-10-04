# TestAssignment2

## 1. Reflections
### 1.1 - Computer Mouse

#### BDD:
- The speed - how fast can you hit a specific point on the screen?
  - Given: a cursor, a timer and a point
  - When: timer starts
  - Then: count until cursor hits point
- The Accuracy - can you hit a specific point on the screen? is it calibrated
  - Given: A cursor and a point
  - When: Mouse is clicked
  - Then: Check if mouseclick is on point

#### TDD:
- Test the speed - how fast can you hit a specific point on the screen - unit test
- Test the accuracy - how precise and how consistently can you hit a specific point on the screen - unit test

#### Acceptance test:
- The build quality - how much wear and tear can the mouse take before the building material wears off?
- The weight - is the mouse made for the right consumer? is it light enough for e-sport players? does the weight even matter for regular consumers?

### 1.2 - Catastrophic Failure
<i>https://www.jpl.nasa.gov/missions/mariner-1</i>
#### The Mariner 1 Spacecraft, 1962
The Mariner 1 space probe barely made it out of Cape Canaveral before the rocket veered dangerously off course. Worried that the rocket was heading towards a crash-landing on earth, NASA engineers issued a self-destruct command and the craft was obliterated about 290 seconds after launch.

An investigation revealed the cause to be a very simple software error. A hyphen (-) was omitted (missing) in a line of code, which meant that incorrect guidance signals were sent to the spacecraft. The overall cost of the omission was reported to be more than $18 million at the time (about $169 million in today’s world).

#### BDD:
- Test Signals:
  - Given: A set of specific guidance signals to keep the rocket flying upright
  - When: Spacecraft receives the guidance signals
  - Then: The spacecraft stays on course

#### TDD:
- Test about the correct signal - unit


