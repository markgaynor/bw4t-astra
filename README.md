### Blocks World for Teams (BW4T) in Astra 

A scalable, agent-oriented solution to the [*Blocks World for Teams*](https://github.com/eishub/BW4T) EIS environment implemented in [*Astra*](http://astralanguage.com/wordpress/), an Agent Programming Language designed for intelligent distributed/concurrent systems built on the Java platform. 

![Drawing](https://raw.githubusercontent.com/markgaynor/bw4t-astra/master/bw4t.png)

#### Details
The goal of *Blocks World for Teams* is to jointly deliver a sequence of colored blocks distributed among the rooms in a particular order as fast as possible.

Here, this is done using a scalable team of *Astra* agents which approach the problem as follows:
* A number of ```Retriever``` agents traverse the rooms and gather the target sequence of blocks in arbitrary order, bringing them back to Room C3. 
* Once the necessary blocks have been collected, an ```Assembler``` agent brings them back to the DropZone in order. 
* The ```Main``` agent configures the environment and coordinates the agents, while a ```Semaphore``` agent ensures mutual exclusion in Room C3. 
* If there is only one Bot in the environment, the ```Assembler``` agent performs the ```Retriever``` role by collecting all of the blocks in the sequence. Otherwise, there will be one ```Assembler``` and any number of ```Retrievers``` up to 8 (any number beyond which is unfeasible, given that the environment has only 9 rooms).

 
#### Instructions for running:
* Download [version 3.6.0 of the *Astra* IDE](http://astralanguage.com/wordpress/download/).
* Import the files as an *Eclipse* project.
* Point the build path to the correct locations of ```astra.jar```, ```cartago.jar```, ```eis-0.5.jar```, ```json-simple-1.1.1.jar``` and ```mas-acre.jar```.
* Initialise ```bw4t-server-3.8.6.jar```. Set the map to ```Random``` for up to 3 agents and ```SuperRandom``` for >3.
* Specify ```agentCount``` on line 19 of ```Main.astra```.
* Run the ```Main``` agent.

#### Issues: 
The server appears to exhibit some stability issues which occasionally cause Bots to stop running indefinitely. If this occurs, restart the server and re-run ```Main```. Note that these issues are especially apparent at higher framerates and at higher numbers of agents. 
