package bw4t;
/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class Semaphore extends ASTRAClass {
	public Semaphore() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"bw4t.Semaphore", new int[] {18,5,18,62},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("enteringC3", new Term[] {
					new Variable(Type.STRING, "room",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Semaphore", new int[] {18,61,27,1},
				new Statement[] {
					new ModuleCall("C",
						"bw4t.Semaphore", new int[] {19,4,19,41},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Bot has entered Room C3.")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.Semaphore","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"bw4t.Semaphore", new int[] {20,4,27,1},
						new Predicate("occupied", new Term[] {
							Primitive.newPrimitive("RoomC3")
						})
					),
					new Declaration(
						new Variable(Type.LIST, "retrievers"),
						"bw4t.Semaphore", new int[] {23,4,27,1},
						new ModuleTerm("system", Type.LIST,
							new Predicate("getAgentsOfType", new Term[] {
								Primitive.newPrimitive("bw4t.Retriever")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.System) intention.getModule("bw4t.Semaphore","system")).getAgentsOfType(
										(java.lang.String) intention.evaluate(predicate.getTerm(0))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.System) visitor.agent().getModule("bw4t.Semaphore","system")).getAgentsOfType(
										(java.lang.String) visitor.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new ForAll(
						"bw4t.Semaphore", new int[] {24,4,24,42},
						new Variable(Type.STRING, "agentName",false),
						new Variable(Type.LIST, "retrievers"),
						new Block(
							"bw4t.Semaphore", new int[] {24,43,27,1},
							new Statement[] {
								new Send("bw4t.Semaphore", new int[] {25,8,25,51},
									new Performative("inform"),
									new Variable(Type.STRING, "agentName"),
									new Predicate("occupied", new Term[] {
										Primitive.newPrimitive("RoomC3")
									})
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Semaphore", new int[] {30,5,30,61},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("exitingC3", new Term[] {
					new Variable(Type.STRING, "room",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Semaphore", new int[] {30,60,39,1},
				new Statement[] {
					new ModuleCall("C",
						"bw4t.Semaphore", new int[] {31,4,31,40},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Bot has exited Room C3.")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("bw4t.Semaphore","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"bw4t.Semaphore", new int[] {32,4,39,1},
						new Predicate("occupied", new Term[] {
							Primitive.newPrimitive("RoomC3")
						})
					),
					new Declaration(
						new Variable(Type.LIST, "retrievers"),
						"bw4t.Semaphore", new int[] {35,4,39,1},
						new ModuleTerm("system", Type.LIST,
							new Predicate("getAgentsOfType", new Term[] {
								Primitive.newPrimitive("bw4t.Retriever")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.System) intention.getModule("bw4t.Semaphore","system")).getAgentsOfType(
										(java.lang.String) intention.evaluate(predicate.getTerm(0))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.System) visitor.agent().getModule("bw4t.Semaphore","system")).getAgentsOfType(
										(java.lang.String) visitor.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new ForAll(
						"bw4t.Semaphore", new int[] {36,4,36,42},
						new Variable(Type.STRING, "agentName",false),
						new Variable(Type.LIST, "retrievers"),
						new Block(
							"bw4t.Semaphore", new int[] {36,43,39,1},
							new Statement[] {
								new Send("bw4t.Semaphore", new int[] {37,8,37,49},
									new Performative("inform"),
									new Variable(Type.STRING, "agentName"),
									new Predicate("vacant", new Term[] {
										Primitive.newPrimitive("RoomC3")
									})
								)
							}
						)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("bw4t.Semaphore","ei")).sense();
			}
		});

	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("ei",astra.lang.EIS.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("system",astra.lang.System.class,agent);
		fragment.addModule("prelude",astra.lang.Prelude.class,agent);
		fragment.addModule("strings",astra.lang.Strings.class,agent);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new BasicSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new Semaphore().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
