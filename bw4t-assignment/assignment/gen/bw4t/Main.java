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

import astra.lang.Strings;

public class Main extends ASTRAClass {
	public Main() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"bw4t.Main", new int[] {18,9,18,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Main", new int[] {18,27,82,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.LIST, "agentCount"),
						"bw4t.Main", new int[] {19,8,82,5},
						new ListTerm(new Term[] {
							Primitive.newPrimitive(3)
						})
					),
					new Declaration(
						new Variable(Type.STRING, "agentCountStr"),
						"bw4t.Main", new int[] {20,8,82,5},
						new ModuleTerm("prelude", Type.STRING,
							new Predicate("valueAsString", new Term[] {
								new Variable(Type.LIST, "agentCount"),
								Primitive.newPrimitive(0)
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.Prelude) intention.getModule("bw4t.Main","prelude")).valueAsString(
										(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
										(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Main","prelude")).valueAsString(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
										(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
									);
								}
							}
						)
					),
					new Declaration(
						new Variable(Type.INTEGER, "agentCountInt"),
						"bw4t.Main", new int[] {21,8,82,5},
						new ModuleTerm("prelude", Type.INTEGER,
							new Predicate("valueAsInt", new Term[] {
								new Variable(Type.LIST, "agentCount"),
								Primitive.newPrimitive(0)
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.Prelude) intention.getModule("bw4t.Main","prelude")).valueAsInt(
										(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
										(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Main","prelude")).valueAsInt(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
										(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
									);
								}
							}
						)
					),
					new ModuleCall("ei",
						"bw4t.Main", new int[] {24,8,24,50},
						new Predicate("launch", new Term[] {
							Primitive.newPrimitive("bw4t"),
							Primitive.newPrimitive("bw4t-client-3.8.6.jar")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.Main","ei")).launch(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("ei",
						"bw4t.Main", new int[] {25,8,25,44},
						new Predicate("init", new Term[] {
							new ListTerm(new Term[] {
								new Funct("agentcount", new Term[] {
									new Variable(Type.STRING, "agentCountStr")
								})
							})
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.Main","ei")).init(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"bw4t.Main", new int[] {26,8,26,17},
						new Predicate("join", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.Main","ei")).join(
								);
							}
						}
					),
					new ModuleCall("ei",
						"bw4t.Main", new int[] {27,8,27,21},
						new Predicate("startEnv", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("bw4t.Main","ei")).startEnv(
								);
							}
						}
					),
					new ModuleCall("system",
						"bw4t.Main", new int[] {30,8,30,57},
						new Predicate("createAgent", new Term[] {
							Primitive.newPrimitive("Assembler"),
							Primitive.newPrimitive("bw4t.Assembler")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("bw4t.Main","system")).createAgent(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("system",
						"bw4t.Main", new int[] {31,8,31,57},
						new Predicate("createAgent", new Term[] {
							Primitive.newPrimitive("Semaphore"),
							Primitive.newPrimitive("bw4t.Semaphore")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("bw4t.Main","system")).createAgent(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"bw4t.Main", new int[] {32,8,82,5},
						Primitive.newPrimitive(1)
					),
					new While(
						"bw4t.Main", new int[] {33,8,82,5},
						new Comparison("<=",
							new Variable(Type.INTEGER, "i"),
							Operator.newOperator('-',
								new Variable(Type.INTEGER, "agentCountInt"),
								Primitive.newPrimitive(1)
							)
						),
						new Block(
							"bw4t.Main", new int[] {33,32,37,9},
							new Statement[] {
								new Declaration(
									new Variable(Type.STRING, "agentName"),
									"bw4t.Main", new int[] {34,12,37,9},
									Operator.newOperator('+',
										Primitive.newPrimitive("Retriever"),
										new Variable(Type.INTEGER, "i")
									)
								),
								new ModuleCall("system",
									"bw4t.Main", new int[] {35,12,35,59},
									new Predicate("createAgent", new Term[] {
										new Variable(Type.STRING, "agentName"),
										Primitive.newPrimitive("bw4t.Retriever")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.System) intention.getModule("bw4t.Main","system")).createAgent(
												(java.lang.String) intention.evaluate(predicate.getTerm(0)),
												(java.lang.String) intention.evaluate(predicate.getTerm(1))
											);
										}
									}
								),
								new Assignment(
									new Variable(Type.INTEGER, "i"),
									"bw4t.Main", new int[] {36,12,37,9},
									Operator.newOperator('+',
										new Variable(Type.INTEGER, "i"),
										Primitive.newPrimitive(1)
									)
								)
							}
						)
					),
					new Declaration(
						new Variable(Type.LIST, "sequence"),
						"bw4t.Main", new int[] {40,8,82,5},
						new ListTerm(new Term[] {

						})
					),
					new When(
						"bw4t.Main", new int[] {41,8,82,5},
						new Predicate("sequence", new Term[] {
							new Variable(Type.LIST, "L",false)
						}),
						new Block(
							"bw4t.Main", new int[] {41,30,44,9},
							new Statement[] {
								new ModuleCall("C",
									"bw4t.Main", new int[] {42,12,42,58},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("Sequence received from Assembler.")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("bw4t.Main","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Assignment(
									new Variable(Type.LIST, "sequence"),
									"bw4t.Main", new int[] {43,12,44,9},
									new Variable(Type.LIST, "L")
								)
							}
						)
					),
					new While(
						"bw4t.Main", new int[] {46,8,82,5},
						Predicate.TRUE,
						new Block(
							"bw4t.Main", new int[] {46,19,81,9},
							new Statement[] {
								new When(
									"bw4t.Main", new int[] {48,12,81,9},
									new Predicate("remove", new Term[] {
										new Variable(Type.STRING, "colour",false)
									}),
									new Block(
										"bw4t.Main", new int[] {48,39,67,13},
										new Statement[] {
											new Assignment(
												new Variable(Type.INTEGER, "i"),
												"bw4t.Main", new int[] {49,16,67,13},
												Primitive.newPrimitive(0)
											),
											new Declaration(
												new Variable(Type.INTEGER, "j"),
												"bw4t.Main", new int[] {50,16,67,13},
												Primitive.newPrimitive(0)
											),
											new While(
												"bw4t.Main", new int[] {52,16,67,13},
												new AND(
													new Comparison("<",
														new Variable(Type.INTEGER, "i"),
														new ModuleTerm("prelude", Type.INTEGER,
															new Predicate("size", new Term[] {
																new Variable(Type.LIST, "sequence")
															}),
															new ModuleTermAdaptor() {
																public Object invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.Prelude) intention.getModule("bw4t.Main","prelude")).size(
																		(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
																	);
																}
																public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																	return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Main","prelude")).size(
																		(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
																	);
																}
															}
														)
													),
													new Comparison("==",
														new Variable(Type.INTEGER, "j"),
														Primitive.newPrimitive(0)
													)
												),
												new Block(
													"bw4t.Main", new int[] {52,57,58,17},
													new Statement[] {
														new If(
															"bw4t.Main", new int[] {53,20,58,17},
															new ModuleFormula("strings",
																new Predicate("equal", new Term[] {
																	new ModuleTerm("prelude", Type.STRING,
																		new Predicate("valueAsString", new Term[] {
																			new Variable(Type.LIST, "sequence"),
																			new Variable(Type.INTEGER, "i")
																		}),
																		new ModuleTermAdaptor() {
																			public Object invoke(Intention intention, Predicate predicate) {
																				return ((astra.lang.Prelude) intention.getModule("bw4t.Main","prelude")).valueAsString(
																					(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
																					(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
																				);
																			}
																			public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																				return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Main","prelude")).valueAsString(
																					(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
																					(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
																				);
																			}
																		}
																	),
																	new Variable(Type.STRING, "colour")
																}),
															new ModuleFormulaAdaptor() {
																	public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																		return ((astra.lang.Strings) visitor.agent().getModule("bw4t.Main","strings")).equal(
																			(java.lang.String) visitor.evaluate(predicate.getTerm(0)),
																			(java.lang.String) visitor.evaluate(predicate.getTerm(1))
																		);
																}
															}
																),
															new Block(
																"bw4t.Main", new int[] {53,81,56,21},
																new Statement[] {
																	new Declaration(
																		new Variable(Type.BOOLEAN, "x"),
																		"bw4t.Main", new int[] {54,24,56,21},
																		new ModuleTerm("prelude", Type.BOOLEAN,
																			new Predicate("remove", new Term[] {
																				new Variable(Type.LIST, "sequence"),
																				new Variable(Type.INTEGER, "i")
																			}),
																			new ModuleTermAdaptor() {
																				public Object invoke(Intention intention, Predicate predicate) {
																					return ((astra.lang.Prelude) intention.getModule("bw4t.Main","prelude")).remove(
																						(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
																						(java.lang.Integer) intention.evaluate(predicate.getTerm(1))
																					);
																				}
																				public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																					return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Main","prelude")).remove(
																						(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
																						(java.lang.Integer) visitor.evaluate(predicate.getTerm(1))
																					);
																				}
																			}
																		)
																	),
																	new Assignment(
																		new Variable(Type.INTEGER, "j"),
																		"bw4t.Main", new int[] {55,24,56,21},
																		Primitive.newPrimitive(1)
																	)
																}
															)
														),
														new Assignment(
															new Variable(Type.INTEGER, "i"),
															"bw4t.Main", new int[] {57,20,58,17},
															Operator.newOperator('+',
																new Variable(Type.INTEGER, "i"),
																Primitive.newPrimitive(1)
															)
														)
													}
												)
											),
											new ModuleCall("C",
												"bw4t.Main", new int[] {60,16,60,49},
												new Predicate("println", new Term[] {
													Primitive.newPrimitive("Blocks left to find:")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.Console) intention.getModule("bw4t.Main","C")).println(
															(java.lang.String) intention.evaluate(predicate.getTerm(0))
														);
													}
												}
											),
											new ForAll(
												"bw4t.Main", new int[] {61,16,61,46},
												new Variable(Type.STRING, "block",false),
												new Variable(Type.LIST, "sequence"),
												new Block(
													"bw4t.Main", new int[] {61,46,67,13},
													new Statement[] {
														new ModuleCall("C",
															"bw4t.Main", new int[] {62,20,62,36},
															new Predicate("println", new Term[] {
																new Variable(Type.STRING, "block")
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.Console) intention.getModule("bw4t.Main","C")).println(
																		(java.lang.String) intention.evaluate(predicate.getTerm(0))
																	);
																}
															}
														)
													}
												)
											),
											new BeliefUpdate('-',
												"bw4t.Main", new int[] {66,16,67,13},
												new Predicate("remove", new Term[] {
													new Variable(Type.STRING, "colour")
												})
											)
										}
									)
								),
								new If(
									"bw4t.Main", new int[] {70,12,81,9},
									new Comparison("==",
										new ModuleTerm("prelude", Type.INTEGER,
											new Predicate("size", new Term[] {
												new Variable(Type.LIST, "sequence")
											}),
											new ModuleTermAdaptor() {
												public Object invoke(Intention intention, Predicate predicate) {
													return ((astra.lang.Prelude) intention.getModule("bw4t.Main","prelude")).size(
														(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
													);
												}
												public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((astra.lang.Prelude) visitor.agent().getModule("bw4t.Main","prelude")).size(
														(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
													);
												}
											}
										),
										Primitive.newPrimitive(0)
									),
									new Block(
										"bw4t.Main", new int[] {70,42,80,13},
										new Statement[] {
											new ModuleCall("C",
												"bw4t.Main", new int[] {72,16,72,70},
												new Predicate("println", new Term[] {
													Primitive.newPrimitive("All blocks found. Signalling assembler...")
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return false;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.Console) intention.getModule("bw4t.Main","C")).println(
															(java.lang.String) intention.evaluate(predicate.getTerm(0))
														);
													}
												}
											),
											new Send("bw4t.Main", new int[] {73,16,73,62},
												new Performative("inform"),
												Primitive.newPrimitive("Assembler"),
												new Predicate("signalAssembler", new Term[] {
													Primitive.newPrimitive("")
												})
											),
											new Declaration(
												new Variable(Type.LIST, "retrievers"),
												"bw4t.Main", new int[] {76,16,80,13},
												new ModuleTerm("system", Type.LIST,
													new Predicate("getAgentsOfType", new Term[] {
														Primitive.newPrimitive("bw4t.Retriever")
													}),
													new ModuleTermAdaptor() {
														public Object invoke(Intention intention, Predicate predicate) {
															return ((astra.lang.System) intention.getModule("bw4t.Main","system")).getAgentsOfType(
																(java.lang.String) intention.evaluate(predicate.getTerm(0))
															);
														}
														public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
															return ((astra.lang.System) visitor.agent().getModule("bw4t.Main","system")).getAgentsOfType(
																(java.lang.String) visitor.evaluate(predicate.getTerm(0))
															);
														}
													}
												)
											),
											new ForAll(
												"bw4t.Main", new int[] {77,16,77,54},
												new Variable(Type.STRING, "agentName",false),
												new Variable(Type.LIST, "retrievers"),
												new Block(
													"bw4t.Main", new int[] {77,55,80,13},
													new Statement[] {
														new ModuleCall("system",
															"bw4t.Main", new int[] {78,20,78,52},
															new Predicate("terminateAgent", new Term[] {
																new Variable(Type.STRING, "agentName")
															}),
															new DefaultModuleCallAdaptor() {
																public boolean inline() {
																	return false;
																}

																public boolean invoke(Intention intention, Predicate predicate) {
																	return ((astra.lang.System) intention.getModule("bw4t.Main","system")).terminateAgent(
																		(java.lang.String) intention.evaluate(predicate.getTerm(0))
																	);
																}
															}
														)
													}
												)
											)
										}
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Main", new int[] {85,9,85,59},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("sequence", new Term[] {
					new Variable(Type.LIST, "L",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Main", new int[] {85,58,87,5},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.Main", new int[] {86,8,87,5},
						new Predicate("sequence", new Term[] {
							new Variable(Type.LIST, "L")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"bw4t.Main", new int[] {90,9,90,68},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("retrieved", new Term[] {
					new Variable(Type.STRING, "colour",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"bw4t.Main", new int[] {90,67,92,5},
				new Statement[] {
					new BeliefUpdate('+',
						"bw4t.Main", new int[] {91,8,92,5},
						new Predicate("remove", new Term[] {
							new Variable(Type.STRING, "colour")
						})
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("bw4t.Main","ei")).sense();
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
			astra.core.Agent agent = new Main().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
